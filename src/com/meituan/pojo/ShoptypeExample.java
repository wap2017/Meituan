package com.meituan.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShoptypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoptypeExample() {
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

        public Criteria andShoptypeIdIsNull() {
            addCriterion("shoptype_id is null");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdIsNotNull() {
            addCriterion("shoptype_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdEqualTo(String value) {
            addCriterion("shoptype_id =", value, "shoptypeId");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdNotEqualTo(String value) {
            addCriterion("shoptype_id <>", value, "shoptypeId");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdGreaterThan(String value) {
            addCriterion("shoptype_id >", value, "shoptypeId");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("shoptype_id >=", value, "shoptypeId");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdLessThan(String value) {
            addCriterion("shoptype_id <", value, "shoptypeId");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdLessThanOrEqualTo(String value) {
            addCriterion("shoptype_id <=", value, "shoptypeId");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdLike(String value) {
            addCriterion("shoptype_id like", value, "shoptypeId");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdNotLike(String value) {
            addCriterion("shoptype_id not like", value, "shoptypeId");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdIn(List<String> values) {
            addCriterion("shoptype_id in", values, "shoptypeId");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdNotIn(List<String> values) {
            addCriterion("shoptype_id not in", values, "shoptypeId");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdBetween(String value1, String value2) {
            addCriterion("shoptype_id between", value1, value2, "shoptypeId");
            return (Criteria) this;
        }

        public Criteria andShoptypeIdNotBetween(String value1, String value2) {
            addCriterion("shoptype_id not between", value1, value2, "shoptypeId");
            return (Criteria) this;
        }

        public Criteria andShoptypeIsNull() {
            addCriterion("shoptype is null");
            return (Criteria) this;
        }

        public Criteria andShoptypeIsNotNull() {
            addCriterion("shoptype is not null");
            return (Criteria) this;
        }

        public Criteria andShoptypeEqualTo(String value) {
            addCriterion("shoptype =", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeNotEqualTo(String value) {
            addCriterion("shoptype <>", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeGreaterThan(String value) {
            addCriterion("shoptype >", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeGreaterThanOrEqualTo(String value) {
            addCriterion("shoptype >=", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeLessThan(String value) {
            addCriterion("shoptype <", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeLessThanOrEqualTo(String value) {
            addCriterion("shoptype <=", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeLike(String value) {
            addCriterion("shoptype like", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeNotLike(String value) {
            addCriterion("shoptype not like", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeIn(List<String> values) {
            addCriterion("shoptype in", values, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeNotIn(List<String> values) {
            addCriterion("shoptype not in", values, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeBetween(String value1, String value2) {
            addCriterion("shoptype between", value1, value2, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeNotBetween(String value1, String value2) {
            addCriterion("shoptype not between", value1, value2, "shoptype");
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