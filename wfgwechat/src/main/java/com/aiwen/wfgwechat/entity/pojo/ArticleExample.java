package com.aiwen.wfgwechat.entity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppTitleIsNull() {
            addCriterion("app_title is null");
            return (Criteria) this;
        }

        public Criteria andAppTitleIsNotNull() {
            addCriterion("app_title is not null");
            return (Criteria) this;
        }

        public Criteria andAppTitleEqualTo(String value) {
            addCriterion("app_title =", value, "appTitle");
            return (Criteria) this;
        }

        public Criteria andAppTitleNotEqualTo(String value) {
            addCriterion("app_title <>", value, "appTitle");
            return (Criteria) this;
        }

        public Criteria andAppTitleGreaterThan(String value) {
            addCriterion("app_title >", value, "appTitle");
            return (Criteria) this;
        }

        public Criteria andAppTitleGreaterThanOrEqualTo(String value) {
            addCriterion("app_title >=", value, "appTitle");
            return (Criteria) this;
        }

        public Criteria andAppTitleLessThan(String value) {
            addCriterion("app_title <", value, "appTitle");
            return (Criteria) this;
        }

        public Criteria andAppTitleLessThanOrEqualTo(String value) {
            addCriterion("app_title <=", value, "appTitle");
            return (Criteria) this;
        }

        public Criteria andAppTitleLike(String value) {
            addCriterion("app_title like", value, "appTitle");
            return (Criteria) this;
        }

        public Criteria andAppTitleNotLike(String value) {
            addCriterion("app_title not like", value, "appTitle");
            return (Criteria) this;
        }

        public Criteria andAppTitleIn(List<String> values) {
            addCriterion("app_title in", values, "appTitle");
            return (Criteria) this;
        }

        public Criteria andAppTitleNotIn(List<String> values) {
            addCriterion("app_title not in", values, "appTitle");
            return (Criteria) this;
        }

        public Criteria andAppTitleBetween(String value1, String value2) {
            addCriterion("app_title between", value1, value2, "appTitle");
            return (Criteria) this;
        }

        public Criteria andAppTitleNotBetween(String value1, String value2) {
            addCriterion("app_title not between", value1, value2, "appTitle");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongIsNull() {
            addCriterion("app_title_long is null");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongIsNotNull() {
            addCriterion("app_title_long is not null");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongEqualTo(String value) {
            addCriterion("app_title_long =", value, "appTitleLong");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongNotEqualTo(String value) {
            addCriterion("app_title_long <>", value, "appTitleLong");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongGreaterThan(String value) {
            addCriterion("app_title_long >", value, "appTitleLong");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongGreaterThanOrEqualTo(String value) {
            addCriterion("app_title_long >=", value, "appTitleLong");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongLessThan(String value) {
            addCriterion("app_title_long <", value, "appTitleLong");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongLessThanOrEqualTo(String value) {
            addCriterion("app_title_long <=", value, "appTitleLong");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongLike(String value) {
            addCriterion("app_title_long like", value, "appTitleLong");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongNotLike(String value) {
            addCriterion("app_title_long not like", value, "appTitleLong");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongIn(List<String> values) {
            addCriterion("app_title_long in", values, "appTitleLong");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongNotIn(List<String> values) {
            addCriterion("app_title_long not in", values, "appTitleLong");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongBetween(String value1, String value2) {
            addCriterion("app_title_long between", value1, value2, "appTitleLong");
            return (Criteria) this;
        }

        public Criteria andAppTitleLongNotBetween(String value1, String value2) {
            addCriterion("app_title_long not between", value1, value2, "appTitleLong");
            return (Criteria) this;
        }

        public Criteria andAppImgIsNull() {
            addCriterion("app_img is null");
            return (Criteria) this;
        }

        public Criteria andAppImgIsNotNull() {
            addCriterion("app_img is not null");
            return (Criteria) this;
        }

        public Criteria andAppImgEqualTo(String value) {
            addCriterion("app_img =", value, "appImg");
            return (Criteria) this;
        }

        public Criteria andAppImgNotEqualTo(String value) {
            addCriterion("app_img <>", value, "appImg");
            return (Criteria) this;
        }

        public Criteria andAppImgGreaterThan(String value) {
            addCriterion("app_img >", value, "appImg");
            return (Criteria) this;
        }

        public Criteria andAppImgGreaterThanOrEqualTo(String value) {
            addCriterion("app_img >=", value, "appImg");
            return (Criteria) this;
        }

        public Criteria andAppImgLessThan(String value) {
            addCriterion("app_img <", value, "appImg");
            return (Criteria) this;
        }

        public Criteria andAppImgLessThanOrEqualTo(String value) {
            addCriterion("app_img <=", value, "appImg");
            return (Criteria) this;
        }

        public Criteria andAppImgLike(String value) {
            addCriterion("app_img like", value, "appImg");
            return (Criteria) this;
        }

        public Criteria andAppImgNotLike(String value) {
            addCriterion("app_img not like", value, "appImg");
            return (Criteria) this;
        }

        public Criteria andAppImgIn(List<String> values) {
            addCriterion("app_img in", values, "appImg");
            return (Criteria) this;
        }

        public Criteria andAppImgNotIn(List<String> values) {
            addCriterion("app_img not in", values, "appImg");
            return (Criteria) this;
        }

        public Criteria andAppImgBetween(String value1, String value2) {
            addCriterion("app_img between", value1, value2, "appImg");
            return (Criteria) this;
        }

        public Criteria andAppImgNotBetween(String value1, String value2) {
            addCriterion("app_img not between", value1, value2, "appImg");
            return (Criteria) this;
        }

        public Criteria andAppDescrideIsNull() {
            addCriterion("app_descride is null");
            return (Criteria) this;
        }

        public Criteria andAppDescrideIsNotNull() {
            addCriterion("app_descride is not null");
            return (Criteria) this;
        }

        public Criteria andAppDescrideEqualTo(String value) {
            addCriterion("app_descride =", value, "appDescride");
            return (Criteria) this;
        }

        public Criteria andAppDescrideNotEqualTo(String value) {
            addCriterion("app_descride <>", value, "appDescride");
            return (Criteria) this;
        }

        public Criteria andAppDescrideGreaterThan(String value) {
            addCriterion("app_descride >", value, "appDescride");
            return (Criteria) this;
        }

        public Criteria andAppDescrideGreaterThanOrEqualTo(String value) {
            addCriterion("app_descride >=", value, "appDescride");
            return (Criteria) this;
        }

        public Criteria andAppDescrideLessThan(String value) {
            addCriterion("app_descride <", value, "appDescride");
            return (Criteria) this;
        }

        public Criteria andAppDescrideLessThanOrEqualTo(String value) {
            addCriterion("app_descride <=", value, "appDescride");
            return (Criteria) this;
        }

        public Criteria andAppDescrideLike(String value) {
            addCriterion("app_descride like", value, "appDescride");
            return (Criteria) this;
        }

        public Criteria andAppDescrideNotLike(String value) {
            addCriterion("app_descride not like", value, "appDescride");
            return (Criteria) this;
        }

        public Criteria andAppDescrideIn(List<String> values) {
            addCriterion("app_descride in", values, "appDescride");
            return (Criteria) this;
        }

        public Criteria andAppDescrideNotIn(List<String> values) {
            addCriterion("app_descride not in", values, "appDescride");
            return (Criteria) this;
        }

        public Criteria andAppDescrideBetween(String value1, String value2) {
            addCriterion("app_descride between", value1, value2, "appDescride");
            return (Criteria) this;
        }

        public Criteria andAppDescrideNotBetween(String value1, String value2) {
            addCriterion("app_descride not between", value1, value2, "appDescride");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentIsNull() {
            addCriterion("app_attachment is null");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentIsNotNull() {
            addCriterion("app_attachment is not null");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentEqualTo(String value) {
            addCriterion("app_attachment =", value, "appAttachment");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentNotEqualTo(String value) {
            addCriterion("app_attachment <>", value, "appAttachment");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentGreaterThan(String value) {
            addCriterion("app_attachment >", value, "appAttachment");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("app_attachment >=", value, "appAttachment");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentLessThan(String value) {
            addCriterion("app_attachment <", value, "appAttachment");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentLessThanOrEqualTo(String value) {
            addCriterion("app_attachment <=", value, "appAttachment");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentLike(String value) {
            addCriterion("app_attachment like", value, "appAttachment");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentNotLike(String value) {
            addCriterion("app_attachment not like", value, "appAttachment");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentIn(List<String> values) {
            addCriterion("app_attachment in", values, "appAttachment");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentNotIn(List<String> values) {
            addCriterion("app_attachment not in", values, "appAttachment");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentBetween(String value1, String value2) {
            addCriterion("app_attachment between", value1, value2, "appAttachment");
            return (Criteria) this;
        }

        public Criteria andAppAttachmentNotBetween(String value1, String value2) {
            addCriterion("app_attachment not between", value1, value2, "appAttachment");
            return (Criteria) this;
        }

        public Criteria andAppFieldIsNull() {
            addCriterion("app_field is null");
            return (Criteria) this;
        }

        public Criteria andAppFieldIsNotNull() {
            addCriterion("app_field is not null");
            return (Criteria) this;
        }

        public Criteria andAppFieldEqualTo(String value) {
            addCriterion("app_field =", value, "appField");
            return (Criteria) this;
        }

        public Criteria andAppFieldNotEqualTo(String value) {
            addCriterion("app_field <>", value, "appField");
            return (Criteria) this;
        }

        public Criteria andAppFieldGreaterThan(String value) {
            addCriterion("app_field >", value, "appField");
            return (Criteria) this;
        }

        public Criteria andAppFieldGreaterThanOrEqualTo(String value) {
            addCriterion("app_field >=", value, "appField");
            return (Criteria) this;
        }

        public Criteria andAppFieldLessThan(String value) {
            addCriterion("app_field <", value, "appField");
            return (Criteria) this;
        }

        public Criteria andAppFieldLessThanOrEqualTo(String value) {
            addCriterion("app_field <=", value, "appField");
            return (Criteria) this;
        }

        public Criteria andAppFieldLike(String value) {
            addCriterion("app_field like", value, "appField");
            return (Criteria) this;
        }

        public Criteria andAppFieldNotLike(String value) {
            addCriterion("app_field not like", value, "appField");
            return (Criteria) this;
        }

        public Criteria andAppFieldIn(List<String> values) {
            addCriterion("app_field in", values, "appField");
            return (Criteria) this;
        }

        public Criteria andAppFieldNotIn(List<String> values) {
            addCriterion("app_field not in", values, "appField");
            return (Criteria) this;
        }

        public Criteria andAppFieldBetween(String value1, String value2) {
            addCriterion("app_field between", value1, value2, "appField");
            return (Criteria) this;
        }

        public Criteria andAppFieldNotBetween(String value1, String value2) {
            addCriterion("app_field not between", value1, value2, "appField");
            return (Criteria) this;
        }

        public Criteria andAppDateIsNull() {
            addCriterion("app_date is null");
            return (Criteria) this;
        }

        public Criteria andAppDateIsNotNull() {
            addCriterion("app_date is not null");
            return (Criteria) this;
        }

        public Criteria andAppDateEqualTo(Date value) {
            addCriterion("app_date =", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotEqualTo(Date value) {
            addCriterion("app_date <>", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateGreaterThan(Date value) {
            addCriterion("app_date >", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateGreaterThanOrEqualTo(Date value) {
            addCriterion("app_date >=", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLessThan(Date value) {
            addCriterion("app_date <", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLessThanOrEqualTo(Date value) {
            addCriterion("app_date <=", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateIn(List<Date> values) {
            addCriterion("app_date in", values, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotIn(List<Date> values) {
            addCriterion("app_date not in", values, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateBetween(Date value1, Date value2) {
            addCriterion("app_date between", value1, value2, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotBetween(Date value1, Date value2) {
            addCriterion("app_date not between", value1, value2, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppStatusIsNull() {
            addCriterion("app_status is null");
            return (Criteria) this;
        }

        public Criteria andAppStatusIsNotNull() {
            addCriterion("app_status is not null");
            return (Criteria) this;
        }

        public Criteria andAppStatusEqualTo(String value) {
            addCriterion("app_status =", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotEqualTo(String value) {
            addCriterion("app_status <>", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusGreaterThan(String value) {
            addCriterion("app_status >", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusGreaterThanOrEqualTo(String value) {
            addCriterion("app_status >=", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLessThan(String value) {
            addCriterion("app_status <", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLessThanOrEqualTo(String value) {
            addCriterion("app_status <=", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLike(String value) {
            addCriterion("app_status like", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotLike(String value) {
            addCriterion("app_status not like", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusIn(List<String> values) {
            addCriterion("app_status in", values, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotIn(List<String> values) {
            addCriterion("app_status not in", values, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusBetween(String value1, String value2) {
            addCriterion("app_status between", value1, value2, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotBetween(String value1, String value2) {
            addCriterion("app_status not between", value1, value2, "appStatus");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNull() {
            addCriterion("update_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNotNull() {
            addCriterion("update_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameEqualTo(String value) {
            addCriterion("update_name =", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotEqualTo(String value) {
            addCriterion("update_name <>", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThan(String value) {
            addCriterion("update_name >", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_name >=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThan(String value) {
            addCriterion("update_name <", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThanOrEqualTo(String value) {
            addCriterion("update_name <=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLike(String value) {
            addCriterion("update_name like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotLike(String value) {
            addCriterion("update_name not like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIn(List<String> values) {
            addCriterion("update_name in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotIn(List<String> values) {
            addCriterion("update_name not in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameBetween(String value1, String value2) {
            addCriterion("update_name between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotBetween(String value1, String value2) {
            addCriterion("update_name not between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}