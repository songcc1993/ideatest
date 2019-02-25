package com.aiwen.wfgwechat.service;

import com.aiwen.wfgwechat.entity.pojo.Attachment;

import java.util.List;

public interface AttachmentService {

    int insertList(List<Attachment> list);

    int save(Attachment attachment);

}
