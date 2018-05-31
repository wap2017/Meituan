package com.meituan.pojo;

import java.util.ArrayList;
import java.util.List;

public class FeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedbackExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(String value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(String value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(String value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(String value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(String value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(String value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLike(String value) {
            addCriterion("f_id like", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotLike(String value) {
            addCriterion("f_id not like", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<String> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<String> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(String value1, String value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(String value1, String value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFReceiveidIsNull() {
            addCriterion("f_receiveId is null");
            return (Criteria) this;
        }

        public Criteria andFReceiveidIsNotNull() {
            addCriterion("f_receiveId is not null");
            return (Criteria) this;
        }

        public Criteria andFReceiveidEqualTo(String value) {
            addCriterion("f_receiveId =", value, "fReceiveid");
            return (Criteria) this;
        }

        public Criteria andFReceiveidNotEqualTo(String value) {
            addCriterion("f_receiveId <>", value, "fReceiveid");
            return (Criteria) this;
        }

        public Criteria andFReceiveidGreaterThan(String value) {
            addCriterion("f_receiveId >", value, "fReceiveid");
            return (Criteria) this;
        }

        public Criteria andFReceiveidGreaterThanOrEqualTo(String value) {
            addCriterion("f_receiveId >=", value, "fReceiveid");
            return (Criteria) this;
        }

        public Criteria andFReceiveidLessThan(String value) {
            addCriterion("f_receiveId <", value, "fReceiveid");
            return (Criteria) this;
        }

        public Criteria andFReceiveidLessThanOrEqualTo(String value) {
            addCriterion("f_receiveId <=", value, "fReceiveid");
            return (Criteria) this;
        }

        public Criteria andFReceiveidLike(String value) {
            addCriterion("f_receiveId like", value, "fReceiveid");
            return (Criteria) this;
        }

        public Criteria andFReceiveidNotLike(String value) {
            addCriterion("f_receiveId not like", value, "fReceiveid");
            return (Criteria) this;
        }

        public Criteria andFReceiveidIn(List<String> values) {
            addCriterion("f_receiveId in", values, "fReceiveid");
            return (Criteria) this;
        }

        public Criteria andFReceiveidNotIn(List<String> values) {
            addCriterion("f_receiveId not in", values, "fReceiveid");
            return (Criteria) this;
        }

        public Criteria andFReceiveidBetween(String value1, String value2) {
            addCriterion("f_receiveId between", value1, value2, "fReceiveid");
            return (Criteria) this;
        }

        public Criteria andFReceiveidNotBetween(String value1, String value2) {
            addCriterion("f_receiveId not between", value1, value2, "fReceiveid");
            return (Criteria) this;
        }

        public Criteria andFContentIsNull() {
            addCriterion("f_content is null");
            return (Criteria) this;
        }

        public Criteria andFContentIsNotNull() {
            addCriterion("f_content is not null");
            return (Criteria) this;
        }

        public Criteria andFContentEqualTo(String value) {
            addCriterion("f_content =", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentNotEqualTo(String value) {
            addCriterion("f_content <>", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentGreaterThan(String value) {
            addCriterion("f_content >", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentGreaterThanOrEqualTo(String value) {
            addCriterion("f_content >=", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentLessThan(String value) {
            addCriterion("f_content <", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentLessThanOrEqualTo(String value) {
            addCriterion("f_content <=", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentLike(String value) {
            addCriterion("f_content like", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentNotLike(String value) {
            addCriterion("f_content not like", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentIn(List<String> values) {
            addCriterion("f_content in", values, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentNotIn(List<String> values) {
            addCriterion("f_content not in", values, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentBetween(String value1, String value2) {
            addCriterion("f_content between", value1, value2, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentNotBetween(String value1, String value2) {
            addCriterion("f_content not between", value1, value2, "fContent");
            return (Criteria) this;
        }

        public Criteria andFReadedIsNull() {
            addCriterion("f_readed is null");
            return (Criteria) this;
        }

        public Criteria andFReadedIsNotNull() {
            addCriterion("f_readed is not null");
            return (Criteria) this;
        }

        public Criteria andFReadedEqualTo(Integer value) {
            addCriterion("f_readed =", value, "fReaded");
            return (Criteria) this;
        }

        public Criteria andFReadedNotEqualTo(Integer value) {
            addCriterion("f_readed <>", value, "fReaded");
            return (Criteria) this;
        }

        public Criteria andFReadedGreaterThan(Integer value) {
            addCriterion("f_readed >", value, "fReaded");
            return (Criteria) this;
        }

        public Criteria andFReadedGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_readed >=", value, "fReaded");
            return (Criteria) this;
        }

        public Criteria andFReadedLessThan(Integer value) {
            addCriterion("f_readed <", value, "fReaded");
            return (Criteria) this;
        }

        public Criteria andFReadedLessThanOrEqualTo(Integer value) {
            addCriterion("f_readed <=", value, "fReaded");
            return (Criteria) this;
        }

        public Criteria andFReadedIn(List<Integer> values) {
            addCriterion("f_readed in", values, "fReaded");
            return (Criteria) this;
        }

        public Criteria andFReadedNotIn(List<Integer> values) {
            addCriterion("f_readed not in", values, "fReaded");
            return (Criteria) this;
        }

        public Criteria andFReadedBetween(Integer value1, Integer value2) {
            addCriterion("f_readed between", value1, value2, "fReaded");
            return (Criteria) this;
        }

        public Criteria andFReadedNotBetween(Integer value1, Integer value2) {
            addCriterion("f_readed not between", value1, value2, "fReaded");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(String value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(String value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(String value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(String value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(String value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(String value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLike(String value) {
            addCriterion("m_id like", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotLike(String value) {
            addCriterion("m_id not like", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<String> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<String> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(String value1, String value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(String value1, String value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(String value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(String value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(String value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(String value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(String value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(String value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLike(String value) {
            addCriterion("o_id like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotLike(String value) {
            addCriterion("o_id not like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<String> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<String> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(String value1, String value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(String value1, String value2) {
            addCriterion("o_id not between", value1, value2, "oId");
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