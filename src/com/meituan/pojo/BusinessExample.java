package com.meituan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andBAccountidIsNull() {
            addCriterion("b_accountId is null");
            return (Criteria) this;
        }

        public Criteria andBAccountidIsNotNull() {
            addCriterion("b_accountId is not null");
            return (Criteria) this;
        }

        public Criteria andBAccountidEqualTo(String value) {
            addCriterion("b_accountId =", value, "bAccountid");
            return (Criteria) this;
        }

        public Criteria andBAccountidNotEqualTo(String value) {
            addCriterion("b_accountId <>", value, "bAccountid");
            return (Criteria) this;
        }

        public Criteria andBAccountidGreaterThan(String value) {
            addCriterion("b_accountId >", value, "bAccountid");
            return (Criteria) this;
        }

        public Criteria andBAccountidGreaterThanOrEqualTo(String value) {
            addCriterion("b_accountId >=", value, "bAccountid");
            return (Criteria) this;
        }

        public Criteria andBAccountidLessThan(String value) {
            addCriterion("b_accountId <", value, "bAccountid");
            return (Criteria) this;
        }

        public Criteria andBAccountidLessThanOrEqualTo(String value) {
            addCriterion("b_accountId <=", value, "bAccountid");
            return (Criteria) this;
        }

        public Criteria andBAccountidLike(String value) {
            addCriterion("b_accountId like", value, "bAccountid");
            return (Criteria) this;
        }

        public Criteria andBAccountidNotLike(String value) {
            addCriterion("b_accountId not like", value, "bAccountid");
            return (Criteria) this;
        }

        public Criteria andBAccountidIn(List<String> values) {
            addCriterion("b_accountId in", values, "bAccountid");
            return (Criteria) this;
        }

        public Criteria andBAccountidNotIn(List<String> values) {
            addCriterion("b_accountId not in", values, "bAccountid");
            return (Criteria) this;
        }

        public Criteria andBAccountidBetween(String value1, String value2) {
            addCriterion("b_accountId between", value1, value2, "bAccountid");
            return (Criteria) this;
        }

        public Criteria andBAccountidNotBetween(String value1, String value2) {
            addCriterion("b_accountId not between", value1, value2, "bAccountid");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordIsNull() {
            addCriterion("b_accountPassword is null");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordIsNotNull() {
            addCriterion("b_accountPassword is not null");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordEqualTo(String value) {
            addCriterion("b_accountPassword =", value, "bAccountpassword");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordNotEqualTo(String value) {
            addCriterion("b_accountPassword <>", value, "bAccountpassword");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordGreaterThan(String value) {
            addCriterion("b_accountPassword >", value, "bAccountpassword");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("b_accountPassword >=", value, "bAccountpassword");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordLessThan(String value) {
            addCriterion("b_accountPassword <", value, "bAccountpassword");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordLessThanOrEqualTo(String value) {
            addCriterion("b_accountPassword <=", value, "bAccountpassword");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordLike(String value) {
            addCriterion("b_accountPassword like", value, "bAccountpassword");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordNotLike(String value) {
            addCriterion("b_accountPassword not like", value, "bAccountpassword");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordIn(List<String> values) {
            addCriterion("b_accountPassword in", values, "bAccountpassword");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordNotIn(List<String> values) {
            addCriterion("b_accountPassword not in", values, "bAccountpassword");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordBetween(String value1, String value2) {
            addCriterion("b_accountPassword between", value1, value2, "bAccountpassword");
            return (Criteria) this;
        }

        public Criteria andBAccountpasswordNotBetween(String value1, String value2) {
            addCriterion("b_accountPassword not between", value1, value2, "bAccountpassword");
            return (Criteria) this;
        }

        public Criteria andBCommissionIsNull() {
            addCriterion("b_commission is null");
            return (Criteria) this;
        }

        public Criteria andBCommissionIsNotNull() {
            addCriterion("b_commission is not null");
            return (Criteria) this;
        }

        public Criteria andBCommissionEqualTo(Float value) {
            addCriterion("b_commission =", value, "bCommission");
            return (Criteria) this;
        }

        public Criteria andBCommissionNotEqualTo(Float value) {
            addCriterion("b_commission <>", value, "bCommission");
            return (Criteria) this;
        }

        public Criteria andBCommissionGreaterThan(Float value) {
            addCriterion("b_commission >", value, "bCommission");
            return (Criteria) this;
        }

        public Criteria andBCommissionGreaterThanOrEqualTo(Float value) {
            addCriterion("b_commission >=", value, "bCommission");
            return (Criteria) this;
        }

        public Criteria andBCommissionLessThan(Float value) {
            addCriterion("b_commission <", value, "bCommission");
            return (Criteria) this;
        }

        public Criteria andBCommissionLessThanOrEqualTo(Float value) {
            addCriterion("b_commission <=", value, "bCommission");
            return (Criteria) this;
        }

        public Criteria andBCommissionIn(List<Float> values) {
            addCriterion("b_commission in", values, "bCommission");
            return (Criteria) this;
        }

        public Criteria andBCommissionNotIn(List<Float> values) {
            addCriterion("b_commission not in", values, "bCommission");
            return (Criteria) this;
        }

        public Criteria andBCommissionBetween(Float value1, Float value2) {
            addCriterion("b_commission between", value1, value2, "bCommission");
            return (Criteria) this;
        }

        public Criteria andBCommissionNotBetween(Float value1, Float value2) {
            addCriterion("b_commission not between", value1, value2, "bCommission");
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

        public Criteria andSTypeIsNull() {
            addCriterion("s_type is null");
            return (Criteria) this;
        }

        public Criteria andSTypeIsNotNull() {
            addCriterion("s_type is not null");
            return (Criteria) this;
        }

        public Criteria andSTypeEqualTo(String value) {
            addCriterion("s_type =", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotEqualTo(String value) {
            addCriterion("s_type <>", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeGreaterThan(String value) {
            addCriterion("s_type >", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeGreaterThanOrEqualTo(String value) {
            addCriterion("s_type >=", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLessThan(String value) {
            addCriterion("s_type <", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLessThanOrEqualTo(String value) {
            addCriterion("s_type <=", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLike(String value) {
            addCriterion("s_type like", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotLike(String value) {
            addCriterion("s_type not like", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeIn(List<String> values) {
            addCriterion("s_type in", values, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotIn(List<String> values) {
            addCriterion("s_type not in", values, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeBetween(String value1, String value2) {
            addCriterion("s_type between", value1, value2, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotBetween(String value1, String value2) {
            addCriterion("s_type not between", value1, value2, "sType");
            return (Criteria) this;
        }

        public Criteria andSStatetypeIsNull() {
            addCriterion("s_stateType is null");
            return (Criteria) this;
        }

        public Criteria andSStatetypeIsNotNull() {
            addCriterion("s_stateType is not null");
            return (Criteria) this;
        }

        public Criteria andSStatetypeEqualTo(String value) {
            addCriterion("s_stateType =", value, "sStatetype");
            return (Criteria) this;
        }

        public Criteria andSStatetypeNotEqualTo(String value) {
            addCriterion("s_stateType <>", value, "sStatetype");
            return (Criteria) this;
        }

        public Criteria andSStatetypeGreaterThan(String value) {
            addCriterion("s_stateType >", value, "sStatetype");
            return (Criteria) this;
        }

        public Criteria andSStatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("s_stateType >=", value, "sStatetype");
            return (Criteria) this;
        }

        public Criteria andSStatetypeLessThan(String value) {
            addCriterion("s_stateType <", value, "sStatetype");
            return (Criteria) this;
        }

        public Criteria andSStatetypeLessThanOrEqualTo(String value) {
            addCriterion("s_stateType <=", value, "sStatetype");
            return (Criteria) this;
        }

        public Criteria andSStatetypeLike(String value) {
            addCriterion("s_stateType like", value, "sStatetype");
            return (Criteria) this;
        }

        public Criteria andSStatetypeNotLike(String value) {
            addCriterion("s_stateType not like", value, "sStatetype");
            return (Criteria) this;
        }

        public Criteria andSStatetypeIn(List<String> values) {
            addCriterion("s_stateType in", values, "sStatetype");
            return (Criteria) this;
        }

        public Criteria andSStatetypeNotIn(List<String> values) {
            addCriterion("s_stateType not in", values, "sStatetype");
            return (Criteria) this;
        }

        public Criteria andSStatetypeBetween(String value1, String value2) {
            addCriterion("s_stateType between", value1, value2, "sStatetype");
            return (Criteria) this;
        }

        public Criteria andSStatetypeNotBetween(String value1, String value2) {
            addCriterion("s_stateType not between", value1, value2, "sStatetype");
            return (Criteria) this;
        }

        public Criteria andSTelephoneIsNull() {
            addCriterion("s_telephone is null");
            return (Criteria) this;
        }

        public Criteria andSTelephoneIsNotNull() {
            addCriterion("s_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andSTelephoneEqualTo(String value) {
            addCriterion("s_telephone =", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneNotEqualTo(String value) {
            addCriterion("s_telephone <>", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneGreaterThan(String value) {
            addCriterion("s_telephone >", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("s_telephone >=", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneLessThan(String value) {
            addCriterion("s_telephone <", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneLessThanOrEqualTo(String value) {
            addCriterion("s_telephone <=", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneLike(String value) {
            addCriterion("s_telephone like", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneNotLike(String value) {
            addCriterion("s_telephone not like", value, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneIn(List<String> values) {
            addCriterion("s_telephone in", values, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneNotIn(List<String> values) {
            addCriterion("s_telephone not in", values, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneBetween(String value1, String value2) {
            addCriterion("s_telephone between", value1, value2, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSTelephoneNotBetween(String value1, String value2) {
            addCriterion("s_telephone not between", value1, value2, "sTelephone");
            return (Criteria) this;
        }

        public Criteria andSResponsibleIsNull() {
            addCriterion("s_responsible is null");
            return (Criteria) this;
        }

        public Criteria andSResponsibleIsNotNull() {
            addCriterion("s_responsible is not null");
            return (Criteria) this;
        }

        public Criteria andSResponsibleEqualTo(String value) {
            addCriterion("s_responsible =", value, "sResponsible");
            return (Criteria) this;
        }

        public Criteria andSResponsibleNotEqualTo(String value) {
            addCriterion("s_responsible <>", value, "sResponsible");
            return (Criteria) this;
        }

        public Criteria andSResponsibleGreaterThan(String value) {
            addCriterion("s_responsible >", value, "sResponsible");
            return (Criteria) this;
        }

        public Criteria andSResponsibleGreaterThanOrEqualTo(String value) {
            addCriterion("s_responsible >=", value, "sResponsible");
            return (Criteria) this;
        }

        public Criteria andSResponsibleLessThan(String value) {
            addCriterion("s_responsible <", value, "sResponsible");
            return (Criteria) this;
        }

        public Criteria andSResponsibleLessThanOrEqualTo(String value) {
            addCriterion("s_responsible <=", value, "sResponsible");
            return (Criteria) this;
        }

        public Criteria andSResponsibleLike(String value) {
            addCriterion("s_responsible like", value, "sResponsible");
            return (Criteria) this;
        }

        public Criteria andSResponsibleNotLike(String value) {
            addCriterion("s_responsible not like", value, "sResponsible");
            return (Criteria) this;
        }

        public Criteria andSResponsibleIn(List<String> values) {
            addCriterion("s_responsible in", values, "sResponsible");
            return (Criteria) this;
        }

        public Criteria andSResponsibleNotIn(List<String> values) {
            addCriterion("s_responsible not in", values, "sResponsible");
            return (Criteria) this;
        }

        public Criteria andSResponsibleBetween(String value1, String value2) {
            addCriterion("s_responsible between", value1, value2, "sResponsible");
            return (Criteria) this;
        }

        public Criteria andSResponsibleNotBetween(String value1, String value2) {
            addCriterion("s_responsible not between", value1, value2, "sResponsible");
            return (Criteria) this;
        }

        public Criteria andSRphoneIsNull() {
            addCriterion("s_rPhone is null");
            return (Criteria) this;
        }

        public Criteria andSRphoneIsNotNull() {
            addCriterion("s_rPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSRphoneEqualTo(String value) {
            addCriterion("s_rPhone =", value, "sRphone");
            return (Criteria) this;
        }

        public Criteria andSRphoneNotEqualTo(String value) {
            addCriterion("s_rPhone <>", value, "sRphone");
            return (Criteria) this;
        }

        public Criteria andSRphoneGreaterThan(String value) {
            addCriterion("s_rPhone >", value, "sRphone");
            return (Criteria) this;
        }

        public Criteria andSRphoneGreaterThanOrEqualTo(String value) {
            addCriterion("s_rPhone >=", value, "sRphone");
            return (Criteria) this;
        }

        public Criteria andSRphoneLessThan(String value) {
            addCriterion("s_rPhone <", value, "sRphone");
            return (Criteria) this;
        }

        public Criteria andSRphoneLessThanOrEqualTo(String value) {
            addCriterion("s_rPhone <=", value, "sRphone");
            return (Criteria) this;
        }

        public Criteria andSRphoneLike(String value) {
            addCriterion("s_rPhone like", value, "sRphone");
            return (Criteria) this;
        }

        public Criteria andSRphoneNotLike(String value) {
            addCriterion("s_rPhone not like", value, "sRphone");
            return (Criteria) this;
        }

        public Criteria andSRphoneIn(List<String> values) {
            addCriterion("s_rPhone in", values, "sRphone");
            return (Criteria) this;
        }

        public Criteria andSRphoneNotIn(List<String> values) {
            addCriterion("s_rPhone not in", values, "sRphone");
            return (Criteria) this;
        }

        public Criteria andSRphoneBetween(String value1, String value2) {
            addCriterion("s_rPhone between", value1, value2, "sRphone");
            return (Criteria) this;
        }

        public Criteria andSRphoneNotBetween(String value1, String value2) {
            addCriterion("s_rPhone not between", value1, value2, "sRphone");
            return (Criteria) this;
        }

        public Criteria andSProvinceIsNull() {
            addCriterion("s_province is null");
            return (Criteria) this;
        }

        public Criteria andSProvinceIsNotNull() {
            addCriterion("s_province is not null");
            return (Criteria) this;
        }

        public Criteria andSProvinceEqualTo(String value) {
            addCriterion("s_province =", value, "sProvince");
            return (Criteria) this;
        }

        public Criteria andSProvinceNotEqualTo(String value) {
            addCriterion("s_province <>", value, "sProvince");
            return (Criteria) this;
        }

        public Criteria andSProvinceGreaterThan(String value) {
            addCriterion("s_province >", value, "sProvince");
            return (Criteria) this;
        }

        public Criteria andSProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("s_province >=", value, "sProvince");
            return (Criteria) this;
        }

        public Criteria andSProvinceLessThan(String value) {
            addCriterion("s_province <", value, "sProvince");
            return (Criteria) this;
        }

        public Criteria andSProvinceLessThanOrEqualTo(String value) {
            addCriterion("s_province <=", value, "sProvince");
            return (Criteria) this;
        }

        public Criteria andSProvinceLike(String value) {
            addCriterion("s_province like", value, "sProvince");
            return (Criteria) this;
        }

        public Criteria andSProvinceNotLike(String value) {
            addCriterion("s_province not like", value, "sProvince");
            return (Criteria) this;
        }

        public Criteria andSProvinceIn(List<String> values) {
            addCriterion("s_province in", values, "sProvince");
            return (Criteria) this;
        }

        public Criteria andSProvinceNotIn(List<String> values) {
            addCriterion("s_province not in", values, "sProvince");
            return (Criteria) this;
        }

        public Criteria andSProvinceBetween(String value1, String value2) {
            addCriterion("s_province between", value1, value2, "sProvince");
            return (Criteria) this;
        }

        public Criteria andSProvinceNotBetween(String value1, String value2) {
            addCriterion("s_province not between", value1, value2, "sProvince");
            return (Criteria) this;
        }

        public Criteria andSCityIsNull() {
            addCriterion("s_city is null");
            return (Criteria) this;
        }

        public Criteria andSCityIsNotNull() {
            addCriterion("s_city is not null");
            return (Criteria) this;
        }

        public Criteria andSCityEqualTo(String value) {
            addCriterion("s_city =", value, "sCity");
            return (Criteria) this;
        }

        public Criteria andSCityNotEqualTo(String value) {
            addCriterion("s_city <>", value, "sCity");
            return (Criteria) this;
        }

        public Criteria andSCityGreaterThan(String value) {
            addCriterion("s_city >", value, "sCity");
            return (Criteria) this;
        }

        public Criteria andSCityGreaterThanOrEqualTo(String value) {
            addCriterion("s_city >=", value, "sCity");
            return (Criteria) this;
        }

        public Criteria andSCityLessThan(String value) {
            addCriterion("s_city <", value, "sCity");
            return (Criteria) this;
        }

        public Criteria andSCityLessThanOrEqualTo(String value) {
            addCriterion("s_city <=", value, "sCity");
            return (Criteria) this;
        }

        public Criteria andSCityLike(String value) {
            addCriterion("s_city like", value, "sCity");
            return (Criteria) this;
        }

        public Criteria andSCityNotLike(String value) {
            addCriterion("s_city not like", value, "sCity");
            return (Criteria) this;
        }

        public Criteria andSCityIn(List<String> values) {
            addCriterion("s_city in", values, "sCity");
            return (Criteria) this;
        }

        public Criteria andSCityNotIn(List<String> values) {
            addCriterion("s_city not in", values, "sCity");
            return (Criteria) this;
        }

        public Criteria andSCityBetween(String value1, String value2) {
            addCriterion("s_city between", value1, value2, "sCity");
            return (Criteria) this;
        }

        public Criteria andSCityNotBetween(String value1, String value2) {
            addCriterion("s_city not between", value1, value2, "sCity");
            return (Criteria) this;
        }

        public Criteria andSSchoolIsNull() {
            addCriterion("s_school is null");
            return (Criteria) this;
        }

        public Criteria andSSchoolIsNotNull() {
            addCriterion("s_school is not null");
            return (Criteria) this;
        }

        public Criteria andSSchoolEqualTo(String value) {
            addCriterion("s_school =", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolNotEqualTo(String value) {
            addCriterion("s_school <>", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolGreaterThan(String value) {
            addCriterion("s_school >", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("s_school >=", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolLessThan(String value) {
            addCriterion("s_school <", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolLessThanOrEqualTo(String value) {
            addCriterion("s_school <=", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolLike(String value) {
            addCriterion("s_school like", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolNotLike(String value) {
            addCriterion("s_school not like", value, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolIn(List<String> values) {
            addCriterion("s_school in", values, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolNotIn(List<String> values) {
            addCriterion("s_school not in", values, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolBetween(String value1, String value2) {
            addCriterion("s_school between", value1, value2, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSSchoolNotBetween(String value1, String value2) {
            addCriterion("s_school not between", value1, value2, "sSchool");
            return (Criteria) this;
        }

        public Criteria andSAddressIsNull() {
            addCriterion("s_address is null");
            return (Criteria) this;
        }

        public Criteria andSAddressIsNotNull() {
            addCriterion("s_address is not null");
            return (Criteria) this;
        }

        public Criteria andSAddressEqualTo(String value) {
            addCriterion("s_address =", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotEqualTo(String value) {
            addCriterion("s_address <>", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressGreaterThan(String value) {
            addCriterion("s_address >", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressGreaterThanOrEqualTo(String value) {
            addCriterion("s_address >=", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLessThan(String value) {
            addCriterion("s_address <", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLessThanOrEqualTo(String value) {
            addCriterion("s_address <=", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLike(String value) {
            addCriterion("s_address like", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotLike(String value) {
            addCriterion("s_address not like", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressIn(List<String> values) {
            addCriterion("s_address in", values, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotIn(List<String> values) {
            addCriterion("s_address not in", values, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressBetween(String value1, String value2) {
            addCriterion("s_address between", value1, value2, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotBetween(String value1, String value2) {
            addCriterion("s_address not between", value1, value2, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSIdcardposIsNull() {
            addCriterion("s_IdCardPos is null");
            return (Criteria) this;
        }

        public Criteria andSIdcardposIsNotNull() {
            addCriterion("s_IdCardPos is not null");
            return (Criteria) this;
        }

        public Criteria andSIdcardposEqualTo(String value) {
            addCriterion("s_IdCardPos =", value, "sIdcardpos");
            return (Criteria) this;
        }

        public Criteria andSIdcardposNotEqualTo(String value) {
            addCriterion("s_IdCardPos <>", value, "sIdcardpos");
            return (Criteria) this;
        }

        public Criteria andSIdcardposGreaterThan(String value) {
            addCriterion("s_IdCardPos >", value, "sIdcardpos");
            return (Criteria) this;
        }

        public Criteria andSIdcardposGreaterThanOrEqualTo(String value) {
            addCriterion("s_IdCardPos >=", value, "sIdcardpos");
            return (Criteria) this;
        }

        public Criteria andSIdcardposLessThan(String value) {
            addCriterion("s_IdCardPos <", value, "sIdcardpos");
            return (Criteria) this;
        }

        public Criteria andSIdcardposLessThanOrEqualTo(String value) {
            addCriterion("s_IdCardPos <=", value, "sIdcardpos");
            return (Criteria) this;
        }

        public Criteria andSIdcardposLike(String value) {
            addCriterion("s_IdCardPos like", value, "sIdcardpos");
            return (Criteria) this;
        }

        public Criteria andSIdcardposNotLike(String value) {
            addCriterion("s_IdCardPos not like", value, "sIdcardpos");
            return (Criteria) this;
        }

        public Criteria andSIdcardposIn(List<String> values) {
            addCriterion("s_IdCardPos in", values, "sIdcardpos");
            return (Criteria) this;
        }

        public Criteria andSIdcardposNotIn(List<String> values) {
            addCriterion("s_IdCardPos not in", values, "sIdcardpos");
            return (Criteria) this;
        }

        public Criteria andSIdcardposBetween(String value1, String value2) {
            addCriterion("s_IdCardPos between", value1, value2, "sIdcardpos");
            return (Criteria) this;
        }

        public Criteria andSIdcardposNotBetween(String value1, String value2) {
            addCriterion("s_IdCardPos not between", value1, value2, "sIdcardpos");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackIsNull() {
            addCriterion("s_IdCardBack is null");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackIsNotNull() {
            addCriterion("s_IdCardBack is not null");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackEqualTo(String value) {
            addCriterion("s_IdCardBack =", value, "sIdcardback");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackNotEqualTo(String value) {
            addCriterion("s_IdCardBack <>", value, "sIdcardback");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackGreaterThan(String value) {
            addCriterion("s_IdCardBack >", value, "sIdcardback");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackGreaterThanOrEqualTo(String value) {
            addCriterion("s_IdCardBack >=", value, "sIdcardback");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackLessThan(String value) {
            addCriterion("s_IdCardBack <", value, "sIdcardback");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackLessThanOrEqualTo(String value) {
            addCriterion("s_IdCardBack <=", value, "sIdcardback");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackLike(String value) {
            addCriterion("s_IdCardBack like", value, "sIdcardback");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackNotLike(String value) {
            addCriterion("s_IdCardBack not like", value, "sIdcardback");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackIn(List<String> values) {
            addCriterion("s_IdCardBack in", values, "sIdcardback");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackNotIn(List<String> values) {
            addCriterion("s_IdCardBack not in", values, "sIdcardback");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackBetween(String value1, String value2) {
            addCriterion("s_IdCardBack between", value1, value2, "sIdcardback");
            return (Criteria) this;
        }

        public Criteria andSIdcardbackNotBetween(String value1, String value2) {
            addCriterion("s_IdCardBack not between", value1, value2, "sIdcardback");
            return (Criteria) this;
        }

        public Criteria andSLicenseIsNull() {
            addCriterion("s_license is null");
            return (Criteria) this;
        }

        public Criteria andSLicenseIsNotNull() {
            addCriterion("s_license is not null");
            return (Criteria) this;
        }

        public Criteria andSLicenseEqualTo(String value) {
            addCriterion("s_license =", value, "sLicense");
            return (Criteria) this;
        }

        public Criteria andSLicenseNotEqualTo(String value) {
            addCriterion("s_license <>", value, "sLicense");
            return (Criteria) this;
        }

        public Criteria andSLicenseGreaterThan(String value) {
            addCriterion("s_license >", value, "sLicense");
            return (Criteria) this;
        }

        public Criteria andSLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("s_license >=", value, "sLicense");
            return (Criteria) this;
        }

        public Criteria andSLicenseLessThan(String value) {
            addCriterion("s_license <", value, "sLicense");
            return (Criteria) this;
        }

        public Criteria andSLicenseLessThanOrEqualTo(String value) {
            addCriterion("s_license <=", value, "sLicense");
            return (Criteria) this;
        }

        public Criteria andSLicenseLike(String value) {
            addCriterion("s_license like", value, "sLicense");
            return (Criteria) this;
        }

        public Criteria andSLicenseNotLike(String value) {
            addCriterion("s_license not like", value, "sLicense");
            return (Criteria) this;
        }

        public Criteria andSLicenseIn(List<String> values) {
            addCriterion("s_license in", values, "sLicense");
            return (Criteria) this;
        }

        public Criteria andSLicenseNotIn(List<String> values) {
            addCriterion("s_license not in", values, "sLicense");
            return (Criteria) this;
        }

        public Criteria andSLicenseBetween(String value1, String value2) {
            addCriterion("s_license between", value1, value2, "sLicense");
            return (Criteria) this;
        }

        public Criteria andSLicenseNotBetween(String value1, String value2) {
            addCriterion("s_license not between", value1, value2, "sLicense");
            return (Criteria) this;
        }

        public Criteria andSHygieneIsNull() {
            addCriterion("s_hygiene is null");
            return (Criteria) this;
        }

        public Criteria andSHygieneIsNotNull() {
            addCriterion("s_hygiene is not null");
            return (Criteria) this;
        }

        public Criteria andSHygieneEqualTo(String value) {
            addCriterion("s_hygiene =", value, "sHygiene");
            return (Criteria) this;
        }

        public Criteria andSHygieneNotEqualTo(String value) {
            addCriterion("s_hygiene <>", value, "sHygiene");
            return (Criteria) this;
        }

        public Criteria andSHygieneGreaterThan(String value) {
            addCriterion("s_hygiene >", value, "sHygiene");
            return (Criteria) this;
        }

        public Criteria andSHygieneGreaterThanOrEqualTo(String value) {
            addCriterion("s_hygiene >=", value, "sHygiene");
            return (Criteria) this;
        }

        public Criteria andSHygieneLessThan(String value) {
            addCriterion("s_hygiene <", value, "sHygiene");
            return (Criteria) this;
        }

        public Criteria andSHygieneLessThanOrEqualTo(String value) {
            addCriterion("s_hygiene <=", value, "sHygiene");
            return (Criteria) this;
        }

        public Criteria andSHygieneLike(String value) {
            addCriterion("s_hygiene like", value, "sHygiene");
            return (Criteria) this;
        }

        public Criteria andSHygieneNotLike(String value) {
            addCriterion("s_hygiene not like", value, "sHygiene");
            return (Criteria) this;
        }

        public Criteria andSHygieneIn(List<String> values) {
            addCriterion("s_hygiene in", values, "sHygiene");
            return (Criteria) this;
        }

        public Criteria andSHygieneNotIn(List<String> values) {
            addCriterion("s_hygiene not in", values, "sHygiene");
            return (Criteria) this;
        }

        public Criteria andSHygieneBetween(String value1, String value2) {
            addCriterion("s_hygiene between", value1, value2, "sHygiene");
            return (Criteria) this;
        }

        public Criteria andSHygieneNotBetween(String value1, String value2) {
            addCriterion("s_hygiene not between", value1, value2, "sHygiene");
            return (Criteria) this;
        }

        public Criteria andSApplyIsNull() {
            addCriterion("s_apply is null");
            return (Criteria) this;
        }

        public Criteria andSApplyIsNotNull() {
            addCriterion("s_apply is not null");
            return (Criteria) this;
        }

        public Criteria andSApplyEqualTo(Date value) {
            addCriterion("s_apply =", value, "sApply");
            return (Criteria) this;
        }

        public Criteria andSApplyNotEqualTo(Date value) {
            addCriterion("s_apply <>", value, "sApply");
            return (Criteria) this;
        }

        public Criteria andSApplyGreaterThan(Date value) {
            addCriterion("s_apply >", value, "sApply");
            return (Criteria) this;
        }

        public Criteria andSApplyGreaterThanOrEqualTo(Date value) {
            addCriterion("s_apply >=", value, "sApply");
            return (Criteria) this;
        }

        public Criteria andSApplyLessThan(Date value) {
            addCriterion("s_apply <", value, "sApply");
            return (Criteria) this;
        }

        public Criteria andSApplyLessThanOrEqualTo(Date value) {
            addCriterion("s_apply <=", value, "sApply");
            return (Criteria) this;
        }

        public Criteria andSApplyIn(List<Date> values) {
            addCriterion("s_apply in", values, "sApply");
            return (Criteria) this;
        }

        public Criteria andSApplyNotIn(List<Date> values) {
            addCriterion("s_apply not in", values, "sApply");
            return (Criteria) this;
        }

        public Criteria andSApplyBetween(Date value1, Date value2) {
            addCriterion("s_apply between", value1, value2, "sApply");
            return (Criteria) this;
        }

        public Criteria andSApplyNotBetween(Date value1, Date value2) {
            addCriterion("s_apply not between", value1, value2, "sApply");
            return (Criteria) this;
        }

        public Criteria andSHoursIsNull() {
            addCriterion("s_hours is null");
            return (Criteria) this;
        }

        public Criteria andSHoursIsNotNull() {
            addCriterion("s_hours is not null");
            return (Criteria) this;
        }

        public Criteria andSHoursEqualTo(String value) {
            addCriterion("s_hours =", value, "sHours");
            return (Criteria) this;
        }

        public Criteria andSHoursNotEqualTo(String value) {
            addCriterion("s_hours <>", value, "sHours");
            return (Criteria) this;
        }

        public Criteria andSHoursGreaterThan(String value) {
            addCriterion("s_hours >", value, "sHours");
            return (Criteria) this;
        }

        public Criteria andSHoursGreaterThanOrEqualTo(String value) {
            addCriterion("s_hours >=", value, "sHours");
            return (Criteria) this;
        }

        public Criteria andSHoursLessThan(String value) {
            addCriterion("s_hours <", value, "sHours");
            return (Criteria) this;
        }

        public Criteria andSHoursLessThanOrEqualTo(String value) {
            addCriterion("s_hours <=", value, "sHours");
            return (Criteria) this;
        }

        public Criteria andSHoursLike(String value) {
            addCriterion("s_hours like", value, "sHours");
            return (Criteria) this;
        }

        public Criteria andSHoursNotLike(String value) {
            addCriterion("s_hours not like", value, "sHours");
            return (Criteria) this;
        }

        public Criteria andSHoursIn(List<String> values) {
            addCriterion("s_hours in", values, "sHours");
            return (Criteria) this;
        }

        public Criteria andSHoursNotIn(List<String> values) {
            addCriterion("s_hours not in", values, "sHours");
            return (Criteria) this;
        }

        public Criteria andSHoursBetween(String value1, String value2) {
            addCriterion("s_hours between", value1, value2, "sHours");
            return (Criteria) this;
        }

        public Criteria andSHoursNotBetween(String value1, String value2) {
            addCriterion("s_hours not between", value1, value2, "sHours");
            return (Criteria) this;
        }

        public Criteria andSNotreasonIsNull() {
            addCriterion("s_notReason is null");
            return (Criteria) this;
        }

        public Criteria andSNotreasonIsNotNull() {
            addCriterion("s_notReason is not null");
            return (Criteria) this;
        }

        public Criteria andSNotreasonEqualTo(String value) {
            addCriterion("s_notReason =", value, "sNotreason");
            return (Criteria) this;
        }

        public Criteria andSNotreasonNotEqualTo(String value) {
            addCriterion("s_notReason <>", value, "sNotreason");
            return (Criteria) this;
        }

        public Criteria andSNotreasonGreaterThan(String value) {
            addCriterion("s_notReason >", value, "sNotreason");
            return (Criteria) this;
        }

        public Criteria andSNotreasonGreaterThanOrEqualTo(String value) {
            addCriterion("s_notReason >=", value, "sNotreason");
            return (Criteria) this;
        }

        public Criteria andSNotreasonLessThan(String value) {
            addCriterion("s_notReason <", value, "sNotreason");
            return (Criteria) this;
        }

        public Criteria andSNotreasonLessThanOrEqualTo(String value) {
            addCriterion("s_notReason <=", value, "sNotreason");
            return (Criteria) this;
        }

        public Criteria andSNotreasonLike(String value) {
            addCriterion("s_notReason like", value, "sNotreason");
            return (Criteria) this;
        }

        public Criteria andSNotreasonNotLike(String value) {
            addCriterion("s_notReason not like", value, "sNotreason");
            return (Criteria) this;
        }

        public Criteria andSNotreasonIn(List<String> values) {
            addCriterion("s_notReason in", values, "sNotreason");
            return (Criteria) this;
        }

        public Criteria andSNotreasonNotIn(List<String> values) {
            addCriterion("s_notReason not in", values, "sNotreason");
            return (Criteria) this;
        }

        public Criteria andSNotreasonBetween(String value1, String value2) {
            addCriterion("s_notReason between", value1, value2, "sNotreason");
            return (Criteria) this;
        }

        public Criteria andSNotreasonNotBetween(String value1, String value2) {
            addCriterion("s_notReason not between", value1, value2, "sNotreason");
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