package com.aiwen.wfgwechat.entity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FieldExample() {
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

        public Criteria andFieldIdIsNull() {
            addCriterion("field_id is null");
            return (Criteria) this;
        }

        public Criteria andFieldIdIsNotNull() {
            addCriterion("field_id is not null");
            return (Criteria) this;
        }

        public Criteria andFieldIdEqualTo(String value) {
            addCriterion("field_id =", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotEqualTo(String value) {
            addCriterion("field_id <>", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThan(String value) {
            addCriterion("field_id >", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThanOrEqualTo(String value) {
            addCriterion("field_id >=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThan(String value) {
            addCriterion("field_id <", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThanOrEqualTo(String value) {
            addCriterion("field_id <=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLike(String value) {
            addCriterion("field_id like", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotLike(String value) {
            addCriterion("field_id not like", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdIn(List<String> values) {
            addCriterion("field_id in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotIn(List<String> values) {
            addCriterion("field_id not in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdBetween(String value1, String value2) {
            addCriterion("field_id between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotBetween(String value1, String value2) {
            addCriterion("field_id not between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNull() {
            addCriterion("field_name is null");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNotNull() {
            addCriterion("field_name is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNameEqualTo(String value) {
            addCriterion("field_name =", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotEqualTo(String value) {
            addCriterion("field_name <>", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThan(String value) {
            addCriterion("field_name >", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("field_name >=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThan(String value) {
            addCriterion("field_name <", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThanOrEqualTo(String value) {
            addCriterion("field_name <=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLike(String value) {
            addCriterion("field_name like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotLike(String value) {
            addCriterion("field_name not like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameIn(List<String> values) {
            addCriterion("field_name in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotIn(List<String> values) {
            addCriterion("field_name not in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameBetween(String value1, String value2) {
            addCriterion("field_name between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotBetween(String value1, String value2) {
            addCriterion("field_name not between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldCmdIsNull() {
            addCriterion("field_cmd is null");
            return (Criteria) this;
        }

        public Criteria andFieldCmdIsNotNull() {
            addCriterion("field_cmd is not null");
            return (Criteria) this;
        }

        public Criteria andFieldCmdEqualTo(String value) {
            addCriterion("field_cmd =", value, "fieldCmd");
            return (Criteria) this;
        }

        public Criteria andFieldCmdNotEqualTo(String value) {
            addCriterion("field_cmd <>", value, "fieldCmd");
            return (Criteria) this;
        }

        public Criteria andFieldCmdGreaterThan(String value) {
            addCriterion("field_cmd >", value, "fieldCmd");
            return (Criteria) this;
        }

        public Criteria andFieldCmdGreaterThanOrEqualTo(String value) {
            addCriterion("field_cmd >=", value, "fieldCmd");
            return (Criteria) this;
        }

        public Criteria andFieldCmdLessThan(String value) {
            addCriterion("field_cmd <", value, "fieldCmd");
            return (Criteria) this;
        }

        public Criteria andFieldCmdLessThanOrEqualTo(String value) {
            addCriterion("field_cmd <=", value, "fieldCmd");
            return (Criteria) this;
        }

        public Criteria andFieldCmdLike(String value) {
            addCriterion("field_cmd like", value, "fieldCmd");
            return (Criteria) this;
        }

        public Criteria andFieldCmdNotLike(String value) {
            addCriterion("field_cmd not like", value, "fieldCmd");
            return (Criteria) this;
        }

        public Criteria andFieldCmdIn(List<String> values) {
            addCriterion("field_cmd in", values, "fieldCmd");
            return (Criteria) this;
        }

        public Criteria andFieldCmdNotIn(List<String> values) {
            addCriterion("field_cmd not in", values, "fieldCmd");
            return (Criteria) this;
        }

        public Criteria andFieldCmdBetween(String value1, String value2) {
            addCriterion("field_cmd between", value1, value2, "fieldCmd");
            return (Criteria) this;
        }

        public Criteria andFieldCmdNotBetween(String value1, String value2) {
            addCriterion("field_cmd not between", value1, value2, "fieldCmd");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeIsNull() {
            addCriterion("field_data_type is null");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeIsNotNull() {
            addCriterion("field_data_type is not null");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeEqualTo(String value) {
            addCriterion("field_data_type =", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeNotEqualTo(String value) {
            addCriterion("field_data_type <>", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeGreaterThan(String value) {
            addCriterion("field_data_type >", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("field_data_type >=", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeLessThan(String value) {
            addCriterion("field_data_type <", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeLessThanOrEqualTo(String value) {
            addCriterion("field_data_type <=", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeLike(String value) {
            addCriterion("field_data_type like", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeNotLike(String value) {
            addCriterion("field_data_type not like", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeIn(List<String> values) {
            addCriterion("field_data_type in", values, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeNotIn(List<String> values) {
            addCriterion("field_data_type not in", values, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeBetween(String value1, String value2) {
            addCriterion("field_data_type between", value1, value2, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeNotBetween(String value1, String value2) {
            addCriterion("field_data_type not between", value1, value2, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDescIsNull() {
            addCriterion("field_desc is null");
            return (Criteria) this;
        }

        public Criteria andFieldDescIsNotNull() {
            addCriterion("field_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFieldDescEqualTo(String value) {
            addCriterion("field_desc =", value, "fieldDesc");
            return (Criteria) this;
        }

        public Criteria andFieldDescNotEqualTo(String value) {
            addCriterion("field_desc <>", value, "fieldDesc");
            return (Criteria) this;
        }

        public Criteria andFieldDescGreaterThan(String value) {
            addCriterion("field_desc >", value, "fieldDesc");
            return (Criteria) this;
        }

        public Criteria andFieldDescGreaterThanOrEqualTo(String value) {
            addCriterion("field_desc >=", value, "fieldDesc");
            return (Criteria) this;
        }

        public Criteria andFieldDescLessThan(String value) {
            addCriterion("field_desc <", value, "fieldDesc");
            return (Criteria) this;
        }

        public Criteria andFieldDescLessThanOrEqualTo(String value) {
            addCriterion("field_desc <=", value, "fieldDesc");
            return (Criteria) this;
        }

        public Criteria andFieldDescLike(String value) {
            addCriterion("field_desc like", value, "fieldDesc");
            return (Criteria) this;
        }

        public Criteria andFieldDescNotLike(String value) {
            addCriterion("field_desc not like", value, "fieldDesc");
            return (Criteria) this;
        }

        public Criteria andFieldDescIn(List<String> values) {
            addCriterion("field_desc in", values, "fieldDesc");
            return (Criteria) this;
        }

        public Criteria andFieldDescNotIn(List<String> values) {
            addCriterion("field_desc not in", values, "fieldDesc");
            return (Criteria) this;
        }

        public Criteria andFieldDescBetween(String value1, String value2) {
            addCriterion("field_desc between", value1, value2, "fieldDesc");
            return (Criteria) this;
        }

        public Criteria andFieldDescNotBetween(String value1, String value2) {
            addCriterion("field_desc not between", value1, value2, "fieldDesc");
            return (Criteria) this;
        }

        public Criteria andFieldSeqIsNull() {
            addCriterion("field_seq is null");
            return (Criteria) this;
        }

        public Criteria andFieldSeqIsNotNull() {
            addCriterion("field_seq is not null");
            return (Criteria) this;
        }

        public Criteria andFieldSeqEqualTo(String value) {
            addCriterion("field_seq =", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqNotEqualTo(String value) {
            addCriterion("field_seq <>", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqGreaterThan(String value) {
            addCriterion("field_seq >", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqGreaterThanOrEqualTo(String value) {
            addCriterion("field_seq >=", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqLessThan(String value) {
            addCriterion("field_seq <", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqLessThanOrEqualTo(String value) {
            addCriterion("field_seq <=", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqLike(String value) {
            addCriterion("field_seq like", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqNotLike(String value) {
            addCriterion("field_seq not like", value, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqIn(List<String> values) {
            addCriterion("field_seq in", values, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqNotIn(List<String> values) {
            addCriterion("field_seq not in", values, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqBetween(String value1, String value2) {
            addCriterion("field_seq between", value1, value2, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldSeqNotBetween(String value1, String value2) {
            addCriterion("field_seq not between", value1, value2, "fieldSeq");
            return (Criteria) this;
        }

        public Criteria andFieldFillIsNull() {
            addCriterion("field_fill is null");
            return (Criteria) this;
        }

        public Criteria andFieldFillIsNotNull() {
            addCriterion("field_fill is not null");
            return (Criteria) this;
        }

        public Criteria andFieldFillEqualTo(String value) {
            addCriterion("field_fill =", value, "fieldFill");
            return (Criteria) this;
        }

        public Criteria andFieldFillNotEqualTo(String value) {
            addCriterion("field_fill <>", value, "fieldFill");
            return (Criteria) this;
        }

        public Criteria andFieldFillGreaterThan(String value) {
            addCriterion("field_fill >", value, "fieldFill");
            return (Criteria) this;
        }

        public Criteria andFieldFillGreaterThanOrEqualTo(String value) {
            addCriterion("field_fill >=", value, "fieldFill");
            return (Criteria) this;
        }

        public Criteria andFieldFillLessThan(String value) {
            addCriterion("field_fill <", value, "fieldFill");
            return (Criteria) this;
        }

        public Criteria andFieldFillLessThanOrEqualTo(String value) {
            addCriterion("field_fill <=", value, "fieldFill");
            return (Criteria) this;
        }

        public Criteria andFieldFillLike(String value) {
            addCriterion("field_fill like", value, "fieldFill");
            return (Criteria) this;
        }

        public Criteria andFieldFillNotLike(String value) {
            addCriterion("field_fill not like", value, "fieldFill");
            return (Criteria) this;
        }

        public Criteria andFieldFillIn(List<String> values) {
            addCriterion("field_fill in", values, "fieldFill");
            return (Criteria) this;
        }

        public Criteria andFieldFillNotIn(List<String> values) {
            addCriterion("field_fill not in", values, "fieldFill");
            return (Criteria) this;
        }

        public Criteria andFieldFillBetween(String value1, String value2) {
            addCriterion("field_fill between", value1, value2, "fieldFill");
            return (Criteria) this;
        }

        public Criteria andFieldFillNotBetween(String value1, String value2) {
            addCriterion("field_fill not between", value1, value2, "fieldFill");
            return (Criteria) this;
        }

        public Criteria andFieldRegularIsNull() {
            addCriterion("field_regular is null");
            return (Criteria) this;
        }

        public Criteria andFieldRegularIsNotNull() {
            addCriterion("field_regular is not null");
            return (Criteria) this;
        }

        public Criteria andFieldRegularEqualTo(String value) {
            addCriterion("field_regular =", value, "fieldRegular");
            return (Criteria) this;
        }

        public Criteria andFieldRegularNotEqualTo(String value) {
            addCriterion("field_regular <>", value, "fieldRegular");
            return (Criteria) this;
        }

        public Criteria andFieldRegularGreaterThan(String value) {
            addCriterion("field_regular >", value, "fieldRegular");
            return (Criteria) this;
        }

        public Criteria andFieldRegularGreaterThanOrEqualTo(String value) {
            addCriterion("field_regular >=", value, "fieldRegular");
            return (Criteria) this;
        }

        public Criteria andFieldRegularLessThan(String value) {
            addCriterion("field_regular <", value, "fieldRegular");
            return (Criteria) this;
        }

        public Criteria andFieldRegularLessThanOrEqualTo(String value) {
            addCriterion("field_regular <=", value, "fieldRegular");
            return (Criteria) this;
        }

        public Criteria andFieldRegularLike(String value) {
            addCriterion("field_regular like", value, "fieldRegular");
            return (Criteria) this;
        }

        public Criteria andFieldRegularNotLike(String value) {
            addCriterion("field_regular not like", value, "fieldRegular");
            return (Criteria) this;
        }

        public Criteria andFieldRegularIn(List<String> values) {
            addCriterion("field_regular in", values, "fieldRegular");
            return (Criteria) this;
        }

        public Criteria andFieldRegularNotIn(List<String> values) {
            addCriterion("field_regular not in", values, "fieldRegular");
            return (Criteria) this;
        }

        public Criteria andFieldRegularBetween(String value1, String value2) {
            addCriterion("field_regular between", value1, value2, "fieldRegular");
            return (Criteria) this;
        }

        public Criteria andFieldRegularNotBetween(String value1, String value2) {
            addCriterion("field_regular not between", value1, value2, "fieldRegular");
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