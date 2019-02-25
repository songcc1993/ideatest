package com.aiwen.wfgwechat.publicmodules.Entity;

/**
 * 项目的常量值放在该类中
 * 能提出来的常量值一定写在这里面  不能再页面上写字符串
 */
public class Constant {
    public static final String  STATUS_404="404";
    public static final String  STATUS_200="200";
    public static final String  STATUS_500="500";

    public static final boolean TREU=true;
    public static final boolean FALSE=false;

    //-------------------回调的时候显示的状态码
    public static final String RESULT_STATUS_0="2";//正在发送！
    public static final String RESULT_STATUS_1="3";//发送成功！
    public static final String RESULT_STATUS_2="4";//发送失败！

    public static final String RESULT_STATUS_0_VALUE="正在发送";//正在发送！
    public static final String RESULT_STATUS_1_VALUE="发送成功";//发送成功！
    public static final String RESULT_STATUS_2_VALUE="发送失败";//发送失败！
    //100:网站  200：小程序 300:公众号
    public static final String MODEL_100="100";
    public static final String MODEL_200="200";
    public static final String MODEL_300="300";
    //图片服务器ip和端口号
    public static String fastdsfRoot="http://47.95.6.0:8880/";

}
