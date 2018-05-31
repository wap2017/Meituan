package com.meituan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOMoneyIsNull() {
            addCriterion("o_money is null");
            return (Criteria) this;
        }

        public Criteria andOMoneyIsNotNull() {
            addCriterion("o_money is not null");
            return (Criteria) this;
        }

        public Criteria andOMoneyEqualTo(Double value) {
            addCriterion("o_money =", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyNotEqualTo(Double value) {
            addCriterion("o_money <>", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyGreaterThan(Double value) {
            addCriterion("o_money >", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("o_money >=", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyLessThan(Double value) {
            addCriterion("o_money <", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyLessThanOrEqualTo(Double value) {
            addCriterion("o_money <=", value, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyIn(List<Double> values) {
            addCriterion("o_money in", values, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyNotIn(List<Double> values) {
            addCriterion("o_money not in", values, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyBetween(Double value1, Double value2) {
            addCriterion("o_money between", value1, value2, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOMoneyNotBetween(Double value1, Double value2) {
            addCriterion("o_money not between", value1, value2, "oMoney");
            return (Criteria) this;
        }

        public Criteria andOOrderpriceIsNull() {
            addCriterion("o_orderPrice is null");
            return (Criteria) this;
        }

        public Criteria andOOrderpriceIsNotNull() {
            addCriterion("o_orderPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOOrderpriceEqualTo(Double value) {
            addCriterion("o_orderPrice =", value, "oOrderprice");
            return (Criteria) this;
        }

        public Criteria andOOrderpriceNotEqualTo(Double value) {
            addCriterion("o_orderPrice <>", value, "oOrderprice");
            return (Criteria) this;
        }

        public Criteria andOOrderpriceGreaterThan(Double value) {
            addCriterion("o_orderPrice >", value, "oOrderprice");
            return (Criteria) this;
        }

        public Criteria andOOrderpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("o_orderPrice >=", value, "oOrderprice");
            return (Criteria) this;
        }

        public Criteria andOOrderpriceLessThan(Double value) {
            addCriterion("o_orderPrice <", value, "oOrderprice");
            return (Criteria) this;
        }

        public Criteria andOOrderpriceLessThanOrEqualTo(Double value) {
            addCriterion("o_orderPrice <=", value, "oOrderprice");
            return (Criteria) this;
        }

        public Criteria andOOrderpriceIn(List<Double> values) {
            addCriterion("o_orderPrice in", values, "oOrderprice");
            return (Criteria) this;
        }

        public Criteria andOOrderpriceNotIn(List<Double> values) {
            addCriterion("o_orderPrice not in", values, "oOrderprice");
            return (Criteria) this;
        }

        public Criteria andOOrderpriceBetween(Double value1, Double value2) {
            addCriterion("o_orderPrice between", value1, value2, "oOrderprice");
            return (Criteria) this;
        }

        public Criteria andOOrderpriceNotBetween(Double value1, Double value2) {
            addCriterion("o_orderPrice not between", value1, value2, "oOrderprice");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateIsNull() {
            addCriterion("o_paymentState is null");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateIsNotNull() {
            addCriterion("o_paymentState is not null");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateEqualTo(String value) {
            addCriterion("o_paymentState =", value, "oPaymentstate");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateNotEqualTo(String value) {
            addCriterion("o_paymentState <>", value, "oPaymentstate");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateGreaterThan(String value) {
            addCriterion("o_paymentState >", value, "oPaymentstate");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateGreaterThanOrEqualTo(String value) {
            addCriterion("o_paymentState >=", value, "oPaymentstate");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateLessThan(String value) {
            addCriterion("o_paymentState <", value, "oPaymentstate");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateLessThanOrEqualTo(String value) {
            addCriterion("o_paymentState <=", value, "oPaymentstate");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateLike(String value) {
            addCriterion("o_paymentState like", value, "oPaymentstate");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateNotLike(String value) {
            addCriterion("o_paymentState not like", value, "oPaymentstate");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateIn(List<String> values) {
            addCriterion("o_paymentState in", values, "oPaymentstate");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateNotIn(List<String> values) {
            addCriterion("o_paymentState not in", values, "oPaymentstate");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateBetween(String value1, String value2) {
            addCriterion("o_paymentState between", value1, value2, "oPaymentstate");
            return (Criteria) this;
        }

        public Criteria andOPaymentstateNotBetween(String value1, String value2) {
            addCriterion("o_paymentState not between", value1, value2, "oPaymentstate");
            return (Criteria) this;
        }

        public Criteria andOShopstateIsNull() {
            addCriterion("o_shopState is null");
            return (Criteria) this;
        }

        public Criteria andOShopstateIsNotNull() {
            addCriterion("o_shopState is not null");
            return (Criteria) this;
        }

        public Criteria andOShopstateEqualTo(String value) {
            addCriterion("o_shopState =", value, "oShopstate");
            return (Criteria) this;
        }

        public Criteria andOShopstateNotEqualTo(String value) {
            addCriterion("o_shopState <>", value, "oShopstate");
            return (Criteria) this;
        }

        public Criteria andOShopstateGreaterThan(String value) {
            addCriterion("o_shopState >", value, "oShopstate");
            return (Criteria) this;
        }

        public Criteria andOShopstateGreaterThanOrEqualTo(String value) {
            addCriterion("o_shopState >=", value, "oShopstate");
            return (Criteria) this;
        }

        public Criteria andOShopstateLessThan(String value) {
            addCriterion("o_shopState <", value, "oShopstate");
            return (Criteria) this;
        }

        public Criteria andOShopstateLessThanOrEqualTo(String value) {
            addCriterion("o_shopState <=", value, "oShopstate");
            return (Criteria) this;
        }

        public Criteria andOShopstateLike(String value) {
            addCriterion("o_shopState like", value, "oShopstate");
            return (Criteria) this;
        }

        public Criteria andOShopstateNotLike(String value) {
            addCriterion("o_shopState not like", value, "oShopstate");
            return (Criteria) this;
        }

        public Criteria andOShopstateIn(List<String> values) {
            addCriterion("o_shopState in", values, "oShopstate");
            return (Criteria) this;
        }

        public Criteria andOShopstateNotIn(List<String> values) {
            addCriterion("o_shopState not in", values, "oShopstate");
            return (Criteria) this;
        }

        public Criteria andOShopstateBetween(String value1, String value2) {
            addCriterion("o_shopState between", value1, value2, "oShopstate");
            return (Criteria) this;
        }

        public Criteria andOShopstateNotBetween(String value1, String value2) {
            addCriterion("o_shopState not between", value1, value2, "oShopstate");
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

        public Criteria andAdEndidIsNull() {
            addCriterion("ad_endId is null");
            return (Criteria) this;
        }

        public Criteria andAdEndidIsNotNull() {
            addCriterion("ad_endId is not null");
            return (Criteria) this;
        }

        public Criteria andAdEndidEqualTo(String value) {
            addCriterion("ad_endId =", value, "adEndid");
            return (Criteria) this;
        }

        public Criteria andAdEndidNotEqualTo(String value) {
            addCriterion("ad_endId <>", value, "adEndid");
            return (Criteria) this;
        }

        public Criteria andAdEndidGreaterThan(String value) {
            addCriterion("ad_endId >", value, "adEndid");
            return (Criteria) this;
        }

        public Criteria andAdEndidGreaterThanOrEqualTo(String value) {
            addCriterion("ad_endId >=", value, "adEndid");
            return (Criteria) this;
        }

        public Criteria andAdEndidLessThan(String value) {
            addCriterion("ad_endId <", value, "adEndid");
            return (Criteria) this;
        }

        public Criteria andAdEndidLessThanOrEqualTo(String value) {
            addCriterion("ad_endId <=", value, "adEndid");
            return (Criteria) this;
        }

        public Criteria andAdEndidLike(String value) {
            addCriterion("ad_endId like", value, "adEndid");
            return (Criteria) this;
        }

        public Criteria andAdEndidNotLike(String value) {
            addCriterion("ad_endId not like", value, "adEndid");
            return (Criteria) this;
        }

        public Criteria andAdEndidIn(List<String> values) {
            addCriterion("ad_endId in", values, "adEndid");
            return (Criteria) this;
        }

        public Criteria andAdEndidNotIn(List<String> values) {
            addCriterion("ad_endId not in", values, "adEndid");
            return (Criteria) this;
        }

        public Criteria andAdEndidBetween(String value1, String value2) {
            addCriterion("ad_endId between", value1, value2, "adEndid");
            return (Criteria) this;
        }

        public Criteria andAdEndidNotBetween(String value1, String value2) {
            addCriterion("ad_endId not between", value1, value2, "adEndid");
            return (Criteria) this;
        }

        public Criteria andORemarkIsNull() {
            addCriterion("o_remark is null");
            return (Criteria) this;
        }

        public Criteria andORemarkIsNotNull() {
            addCriterion("o_remark is not null");
            return (Criteria) this;
        }

        public Criteria andORemarkEqualTo(String value) {
            addCriterion("o_remark =", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkNotEqualTo(String value) {
            addCriterion("o_remark <>", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkGreaterThan(String value) {
            addCriterion("o_remark >", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkGreaterThanOrEqualTo(String value) {
            addCriterion("o_remark >=", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkLessThan(String value) {
            addCriterion("o_remark <", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkLessThanOrEqualTo(String value) {
            addCriterion("o_remark <=", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkLike(String value) {
            addCriterion("o_remark like", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkNotLike(String value) {
            addCriterion("o_remark not like", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkIn(List<String> values) {
            addCriterion("o_remark in", values, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkNotIn(List<String> values) {
            addCriterion("o_remark not in", values, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkBetween(String value1, String value2) {
            addCriterion("o_remark between", value1, value2, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkNotBetween(String value1, String value2) {
            addCriterion("o_remark not between", value1, value2, "oRemark");
            return (Criteria) this;
        }

        public Criteria andOSendtimeIsNull() {
            addCriterion("o_sendTime is null");
            return (Criteria) this;
        }

        public Criteria andOSendtimeIsNotNull() {
            addCriterion("o_sendTime is not null");
            return (Criteria) this;
        }

        public Criteria andOSendtimeEqualTo(Date value) {
            addCriterion("o_sendTime =", value, "oSendtime");
            return (Criteria) this;
        }

        public Criteria andOSendtimeNotEqualTo(Date value) {
            addCriterion("o_sendTime <>", value, "oSendtime");
            return (Criteria) this;
        }

        public Criteria andOSendtimeGreaterThan(Date value) {
            addCriterion("o_sendTime >", value, "oSendtime");
            return (Criteria) this;
        }

        public Criteria andOSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_sendTime >=", value, "oSendtime");
            return (Criteria) this;
        }

        public Criteria andOSendtimeLessThan(Date value) {
            addCriterion("o_sendTime <", value, "oSendtime");
            return (Criteria) this;
        }

        public Criteria andOSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("o_sendTime <=", value, "oSendtime");
            return (Criteria) this;
        }

        public Criteria andOSendtimeIn(List<Date> values) {
            addCriterion("o_sendTime in", values, "oSendtime");
            return (Criteria) this;
        }

        public Criteria andOSendtimeNotIn(List<Date> values) {
            addCriterion("o_sendTime not in", values, "oSendtime");
            return (Criteria) this;
        }

        public Criteria andOSendtimeBetween(Date value1, Date value2) {
            addCriterion("o_sendTime between", value1, value2, "oSendtime");
            return (Criteria) this;
        }

        public Criteria andOSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("o_sendTime not between", value1, value2, "oSendtime");
            return (Criteria) this;
        }

        public Criteria andOOpentimeIsNull() {
            addCriterion("o_openTime is null");
            return (Criteria) this;
        }

        public Criteria andOOpentimeIsNotNull() {
            addCriterion("o_openTime is not null");
            return (Criteria) this;
        }

        public Criteria andOOpentimeEqualTo(Date value) {
            addCriterion("o_openTime =", value, "oOpentime");
            return (Criteria) this;
        }

        public Criteria andOOpentimeNotEqualTo(Date value) {
            addCriterion("o_openTime <>", value, "oOpentime");
            return (Criteria) this;
        }

        public Criteria andOOpentimeGreaterThan(Date value) {
            addCriterion("o_openTime >", value, "oOpentime");
            return (Criteria) this;
        }

        public Criteria andOOpentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_openTime >=", value, "oOpentime");
            return (Criteria) this;
        }

        public Criteria andOOpentimeLessThan(Date value) {
            addCriterion("o_openTime <", value, "oOpentime");
            return (Criteria) this;
        }

        public Criteria andOOpentimeLessThanOrEqualTo(Date value) {
            addCriterion("o_openTime <=", value, "oOpentime");
            return (Criteria) this;
        }

        public Criteria andOOpentimeIn(List<Date> values) {
            addCriterion("o_openTime in", values, "oOpentime");
            return (Criteria) this;
        }

        public Criteria andOOpentimeNotIn(List<Date> values) {
            addCriterion("o_openTime not in", values, "oOpentime");
            return (Criteria) this;
        }

        public Criteria andOOpentimeBetween(Date value1, Date value2) {
            addCriterion("o_openTime between", value1, value2, "oOpentime");
            return (Criteria) this;
        }

        public Criteria andOOpentimeNotBetween(Date value1, Date value2) {
            addCriterion("o_openTime not between", value1, value2, "oOpentime");
            return (Criteria) this;
        }

        public Criteria andOFinishtimeIsNull() {
            addCriterion("o_finishTime is null");
            return (Criteria) this;
        }

        public Criteria andOFinishtimeIsNotNull() {
            addCriterion("o_finishTime is not null");
            return (Criteria) this;
        }

        public Criteria andOFinishtimeEqualTo(Date value) {
            addCriterion("o_finishTime =", value, "oFinishtime");
            return (Criteria) this;
        }

        public Criteria andOFinishtimeNotEqualTo(Date value) {
            addCriterion("o_finishTime <>", value, "oFinishtime");
            return (Criteria) this;
        }

        public Criteria andOFinishtimeGreaterThan(Date value) {
            addCriterion("o_finishTime >", value, "oFinishtime");
            return (Criteria) this;
        }

        public Criteria andOFinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("o_finishTime >=", value, "oFinishtime");
            return (Criteria) this;
        }

        public Criteria andOFinishtimeLessThan(Date value) {
            addCriterion("o_finishTime <", value, "oFinishtime");
            return (Criteria) this;
        }

        public Criteria andOFinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("o_finishTime <=", value, "oFinishtime");
            return (Criteria) this;
        }

        public Criteria andOFinishtimeIn(List<Date> values) {
            addCriterion("o_finishTime in", values, "oFinishtime");
            return (Criteria) this;
        }

        public Criteria andOFinishtimeNotIn(List<Date> values) {
            addCriterion("o_finishTime not in", values, "oFinishtime");
            return (Criteria) this;
        }

        public Criteria andOFinishtimeBetween(Date value1, Date value2) {
            addCriterion("o_finishTime between", value1, value2, "oFinishtime");
            return (Criteria) this;
        }

        public Criteria andOFinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("o_finishTime not between", value1, value2, "oFinishtime");
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