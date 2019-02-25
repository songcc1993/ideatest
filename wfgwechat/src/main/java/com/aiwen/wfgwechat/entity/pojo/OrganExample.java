package com.aiwen.wfgwechat.entity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganExample() {
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

        public Criteria andOrganNameIsNull() {
            addCriterion("organ_name is null");
            return (Criteria) this;
        }

        public Criteria andOrganNameIsNotNull() {
            addCriterion("organ_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrganNameEqualTo(String value) {
            addCriterion("organ_name =", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameNotEqualTo(String value) {
            addCriterion("organ_name <>", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameGreaterThan(String value) {
            addCriterion("organ_name >", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameGreaterThanOrEqualTo(String value) {
            addCriterion("organ_name >=", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameLessThan(String value) {
            addCriterion("organ_name <", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameLessThanOrEqualTo(String value) {
            addCriterion("organ_name <=", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameLike(String value) {
            addCriterion("organ_name like", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameNotLike(String value) {
            addCriterion("organ_name not like", value, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameIn(List<String> values) {
            addCriterion("organ_name in", values, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameNotIn(List<String> values) {
            addCriterion("organ_name not in", values, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameBetween(String value1, String value2) {
            addCriterion("organ_name between", value1, value2, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganNameNotBetween(String value1, String value2) {
            addCriterion("organ_name not between", value1, value2, "organName");
            return (Criteria) this;
        }

        public Criteria andOrganUrlIsNull() {
            addCriterion("organ_url is null");
            return (Criteria) this;
        }

        public Criteria andOrganUrlIsNotNull() {
            addCriterion("organ_url is not null");
            return (Criteria) this;
        }

        public Criteria andOrganUrlEqualTo(String value) {
            addCriterion("organ_url =", value, "organUrl");
            return (Criteria) this;
        }

        public Criteria andOrganUrlNotEqualTo(String value) {
            addCriterion("organ_url <>", value, "organUrl");
            return (Criteria) this;
        }

        public Criteria andOrganUrlGreaterThan(String value) {
            addCriterion("organ_url >", value, "organUrl");
            return (Criteria) this;
        }

        public Criteria andOrganUrlGreaterThanOrEqualTo(String value) {
            addCriterion("organ_url >=", value, "organUrl");
            return (Criteria) this;
        }

        public Criteria andOrganUrlLessThan(String value) {
            addCriterion("organ_url <", value, "organUrl");
            return (Criteria) this;
        }

        public Criteria andOrganUrlLessThanOrEqualTo(String value) {
            addCriterion("organ_url <=", value, "organUrl");
            return (Criteria) this;
        }

        public Criteria andOrganUrlLike(String value) {
            addCriterion("organ_url like", value, "organUrl");
            return (Criteria) this;
        }

        public Criteria andOrganUrlNotLike(String value) {
            addCriterion("organ_url not like", value, "organUrl");
            return (Criteria) this;
        }

        public Criteria andOrganUrlIn(List<String> values) {
            addCriterion("organ_url in", values, "organUrl");
            return (Criteria) this;
        }

        public Criteria andOrganUrlNotIn(List<String> values) {
            addCriterion("organ_url not in", values, "organUrl");
            return (Criteria) this;
        }

        public Criteria andOrganUrlBetween(String value1, String value2) {
            addCriterion("organ_url between", value1, value2, "organUrl");
            return (Criteria) this;
        }

        public Criteria andOrganUrlNotBetween(String value1, String value2) {
            addCriterion("organ_url not between", value1, value2, "organUrl");
            return (Criteria) this;
        }

        public Criteria andPublicIdIsNull() {
            addCriterion("public_id is null");
            return (Criteria) this;
        }

        public Criteria andPublicIdIsNotNull() {
            addCriterion("public_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublicIdEqualTo(String value) {
            addCriterion("public_id =", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdNotEqualTo(String value) {
            addCriterion("public_id <>", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdGreaterThan(String value) {
            addCriterion("public_id >", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdGreaterThanOrEqualTo(String value) {
            addCriterion("public_id >=", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdLessThan(String value) {
            addCriterion("public_id <", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdLessThanOrEqualTo(String value) {
            addCriterion("public_id <=", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdLike(String value) {
            addCriterion("public_id like", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdNotLike(String value) {
            addCriterion("public_id not like", value, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdIn(List<String> values) {
            addCriterion("public_id in", values, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdNotIn(List<String> values) {
            addCriterion("public_id not in", values, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdBetween(String value1, String value2) {
            addCriterion("public_id between", value1, value2, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicIdNotBetween(String value1, String value2) {
            addCriterion("public_id not between", value1, value2, "publicId");
            return (Criteria) this;
        }

        public Criteria andPublicNameIsNull() {
            addCriterion("public_name is null");
            return (Criteria) this;
        }

        public Criteria andPublicNameIsNotNull() {
            addCriterion("public_name is not null");
            return (Criteria) this;
        }

        public Criteria andPublicNameEqualTo(String value) {
            addCriterion("public_name =", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameNotEqualTo(String value) {
            addCriterion("public_name <>", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameGreaterThan(String value) {
            addCriterion("public_name >", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameGreaterThanOrEqualTo(String value) {
            addCriterion("public_name >=", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameLessThan(String value) {
            addCriterion("public_name <", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameLessThanOrEqualTo(String value) {
            addCriterion("public_name <=", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameLike(String value) {
            addCriterion("public_name like", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameNotLike(String value) {
            addCriterion("public_name not like", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameIn(List<String> values) {
            addCriterion("public_name in", values, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameNotIn(List<String> values) {
            addCriterion("public_name not in", values, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameBetween(String value1, String value2) {
            addCriterion("public_name between", value1, value2, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameNotBetween(String value1, String value2) {
            addCriterion("public_name not between", value1, value2, "publicName");
            return (Criteria) this;
        }

        public Criteria andSmallIdIsNull() {
            addCriterion("small_id is null");
            return (Criteria) this;
        }

        public Criteria andSmallIdIsNotNull() {
            addCriterion("small_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmallIdEqualTo(String value) {
            addCriterion("small_id =", value, "smallId");
            return (Criteria) this;
        }

        public Criteria andSmallIdNotEqualTo(String value) {
            addCriterion("small_id <>", value, "smallId");
            return (Criteria) this;
        }

        public Criteria andSmallIdGreaterThan(String value) {
            addCriterion("small_id >", value, "smallId");
            return (Criteria) this;
        }

        public Criteria andSmallIdGreaterThanOrEqualTo(String value) {
            addCriterion("small_id >=", value, "smallId");
            return (Criteria) this;
        }

        public Criteria andSmallIdLessThan(String value) {
            addCriterion("small_id <", value, "smallId");
            return (Criteria) this;
        }

        public Criteria andSmallIdLessThanOrEqualTo(String value) {
            addCriterion("small_id <=", value, "smallId");
            return (Criteria) this;
        }

        public Criteria andSmallIdLike(String value) {
            addCriterion("small_id like", value, "smallId");
            return (Criteria) this;
        }

        public Criteria andSmallIdNotLike(String value) {
            addCriterion("small_id not like", value, "smallId");
            return (Criteria) this;
        }

        public Criteria andSmallIdIn(List<String> values) {
            addCriterion("small_id in", values, "smallId");
            return (Criteria) this;
        }

        public Criteria andSmallIdNotIn(List<String> values) {
            addCriterion("small_id not in", values, "smallId");
            return (Criteria) this;
        }

        public Criteria andSmallIdBetween(String value1, String value2) {
            addCriterion("small_id between", value1, value2, "smallId");
            return (Criteria) this;
        }

        public Criteria andSmallIdNotBetween(String value1, String value2) {
            addCriterion("small_id not between", value1, value2, "smallId");
            return (Criteria) this;
        }

        public Criteria andSmallNameIsNull() {
            addCriterion("small_name is null");
            return (Criteria) this;
        }

        public Criteria andSmallNameIsNotNull() {
            addCriterion("small_name is not null");
            return (Criteria) this;
        }

        public Criteria andSmallNameEqualTo(String value) {
            addCriterion("small_name =", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameNotEqualTo(String value) {
            addCriterion("small_name <>", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameGreaterThan(String value) {
            addCriterion("small_name >", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameGreaterThanOrEqualTo(String value) {
            addCriterion("small_name >=", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameLessThan(String value) {
            addCriterion("small_name <", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameLessThanOrEqualTo(String value) {
            addCriterion("small_name <=", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameLike(String value) {
            addCriterion("small_name like", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameNotLike(String value) {
            addCriterion("small_name not like", value, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameIn(List<String> values) {
            addCriterion("small_name in", values, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameNotIn(List<String> values) {
            addCriterion("small_name not in", values, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameBetween(String value1, String value2) {
            addCriterion("small_name between", value1, value2, "smallName");
            return (Criteria) this;
        }

        public Criteria andSmallNameNotBetween(String value1, String value2) {
            addCriterion("small_name not between", value1, value2, "smallName");
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