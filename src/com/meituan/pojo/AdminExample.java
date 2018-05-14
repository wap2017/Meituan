package com.meituan.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(String value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(String value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(String value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(String value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(String value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(String value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLike(String value) {
            addCriterion("a_id like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotLike(String value) {
            addCriterion("a_id not like", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<String> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<String> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(String value1, String value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(String value1, String value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAAccountIsNull() {
            addCriterion("a_account is null");
            return (Criteria) this;
        }

        public Criteria andAAccountIsNotNull() {
            addCriterion("a_account is not null");
            return (Criteria) this;
        }

        public Criteria andAAccountEqualTo(String value) {
            addCriterion("a_account =", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountNotEqualTo(String value) {
            addCriterion("a_account <>", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountGreaterThan(String value) {
            addCriterion("a_account >", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountGreaterThanOrEqualTo(String value) {
            addCriterion("a_account >=", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountLessThan(String value) {
            addCriterion("a_account <", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountLessThanOrEqualTo(String value) {
            addCriterion("a_account <=", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountLike(String value) {
            addCriterion("a_account like", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountNotLike(String value) {
            addCriterion("a_account not like", value, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountIn(List<String> values) {
            addCriterion("a_account in", values, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountNotIn(List<String> values) {
            addCriterion("a_account not in", values, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountBetween(String value1, String value2) {
            addCriterion("a_account between", value1, value2, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAAccountNotBetween(String value1, String value2) {
            addCriterion("a_account not between", value1, value2, "aAccount");
            return (Criteria) this;
        }

        public Criteria andAPwdIsNull() {
            addCriterion("a_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAPwdIsNotNull() {
            addCriterion("a_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAPwdEqualTo(String value) {
            addCriterion("a_pwd =", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdNotEqualTo(String value) {
            addCriterion("a_pwd <>", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdGreaterThan(String value) {
            addCriterion("a_pwd >", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdGreaterThanOrEqualTo(String value) {
            addCriterion("a_pwd >=", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdLessThan(String value) {
            addCriterion("a_pwd <", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdLessThanOrEqualTo(String value) {
            addCriterion("a_pwd <=", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdLike(String value) {
            addCriterion("a_pwd like", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdNotLike(String value) {
            addCriterion("a_pwd not like", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdIn(List<String> values) {
            addCriterion("a_pwd in", values, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdNotIn(List<String> values) {
            addCriterion("a_pwd not in", values, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdBetween(String value1, String value2) {
            addCriterion("a_pwd between", value1, value2, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdNotBetween(String value1, String value2) {
            addCriterion("a_pwd not between", value1, value2, "aPwd");
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