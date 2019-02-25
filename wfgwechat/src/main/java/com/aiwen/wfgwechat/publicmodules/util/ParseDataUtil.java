package com.aiwen.wfgwechat.publicmodules.util;

import com.aiwen.wfgwechat.config.public_Utils.EnumData;
import com.aiwen.wfgwechat.entity.pojo.Article;
import com.aiwen.wfgwechat.entity.pojo.ChannelArticle;
import com.aiwen.wfgwechat.entity.public_api_pojo.BaseParam;
import com.aiwen.wfgwechat.entity.public_api_pojo.RequestObj;
import com.aiwen.wfgwechat.entity.public_api_pojo.SendMessage;
import com.aiwen.wfgwechat.publicmodules.Entity.Constant;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.util.*;

public class ParseDataUtil {

    /**
     * 将对象参数进行 字典排序组装
     * @param obj
     * @param aes_key
     * @return
     */
    public static String  genertParam(Object obj,String aes_key){
        Map<String, Object> paramMap = new TreeMap<>(String::compareTo);
        List<Class> list = new ArrayList<>();
        Class<?> aClass = obj.getClass();
        list.add(aClass);
        Class<?> superclass = aClass.getSuperclass();
        if(superclass!=null){
            list.add(superclass);
        }
        for(Class ite:list){
            Field[] declaredFields = ite.getDeclaredFields();
            for (Field item:declaredFields) {
                String name = item.getName();
                if("serialVersionUID".equals(name)){
                    continue;
                }
                String typeName = item.getType().getTypeName();
                String getName = genertName(name, "get");
                try {
                    Object value = aClass.getMethod(getName).invoke(obj);
                    if(String.class.getTypeName().equals(typeName)){
                        if(value==null||"".equals(value.toString())){
                            continue;
                        }
                    }
                    paramMap.put(name, value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        String s = map2Param(paramMap);
        // 3.追加aes_key，得到最后的待加密参数字符串
        if(aes_key!=null&&!"".equals(aes_key)){
            s=s+"aes_key=" + aes_key;
        }
        return s;
    }
    public static String  map2Param(Map<String,Object> map){
        StringBuffer normalParamStr = new StringBuffer();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if(value==null){
                continue;
            }
            normalParamStr.append(key).append("=").append(value).append("&");
        }
        return  normalParamStr.toString();
    }
    public static String genertName(String name,String flag){
        String first = name.substring(0, 1);
        String last = name.substring(1);
        first= first.toUpperCase();
        return flag+first+last;
    }


    /**
     * @param data
     * @param transferKey
     * @return 字符串转化为对象
     */
    public  static Map<String,Object> string2Data(String  data,String transferKey){
        /*try {
            data=URLDecoder.decode(data, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        List<Object>  list = new ArrayList<>();
        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("flag", true);
        RequestObj target = JSONObject.parseObject(data, RequestObj.class);
        //加密的数据（对所有参数）
        String encryption = target.getEncryption();
        target.setEncryption(null);
        String requestData = target.getRequest_data();
        target.setRequest_data(null);
        String s = genertParam(target, transferKey);
        boolean verification =false;
        try {
            String s1 = AesEbcUtil.aesTransferEncrypt(s, transferKey);
            verification = AesEbcUtil.verification(encryption, s1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*if(verification==false){
            resultMap.put("flag", false);
            resultMap.put("message", "接收信息解密失败！");
             return resultMap;
        }*/
        target.setRequest_data(requestData);
        String app_sign = target.getApp_sign();
        if(app_sign!=null&&!"".equals(app_sign)){
            try {
                String s1 = AesEbcUtil.aesTransferDncrypt(app_sign, EnumData.KEY_PUBLIC_APPID_APPSECRCT);
                if(s1!=null){
                    String[] split = s1.split("&");
                    resultMap.put("appid", split[0]);
                    resultMap.put("secret", split[1]);
                }else{
                    resultMap.put("flag", false);
                    resultMap.put("message", "app_sign不能问空！");
                }
            } catch (Exception e) {
                resultMap.put("flag", false);
                resultMap.put("message", "app_sign解密错误！");
                e.printStackTrace();
            }


           /* String[] split = app_sign.split("&");
            resultMap.put("appid", split[0]);
            resultMap.put("secret", split[1]);*/
        }
        String app_flag = target.getApp_flag();
        resultMap.put("app_flag", app_flag);
        //请求所带的主要参数（图文信息）
        String request_data = target.getRequest_data();
        JSONArray jsonarray = JSONObject.parseArray(request_data);
        for(Object  item :jsonarray){
            String sendMessageStr = JSONObject.toJSONString(item);
            SendMessage sendMessage = JSONObject.parseObject(sendMessageStr, SendMessage.class);
            Article ae = new Article();
            ResultMessage resultMessage = copyData(sendMessage, ae);
            resultMap.put("message", resultMessage.getMessage());
            if(resultMessage.getResult()==Constant.FALSE){
                resultMap.put("flag", false);
                break;
            }
            if(resultMessage.getResult()==Constant.TREU){
                list.add(ae);
            }
        }
        resultMap.put("data", list);
        return resultMap;
    }
    public static ResultMessage copyData(SendMessage source, Article target){
        ResultMessage rm = new ResultMessage();
        Map<String,Object> map = new HashMap<>();
        String app_title = source.getApp_title();
        if(app_title==null||"".equals(app_title)){
            map.put("flag", false);
            rm.setMessage("标题不能为空。");
            rm.setResult(Constant.FALSE);
            rm.setStatus(Constant.STATUS_500);
            return rm;
        }
        String app_content = source.getApp_content();
        if(app_content==null||"".equals(app_content)){
            map.put("flag", false);
            rm.setMessage("文章内容不能为空。");
            rm.setResult(Constant.FALSE);
            rm.setStatus(Constant.STATUS_500);
            return rm;
        }
        String app_field = source.getApp_field();
        String[] strings = parseField(app_field);
        target.setChannelIds(strings);
        target.setAppId(source.getApp_id());
        target.setAppTitle(app_title);
        target.setAppTitleLong(source.getApp_title_long());
        target.setAppImg(source.getApp_img());
        target.setAppContent(app_content);
        target.setAppAttachment(source.getApp_attachment());
        target.setAppField(app_field);
        target.setAppVersion(source.getApp_version());
        target.setAppDescride(source.getApp_descride());
        return rm;
    }
    public static String[] parseField(String field){
        JSONArray jsonarray = JSONObject.parseArray(field);
        String[] split =null;
        for(Object item:jsonarray){
            net.sf.json.JSONObject jsonObject = net.sf.json.JSONObject.fromObject(item);
            String field_id = (String)jsonObject.get("field_id");
            if("pindao".equals(field_id)){
                String field_value = (String)jsonObject.get("field_value");
                if(field_value!=null&&!"".equals(field_value)){
                   split = field_value.split(",");
                }
                break;
            }
        }
        return split;

    }
    /**
     * 解析数据 不验证数据是否为空
     * @param data
     * @param bp
     * @param transferKey
     * @return
     */
    public  static Map<String,Object> parseData(String data,BaseParam bp,String transferKey){
        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("flag", true);
        BaseParam target = JSONObject.parseObject(data, bp.getClass());
        String encryption = target.getEncryption();
        target.setEncryption(null);
        String s = genertParam(target, transferKey);
        boolean verification =false;
        try {
            String s1 = AesEbcUtil.aesTransferEncrypt(s, transferKey);
            verification = AesEbcUtil.verification(encryption, s1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*if(verification==false){
            resultMap.put("flag", false);
            resultMap.put("message", "接收信息解密失败！");
            return resultMap;
        }*/
        resultMap.put(bp.getClass().getSimpleName(), target);
        return resultMap;
    };



}
