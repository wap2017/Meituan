package com.meituan.pojo;

import java.util.ArrayList;
import java.util.List;

public class RemainingsumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RemainingsumExample() {
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

        public Criteria andRsIdIsNull() {
            addCriterion("rs_id is null");
            return (Criteria) this;
        }

        public Criteria andRsIdIsNotNull() {
            addCriterion("rs_id is not null");
            return (Criteria) this;
        }

        public Criteria andRsIdEqualTo(String value) {
            addCriterion("rs_id =", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdNotEqualTo(String value) {
            addCriterion("rs_id <>", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdGreaterThan(String value) {
            addCriterion("rs_id >", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdGreaterThanOrEqualTo(String value) {
            addCriterion("rs_id >=", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdLessThan(String value) {
            addCriterion("rs_id <", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdLessThanOrEqualTo(String value) {
            addCriterion("rs_id <=", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdLike(String value) {
            addCriterion("rs_id like", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdNotLike(String value) {
            addCriterion("rs_id not like", value, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdIn(List<String> values) {
            addCriterion("rs_id in", values, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdNotIn(List<String> values) {
            addCriterion("rs_id not in", values, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdBetween(String value1, String value2) {
            addCriterion("rs_id between", value1, value2, "rsId");
            return (Criteria) this;
        }

        public Criteria andRsIdNotBetween(String value1, String value2) {
            addCriterion("rs_id not between", value1, value2, "rsId");
            return (Criteria) this;
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

        public Criteria andRsDepositmoneyIsNull() {
            addCriterion("rs_depositMoney is null");
            return (Criteria) this;
        }

        public Criteria andRsDepositmoneyIsNotNull() {
            addCriterion("rs_depositMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRsDepositmoneyEqualTo(Double value) {
            addCriterion("rs_depositMoney =", value, "rsDepositmoney");
            return (Criteria) this;
        }

        public Criteria andRsDepositmoneyNotEqualTo(Double value) {
            addCriterion("rs_depositMoney <>", value, "rsDepositmoney");
            return (Criteria) this;
        }

        public Criteria andRsDepositmoneyGreaterThan(Double value) {
            addCriterion("rs_depositMoney >", value, "rsDepositmoney");
            return (Criteria) this;
        }

        public Criteria andRsDepositmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_depositMoney >=", value, "rsDepositmoney");
            return (Criteria) this;
        }

        public Criteria andRsDepositmoneyLessThan(Double value) {
            addCriterion("rs_depositMoney <", value, "rsDepositmoney");
            return (Criteria) this;
        }

        public Criteria andRsDepositmoneyLessThanOrEqualTo(Double value) {
            addCriterion("rs_depositMoney <=", value, "rsDepositmoney");
            return (Criteria) this;
        }

        public Criteria andRsDepositmoneyIn(List<Double> values) {
            addCriterion("rs_depositMoney in", values, "rsDepositmoney");
            return (Criteria) this;
        }

        public Criteria andRsDepositmoneyNotIn(List<Double> values) {
            addCriterion("rs_depositMoney not in", values, "rsDepositmoney");
            return (Criteria) this;
        }

        public Criteria andRsDepositmoneyBetween(Double value1, Double value2) {
            addCriterion("rs_depositMoney between", value1, value2, "rsDepositmoney");
            return (Criteria) this;
        }

        public Criteria andRsDepositmoneyNotBetween(Double value1, Double value2) {
            addCriterion("rs_depositMoney not between", value1, value2, "rsDepositmoney");
            return (Criteria) this;
        }

        public Criteria andRsTotalmoneyIsNull() {
            addCriterion("rs_totalMoney is null");
            return (Criteria) this;
        }

        public Criteria andRsTotalmoneyIsNotNull() {
            addCriterion("rs_totalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRsTotalmoneyEqualTo(Double value) {
            addCriterion("rs_totalMoney =", value, "rsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andRsTotalmoneyNotEqualTo(Double value) {
            addCriterion("rs_totalMoney <>", value, "rsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andRsTotalmoneyGreaterThan(Double value) {
            addCriterion("rs_totalMoney >", value, "rsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andRsTotalmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("rs_totalMoney >=", value, "rsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andRsTotalmoneyLessThan(Double value) {
            addCriterion("rs_totalMoney <", value, "rsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andRsTotalmoneyLessThanOrEqualTo(Double value) {
            addCriterion("rs_totalMoney <=", value, "rsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andRsTotalmoneyIn(List<Double> values) {
            addCriterion("rs_totalMoney in", values, "rsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andRsTotalmoneyNotIn(List<Double> values) {
            addCriterion("rs_totalMoney not in", values, "rsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andRsTotalmoneyBetween(Double value1, Double value2) {
            addCriterion("rs_totalMoney between", value1, value2, "rsTotalmoney");
            return (Criteria) this;
        }

        public Criteria andRsTotalmoneyNotBetween(Double value1, Double value2) {
            addCriterion("rs_totalMoney not between", value1, value2, "rsTotalmoney");
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