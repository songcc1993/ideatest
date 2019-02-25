package com.aiwen.wfgwechat.service.impl;

import com.aiwen.wfgwechat.dao.BaseMapper;
import com.aiwen.wfgwechat.dao.ResultStatusMapper;
import com.aiwen.wfgwechat.entity.pojo.ResultStatus;
import com.aiwen.wfgwechat.publicmodules.Entity.Constant;
import com.aiwen.wfgwechat.service.ResultStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class ResultStatusServiceImpl extends BaseServiceImpl<ResultStatus> implements ResultStatusService {
    @Autowired
    private ResultStatusMapper  mapper;
    @Override
    protected BaseMapper<ResultStatus, Serializable> getDao() {
        return mapper;
    }

    @Override
    public void ifHasUpdateOrSave(String appFlag,String appCode) {
        ResultStatus resultStatus = new ResultStatus();
        resultStatus.setAppFlag(appFlag);
        List<ResultStatus> listBy = mapper.findListBy (resultStatus);
        if(listBy==null||listBy.size()<=0){
            resultStatus.setApp_code(Constant.RESULT_STATUS_0);
            mapper.save(resultStatus);
        }else{
            ResultStatus resultStatus1 = listBy.get(0);
            resultStatus1.setApp_code(appCode);
            mapper.update(resultStatus1);
        }
    }
}
