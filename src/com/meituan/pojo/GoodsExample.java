package com.meituan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(String value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(String value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(String value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(String value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(String value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(String value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLike(String value) {
            addCriterion("g_id like", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotLike(String value) {
            addCriterion("g_id not like", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<String> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<String> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(String value1, String value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(String value1, String value2) {
            addCriterion("g_id not between", value1, value2, "gId");
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

        public Criteria andGNameIsNull() {
            addCriterion("g_name is null");
            return (Criteria) this;
        }

        public Criteria andGNameIsNotNull() {
            addCriterion("g_name is not null");
            return (Criteria) this;
        }

        public Criteria andGNameEqualTo(String value) {
            addCriterion("g_name =", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotEqualTo(String value) {
            addCriterion("g_name <>", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThan(String value) {
            addCriterion("g_name >", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThanOrEqualTo(String value) {
            addCriterion("g_name >=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThan(String value) {
            addCriterion("g_name <", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThanOrEqualTo(String value) {
            addCriterion("g_name <=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLike(String value) {
            addCriterion("g_name like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotLike(String value) {
            addCriterion("g_name not like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameIn(List<String> values) {
            addCriterion("g_name in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotIn(List<String> values) {
            addCriterion("g_name not in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameBetween(String value1, String value2) {
            addCriterion("g_name between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotBetween(String value1, String value2) {
            addCriterion("g_name not between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGDetailIsNull() {
            addCriterion("g_detail is null");
            return (Criteria) this;
        }

        public Criteria andGDetailIsNotNull() {
            addCriterion("g_detail is not null");
            return (Criteria) this;
        }

        public Criteria andGDetailEqualTo(String value) {
            addCriterion("g_detail =", value, "gDetail");
            return (Criteria) this;
        }

        public Criteria andGDetailNotEqualTo(String value) {
            addCriterion("g_detail <>", value, "gDetail");
            return (Criteria) this;
        }

        public Criteria andGDetailGreaterThan(String value) {
            addCriterion("g_detail >", value, "gDetail");
            return (Criteria) this;
        }

        public Criteria andGDetailGreaterThanOrEqualTo(String value) {
            addCriterion("g_detail >=", value, "gDetail");
            return (Criteria) this;
        }

        public Criteria andGDetailLessThan(String value) {
            addCriterion("g_detail <", value, "gDetail");
            return (Criteria) this;
        }

        public Criteria andGDetailLessThanOrEqualTo(String value) {
            addCriterion("g_detail <=", value, "gDetail");
            return (Criteria) this;
        }

        public Criteria andGDetailLike(String value) {
            addCriterion("g_detail like", value, "gDetail");
            return (Criteria) this;
        }

        public Criteria andGDetailNotLike(String value) {
            addCriterion("g_detail not like", value, "gDetail");
            return (Criteria) this;
        }

        public Criteria andGDetailIn(List<String> values) {
            addCriterion("g_detail in", values, "gDetail");
            return (Criteria) this;
        }

        public Criteria andGDetailNotIn(List<String> values) {
            addCriterion("g_detail not in", values, "gDetail");
            return (Criteria) this;
        }

        public Criteria andGDetailBetween(String value1, String value2) {
            addCriterion("g_detail between", value1, value2, "gDetail");
            return (Criteria) this;
        }

        public Criteria andGDetailNotBetween(String value1, String value2) {
            addCriterion("g_detail not between", value1, value2, "gDetail");
            return (Criteria) this;
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

        public Criteria andGPriceIsNull() {
            addCriterion("g_price is null");
            return (Criteria) this;
        }

        public Criteria andGPriceIsNotNull() {
            addCriterion("g_price is not null");
            return (Criteria) this;
        }

        public Criteria andGPriceEqualTo(Double value) {
            addCriterion("g_price =", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceNotEqualTo(Double value) {
            addCriterion("g_price <>", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceGreaterThan(Double value) {
            addCriterion("g_price >", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("g_price >=", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceLessThan(Double value) {
            addCriterion("g_price <", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceLessThanOrEqualTo(Double value) {
            addCriterion("g_price <=", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceIn(List<Double> values) {
            addCriterion("g_price in", values, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceNotIn(List<Double> values) {
            addCriterion("g_price not in", values, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceBetween(Double value1, Double value2) {
            addCriterion("g_price between", value1, value2, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceNotBetween(Double value1, Double value2) {
            addCriterion("g_price not between", value1, value2, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGStockIsNull() {
            addCriterion("g_stock is null");
            return (Criteria) this;
        }

        public Criteria andGStockIsNotNull() {
            addCriterion("g_stock is not null");
            return (Criteria) this;
        }

        public Criteria andGStockEqualTo(Integer value) {
            addCriterion("g_stock =", value, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockNotEqualTo(Integer value) {
            addCriterion("g_stock <>", value, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockGreaterThan(Integer value) {
            addCriterion("g_stock >", value, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_stock >=", value, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockLessThan(Integer value) {
            addCriterion("g_stock <", value, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockLessThanOrEqualTo(Integer value) {
            addCriterion("g_stock <=", value, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockIn(List<Integer> values) {
            addCriterion("g_stock in", values, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockNotIn(List<Integer> values) {
            addCriterion("g_stock not in", values, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockBetween(Integer value1, Integer value2) {
            addCriterion("g_stock between", value1, value2, "gStock");
            return (Criteria) this;
        }

        public Criteria andGStockNotBetween(Integer value1, Integer value2) {
            addCriterion("g_stock not between", value1, value2, "gStock");
            return (Criteria) this;
        }

        public Criteria andGPictureIsNull() {
            addCriterion("g_picture is null");
            return (Criteria) this;
        }

        public Criteria andGPictureIsNotNull() {
            addCriterion("g_picture is not null");
            return (Criteria) this;
        }

        public Criteria andGPictureEqualTo(String value) {
            addCriterion("g_picture =", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureNotEqualTo(String value) {
            addCriterion("g_picture <>", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureGreaterThan(String value) {
            addCriterion("g_picture >", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureGreaterThanOrEqualTo(String value) {
            addCriterion("g_picture >=", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureLessThan(String value) {
            addCriterion("g_picture <", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureLessThanOrEqualTo(String value) {
            addCriterion("g_picture <=", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureLike(String value) {
            addCriterion("g_picture like", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureNotLike(String value) {
            addCriterion("g_picture not like", value, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureIn(List<String> values) {
            addCriterion("g_picture in", values, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureNotIn(List<String> values) {
            addCriterion("g_picture not in", values, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureBetween(String value1, String value2) {
            addCriterion("g_picture between", value1, value2, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGPictureNotBetween(String value1, String value2) {
            addCriterion("g_picture not between", value1, value2, "gPicture");
            return (Criteria) this;
        }

        public Criteria andGSaleIsNull() {
            addCriterion("g_sale is null");
            return (Criteria) this;
        }

        public Criteria andGSaleIsNotNull() {
            addCriterion("g_sale is not null");
            return (Criteria) this;
        }

        public Criteria andGSaleEqualTo(Integer value) {
            addCriterion("g_sale =", value, "gSale");
            return (Criteria) this;
        }

        public Criteria andGSaleNotEqualTo(Integer value) {
            addCriterion("g_sale <>", value, "gSale");
            return (Criteria) this;
        }

        public Criteria andGSaleGreaterThan(Integer value) {
            addCriterion("g_sale >", value, "gSale");
            return (Criteria) this;
        }

        public Criteria andGSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_sale >=", value, "gSale");
            return (Criteria) this;
        }

        public Criteria andGSaleLessThan(Integer value) {
            addCriterion("g_sale <", value, "gSale");
            return (Criteria) this;
        }

        public Criteria andGSaleLessThanOrEqualTo(Integer value) {
            addCriterion("g_sale <=", value, "gSale");
            return (Criteria) this;
        }

        public Criteria andGSaleIn(List<Integer> values) {
            addCriterion("g_sale in", values, "gSale");
            return (Criteria) this;
        }

        public Criteria andGSaleNotIn(List<Integer> values) {
            addCriterion("g_sale not in", values, "gSale");
            return (Criteria) this;
        }

        public Criteria andGSaleBetween(Integer value1, Integer value2) {
            addCriterion("g_sale between", value1, value2, "gSale");
            return (Criteria) this;
        }

        public Criteria andGSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("g_sale not between", value1, value2, "gSale");
            return (Criteria) this;
        }

        public Criteria andGAddIsNull() {
            addCriterion("g_add is null");
            return (Criteria) this;
        }

        public Criteria andGAddIsNotNull() {
            addCriterion("g_add is not null");
            return (Criteria) this;
        }

        public Criteria andGAddEqualTo(Date value) {
            addCriterion("g_add =", value, "gAdd");
            return (Criteria) this;
        }

        public Criteria andGAddNotEqualTo(Date value) {
            addCriterion("g_add <>", value, "gAdd");
            return (Criteria) this;
        }

        public Criteria andGAddGreaterThan(Date value) {
            addCriterion("g_add >", value, "gAdd");
            return (Criteria) this;
        }

        public Criteria andGAddGreaterThanOrEqualTo(Date value) {
            addCriterion("g_add >=", value, "gAdd");
            return (Criteria) this;
        }

        public Criteria andGAddLessThan(Date value) {
            addCriterion("g_add <", value, "gAdd");
            return (Criteria) this;
        }

        public Criteria andGAddLessThanOrEqualTo(Date value) {
            addCriterion("g_add <=", value, "gAdd");
            return (Criteria) this;
        }

        public Criteria andGAddIn(List<Date> values) {
            addCriterion("g_add in", values, "gAdd");
            return (Criteria) this;
        }

        public Criteria andGAddNotIn(List<Date> values) {
            addCriterion("g_add not in", values, "gAdd");
            return (Criteria) this;
        }

        public Criteria andGAddBetween(Date value1, Date value2) {
            addCriterion("g_add between", value1, value2, "gAdd");
            return (Criteria) this;
        }

        public Criteria andGAddNotBetween(Date value1, Date value2) {
            addCriterion("g_add not between", value1, value2, "gAdd");
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