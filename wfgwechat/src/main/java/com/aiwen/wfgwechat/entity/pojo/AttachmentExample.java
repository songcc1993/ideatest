package com.aiwen.wfgwechat.entity.pojo;

import java.util.ArrayList;
import java.util.List;

public class AttachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttachmentExample() {
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

        public Criteria andAttachmentIdIsNull() {
            addCriterion("attachment_id is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIsNotNull() {
            addCriterion("attachment_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdEqualTo(String value) {
            addCriterion("attachment_id =", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotEqualTo(String value) {
            addCriterion("attachment_id <>", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdGreaterThan(String value) {
            addCriterion("attachment_id >", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_id >=", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLessThan(String value) {
            addCriterion("attachment_id <", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLessThanOrEqualTo(String value) {
            addCriterion("attachment_id <=", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLike(String value) {
            addCriterion("attachment_id like", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotLike(String value) {
            addCriterion("attachment_id not like", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIn(List<String> values) {
            addCriterion("attachment_id in", values, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotIn(List<String> values) {
            addCriterion("attachment_id not in", values, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdBetween(String value1, String value2) {
            addCriterion("attachment_id between", value1, value2, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotBetween(String value1, String value2) {
            addCriterion("attachment_id not between", value1, value2, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIsNull() {
            addCriterion("attachment_name is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIsNotNull() {
            addCriterion("attachment_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameEqualTo(String value) {
            addCriterion("attachment_name =", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotEqualTo(String value) {
            addCriterion("attachment_name <>", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameGreaterThan(String value) {
            addCriterion("attachment_name >", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_name >=", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLessThan(String value) {
            addCriterion("attachment_name <", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLessThanOrEqualTo(String value) {
            addCriterion("attachment_name <=", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLike(String value) {
            addCriterion("attachment_name like", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotLike(String value) {
            addCriterion("attachment_name not like", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIn(List<String> values) {
            addCriterion("attachment_name in", values, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotIn(List<String> values) {
            addCriterion("attachment_name not in", values, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameBetween(String value1, String value2) {
            addCriterion("attachment_name between", value1, value2, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotBetween(String value1, String value2) {
            addCriterion("attachment_name not between", value1, value2, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlIsNull() {
            addCriterion("attachment_url is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlIsNotNull() {
            addCriterion("attachment_url is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlEqualTo(String value) {
            addCriterion("attachment_url =", value, "attachmentUrl");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlNotEqualTo(String value) {
            addCriterion("attachment_url <>", value, "attachmentUrl");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlGreaterThan(String value) {
            addCriterion("attachment_url >", value, "attachmentUrl");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_url >=", value, "attachmentUrl");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlLessThan(String value) {
            addCriterion("attachment_url <", value, "attachmentUrl");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlLessThanOrEqualTo(String value) {
            addCriterion("attachment_url <=", value, "attachmentUrl");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlLike(String value) {
            addCriterion("attachment_url like", value, "attachmentUrl");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlNotLike(String value) {
            addCriterion("attachment_url not like", value, "attachmentUrl");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlIn(List<String> values) {
            addCriterion("attachment_url in", values, "attachmentUrl");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlNotIn(List<String> values) {
            addCriterion("attachment_url not in", values, "attachmentUrl");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlBetween(String value1, String value2) {
            addCriterion("attachment_url between", value1, value2, "attachmentUrl");
            return (Criteria) this;
        }

        public Criteria andAttachmentUrlNotBetween(String value1, String value2) {
            addCriterion("attachment_url not between", value1, value2, "attachmentUrl");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeIsNull() {
            addCriterion("attachment_size is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeIsNotNull() {
            addCriterion("attachment_size is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeEqualTo(String value) {
            addCriterion("attachment_size =", value, "attachmentSize");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeNotEqualTo(String value) {
            addCriterion("attachment_size <>", value, "attachmentSize");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeGreaterThan(String value) {
            addCriterion("attachment_size >", value, "attachmentSize");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_size >=", value, "attachmentSize");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeLessThan(String value) {
            addCriterion("attachment_size <", value, "attachmentSize");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeLessThanOrEqualTo(String value) {
            addCriterion("attachment_size <=", value, "attachmentSize");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeLike(String value) {
            addCriterion("attachment_size like", value, "attachmentSize");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeNotLike(String value) {
            addCriterion("attachment_size not like", value, "attachmentSize");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeIn(List<String> values) {
            addCriterion("attachment_size in", values, "attachmentSize");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeNotIn(List<String> values) {
            addCriterion("attachment_size not in", values, "attachmentSize");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeBetween(String value1, String value2) {
            addCriterion("attachment_size between", value1, value2, "attachmentSize");
            return (Criteria) this;
        }

        public Criteria andAttachmentSizeNotBetween(String value1, String value2) {
            addCriterion("attachment_size not between", value1, value2, "attachmentSize");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeIsNull() {
            addCriterion("attachment_type is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeIsNotNull() {
            addCriterion("attachment_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeEqualTo(String value) {
            addCriterion("attachment_type =", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeNotEqualTo(String value) {
            addCriterion("attachment_type <>", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeGreaterThan(String value) {
            addCriterion("attachment_type >", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_type >=", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeLessThan(String value) {
            addCriterion("attachment_type <", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeLessThanOrEqualTo(String value) {
            addCriterion("attachment_type <=", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeLike(String value) {
            addCriterion("attachment_type like", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeNotLike(String value) {
            addCriterion("attachment_type not like", value, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeIn(List<String> values) {
            addCriterion("attachment_type in", values, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeNotIn(List<String> values) {
            addCriterion("attachment_type not in", values, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeBetween(String value1, String value2) {
            addCriterion("attachment_type between", value1, value2, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentTypeNotBetween(String value1, String value2) {
            addCriterion("attachment_type not between", value1, value2, "attachmentType");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionIsNull() {
            addCriterion("attachment_extension is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionIsNotNull() {
            addCriterion("attachment_extension is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionEqualTo(String value) {
            addCriterion("attachment_extension =", value, "attachmentExtension");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionNotEqualTo(String value) {
            addCriterion("attachment_extension <>", value, "attachmentExtension");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionGreaterThan(String value) {
            addCriterion("attachment_extension >", value, "attachmentExtension");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_extension >=", value, "attachmentExtension");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionLessThan(String value) {
            addCriterion("attachment_extension <", value, "attachmentExtension");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionLessThanOrEqualTo(String value) {
            addCriterion("attachment_extension <=", value, "attachmentExtension");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionLike(String value) {
            addCriterion("attachment_extension like", value, "attachmentExtension");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionNotLike(String value) {
            addCriterion("attachment_extension not like", value, "attachmentExtension");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionIn(List<String> values) {
            addCriterion("attachment_extension in", values, "attachmentExtension");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionNotIn(List<String> values) {
            addCriterion("attachment_extension not in", values, "attachmentExtension");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionBetween(String value1, String value2) {
            addCriterion("attachment_extension between", value1, value2, "attachmentExtension");
            return (Criteria) this;
        }

        public Criteria andAttachmentExtensionNotBetween(String value1, String value2) {
            addCriterion("attachment_extension not between", value1, value2, "attachmentExtension");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateIsNull() {
            addCriterion("attachment_date is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateIsNotNull() {
            addCriterion("attachment_date is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateEqualTo(String value) {
            addCriterion("attachment_date =", value, "attachmentDate");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateNotEqualTo(String value) {
            addCriterion("attachment_date <>", value, "attachmentDate");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateGreaterThan(String value) {
            addCriterion("attachment_date >", value, "attachmentDate");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_date >=", value, "attachmentDate");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateLessThan(String value) {
            addCriterion("attachment_date <", value, "attachmentDate");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateLessThanOrEqualTo(String value) {
            addCriterion("attachment_date <=", value, "attachmentDate");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateLike(String value) {
            addCriterion("attachment_date like", value, "attachmentDate");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateNotLike(String value) {
            addCriterion("attachment_date not like", value, "attachmentDate");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateIn(List<String> values) {
            addCriterion("attachment_date in", values, "attachmentDate");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateNotIn(List<String> values) {
            addCriterion("attachment_date not in", values, "attachmentDate");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateBetween(String value1, String value2) {
            addCriterion("attachment_date between", value1, value2, "attachmentDate");
            return (Criteria) this;
        }

        public Criteria andAttachmentDateNotBetween(String value1, String value2) {
            addCriterion("attachment_date not between", value1, value2, "attachmentDate");
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