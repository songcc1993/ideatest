package com.aiwen.wfgwechat.dao;


import com.aiwen.wfgwechat.entity.Test;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


public interface TestDao  {
    public List<Test> findPageBy(Test test);
    public Test findById(String id);
    public void save(Test test);
    public void update(Test test);
    public void deleteById(String id);
}
