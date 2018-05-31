package com.meituan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMReceiveidIsNull() {
            addCriterion("m_receiveId is null");
            return (Criteria) this;
        }

        public Criteria andMReceiveidIsNotNull() {
            addCriterion("m_receiveId is not null");
            return (Criteria) this;
        }

        public Criteria andMReceiveidEqualTo(String value) {
            addCriterion("m_receiveId =", value, "mReceiveid");
            return (Criteria) this;
        }

        public Criteria andMReceiveidNotEqualTo(String value) {
            addCriterion("m_receiveId <>", value, "mReceiveid");
            return (Criteria) this;
        }

        public Criteria andMReceiveidGreaterThan(String value) {
            addCriterion("m_receiveId >", value, "mReceiveid");
            return (Criteria) this;
        }

        public Criteria andMReceiveidGreaterThanOrEqualTo(String value) {
            addCriterion("m_receiveId >=", value, "mReceiveid");
            return (Criteria) this;
        }

        public Criteria andMReceiveidLessThan(String value) {
            addCriterion("m_receiveId <", value, "mReceiveid");
            return (Criteria) this;
        }

        public Criteria andMReceiveidLessThanOrEqualTo(String value) {
            addCriterion("m_receiveId <=", value, "mReceiveid");
            return (Criteria) this;
        }

        public Criteria andMReceiveidLike(String value) {
            addCriterion("m_receiveId like", value, "mReceiveid");
            return (Criteria) this;
        }

        public Criteria andMReceiveidNotLike(String value) {
            addCriterion("m_receiveId not like", value, "mReceiveid");
            return (Criteria) this;
        }

        public Criteria andMReceiveidIn(List<String> values) {
            addCriterion("m_receiveId in", values, "mReceiveid");
            return (Criteria) this;
        }

        public Criteria andMReceiveidNotIn(List<String> values) {
            addCriterion("m_receiveId not in", values, "mReceiveid");
            return (Criteria) this;
        }

        public Criteria andMReceiveidBetween(String value1, String value2) {
            addCriterion("m_receiveId between", value1, value2, "mReceiveid");
            return (Criteria) this;
        }

        public Criteria andMReceiveidNotBetween(String value1, String value2) {
            addCriterion("m_receiveId not between", value1, value2, "mReceiveid");
            return (Criteria) this;
        }

        public Criteria andMDateIsNull() {
            addCriterion("m_date is null");
            return (Criteria) this;
        }

        public Criteria andMDateIsNotNull() {
            addCriterion("m_date is not null");
            return (Criteria) this;
        }

        public Criteria andMDateEqualTo(Date value) {
            addCriterion("m_date =", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotEqualTo(Date value) {
            addCriterion("m_date <>", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateGreaterThan(Date value) {
            addCriterion("m_date >", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateGreaterThanOrEqualTo(Date value) {
            addCriterion("m_date >=", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateLessThan(Date value) {
            addCriterion("m_date <", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateLessThanOrEqualTo(Date value) {
            addCriterion("m_date <=", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateIn(List<Date> values) {
            addCriterion("m_date in", values, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotIn(List<Date> values) {
            addCriterion("m_date not in", values, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateBetween(Date value1, Date value2) {
            addCriterion("m_date between", value1, value2, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotBetween(Date value1, Date value2) {
            addCriterion("m_date not between", value1, value2, "mDate");
            return (Criteria) this;
        }

        public Criteria andMContentIsNull() {
            addCriterion("m_content is null");
            return (Criteria) this;
        }

        public Criteria andMContentIsNotNull() {
            addCriterion("m_content is not null");
            return (Criteria) this;
        }

        public Criteria andMContentEqualTo(String value) {
            addCriterion("m_content =", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotEqualTo(String value) {
            addCriterion("m_content <>", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentGreaterThan(String value) {
            addCriterion("m_content >", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentGreaterThanOrEqualTo(String value) {
            addCriterion("m_content >=", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentLessThan(String value) {
            addCriterion("m_content <", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentLessThanOrEqualTo(String value) {
            addCriterion("m_content <=", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentLike(String value) {
            addCriterion("m_content like", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotLike(String value) {
            addCriterion("m_content not like", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentIn(List<String> values) {
            addCriterion("m_content in", values, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotIn(List<String> values) {
            addCriterion("m_content not in", values, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentBetween(String value1, String value2) {
            addCriterion("m_content between", value1, value2, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotBetween(String value1, String value2) {
            addCriterion("m_content not between", value1, value2, "mContent");
            return (Criteria) this;
        }

        public Criteria andMReadedIsNull() {
            addCriterion("m_readed is null");
            return (Criteria) this;
        }

        public Criteria andMReadedIsNotNull() {
            addCriterion("m_readed is not null");
            return (Criteria) this;
        }

        public Criteria andMReadedEqualTo(String value) {
            addCriterion("m_readed =", value, "mReaded");
            return (Criteria) this;
        }

        public Criteria andMReadedNotEqualTo(String value) {
            addCriterion("m_readed <>", value, "mReaded");
            return (Criteria) this;
        }

        public Criteria andMReadedGreaterThan(String value) {
            addCriterion("m_readed >", value, "mReaded");
            return (Criteria) this;
        }

        public Criteria andMReadedGreaterThanOrEqualTo(String value) {
            addCriterion("m_readed >=", value, "mReaded");
            return (Criteria) this;
        }

        public Criteria andMReadedLessThan(String value) {
            addCriterion("m_readed <", value, "mReaded");
            return (Criteria) this;
        }

        public Criteria andMReadedLessThanOrEqualTo(String value) {
            addCriterion("m_readed <=", value, "mReaded");
            return (Criteria) this;
        }

        public Criteria andMReadedLike(String value) {
            addCriterion("m_readed like", value, "mReaded");
            return (Criteria) this;
        }

        public Criteria andMReadedNotLike(String value) {
            addCriterion("m_readed not like", value, "mReaded");
            return (Criteria) this;
        }

        public Criteria andMReadedIn(List<String> values) {
            addCriterion("m_readed in", values, "mReaded");
            return (Criteria) this;
        }

        public Criteria andMReadedNotIn(List<String> values) {
            addCriterion("m_readed not in", values, "mReaded");
            return (Criteria) this;
        }

        public Criteria andMReadedBetween(String value1, String value2) {
            addCriterion("m_readed between", value1, value2, "mReaded");
            return (Criteria) this;
        }

        public Criteria andMReadedNotBetween(String value1, String value2) {
            addCriterion("m_readed not between", value1, value2, "mReaded");
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