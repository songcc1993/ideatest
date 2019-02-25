package com.aiwen.wfgwechat.service;

import com.aiwen.wfgwechat.entity.public_api_pojo.RequestObj;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;

public interface SmallProgramService  {

    public ResultMessage send(String data);

    public ResultMessage saveOrEdit(String data);

    public ResultMessage publish(String data);

    ResultMessage preview(String data);


    public ResultMessage repeal(String data);

    public ResultMessage returnStatus(String data);
}
