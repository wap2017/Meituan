package com.meituan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("p_id like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("p_id not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("u_id like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("u_id not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andPStateIsNull() {
            addCriterion("p_State is null");
            return (Criteria) this;
        }

        public Criteria andPStateIsNotNull() {
            addCriterion("p_State is not null");
            return (Criteria) this;
        }

        public Criteria andPStateEqualTo(String value) {
            addCriterion("p_State =", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotEqualTo(String value) {
            addCriterion("p_State <>", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateGreaterThan(String value) {
            addCriterion("p_State >", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateGreaterThanOrEqualTo(String value) {
            addCriterion("p_State >=", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLessThan(String value) {
            addCriterion("p_State <", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLessThanOrEqualTo(String value) {
            addCriterion("p_State <=", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLike(String value) {
            addCriterion("p_State like", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotLike(String value) {
            addCriterion("p_State not like", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateIn(List<String> values) {
            addCriterion("p_State in", values, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotIn(List<String> values) {
            addCriterion("p_State not in", values, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateBetween(String value1, String value2) {
            addCriterion("p_State between", value1, value2, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotBetween(String value1, String value2) {
            addCriterion("p_State not between", value1, value2, "pState");
            return (Criteria) this;
        }

        public Criteria andPAddressidIsNull() {
            addCriterion("p_addressId is null");
            return (Criteria) this;
        }

        public Criteria andPAddressidIsNotNull() {
            addCriterion("p_addressId is not null");
            return (Criteria) this;
        }

        public Criteria andPAddressidEqualTo(String value) {
            addCriterion("p_addressId =", value, "pAddressid");
            return (Criteria) this;
        }

        public Criteria andPAddressidNotEqualTo(String value) {
            addCriterion("p_addressId <>", value, "pAddressid");
            return (Criteria) this;
        }

        public Criteria andPAddressidGreaterThan(String value) {
            addCriterion("p_addressId >", value, "pAddressid");
            return (Criteria) this;
        }

        public Criteria andPAddressidGreaterThanOrEqualTo(String value) {
            addCriterion("p_addressId >=", value, "pAddressid");
            return (Criteria) this;
        }

        public Criteria andPAddressidLessThan(String value) {
            addCriterion("p_addressId <", value, "pAddressid");
            return (Criteria) this;
        }

        public Criteria andPAddressidLessThanOrEqualTo(String value) {
            addCriterion("p_addressId <=", value, "pAddressid");
            return (Criteria) this;
        }

        public Criteria andPAddressidLike(String value) {
            addCriterion("p_addressId like", value, "pAddressid");
            return (Criteria) this;
        }

        public Criteria andPAddressidNotLike(String value) {
            addCriterion("p_addressId not like", value, "pAddressid");
            return (Criteria) this;
        }

        public Criteria andPAddressidIn(List<String> values) {
            addCriterion("p_addressId in", values, "pAddressid");
            return (Criteria) this;
        }

        public Criteria andPAddressidNotIn(List<String> values) {
            addCriterion("p_addressId not in", values, "pAddressid");
            return (Criteria) this;
        }

        public Criteria andPAddressidBetween(String value1, String value2) {
            addCriterion("p_addressId between", value1, value2, "pAddressid");
            return (Criteria) this;
        }

        public Criteria andPAddressidNotBetween(String value1, String value2) {
            addCriterion("p_addressId not between", value1, value2, "pAddressid");
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

        public Criteria andPOrderremarkIsNull() {
            addCriterion("p_orderRemark is null");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkIsNotNull() {
            addCriterion("p_orderRemark is not null");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkEqualTo(String value) {
            addCriterion("p_orderRemark =", value, "pOrderremark");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkNotEqualTo(String value) {
            addCriterion("p_orderRemark <>", value, "pOrderremark");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkGreaterThan(String value) {
            addCriterion("p_orderRemark >", value, "pOrderremark");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkGreaterThanOrEqualTo(String value) {
            addCriterion("p_orderRemark >=", value, "pOrderremark");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkLessThan(String value) {
            addCriterion("p_orderRemark <", value, "pOrderremark");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkLessThanOrEqualTo(String value) {
            addCriterion("p_orderRemark <=", value, "pOrderremark");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkLike(String value) {
            addCriterion("p_orderRemark like", value, "pOrderremark");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkNotLike(String value) {
            addCriterion("p_orderRemark not like", value, "pOrderremark");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkIn(List<String> values) {
            addCriterion("p_orderRemark in", values, "pOrderremark");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkNotIn(List<String> values) {
            addCriterion("p_orderRemark not in", values, "pOrderremark");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkBetween(String value1, String value2) {
            addCriterion("p_orderRemark between", value1, value2, "pOrderremark");
            return (Criteria) this;
        }

        public Criteria andPOrderremarkNotBetween(String value1, String value2) {
            addCriterion("p_orderRemark not between", value1, value2, "pOrderremark");
            return (Criteria) this;
        }

        public Criteria andPCanceltimeIsNull() {
            addCriterion("p_cancelTime is null");
            return (Criteria) this;
        }

        public Criteria andPCanceltimeIsNotNull() {
            addCriterion("p_cancelTime is not null");
            return (Criteria) this;
        }

        public Criteria andPCanceltimeEqualTo(Date value) {
            addCriterion("p_cancelTime =", value, "pCanceltime");
            return (Criteria) this;
        }

        public Criteria andPCanceltimeNotEqualTo(Date value) {
            addCriterion("p_cancelTime <>", value, "pCanceltime");
            return (Criteria) this;
        }

        public Criteria andPCanceltimeGreaterThan(Date value) {
            addCriterion("p_cancelTime >", value, "pCanceltime");
            return (Criteria) this;
        }

        public Criteria andPCanceltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("p_cancelTime >=", value, "pCanceltime");
            return (Criteria) this;
        }

        public Criteria andPCanceltimeLessThan(Date value) {
            addCriterion("p_cancelTime <", value, "pCanceltime");
            return (Criteria) this;
        }

        public Criteria andPCanceltimeLessThanOrEqualTo(Date value) {
            addCriterion("p_cancelTime <=", value, "pCanceltime");
            return (Criteria) this;
        }

        public Criteria andPCanceltimeIn(List<Date> values) {
            addCriterion("p_cancelTime in", values, "pCanceltime");
            return (Criteria) this;
        }

        public Criteria andPCanceltimeNotIn(List<Date> values) {
            addCriterion("p_cancelTime not in", values, "pCanceltime");
            return (Criteria) this;
        }

        public Criteria andPCanceltimeBetween(Date value1, Date value2) {
            addCriterion("p_cancelTime between", value1, value2, "pCanceltime");
            return (Criteria) this;
        }

        public Criteria andPCanceltimeNotBetween(Date value1, Date value2) {
            addCriterion("p_cancelTime not between", value1, value2, "pCanceltime");
            return (Criteria) this;
        }

        public Criteria andPOpentimeIsNull() {
            addCriterion("p_openTime is null");
            return (Criteria) this;
        }

        public Criteria andPOpentimeIsNotNull() {
            addCriterion("p_openTime is not null");
            return (Criteria) this;
        }

        public Criteria andPOpentimeEqualTo(Date value) {
            addCriterion("p_openTime =", value, "pOpentime");
            return (Criteria) this;
        }

        public Criteria andPOpentimeNotEqualTo(Date value) {
            addCriterion("p_openTime <>", value, "pOpentime");
            return (Criteria) this;
        }

        public Criteria andPOpentimeGreaterThan(Date value) {
            addCriterion("p_openTime >", value, "pOpentime");
            return (Criteria) this;
        }

        public Criteria andPOpentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("p_openTime >=", value, "pOpentime");
            return (Criteria) this;
        }

        public Criteria andPOpentimeLessThan(Date value) {
            addCriterion("p_openTime <", value, "pOpentime");
            return (Criteria) this;
        }

        public Criteria andPOpentimeLessThanOrEqualTo(Date value) {
            addCriterion("p_openTime <=", value, "pOpentime");
            return (Criteria) this;
        }

        public Criteria andPOpentimeIn(List<Date> values) {
            addCriterion("p_openTime in", values, "pOpentime");
            return (Criteria) this;
        }

        public Criteria andPOpentimeNotIn(List<Date> values) {
            addCriterion("p_openTime not in", values, "pOpentime");
            return (Criteria) this;
        }

        public Criteria andPOpentimeBetween(Date value1, Date value2) {
            addCriterion("p_openTime between", value1, value2, "pOpentime");
            return (Criteria) this;
        }

        public Criteria andPOpentimeNotBetween(Date value1, Date value2) {
            addCriterion("p_openTime not between", value1, value2, "pOpentime");
            return (Criteria) this;
        }

        public Criteria andPReceivetimeIsNull() {
            addCriterion("p_receiveTime is null");
            return (Criteria) this;
        }

        public Criteria andPReceivetimeIsNotNull() {
            addCriterion("p_receiveTime is not null");
            return (Criteria) this;
        }

        public Criteria andPReceivetimeEqualTo(Date value) {
            addCriterion("p_receiveTime =", value, "pReceivetime");
            return (Criteria) this;
        }

        public Criteria andPReceivetimeNotEqualTo(Date value) {
            addCriterion("p_receiveTime <>", value, "pReceivetime");
            return (Criteria) this;
        }

        public Criteria andPReceivetimeGreaterThan(Date value) {
            addCriterion("p_receiveTime >", value, "pReceivetime");
            return (Criteria) this;
        }

        public Criteria andPReceivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("p_receiveTime >=", value, "pReceivetime");
            return (Criteria) this;
        }

        public Criteria andPReceivetimeLessThan(Date value) {
            addCriterion("p_receiveTime <", value, "pReceivetime");
            return (Criteria) this;
        }

        public Criteria andPReceivetimeLessThanOrEqualTo(Date value) {
            addCriterion("p_receiveTime <=", value, "pReceivetime");
            return (Criteria) this;
        }

        public Criteria andPReceivetimeIn(List<Date> values) {
            addCriterion("p_receiveTime in", values, "pReceivetime");
            return (Criteria) this;
        }

        public Criteria andPReceivetimeNotIn(List<Date> values) {
            addCriterion("p_receiveTime not in", values, "pReceivetime");
            return (Criteria) this;
        }

        public Criteria andPReceivetimeBetween(Date value1, Date value2) {
            addCriterion("p_receiveTime between", value1, value2, "pReceivetime");
            return (Criteria) this;
        }

        public Criteria andPReceivetimeNotBetween(Date value1, Date value2) {
            addCriterion("p_receiveTime not between", value1, value2, "pReceivetime");
            return (Criteria) this;
        }

        public Criteria andPFinishtimeIsNull() {
            addCriterion("p_finishTime is null");
            return (Criteria) this;
        }

        public Criteria andPFinishtimeIsNotNull() {
            addCriterion("p_finishTime is not null");
            return (Criteria) this;
        }

        public Criteria andPFinishtimeEqualTo(Date value) {
            addCriterion("p_finishTime =", value, "pFinishtime");
            return (Criteria) this;
        }

        public Criteria andPFinishtimeNotEqualTo(Date value) {
            addCriterion("p_finishTime <>", value, "pFinishtime");
            return (Criteria) this;
        }

        public Criteria andPFinishtimeGreaterThan(Date value) {
            addCriterion("p_finishTime >", value, "pFinishtime");
            return (Criteria) this;
        }

        public Criteria andPFinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("p_finishTime >=", value, "pFinishtime");
            return (Criteria) this;
        }

        public Criteria andPFinishtimeLessThan(Date value) {
            addCriterion("p_finishTime <", value, "pFinishtime");
            return (Criteria) this;
        }

        public Criteria andPFinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("p_finishTime <=", value, "pFinishtime");
            return (Criteria) this;
        }

        public Criteria andPFinishtimeIn(List<Date> values) {
            addCriterion("p_finishTime in", values, "pFinishtime");
            return (Criteria) this;
        }

        public Criteria andPFinishtimeNotIn(List<Date> values) {
            addCriterion("p_finishTime not in", values, "pFinishtime");
            return (Criteria) this;
        }

        public Criteria andPFinishtimeBetween(Date value1, Date value2) {
            addCriterion("p_finishTime between", value1, value2, "pFinishtime");
            return (Criteria) this;
        }

        public Criteria andPFinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("p_finishTime not between", value1, value2, "pFinishtime");
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