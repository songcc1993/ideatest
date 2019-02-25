package com.aiwen.wfgwechat.service;

import com.aiwen.wfgwechat.entity.public_api_pojo.RequestObj;
import com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface.PreviewReturn;
import com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface.SendAllTableReturn;
import com.aiwen.wfgwechat.publicmodules.Entity.ResultMessage;

import java.util.List;

public interface PublicApiService {
    public String send(String data);

    public void saveOrEdit(String data);

    public ResultMessage publish(String data);

    public void repeal(String data);

    public ResultMessage returnStatus(String data);


    public ResultMessage SendPublic(String string);

    public ResultMessage preview(String data);
}
