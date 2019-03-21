package com.atm.pojo;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSCodeIsNull() {
            addCriterion("s_code is null");
            return (Criteria) this;
        }

        public Criteria andSCodeIsNotNull() {
            addCriterion("s_code is not null");
            return (Criteria) this;
        }

        public Criteria andSCodeEqualTo(String value) {
            addCriterion("s_code =", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeNotEqualTo(String value) {
            addCriterion("s_code <>", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeGreaterThan(String value) {
            addCriterion("s_code >", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeGreaterThanOrEqualTo(String value) {
            addCriterion("s_code >=", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeLessThan(String value) {
            addCriterion("s_code <", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeLessThanOrEqualTo(String value) {
            addCriterion("s_code <=", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeLike(String value) {
            addCriterion("s_code like", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeNotLike(String value) {
            addCriterion("s_code not like", value, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeIn(List<String> values) {
            addCriterion("s_code in", values, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeNotIn(List<String> values) {
            addCriterion("s_code not in", values, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeBetween(String value1, String value2) {
            addCriterion("s_code between", value1, value2, "sCode");
            return (Criteria) this;
        }

        public Criteria andSCodeNotBetween(String value1, String value2) {
            addCriterion("s_code not between", value1, value2, "sCode");
            return (Criteria) this;
        }

        public Criteria andSPriceIsNull() {
            addCriterion("s_price is null");
            return (Criteria) this;
        }

        public Criteria andSPriceIsNotNull() {
            addCriterion("s_price is not null");
            return (Criteria) this;
        }

        public Criteria andSPriceEqualTo(Float value) {
            addCriterion("s_price =", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotEqualTo(Float value) {
            addCriterion("s_price <>", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceGreaterThan(Float value) {
            addCriterion("s_price >", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("s_price >=", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLessThan(Float value) {
            addCriterion("s_price <", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceLessThanOrEqualTo(Float value) {
            addCriterion("s_price <=", value, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceIn(List<Float> values) {
            addCriterion("s_price in", values, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotIn(List<Float> values) {
            addCriterion("s_price not in", values, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceBetween(Float value1, Float value2) {
            addCriterion("s_price between", value1, value2, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSPriceNotBetween(Float value1, Float value2) {
            addCriterion("s_price not between", value1, value2, "sPrice");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSCompanyIsNull() {
            addCriterion("s_company is null");
            return (Criteria) this;
        }

        public Criteria andSCompanyIsNotNull() {
            addCriterion("s_company is not null");
            return (Criteria) this;
        }

        public Criteria andSCompanyEqualTo(String value) {
            addCriterion("s_company =", value, "sCompany");
            return (Criteria) this;
        }

        public Criteria andSCompanyNotEqualTo(String value) {
            addCriterion("s_company <>", value, "sCompany");
            return (Criteria) this;
        }

        public Criteria andSCompanyGreaterThan(String value) {
            addCriterion("s_company >", value, "sCompany");
            return (Criteria) this;
        }

        public Criteria andSCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("s_company >=", value, "sCompany");
            return (Criteria) this;
        }

        public Criteria andSCompanyLessThan(String value) {
            addCriterion("s_company <", value, "sCompany");
            return (Criteria) this;
        }

        public Criteria andSCompanyLessThanOrEqualTo(String value) {
            addCriterion("s_company <=", value, "sCompany");
            return (Criteria) this;
        }

        public Criteria andSCompanyLike(String value) {
            addCriterion("s_company like", value, "sCompany");
            return (Criteria) this;
        }

        public Criteria andSCompanyNotLike(String value) {
            addCriterion("s_company not like", value, "sCompany");
            return (Criteria) this;
        }

        public Criteria andSCompanyIn(List<String> values) {
            addCriterion("s_company in", values, "sCompany");
            return (Criteria) this;
        }

        public Criteria andSCompanyNotIn(List<String> values) {
            addCriterion("s_company not in", values, "sCompany");
            return (Criteria) this;
        }

        public Criteria andSCompanyBetween(String value1, String value2) {
            addCriterion("s_company between", value1, value2, "sCompany");
            return (Criteria) this;
        }

        public Criteria andSCompanyNotBetween(String value1, String value2) {
            addCriterion("s_company not between", value1, value2, "sCompany");
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