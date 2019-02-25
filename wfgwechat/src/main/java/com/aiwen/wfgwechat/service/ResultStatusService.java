package com.aiwen.wfgwechat.service;

import com.aiwen.wfgwechat.entity.pojo.ResultStatus;

import java.io.Serializable;

public interface ResultStatusService extends BaseService<ResultStatus, Serializable> {
    public void ifHasUpdateOrSave(String appFlag,String appCode);
}
