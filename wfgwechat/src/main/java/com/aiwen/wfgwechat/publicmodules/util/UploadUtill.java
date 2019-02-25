package com.aiwen.wfgwechat.publicmodules.util;

import com.aiwen.wfgwechat.publicmodules.Entity.Constant;
import com.alibaba.fastjson.JSON;
import com.github.tobato.fastdfs.domain.MataData;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
public class UploadUtill {

    private static UploadUtill UploadUtill;

    @PostConstruct
    public void init(){
        UploadUtill = this ;
    }
    @Autowired
    private FastFileStorageClient fastFileStorageClient;

    public static StorePath  upload(String url,String fileName){
        StorePath storePath =null;
        InputStream in = null;
        Long contentLength = null;
        String fileNameEx="";
        try {
            if(fileName==null||"".equals(fileName)){
                if(url!=null&&!"".equals(url)){
                    int i = url.lastIndexOf("/");
                    fileNameEx=url.substring(i+1, url.length());
                }
            }else{
                fileNameEx=fileName;
            }
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            in = conn.getInputStream();
            contentLength = (long) conn.getContentLength();
            // 设置文件信息
            Set<MataData> mataData = new HashSet<>();
            mataData.add(new MataData("author", ""));
            mataData.add(new MataData("description", ""));
            // 上传   （文件上传可不填文件信息，填入null即可）
            storePath = UploadUtill.fastFileStorageClient.uploadFile(in, contentLength, FilenameUtils.getExtension(fileNameEx), mataData);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("发送 POST 请求出现异常！" + e);
        }finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return storePath;
    }

    /**
     *
     * @param url       图片名称
     * @param fileName  图片的后缀类型
     * @return
     */

    public static String getImageFullUrl(String url,String fileName){
        String fullPath = null;
        if(!url.contains("http://") && !url.contains("https://")){
            url = "http://"+url;
        }
        try{
           StorePath upload = upload(url, fileName);
           fullPath = upload.getFullPath();
       }catch (Exception e){
           System.out.println("图片上传至服务器======="+e);
           return "4";
       }
        return Constant.fastdsfRoot+fullPath;
    }



    public static void main(String[] arg){
        String url="http://apps.lianziapp.com:8081/dfs/downloadpicture?id=7b5454d89c3bb6b552d98a1c267dfee0&sp=5";
        String imageFullUrl = getImageFullUrl(url, new Date().getTime() + ".jpg");
        System.out.println(JSON.toJSONString(imageFullUrl));
        //upload(url);
        /*URLConnection urlConnection = HttpUtil.postConnection(url);
        try {
            Map<String, List<String>> requestProperties = urlConnection.getRequestProperties();
            InputStream inputStream = urlConnection.getInputStream();
            Object content = urlConnection.getContent();
            JSONObject jsonObject = JSONObject.fromObject(content);
            System.out.println( jsonObject.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
