package com.meituan.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodTypeExample() {
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

        public Criteria andGTypeIsNull() {
            addCriterion("g_type is null");
            return (Criteria) this;
        }

        public Criteria andGTypeIsNotNull() {
            addCriterion("g_type is not null");
            return (Criteria) this;
        }

        public Criteria andGTypeEqualTo(String value) {
            addCriterion("g_type =", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotEqualTo(String value) {
            addCriterion("g_type <>", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeGreaterThan(String value) {
            addCriterion("g_type >", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeGreaterThanOrEqualTo(String value) {
            addCriterion("g_type >=", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLessThan(String value) {
            addCriterion("g_type <", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLessThanOrEqualTo(String value) {
            addCriterion("g_type <=", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeLike(String value) {
            addCriterion("g_type like", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotLike(String value) {
            addCriterion("g_type not like", value, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeIn(List<String> values) {
            addCriterion("g_type in", values, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotIn(List<String> values) {
            addCriterion("g_type not in", values, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeBetween(String value1, String value2) {
            addCriterion("g_type between", value1, value2, "gType");
            return (Criteria) this;
        }

        public Criteria andGTypeNotBetween(String value1, String value2) {
            addCriterion("g_type not between", value1, value2, "gType");
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

        public Criteria andGTypenameIsNull() {
            addCriterion("g_typeName is null");
            return (Criteria) this;
        }

        public Criteria andGTypenameIsNotNull() {
            addCriterion("g_typeName is not null");
            return (Criteria) this;
        }

        public Criteria andGTypenameEqualTo(String value) {
            addCriterion("g_typeName =", value, "gTypename");
            return (Criteria) this;
        }

        public Criteria andGTypenameNotEqualTo(String value) {
            addCriterion("g_typeName <>", value, "gTypename");
            return (Criteria) this;
        }

        public Criteria andGTypenameGreaterThan(String value) {
            addCriterion("g_typeName >", value, "gTypename");
            return (Criteria) this;
        }

        public Criteria andGTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("g_typeName >=", value, "gTypename");
            return (Criteria) this;
        }

        public Criteria andGTypenameLessThan(String value) {
            addCriterion("g_typeName <", value, "gTypename");
            return (Criteria) this;
        }

        public Criteria andGTypenameLessThanOrEqualTo(String value) {
            addCriterion("g_typeName <=", value, "gTypename");
            return (Criteria) this;
        }

        public Criteria andGTypenameLike(String value) {
            addCriterion("g_typeName like", value, "gTypename");
            return (Criteria) this;
        }

        public Criteria andGTypenameNotLike(String value) {
            addCriterion("g_typeName not like", value, "gTypename");
            return (Criteria) this;
        }

        public Criteria andGTypenameIn(List<String> values) {
            addCriterion("g_typeName in", values, "gTypename");
            return (Criteria) this;
        }

        public Criteria andGTypenameNotIn(List<String> values) {
            addCriterion("g_typeName not in", values, "gTypename");
            return (Criteria) this;
        }

        public Criteria andGTypenameBetween(String value1, String value2) {
            addCriterion("g_typeName between", value1, value2, "gTypename");
            return (Criteria) this;
        }

        public Criteria andGTypenameNotBetween(String value1, String value2) {
            addCriterion("g_typeName not between", value1, value2, "gTypename");
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