package com.yiyang.entity;

import java.util.ArrayList;
import java.util.List;

public class CarehistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarehistoryExample() {
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

        public Criteria andCustomidIsNull() {
            addCriterion("customid is null");
            return (Criteria) this;
        }

        public Criteria andCustomidIsNotNull() {
            addCriterion("customid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomidEqualTo(Long value) {
            addCriterion("customid =", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotEqualTo(Long value) {
            addCriterion("customid <>", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThan(Long value) {
            addCriterion("customid >", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidGreaterThanOrEqualTo(Long value) {
            addCriterion("customid >=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThan(Long value) {
            addCriterion("customid <", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidLessThanOrEqualTo(Long value) {
            addCriterion("customid <=", value, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidIn(List<Long> values) {
            addCriterion("customid in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotIn(List<Long> values) {
            addCriterion("customid not in", values, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidBetween(Long value1, Long value2) {
            addCriterion("customid between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andCustomidNotBetween(Long value1, Long value2) {
            addCriterion("customid not between", value1, value2, "customid");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNull() {
            addCriterion("serviceid is null");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNotNull() {
            addCriterion("serviceid is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidEqualTo(Long value) {
            addCriterion("serviceid =", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotEqualTo(Long value) {
            addCriterion("serviceid <>", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThan(Long value) {
            addCriterion("serviceid >", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThanOrEqualTo(Long value) {
            addCriterion("serviceid >=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThan(Long value) {
            addCriterion("serviceid <", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThanOrEqualTo(Long value) {
            addCriterion("serviceid <=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidIn(List<Long> values) {
            addCriterion("serviceid in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotIn(List<Long> values) {
            addCriterion("serviceid not in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidBetween(Long value1, Long value2) {
            addCriterion("serviceid between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotBetween(Long value1, Long value2) {
            addCriterion("serviceid not between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andDetialIsNull() {
            addCriterion("detial is null");
            return (Criteria) this;
        }

        public Criteria andDetialIsNotNull() {
            addCriterion("detial is not null");
            return (Criteria) this;
        }

        public Criteria andDetialEqualTo(String value) {
            addCriterion("detial =", value, "detial");
            return (Criteria) this;
        }

        public Criteria andDetialNotEqualTo(String value) {
            addCriterion("detial <>", value, "detial");
            return (Criteria) this;
        }

        public Criteria andDetialGreaterThan(String value) {
            addCriterion("detial >", value, "detial");
            return (Criteria) this;
        }

        public Criteria andDetialGreaterThanOrEqualTo(String value) {
            addCriterion("detial >=", value, "detial");
            return (Criteria) this;
        }

        public Criteria andDetialLessThan(String value) {
            addCriterion("detial <", value, "detial");
            return (Criteria) this;
        }

        public Criteria andDetialLessThanOrEqualTo(String value) {
            addCriterion("detial <=", value, "detial");
            return (Criteria) this;
        }

        public Criteria andDetialLike(String value) {
            addCriterion("detial like", value, "detial");
            return (Criteria) this;
        }

        public Criteria andDetialNotLike(String value) {
            addCriterion("detial not like", value, "detial");
            return (Criteria) this;
        }

        public Criteria andDetialIn(List<String> values) {
            addCriterion("detial in", values, "detial");
            return (Criteria) this;
        }

        public Criteria andDetialNotIn(List<String> values) {
            addCriterion("detial not in", values, "detial");
            return (Criteria) this;
        }

        public Criteria andDetialBetween(String value1, String value2) {
            addCriterion("detial between", value1, value2, "detial");
            return (Criteria) this;
        }

        public Criteria andDetialNotBetween(String value1, String value2) {
            addCriterion("detial not between", value1, value2, "detial");
            return (Criteria) this;
        }

        public Criteria andServicenumberIsNull() {
            addCriterion("servicenumber is null");
            return (Criteria) this;
        }

        public Criteria andServicenumberIsNotNull() {
            addCriterion("servicenumber is not null");
            return (Criteria) this;
        }

        public Criteria andServicenumberEqualTo(Integer value) {
            addCriterion("servicenumber =", value, "servicenumber");
            return (Criteria) this;
        }

        public Criteria andServicenumberNotEqualTo(Integer value) {
            addCriterion("servicenumber <>", value, "servicenumber");
            return (Criteria) this;
        }

        public Criteria andServicenumberGreaterThan(Integer value) {
            addCriterion("servicenumber >", value, "servicenumber");
            return (Criteria) this;
        }

        public Criteria andServicenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicenumber >=", value, "servicenumber");
            return (Criteria) this;
        }

        public Criteria andServicenumberLessThan(Integer value) {
            addCriterion("servicenumber <", value, "servicenumber");
            return (Criteria) this;
        }

        public Criteria andServicenumberLessThanOrEqualTo(Integer value) {
            addCriterion("servicenumber <=", value, "servicenumber");
            return (Criteria) this;
        }

        public Criteria andServicenumberIn(List<Integer> values) {
            addCriterion("servicenumber in", values, "servicenumber");
            return (Criteria) this;
        }

        public Criteria andServicenumberNotIn(List<Integer> values) {
            addCriterion("servicenumber not in", values, "servicenumber");
            return (Criteria) this;
        }

        public Criteria andServicenumberBetween(Integer value1, Integer value2) {
            addCriterion("servicenumber between", value1, value2, "servicenumber");
            return (Criteria) this;
        }

        public Criteria andServicenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("servicenumber not between", value1, value2, "servicenumber");
            return (Criteria) this;
        }

        public Criteria andNurseidIsNull() {
            addCriterion("nurseid is null");
            return (Criteria) this;
        }

        public Criteria andNurseidIsNotNull() {
            addCriterion("nurseid is not null");
            return (Criteria) this;
        }

        public Criteria andNurseidEqualTo(Long value) {
            addCriterion("nurseid =", value, "nurseid");
            return (Criteria) this;
        }

        public Criteria andNurseidNotEqualTo(Long value) {
            addCriterion("nurseid <>", value, "nurseid");
            return (Criteria) this;
        }

        public Criteria andNurseidGreaterThan(Long value) {
            addCriterion("nurseid >", value, "nurseid");
            return (Criteria) this;
        }

        public Criteria andNurseidGreaterThanOrEqualTo(Long value) {
            addCriterion("nurseid >=", value, "nurseid");
            return (Criteria) this;
        }

        public Criteria andNurseidLessThan(Long value) {
            addCriterion("nurseid <", value, "nurseid");
            return (Criteria) this;
        }

        public Criteria andNurseidLessThanOrEqualTo(Long value) {
            addCriterion("nurseid <=", value, "nurseid");
            return (Criteria) this;
        }

        public Criteria andNurseidIn(List<Long> values) {
            addCriterion("nurseid in", values, "nurseid");
            return (Criteria) this;
        }

        public Criteria andNurseidNotIn(List<Long> values) {
            addCriterion("nurseid not in", values, "nurseid");
            return (Criteria) this;
        }

        public Criteria andNurseidBetween(Long value1, Long value2) {
            addCriterion("nurseid between", value1, value2, "nurseid");
            return (Criteria) this;
        }

        public Criteria andNurseidNotBetween(Long value1, Long value2) {
            addCriterion("nurseid not between", value1, value2, "nurseid");
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