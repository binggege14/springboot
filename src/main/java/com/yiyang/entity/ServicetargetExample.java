package com.yiyang.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ServicetargetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicetargetExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Long value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Long value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Long value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Long value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Long value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Long value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Long> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Long> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Long value1, Long value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Long value1, Long value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
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

        public Criteria andStartIsNull() {
            addCriterion("start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(Date value) {
            addCriterionForJDBCDate("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(Date value) {
            addCriterionForJDBCDate("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(Date value) {
            addCriterionForJDBCDate("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<Date> values) {
            addCriterionForJDBCDate("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start not between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andEndIsNull() {
            addCriterion("end is null");
            return (Criteria) this;
        }

        public Criteria andEndIsNotNull() {
            addCriterion("end is not null");
            return (Criteria) this;
        }

        public Criteria andEndEqualTo(Date value) {
            addCriterionForJDBCDate("end =", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("end <>", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThan(Date value) {
            addCriterionForJDBCDate("end >", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end >=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThan(Date value) {
            addCriterionForJDBCDate("end <", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end <=", value, "end");
            return (Criteria) this;
        }

        public Criteria andEndIn(List<Date> values) {
            addCriterionForJDBCDate("end in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("end not in", values, "end");
            return (Criteria) this;
        }

        public Criteria andEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end between", value1, value2, "end");
            return (Criteria) this;
        }

        public Criteria andEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end not between", value1, value2, "end");
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