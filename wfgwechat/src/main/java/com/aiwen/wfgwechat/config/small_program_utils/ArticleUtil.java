package com.aiwen.wfgwechat.config.small_program_utils;

import com.aiwen.wfgwechat.config.public_Utils.EnumData;
import com.aiwen.wfgwechat.dao.AttachmentMapper;
import com.aiwen.wfgwechat.entity.pojo.Article;
import com.aiwen.wfgwechat.entity.pojo.Attachment;
import com.aiwen.wfgwechat.publicmodules.Entity.Constant;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;
import com.aiwen.wfgwechat.publicmodules.util.ImageUtil;
import com.aiwen.wfgwechat.publicmodules.util.UUIDUtil;
import com.aiwen.wfgwechat.publicmodules.util.UploadUtill;
import com.aiwen.wfgwechat.service.AttachmentService;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArticleUtil {

    @Autowired
    private static AttachmentService attachmentService;

    public static ResultMessage articleIsNull(Article article){
        ResultMessage message = new ResultMessage();
        message.setStatus(Constant.STATUS_500);
        message.setResult(Constant.FALSE);
        if(article.getAppTitle() == null && "".equals(article.getAppTitle())){
            message.setMessage("文章标题不能为空！");
            return message;
        }else if(article.getAppContent() ==null && "".equals(article.getAppContent())){
            message.setMessage("文章内容不能为空！");
            return message;
        }else if(article.getAppVersion() == null && "".equals(article.getAppVersion())){
            message.setMessage("文章的标识戳不能为空！");
            return message;
        }
        message.setResult(Constant.TREU);
        return message;
    }

    /**
     * 解析文章图片
     * @param content
     * @return
     */
    public static ResultMessage Content(String content){
        ResultMessage message = new ResultMessage();

        Map<String,String> map = new HashMap<>();
        List<String> imgList = ImageUtil.getImgStr(content);
        String newImg = null;
            for(int i = 0 ; i < imgList.size() ; i++){
                String img = imgList.get(i);
                String sec = img.replaceAll("'", "");
                try{
                        //联子图片
                    if(img.contains("lianziapp.com")){
                        newImg = UploadUtill.getImageFullUrl(sec, new Date().getTime() + ".jpg");
                        if(newImg == null ){
                            map.put(img,EnumData.TUPIAN_URL);
                            continue;
                        }
                        map.put(img,newImg);
                        //其他图片路径
                    }else {
                        newImg = UploadUtill.getImageFullUrl(sec,"");
                        if(newImg.equals("4") ){
                            map.put(img,EnumData.TUPIAN_URL);
                            continue;
                        }
                        map.put(img,newImg);
                    }
                }catch(Exception e){
                    map.put(img,EnumData.TUPIAN_URL);
                    continue;
                }
            }
            message.setData(map);
            message.setStatus(Constant.STATUS_200);
            message.setResult(Constant.TREU);
        return message;
    }

    /**
     * 解析文章中的附件信息
     */
    public static ResultMessage Attachment(String data){
        ResultMessage message = new ResultMessage();
        List<Attachment> attachmentsList = JSONArray.parseArray(data, Attachment.class);
        for(int i = 0 ; i < attachmentsList.size() ; i++){
            Attachment attachment = attachmentsList.get(i);
            String url = UploadUtill.getImageFullUrl(attachment.getAttachment_url(), new Date().getTime() + "."+attachment.getAttachment_type());
                if(url.equals("4")){
                    continue;
                }
            attachment.setAttachment_id(UUIDUtil.getUuid());
            attachment.setAttachment_url(url);

        }
        message.setData(attachmentsList);
        return message;
    }


}
