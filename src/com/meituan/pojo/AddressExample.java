package com.meituan.pojo;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(String value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(String value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(String value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(String value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(String value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(String value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLike(String value) {
            addCriterion("ad_id like", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotLike(String value) {
            addCriterion("ad_id not like", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<String> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<String> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(String value1, String value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(String value1, String value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
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

        public Criteria andAdNameIsNull() {
            addCriterion("ad_name is null");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNotNull() {
            addCriterion("ad_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdNameEqualTo(String value) {
            addCriterion("ad_name =", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotEqualTo(String value) {
            addCriterion("ad_name <>", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThan(String value) {
            addCriterion("ad_name >", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThanOrEqualTo(String value) {
            addCriterion("ad_name >=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThan(String value) {
            addCriterion("ad_name <", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThanOrEqualTo(String value) {
            addCriterion("ad_name <=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLike(String value) {
            addCriterion("ad_name like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotLike(String value) {
            addCriterion("ad_name not like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameIn(List<String> values) {
            addCriterion("ad_name in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotIn(List<String> values) {
            addCriterion("ad_name not in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameBetween(String value1, String value2) {
            addCriterion("ad_name between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotBetween(String value1, String value2) {
            addCriterion("ad_name not between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdPhoneIsNull() {
            addCriterion("ad_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdPhoneIsNotNull() {
            addCriterion("ad_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdPhoneEqualTo(String value) {
            addCriterion("ad_phone =", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotEqualTo(String value) {
            addCriterion("ad_phone <>", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneGreaterThan(String value) {
            addCriterion("ad_phone >", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ad_phone >=", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneLessThan(String value) {
            addCriterion("ad_phone <", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneLessThanOrEqualTo(String value) {
            addCriterion("ad_phone <=", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneLike(String value) {
            addCriterion("ad_phone like", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotLike(String value) {
            addCriterion("ad_phone not like", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneIn(List<String> values) {
            addCriterion("ad_phone in", values, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotIn(List<String> values) {
            addCriterion("ad_phone not in", values, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneBetween(String value1, String value2) {
            addCriterion("ad_phone between", value1, value2, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotBetween(String value1, String value2) {
            addCriterion("ad_phone not between", value1, value2, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdProvinceIsNull() {
            addCriterion("ad_province is null");
            return (Criteria) this;
        }

        public Criteria andAdProvinceIsNotNull() {
            addCriterion("ad_province is not null");
            return (Criteria) this;
        }

        public Criteria andAdProvinceEqualTo(String value) {
            addCriterion("ad_province =", value, "adProvince");
            return (Criteria) this;
        }

        public Criteria andAdProvinceNotEqualTo(String value) {
            addCriterion("ad_province <>", value, "adProvince");
            return (Criteria) this;
        }

        public Criteria andAdProvinceGreaterThan(String value) {
            addCriterion("ad_province >", value, "adProvince");
            return (Criteria) this;
        }

        public Criteria andAdProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("ad_province >=", value, "adProvince");
            return (Criteria) this;
        }

        public Criteria andAdProvinceLessThan(String value) {
            addCriterion("ad_province <", value, "adProvince");
            return (Criteria) this;
        }

        public Criteria andAdProvinceLessThanOrEqualTo(String value) {
            addCriterion("ad_province <=", value, "adProvince");
            return (Criteria) this;
        }

        public Criteria andAdProvinceLike(String value) {
            addCriterion("ad_province like", value, "adProvince");
            return (Criteria) this;
        }

        public Criteria andAdProvinceNotLike(String value) {
            addCriterion("ad_province not like", value, "adProvince");
            return (Criteria) this;
        }

        public Criteria andAdProvinceIn(List<String> values) {
            addCriterion("ad_province in", values, "adProvince");
            return (Criteria) this;
        }

        public Criteria andAdProvinceNotIn(List<String> values) {
            addCriterion("ad_province not in", values, "adProvince");
            return (Criteria) this;
        }

        public Criteria andAdProvinceBetween(String value1, String value2) {
            addCriterion("ad_province between", value1, value2, "adProvince");
            return (Criteria) this;
        }

        public Criteria andAdProvinceNotBetween(String value1, String value2) {
            addCriterion("ad_province not between", value1, value2, "adProvince");
            return (Criteria) this;
        }

        public Criteria andAdCityIsNull() {
            addCriterion("ad_city is null");
            return (Criteria) this;
        }

        public Criteria andAdCityIsNotNull() {
            addCriterion("ad_city is not null");
            return (Criteria) this;
        }

        public Criteria andAdCityEqualTo(String value) {
            addCriterion("ad_city =", value, "adCity");
            return (Criteria) this;
        }

        public Criteria andAdCityNotEqualTo(String value) {
            addCriterion("ad_city <>", value, "adCity");
            return (Criteria) this;
        }

        public Criteria andAdCityGreaterThan(String value) {
            addCriterion("ad_city >", value, "adCity");
            return (Criteria) this;
        }

        public Criteria andAdCityGreaterThanOrEqualTo(String value) {
            addCriterion("ad_city >=", value, "adCity");
            return (Criteria) this;
        }

        public Criteria andAdCityLessThan(String value) {
            addCriterion("ad_city <", value, "adCity");
            return (Criteria) this;
        }

        public Criteria andAdCityLessThanOrEqualTo(String value) {
            addCriterion("ad_city <=", value, "adCity");
            return (Criteria) this;
        }

        public Criteria andAdCityLike(String value) {
            addCriterion("ad_city like", value, "adCity");
            return (Criteria) this;
        }

        public Criteria andAdCityNotLike(String value) {
            addCriterion("ad_city not like", value, "adCity");
            return (Criteria) this;
        }

        public Criteria andAdCityIn(List<String> values) {
            addCriterion("ad_city in", values, "adCity");
            return (Criteria) this;
        }

        public Criteria andAdCityNotIn(List<String> values) {
            addCriterion("ad_city not in", values, "adCity");
            return (Criteria) this;
        }

        public Criteria andAdCityBetween(String value1, String value2) {
            addCriterion("ad_city between", value1, value2, "adCity");
            return (Criteria) this;
        }

        public Criteria andAdCityNotBetween(String value1, String value2) {
            addCriterion("ad_city not between", value1, value2, "adCity");
            return (Criteria) this;
        }

        public Criteria andAdAddressIsNull() {
            addCriterion("ad_address is null");
            return (Criteria) this;
        }

        public Criteria andAdAddressIsNotNull() {
            addCriterion("ad_address is not null");
            return (Criteria) this;
        }

        public Criteria andAdAddressEqualTo(String value) {
            addCriterion("ad_address =", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressNotEqualTo(String value) {
            addCriterion("ad_address <>", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressGreaterThan(String value) {
            addCriterion("ad_address >", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ad_address >=", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressLessThan(String value) {
            addCriterion("ad_address <", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressLessThanOrEqualTo(String value) {
            addCriterion("ad_address <=", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressLike(String value) {
            addCriterion("ad_address like", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressNotLike(String value) {
            addCriterion("ad_address not like", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressIn(List<String> values) {
            addCriterion("ad_address in", values, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressNotIn(List<String> values) {
            addCriterion("ad_address not in", values, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressBetween(String value1, String value2) {
            addCriterion("ad_address between", value1, value2, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressNotBetween(String value1, String value2) {
            addCriterion("ad_address not between", value1, value2, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdFlagIsNull() {
            addCriterion("ad_flag is null");
            return (Criteria) this;
        }

        public Criteria andAdFlagIsNotNull() {
            addCriterion("ad_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAdFlagEqualTo(Integer value) {
            addCriterion("ad_flag =", value, "adFlag");
            return (Criteria) this;
        }

        public Criteria andAdFlagNotEqualTo(Integer value) {
            addCriterion("ad_flag <>", value, "adFlag");
            return (Criteria) this;
        }

        public Criteria andAdFlagGreaterThan(Integer value) {
            addCriterion("ad_flag >", value, "adFlag");
            return (Criteria) this;
        }

        public Criteria andAdFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_flag >=", value, "adFlag");
            return (Criteria) this;
        }

        public Criteria andAdFlagLessThan(Integer value) {
            addCriterion("ad_flag <", value, "adFlag");
            return (Criteria) this;
        }

        public Criteria andAdFlagLessThanOrEqualTo(Integer value) {
            addCriterion("ad_flag <=", value, "adFlag");
            return (Criteria) this;
        }

        public Criteria andAdFlagIn(List<Integer> values) {
            addCriterion("ad_flag in", values, "adFlag");
            return (Criteria) this;
        }

        public Criteria andAdFlagNotIn(List<Integer> values) {
            addCriterion("ad_flag not in", values, "adFlag");
            return (Criteria) this;
        }

        public Criteria andAdFlagBetween(Integer value1, Integer value2) {
            addCriterion("ad_flag between", value1, value2, "adFlag");
            return (Criteria) this;
        }

        public Criteria andAdFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_flag not between", value1, value2, "adFlag");
            return (Criteria) this;
        }

        public Criteria andAdSexIsNull() {
            addCriterion("ad_sex is null");
            return (Criteria) this;
        }

        public Criteria andAdSexIsNotNull() {
            addCriterion("ad_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAdSexEqualTo(String value) {
            addCriterion("ad_sex =", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexNotEqualTo(String value) {
            addCriterion("ad_sex <>", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexGreaterThan(String value) {
            addCriterion("ad_sex >", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexGreaterThanOrEqualTo(String value) {
            addCriterion("ad_sex >=", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexLessThan(String value) {
            addCriterion("ad_sex <", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexLessThanOrEqualTo(String value) {
            addCriterion("ad_sex <=", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexLike(String value) {
            addCriterion("ad_sex like", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexNotLike(String value) {
            addCriterion("ad_sex not like", value, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexIn(List<String> values) {
            addCriterion("ad_sex in", values, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexNotIn(List<String> values) {
            addCriterion("ad_sex not in", values, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexBetween(String value1, String value2) {
            addCriterion("ad_sex between", value1, value2, "adSex");
            return (Criteria) this;
        }

        public Criteria andAdSexNotBetween(String value1, String value2) {
            addCriterion("ad_sex not between", value1, value2, "adSex");
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