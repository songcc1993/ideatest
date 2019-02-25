package com.aiwen.wfgwechat.entity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChannelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelExample() {
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

        public Criteria andFieldItemIdIsNull() {
            addCriterion("field_item_id is null");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdIsNotNull() {
            addCriterion("field_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdEqualTo(String value) {
            addCriterion("field_item_id =", value, "fieldItemId");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdNotEqualTo(String value) {
            addCriterion("field_item_id <>", value, "fieldItemId");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdGreaterThan(String value) {
            addCriterion("field_item_id >", value, "fieldItemId");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("field_item_id >=", value, "fieldItemId");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdLessThan(String value) {
            addCriterion("field_item_id <", value, "fieldItemId");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdLessThanOrEqualTo(String value) {
            addCriterion("field_item_id <=", value, "fieldItemId");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdLike(String value) {
            addCriterion("field_item_id like", value, "fieldItemId");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdNotLike(String value) {
            addCriterion("field_item_id not like", value, "fieldItemId");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdIn(List<String> values) {
            addCriterion("field_item_id in", values, "fieldItemId");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdNotIn(List<String> values) {
            addCriterion("field_item_id not in", values, "fieldItemId");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdBetween(String value1, String value2) {
            addCriterion("field_item_id between", value1, value2, "fieldItemId");
            return (Criteria) this;
        }

        public Criteria andFieldItemIdNotBetween(String value1, String value2) {
            addCriterion("field_item_id not between", value1, value2, "fieldItemId");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameIsNull() {
            addCriterion("field_item_name is null");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameIsNotNull() {
            addCriterion("field_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameEqualTo(String value) {
            addCriterion("field_item_name =", value, "fieldItemName");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameNotEqualTo(String value) {
            addCriterion("field_item_name <>", value, "fieldItemName");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameGreaterThan(String value) {
            addCriterion("field_item_name >", value, "fieldItemName");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("field_item_name >=", value, "fieldItemName");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameLessThan(String value) {
            addCriterion("field_item_name <", value, "fieldItemName");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameLessThanOrEqualTo(String value) {
            addCriterion("field_item_name <=", value, "fieldItemName");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameLike(String value) {
            addCriterion("field_item_name like", value, "fieldItemName");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameNotLike(String value) {
            addCriterion("field_item_name not like", value, "fieldItemName");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameIn(List<String> values) {
            addCriterion("field_item_name in", values, "fieldItemName");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameNotIn(List<String> values) {
            addCriterion("field_item_name not in", values, "fieldItemName");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameBetween(String value1, String value2) {
            addCriterion("field_item_name between", value1, value2, "fieldItemName");
            return (Criteria) this;
        }

        public Criteria andFieldItemNameNotBetween(String value1, String value2) {
            addCriterion("field_item_name not between", value1, value2, "fieldItemName");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueIsNull() {
            addCriterion("field_item_value is null");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueIsNotNull() {
            addCriterion("field_item_value is not null");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueEqualTo(String value) {
            addCriterion("field_item_value =", value, "fieldItemValue");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueNotEqualTo(String value) {
            addCriterion("field_item_value <>", value, "fieldItemValue");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueGreaterThan(String value) {
            addCriterion("field_item_value >", value, "fieldItemValue");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueGreaterThanOrEqualTo(String value) {
            addCriterion("field_item_value >=", value, "fieldItemValue");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueLessThan(String value) {
            addCriterion("field_item_value <", value, "fieldItemValue");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueLessThanOrEqualTo(String value) {
            addCriterion("field_item_value <=", value, "fieldItemValue");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueLike(String value) {
            addCriterion("field_item_value like", value, "fieldItemValue");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueNotLike(String value) {
            addCriterion("field_item_value not like", value, "fieldItemValue");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueIn(List<String> values) {
            addCriterion("field_item_value in", values, "fieldItemValue");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueNotIn(List<String> values) {
            addCriterion("field_item_value not in", values, "fieldItemValue");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueBetween(String value1, String value2) {
            addCriterion("field_item_value between", value1, value2, "fieldItemValue");
            return (Criteria) this;
        }

        public Criteria andFieldItemValueNotBetween(String value1, String value2) {
            addCriterion("field_item_value not between", value1, value2, "fieldItemValue");
            return (Criteria) this;
        }

        public Criteria andParentItemIdIsNull() {
            addCriterion("parent_item_id is null");
            return (Criteria) this;
        }

        public Criteria andParentItemIdIsNotNull() {
            addCriterion("parent_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentItemIdEqualTo(String value) {
            addCriterion("parent_item_id =", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdNotEqualTo(String value) {
            addCriterion("parent_item_id <>", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdGreaterThan(String value) {
            addCriterion("parent_item_id >", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_item_id >=", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdLessThan(String value) {
            addCriterion("parent_item_id <", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdLessThanOrEqualTo(String value) {
            addCriterion("parent_item_id <=", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdLike(String value) {
            addCriterion("parent_item_id like", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdNotLike(String value) {
            addCriterion("parent_item_id not like", value, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdIn(List<String> values) {
            addCriterion("parent_item_id in", values, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdNotIn(List<String> values) {
            addCriterion("parent_item_id not in", values, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdBetween(String value1, String value2) {
            addCriterion("parent_item_id between", value1, value2, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andParentItemIdNotBetween(String value1, String value2) {
            addCriterion("parent_item_id not between", value1, value2, "parentItemId");
            return (Criteria) this;
        }

        public Criteria andOrganIdIsNull() {
            addCriterion("organ_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganIdIsNotNull() {
            addCriterion("organ_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganIdEqualTo(String value) {
            addCriterion("organ_id =", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdNotEqualTo(String value) {
            addCriterion("organ_id <>", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdGreaterThan(String value) {
            addCriterion("organ_id >", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdGreaterThanOrEqualTo(String value) {
            addCriterion("organ_id >=", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdLessThan(String value) {
            addCriterion("organ_id <", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdLessThanOrEqualTo(String value) {
            addCriterion("organ_id <=", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdLike(String value) {
            addCriterion("organ_id like", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdNotLike(String value) {
            addCriterion("organ_id not like", value, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdIn(List<String> values) {
            addCriterion("organ_id in", values, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdNotIn(List<String> values) {
            addCriterion("organ_id not in", values, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdBetween(String value1, String value2) {
            addCriterion("organ_id between", value1, value2, "organId");
            return (Criteria) this;
        }

        public Criteria andOrganIdNotBetween(String value1, String value2) {
            addCriterion("organ_id not between", value1, value2, "organId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
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

        public Criteria andStartIsNull() {
            addCriterion("start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(String value) {
            addCriterion("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(String value) {
            addCriterion("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(String value) {
            addCriterion("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(String value) {
            addCriterion("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(String value) {
            addCriterion("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(String value) {
            addCriterion("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLike(String value) {
            addCriterion("start like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotLike(String value) {
            addCriterion("start not like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<String> values) {
            addCriterion("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<String> values) {
            addCriterion("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(String value1, String value2) {
            addCriterion("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(String value1, String value2) {
            addCriterion("start not between", value1, value2, "start");
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