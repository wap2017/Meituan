package com.meituan.pojo;

import java.util.ArrayList;
import java.util.List;

public class BussinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BussinessExample() {
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

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(String value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(String value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(String value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(String value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(String value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(String value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLike(String value) {
            addCriterion("b_id like", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotLike(String value) {
            addCriterion("b_id not like", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<String> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<String> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(String value1, String value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(String value1, String value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(String value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(String value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(String value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(String value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(String value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(String value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLike(String value) {
            addCriterion("s_id like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotLike(String value) {
            addCriterion("s_id not like", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<String> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<String> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(String value1, String value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(String value1, String value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andBShopnameIsNull() {
            addCriterion("b_shopName is null");
            return (Criteria) this;
        }

        public Criteria andBShopnameIsNotNull() {
            addCriterion("b_shopName is not null");
            return (Criteria) this;
        }

        public Criteria andBShopnameEqualTo(String value) {
            addCriterion("b_shopName =", value, "bShopname");
            return (Criteria) this;
        }

        public Criteria andBShopnameNotEqualTo(String value) {
            addCriterion("b_shopName <>", value, "bShopname");
            return (Criteria) this;
        }

        public Criteria andBShopnameGreaterThan(String value) {
            addCriterion("b_shopName >", value, "bShopname");
            return (Criteria) this;
        }

        public Criteria andBShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("b_shopName >=", value, "bShopname");
            return (Criteria) this;
        }

        public Criteria andBShopnameLessThan(String value) {
            addCriterion("b_shopName <", value, "bShopname");
            return (Criteria) this;
        }

        public Criteria andBShopnameLessThanOrEqualTo(String value) {
            addCriterion("b_shopName <=", value, "bShopname");
            return (Criteria) this;
        }

        public Criteria andBShopnameLike(String value) {
            addCriterion("b_shopName like", value, "bShopname");
            return (Criteria) this;
        }

        public Criteria andBShopnameNotLike(String value) {
            addCriterion("b_shopName not like", value, "bShopname");
            return (Criteria) this;
        }

        public Criteria andBShopnameIn(List<String> values) {
            addCriterion("b_shopName in", values, "bShopname");
            return (Criteria) this;
        }

        public Criteria andBShopnameNotIn(List<String> values) {
            addCriterion("b_shopName not in", values, "bShopname");
            return (Criteria) this;
        }

        public Criteria andBShopnameBetween(String value1, String value2) {
            addCriterion("b_shopName between", value1, value2, "bShopname");
            return (Criteria) this;
        }

        public Criteria andBShopnameNotBetween(String value1, String value2) {
            addCriterion("b_shopName not between", value1, value2, "bShopname");
            return (Criteria) this;
        }

        public Criteria andBShoplogoIsNull() {
            addCriterion("b_shopLogo is null");
            return (Criteria) this;
        }

        public Criteria andBShoplogoIsNotNull() {
            addCriterion("b_shopLogo is not null");
            return (Criteria) this;
        }

        public Criteria andBShoplogoEqualTo(String value) {
            addCriterion("b_shopLogo =", value, "bShoplogo");
            return (Criteria) this;
        }

        public Criteria andBShoplogoNotEqualTo(String value) {
            addCriterion("b_shopLogo <>", value, "bShoplogo");
            return (Criteria) this;
        }

        public Criteria andBShoplogoGreaterThan(String value) {
            addCriterion("b_shopLogo >", value, "bShoplogo");
            return (Criteria) this;
        }

        public Criteria andBShoplogoGreaterThanOrEqualTo(String value) {
            addCriterion("b_shopLogo >=", value, "bShoplogo");
            return (Criteria) this;
        }

        public Criteria andBShoplogoLessThan(String value) {
            addCriterion("b_shopLogo <", value, "bShoplogo");
            return (Criteria) this;
        }

        public Criteria andBShoplogoLessThanOrEqualTo(String value) {
            addCriterion("b_shopLogo <=", value, "bShoplogo");
            return (Criteria) this;
        }

        public Criteria andBShoplogoLike(String value) {
            addCriterion("b_shopLogo like", value, "bShoplogo");
            return (Criteria) this;
        }

        public Criteria andBShoplogoNotLike(String value) {
            addCriterion("b_shopLogo not like", value, "bShoplogo");
            return (Criteria) this;
        }

        public Criteria andBShoplogoIn(List<String> values) {
            addCriterion("b_shopLogo in", values, "bShoplogo");
            return (Criteria) this;
        }

        public Criteria andBShoplogoNotIn(List<String> values) {
            addCriterion("b_shopLogo not in", values, "bShoplogo");
            return (Criteria) this;
        }

        public Criteria andBShoplogoBetween(String value1, String value2) {
            addCriterion("b_shopLogo between", value1, value2, "bShoplogo");
            return (Criteria) this;
        }

        public Criteria andBShoplogoNotBetween(String value1, String value2) {
            addCriterion("b_shopLogo not between", value1, value2, "bShoplogo");
            return (Criteria) this;
        }

        public Criteria andBNoticeIsNull() {
            addCriterion("b_notice is null");
            return (Criteria) this;
        }

        public Criteria andBNoticeIsNotNull() {
            addCriterion("b_notice is not null");
            return (Criteria) this;
        }

        public Criteria andBNoticeEqualTo(String value) {
            addCriterion("b_notice =", value, "bNotice");
            return (Criteria) this;
        }

        public Criteria andBNoticeNotEqualTo(String value) {
            addCriterion("b_notice <>", value, "bNotice");
            return (Criteria) this;
        }

        public Criteria andBNoticeGreaterThan(String value) {
            addCriterion("b_notice >", value, "bNotice");
            return (Criteria) this;
        }

        public Criteria andBNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("b_notice >=", value, "bNotice");
            return (Criteria) this;
        }

        public Criteria andBNoticeLessThan(String value) {
            addCriterion("b_notice <", value, "bNotice");
            return (Criteria) this;
        }

        public Criteria andBNoticeLessThanOrEqualTo(String value) {
            addCriterion("b_notice <=", value, "bNotice");
            return (Criteria) this;
        }

        public Criteria andBNoticeLike(String value) {
            addCriterion("b_notice like", value, "bNotice");
            return (Criteria) this;
        }

        public Criteria andBNoticeNotLike(String value) {
            addCriterion("b_notice not like", value, "bNotice");
            return (Criteria) this;
        }

        public Criteria andBNoticeIn(List<String> values) {
            addCriterion("b_notice in", values, "bNotice");
            return (Criteria) this;
        }

        public Criteria andBNoticeNotIn(List<String> values) {
            addCriterion("b_notice not in", values, "bNotice");
            return (Criteria) this;
        }

        public Criteria andBNoticeBetween(String value1, String value2) {
            addCriterion("b_notice between", value1, value2, "bNotice");
            return (Criteria) this;
        }

        public Criteria andBNoticeNotBetween(String value1, String value2) {
            addCriterion("b_notice not between", value1, value2, "bNotice");
            return (Criteria) this;
        }

        public Criteria andBIsbanIsNull() {
            addCriterion("b_isBan is null");
            return (Criteria) this;
        }

        public Criteria andBIsbanIsNotNull() {
            addCriterion("b_isBan is not null");
            return (Criteria) this;
        }

        public Criteria andBIsbanEqualTo(Integer value) {
            addCriterion("b_isBan =", value, "bIsban");
            return (Criteria) this;
        }

        public Criteria andBIsbanNotEqualTo(Integer value) {
            addCriterion("b_isBan <>", value, "bIsban");
            return (Criteria) this;
        }

        public Criteria andBIsbanGreaterThan(Integer value) {
            addCriterion("b_isBan >", value, "bIsban");
            return (Criteria) this;
        }

        public Criteria andBIsbanGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_isBan >=", value, "bIsban");
            return (Criteria) this;
        }

        public Criteria andBIsbanLessThan(Integer value) {
            addCriterion("b_isBan <", value, "bIsban");
            return (Criteria) this;
        }

        public Criteria andBIsbanLessThanOrEqualTo(Integer value) {
            addCriterion("b_isBan <=", value, "bIsban");
            return (Criteria) this;
        }

        public Criteria andBIsbanIn(List<Integer> values) {
            addCriterion("b_isBan in", values, "bIsban");
            return (Criteria) this;
        }

        public Criteria andBIsbanNotIn(List<Integer> values) {
            addCriterion("b_isBan not in", values, "bIsban");
            return (Criteria) this;
        }

        public Criteria andBIsbanBetween(Integer value1, Integer value2) {
            addCriterion("b_isBan between", value1, value2, "bIsban");
            return (Criteria) this;
        }

        public Criteria andBIsbanNotBetween(Integer value1, Integer value2) {
            addCriterion("b_isBan not between", value1, value2, "bIsban");
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