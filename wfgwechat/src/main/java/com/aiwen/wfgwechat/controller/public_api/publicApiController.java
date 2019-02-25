package com.aiwen.wfgwechat.controller.public_api;

import com.aiwen.wfgwechat.config.public_Utils.JsonToBean;
import com.aiwen.wfgwechat.entity.pojo.Media;
import com.aiwen.wfgwechat.entity.public_api_pojo.RequestObj;
import com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface.PreviewReturn;
import com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface.SendAllTableReturn;
import com.aiwen.wfgwechat.publicmodules.Entity.Constant;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.aiwen.wfgwechat.publicmodules.util.UploadUtill;
import com.aiwen.wfgwechat.service.MediaService;
import com.aiwen.wfgwechat.service.PublicApiService;
import com.aiwen.wfgwechat.service.ResultStatusService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.tobato.fastdfs.domain.StorePath;
import com.sun.org.apache.bcel.internal.generic.POP2;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/publicApi")
public class publicApiController {

    @Autowired
    private PublicApiService publicService;
    @Autowired
    private ResultStatusService resultStatusService;
    @Autowired
    private MediaService mediaService;


    /**
     * 保存或者修改
     * @paramdata
     * @return
     */
    @PostMapping("/saveOrEdit")
    public ResultMessage updateOrSave(String data){
          ResultMessage result = new ResultMessage();
        RequestObj target = JSONObject.parseObject(data, RequestObj.class);
        if(target.getApp_flag() == null || "".equals(target.getApp_flag())){
            result.setMessage("app_flag不能为空!");
        result.setResult(Constant.FALSE);
        result.setStatus(Constant.STATUS_500);
        return result;
    }
        try {
            publicService.saveOrEdit(data);
        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(Constant.STATUS_500);
            result.setResult(Constant.FALSE);
            result.setMessage(e.getMessage());
            return result;
        }

        Map<String, String> map = new HashMap<>();
        map.put("app_id",target.getApp_flag());
        result.setData(map);
        System.out.println("保存接口返回数据：====="+JSON.toJSONString(result));
        return result;
    }


    /**
     * 发布
     * @param data
     * @return
     */
    @PostMapping("/publish")
    public ResultMessage publish(String data){
        ResultMessage result = new ResultMessage();
        try {
            result = publicService.publish(data);

        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(Constant.STATUS_500);
            result.setResult(Constant.FALSE);
        }
        return result;
    }

    /**
     * 预览
     * @param data
     * @return
     */
    @RequestMapping("/preview")
    public ResultMessage preview(String data){
        ResultMessage result = new ResultMessage();
        try {
            result = publicService.preview(data);

        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(Constant.STATUS_500);
            result.setResult(Constant.FALSE);
        }
        return result;
    }

    //轮循
    @PostMapping("/returnStatus")
    public ResultMessage returnStatus(String data){
        ResultMessage result = new ResultMessage();
        try {
            result = publicService.returnStatus(data);
        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(Constant.STATUS_500);
            result.setResult(Constant.FALSE);
        }
        return result;
    }





    /**
     * 接收发送多条图文信息（推送）
     * @param
     * @return
     */
    @RequestMapping(value = "/Release")
    @ResponseBody
    public ResultMessage message(String data){
        ResultMessage result = new ResultMessage() ;
        try{
            result = publicService.SendPublic(data);

        }catch (Exception e){
            result.setResult(Constant.FALSE);
            result.setMessage(e.toString());
            result.setStatus(Constant.STATUS_500);
        }
        return result;
    }



    @RequestMapping("/pushMessage")
    @ResponseBody
    public ResultMessage pushMessage(String data){
        System.out.println(data);

        return null;
    }
   /* @RequestMapping("/test")
    public String testFile(){
        String url="http://apps.lianziapp.com:8081/dfs/downloadpicture?id=7b5454d89c3bb6b552d98a1c267dfee0&sp=5";
        String imageFullUrl = UploadUtill.getImageFullUrl(url, new Date().getTime() + ".jpg");
        System.out.println(imageFullUrl);
        return imageFullUrl;
    }*/

    @RequestMapping("/test")
    public String test(String data){
        List<String> list = new ArrayList<>();
    String  id = null;

        for(int i = 0 ; i < 20 ; i++){
           ResultMessage message = this.updateOrSave(data);
           id = JSON.toJSONString(message);
            list.add(id);
       }

  /*  for(int i = 0 ; i < 200 ;i++){
        ResultMessage message = this.returnStatus(data);
        list.add(JSON.toJSONString(message));
    }*/
        return list.toString();
    }


}
