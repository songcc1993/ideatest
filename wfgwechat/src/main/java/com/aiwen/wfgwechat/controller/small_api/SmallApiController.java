package com.aiwen.wfgwechat.controller.small_api;

import com.aiwen.wfgwechat.entity.pojo.Attachment;
import com.aiwen.wfgwechat.entity.public_api_pojo.RequestObj;
import com.aiwen.wfgwechat.publicmodules.Entity.Constant;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.aiwen.wfgwechat.service.AttachmentService;
import com.aiwen.wfgwechat.service.SmallProgramService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/smallApi")
public class SmallApiController {

    @Autowired
    private SmallProgramService smallProgramService;

    @PostMapping("/saveOrEdit")
    public ResultMessage updateOrSave(String data){
        ResultMessage result = new ResultMessage();
        try {
            smallProgramService.saveOrEdit(data);
        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(Constant.STATUS_500);
            result.setResult(Constant.FALSE);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    @PostMapping("/publish")
    public ResultMessage publish(String data){
        ResultMessage result = new ResultMessage();
        try {
            smallProgramService.publish(data);
        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(Constant.STATUS_500);
            result.setResult(Constant.FALSE);
        }
        return result;
    }
    @PostMapping("/repeal")
    public ResultMessage repeal(String data){
        ResultMessage result = new ResultMessage();
        try {
            smallProgramService.repeal(data);
        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(Constant.STATUS_500);
            result.setResult(Constant.FALSE);
        }
        return result;
    }

    /**
     * 返回状态
     * @param data
     * @return
     */
    @PostMapping("/returnStatus")
    public ResultMessage returnStatus(String data){
        ResultMessage result = new ResultMessage();
        try {
            result = smallProgramService.returnStatus(data);
            System.out.println("查询状态返回信息：===="+ JSON.toJSONString(result));

        }catch (Exception e){
            e.printStackTrace();
            result.setStatus(Constant.STATUS_500);
            result.setResult(Constant.FALSE);
        }
        return result;
    }
    /**
     *保存修改图文消息
     * @param data
     * @return
     */
    @RequestMapping("/send")
    @ResponseBody
    public ResultMessage send(String data){
        ResultMessage result = new ResultMessage();
        RequestObj target = JSONObject.parseObject(data, RequestObj.class);
        if(target.getApp_flag() == null || "".equals(target.getApp_flag())){
            result.setMessage("app_flag不能为空!");
            result.setResult(Constant.FALSE);
            result.setStatus(Constant.STATUS_500);
            return result;
        }
        try{
            result = smallProgramService.send(data);
        }catch(Exception e){
            e.printStackTrace();
            result.setStatus(Constant.STATUS_500);
            result.setResult(Constant.FALSE);
            result.setMessage(e.getMessage());
            return result;
        }

        System.out.println("保存接口返回数据：====="+JSON.toJSONString(result));
        return result;
    }

    /**
     * 预览图文消息
     * @param data
     * @return
     */
    @RequestMapping("/preview")
    @ResponseBody
    public ResultMessage preview(String data){

        return smallProgramService.preview(data);
    }

    /**
     * 发布图文消息
     * @param data
     * @return
     */
    @RequestMapping("/Release")
    @ResponseBody
    public ResultMessage Release(String data){


        return smallProgramService.publish(data);
    }

    /**
     * 撤销图文消息
     * @param data
     * @return
     */
    @RequestMapping("/revoke")
    @ResponseBody
    public ResultMessage revoke(String data){

        return  smallProgramService.repeal(data);
    }
@Autowired
private AttachmentService attachmentService;
    @RequestMapping("/test")
    @ResponseBody
    public Integer test(){
        List<Attachment> attachments = new ArrayList<>();
        Attachment a = new Attachment();
        a.setAttachment_id("111111");
        a.setAttachment_url("222222");
        a.setAttachment_date("1111111");
        a.setAttachment_extension("111111111");
        a.setAttachment_name("11111111");
        a.setAttachment_size("111111111");
        a.setAttachment_type("1111111111");
        Attachment a2 = new Attachment();
        a2.setAttachment_id("11111221");
        a2.setAttachment_url("22222222");
        a2.setAttachment_date("111122111");
        a2.setAttachment_extension("11111221111");
        a2.setAttachment_name("1112211111");
        a2.setAttachment_size("11111221111");
        a2.setAttachment_type("111112211111");
        attachments.add(a);
        attachments.add(a2);
        int i = attachmentService.insertList(attachments);
        return  i;
    }
}
