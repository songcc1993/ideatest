package com.aiwen.wfgwechat.entity.pojo;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.Date;

public class Article extends  BaseEntity implements Serializable {
    private static final long serialVersionUID = 342131798762684255L;
    private String appId;

    private String appTitle;

    private String appTitleLong;

    private String appContent;

    private String appImg; //标题图片

    private String appDescride;

    private String appAttachment;

    private String appField;

    private String appStatus; //0 保存  1 发布 2 预览 3 删除

    private String appGroup;

    private String appVersion;

    private String appFlag;

    private Date appDate;

    private String createName;

    private Date createDate;

    private String updateName;

    private Date updateDate;

    private String[] channelIds; //临时用的属性  不保存在数据库

    public String[] getChannelIds() {
        return channelIds;
    }

    public void setChannelIds(String[] channelIds) {
        this.channelIds = channelIds;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppTitle() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    public String getAppTitleLong() {
        return appTitleLong;
    }

    public void setAppTitleLong(String appTitleLong) {
        this.appTitleLong = appTitleLong;
    }

    public String getAppContent() {
        return appContent;
    }

    public void setAppContent(String appContent) {
        this.appContent = appContent;
    }

    public String getAppImg() {
        return appImg;
    }

    public void setAppImg(String appImg) {
        this.appImg = appImg;
    }

    public String getAppDescride() {
        return appDescride;
    }

    public void setAppDescride(String appDescride) {
        this.appDescride = appDescride;
    }

    public String getAppAttachment() {
        return appAttachment;
    }

    public void setAppAttachment(String appAttachment) {
        this.appAttachment = appAttachment;
    }

    public String getAppField() {
        return appField;
    }

    public void setAppField(String appField) {
        this.appField = appField;
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    public String getAppGroup() {
        return appGroup;
    }

    public void setAppGroup(String appGroup) {
        this.appGroup = appGroup;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public Date getAppDate() {
        return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }

    @Override
    public String getCreateName() {
        return createName;
    }

    @Override
    public void setCreateName(String createName) {
        this.createName = createName;
    }

    @Override
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String getUpdateName() {
        return updateName;
    }

    @Override
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    @Override
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAppFlag() {
        return appFlag;
    }

    public void setAppFlag(String appFlag) {
        this.appFlag = appFlag;
    }
}