package com.aiwen.wfgwechat.service.impl;

import com.aiwen.wfgwechat.dao.AttachmentMapper;
import com.aiwen.wfgwechat.entity.pojo.Attachment;
import com.aiwen.wfgwechat.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentServiceImpl implements AttachmentService {

    @Autowired
    private AttachmentMapper attachmentMapper;

    @Override
    public int insertList(List<Attachment> list) {
        return attachmentMapper.insertList(list);
    }

    @Override
    public int save(Attachment attachment) {
        return attachmentMapper.save(attachment);
    }
}
