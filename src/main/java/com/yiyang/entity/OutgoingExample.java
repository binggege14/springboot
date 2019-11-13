package com.yiyang.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OutgoingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutgoingExample() {
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

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("customerid like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("customerid not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonIsNull() {
            addCriterion("outgoingreason is null");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonIsNotNull() {
            addCriterion("outgoingreason is not null");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonEqualTo(String value) {
            addCriterion("outgoingreason =", value, "outgoingreason");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonNotEqualTo(String value) {
            addCriterion("outgoingreason <>", value, "outgoingreason");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonGreaterThan(String value) {
            addCriterion("outgoingreason >", value, "outgoingreason");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonGreaterThanOrEqualTo(String value) {
            addCriterion("outgoingreason >=", value, "outgoingreason");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonLessThan(String value) {
            addCriterion("outgoingreason <", value, "outgoingreason");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonLessThanOrEqualTo(String value) {
            addCriterion("outgoingreason <=", value, "outgoingreason");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonLike(String value) {
            addCriterion("outgoingreason like", value, "outgoingreason");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonNotLike(String value) {
            addCriterion("outgoingreason not like", value, "outgoingreason");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonIn(List<String> values) {
            addCriterion("outgoingreason in", values, "outgoingreason");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonNotIn(List<String> values) {
            addCriterion("outgoingreason not in", values, "outgoingreason");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonBetween(String value1, String value2) {
            addCriterion("outgoingreason between", value1, value2, "outgoingreason");
            return (Criteria) this;
        }

        public Criteria andOutgoingreasonNotBetween(String value1, String value2) {
            addCriterion("outgoingreason not between", value1, value2, "outgoingreason");
            return (Criteria) this;
        }

        public Criteria andOutgongtimeIsNull() {
            addCriterion("outgongtime is null");
            return (Criteria) this;
        }

        public Criteria andOutgongtimeIsNotNull() {
            addCriterion("outgongtime is not null");
            return (Criteria) this;
        }

        public Criteria andOutgongtimeEqualTo(Date value) {
            addCriterionForJDBCDate("outgongtime =", value, "outgongtime");
            return (Criteria) this;
        }

        public Criteria andOutgongtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("outgongtime <>", value, "outgongtime");
            return (Criteria) this;
        }

        public Criteria andOutgongtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("outgongtime >", value, "outgongtime");
            return (Criteria) this;
        }

        public Criteria andOutgongtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outgongtime >=", value, "outgongtime");
            return (Criteria) this;
        }

        public Criteria andOutgongtimeLessThan(Date value) {
            addCriterionForJDBCDate("outgongtime <", value, "outgongtime");
            return (Criteria) this;
        }

        public Criteria andOutgongtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outgongtime <=", value, "outgongtime");
            return (Criteria) this;
        }

        public Criteria andOutgongtimeIn(List<Date> values) {
            addCriterionForJDBCDate("outgongtime in", values, "outgongtime");
            return (Criteria) this;
        }

        public Criteria andOutgongtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("outgongtime not in", values, "outgongtime");
            return (Criteria) this;
        }

        public Criteria andOutgongtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outgongtime between", value1, value2, "outgongtime");
            return (Criteria) this;
        }

        public Criteria andOutgongtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outgongtime not between", value1, value2, "outgongtime");
            return (Criteria) this;
        }

        public Criteria andExpectedreturntimeIsNull() {
            addCriterion("EXPECTEDRETURNTIME is null");
            return (Criteria) this;
        }

        public Criteria andExpectedreturntimeIsNotNull() {
            addCriterion("EXPECTEDRETURNTIME is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedreturntimeEqualTo(Date value) {
            addCriterionForJDBCDate("EXPECTEDRETURNTIME =", value, "expectedreturntime");
            return (Criteria) this;
        }

        public Criteria andExpectedreturntimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EXPECTEDRETURNTIME <>", value, "expectedreturntime");
            return (Criteria) this;
        }

        public Criteria andExpectedreturntimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EXPECTEDRETURNTIME >", value, "expectedreturntime");
            return (Criteria) this;
        }

        public Criteria andExpectedreturntimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPECTEDRETURNTIME >=", value, "expectedreturntime");
            return (Criteria) this;
        }

        public Criteria andExpectedreturntimeLessThan(Date value) {
            addCriterionForJDBCDate("EXPECTEDRETURNTIME <", value, "expectedreturntime");
            return (Criteria) this;
        }

        public Criteria andExpectedreturntimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EXPECTEDRETURNTIME <=", value, "expectedreturntime");
            return (Criteria) this;
        }

        public Criteria andExpectedreturntimeIn(List<Date> values) {
            addCriterionForJDBCDate("EXPECTEDRETURNTIME in", values, "expectedreturntime");
            return (Criteria) this;
        }

        public Criteria andExpectedreturntimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EXPECTEDRETURNTIME not in", values, "expectedreturntime");
            return (Criteria) this;
        }

        public Criteria andExpectedreturntimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPECTEDRETURNTIME between", value1, value2, "expectedreturntime");
            return (Criteria) this;
        }

        public Criteria andExpectedreturntimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EXPECTEDRETURNTIME not between", value1, value2, "expectedreturntime");
            return (Criteria) this;
        }

        public Criteria andActualreturntimeIsNull() {
            addCriterion("ACTUALRETURNTIME is null");
            return (Criteria) this;
        }

        public Criteria andActualreturntimeIsNotNull() {
            addCriterion("ACTUALRETURNTIME is not null");
            return (Criteria) this;
        }

        public Criteria andActualreturntimeEqualTo(Date value) {
            addCriterionForJDBCDate("ACTUALRETURNTIME =", value, "actualreturntime");
            return (Criteria) this;
        }

        public Criteria andActualreturntimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACTUALRETURNTIME <>", value, "actualreturntime");
            return (Criteria) this;
        }

        public Criteria andActualreturntimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ACTUALRETURNTIME >", value, "actualreturntime");
            return (Criteria) this;
        }

        public Criteria andActualreturntimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTUALRETURNTIME >=", value, "actualreturntime");
            return (Criteria) this;
        }

        public Criteria andActualreturntimeLessThan(Date value) {
            addCriterionForJDBCDate("ACTUALRETURNTIME <", value, "actualreturntime");
            return (Criteria) this;
        }

        public Criteria andActualreturntimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTUALRETURNTIME <=", value, "actualreturntime");
            return (Criteria) this;
        }

        public Criteria andActualreturntimeIn(List<Date> values) {
            addCriterionForJDBCDate("ACTUALRETURNTIME in", values, "actualreturntime");
            return (Criteria) this;
        }

        public Criteria andActualreturntimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACTUALRETURNTIME not in", values, "actualreturntime");
            return (Criteria) this;
        }

        public Criteria andActualreturntimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTUALRETURNTIME between", value1, value2, "actualreturntime");
            return (Criteria) this;
        }

        public Criteria andActualreturntimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTUALRETURNTIME not between", value1, value2, "actualreturntime");
            return (Criteria) this;
        }

        public Criteria andEscortedIsNull() {
            addCriterion("ESCORTED is null");
            return (Criteria) this;
        }

        public Criteria andEscortedIsNotNull() {
            addCriterion("ESCORTED is not null");
            return (Criteria) this;
        }

        public Criteria andEscortedEqualTo(String value) {
            addCriterion("ESCORTED =", value, "escorted");
            return (Criteria) this;
        }

        public Criteria andEscortedNotEqualTo(String value) {
            addCriterion("ESCORTED <>", value, "escorted");
            return (Criteria) this;
        }

        public Criteria andEscortedGreaterThan(String value) {
            addCriterion("ESCORTED >", value, "escorted");
            return (Criteria) this;
        }

        public Criteria andEscortedGreaterThanOrEqualTo(String value) {
            addCriterion("ESCORTED >=", value, "escorted");
            return (Criteria) this;
        }

        public Criteria andEscortedLessThan(String value) {
            addCriterion("ESCORTED <", value, "escorted");
            return (Criteria) this;
        }

        public Criteria andEscortedLessThanOrEqualTo(String value) {
            addCriterion("ESCORTED <=", value, "escorted");
            return (Criteria) this;
        }

        public Criteria andEscortedLike(String value) {
            addCriterion("ESCORTED like", value, "escorted");
            return (Criteria) this;
        }

        public Criteria andEscortedNotLike(String value) {
            addCriterion("ESCORTED not like", value, "escorted");
            return (Criteria) this;
        }

        public Criteria andEscortedIn(List<String> values) {
            addCriterion("ESCORTED in", values, "escorted");
            return (Criteria) this;
        }

        public Criteria andEscortedNotIn(List<String> values) {
            addCriterion("ESCORTED not in", values, "escorted");
            return (Criteria) this;
        }

        public Criteria andEscortedBetween(String value1, String value2) {
            addCriterion("ESCORTED between", value1, value2, "escorted");
            return (Criteria) this;
        }

        public Criteria andEscortedNotBetween(String value1, String value2) {
            addCriterion("ESCORTED not between", value1, value2, "escorted");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("RELATION is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("RELATION is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("RELATION =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("RELATION <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("RELATION >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("RELATION >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("RELATION <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("RELATION <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("RELATION like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("RELATION not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("RELATION in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("RELATION not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("RELATION between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("RELATION not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andEscortedtelIsNull() {
            addCriterion("ESCORTEDTEL is null");
            return (Criteria) this;
        }

        public Criteria andEscortedtelIsNotNull() {
            addCriterion("ESCORTEDTEL is not null");
            return (Criteria) this;
        }

        public Criteria andEscortedtelEqualTo(String value) {
            addCriterion("ESCORTEDTEL =", value, "escortedtel");
            return (Criteria) this;
        }

        public Criteria andEscortedtelNotEqualTo(String value) {
            addCriterion("ESCORTEDTEL <>", value, "escortedtel");
            return (Criteria) this;
        }

        public Criteria andEscortedtelGreaterThan(String value) {
            addCriterion("ESCORTEDTEL >", value, "escortedtel");
            return (Criteria) this;
        }

        public Criteria andEscortedtelGreaterThanOrEqualTo(String value) {
            addCriterion("ESCORTEDTEL >=", value, "escortedtel");
            return (Criteria) this;
        }

        public Criteria andEscortedtelLessThan(String value) {
            addCriterion("ESCORTEDTEL <", value, "escortedtel");
            return (Criteria) this;
        }

        public Criteria andEscortedtelLessThanOrEqualTo(String value) {
            addCriterion("ESCORTEDTEL <=", value, "escortedtel");
            return (Criteria) this;
        }

        public Criteria andEscortedtelLike(String value) {
            addCriterion("ESCORTEDTEL like", value, "escortedtel");
            return (Criteria) this;
        }

        public Criteria andEscortedtelNotLike(String value) {
            addCriterion("ESCORTEDTEL not like", value, "escortedtel");
            return (Criteria) this;
        }

        public Criteria andEscortedtelIn(List<String> values) {
            addCriterion("ESCORTEDTEL in", values, "escortedtel");
            return (Criteria) this;
        }

        public Criteria andEscortedtelNotIn(List<String> values) {
            addCriterion("ESCORTEDTEL not in", values, "escortedtel");
            return (Criteria) this;
        }

        public Criteria andEscortedtelBetween(String value1, String value2) {
            addCriterion("ESCORTEDTEL between", value1, value2, "escortedtel");
            return (Criteria) this;
        }

        public Criteria andEscortedtelNotBetween(String value1, String value2) {
            addCriterion("ESCORTEDTEL not between", value1, value2, "escortedtel");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNull() {
            addCriterion("AUDITSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("AUDITSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(String value) {
            addCriterion("AUDITSTATUS =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(String value) {
            addCriterion("AUDITSTATUS <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(String value) {
            addCriterion("AUDITSTATUS >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITSTATUS >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(String value) {
            addCriterion("AUDITSTATUS <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(String value) {
            addCriterion("AUDITSTATUS <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLike(String value) {
            addCriterion("AUDITSTATUS like", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotLike(String value) {
            addCriterion("AUDITSTATUS not like", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<String> values) {
            addCriterion("AUDITSTATUS in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<String> values) {
            addCriterion("AUDITSTATUS not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(String value1, String value2) {
            addCriterion("AUDITSTATUS between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(String value1, String value2) {
            addCriterion("AUDITSTATUS not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditpersonIsNull() {
            addCriterion("auditperson is null");
            return (Criteria) this;
        }

        public Criteria andAuditpersonIsNotNull() {
            addCriterion("auditperson is not null");
            return (Criteria) this;
        }

        public Criteria andAuditpersonEqualTo(String value) {
            addCriterion("auditperson =", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonNotEqualTo(String value) {
            addCriterion("auditperson <>", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonGreaterThan(String value) {
            addCriterion("auditperson >", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonGreaterThanOrEqualTo(String value) {
            addCriterion("auditperson >=", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonLessThan(String value) {
            addCriterion("auditperson <", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonLessThanOrEqualTo(String value) {
            addCriterion("auditperson <=", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonLike(String value) {
            addCriterion("auditperson like", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonNotLike(String value) {
            addCriterion("auditperson not like", value, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonIn(List<String> values) {
            addCriterion("auditperson in", values, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonNotIn(List<String> values) {
            addCriterion("auditperson not in", values, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonBetween(String value1, String value2) {
            addCriterion("auditperson between", value1, value2, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAuditpersonNotBetween(String value1, String value2) {
            addCriterion("auditperson not between", value1, value2, "auditperson");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNull() {
            addCriterion("audittime is null");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNotNull() {
            addCriterion("audittime is not null");
            return (Criteria) this;
        }

        public Criteria andAudittimeEqualTo(Date value) {
            addCriterionForJDBCDate("audittime =", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("audittime <>", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThan(Date value) {
            addCriterionForJDBCDate("audittime >", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("audittime >=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThan(Date value) {
            addCriterionForJDBCDate("audittime <", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("audittime <=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeIn(List<Date> values) {
            addCriterionForJDBCDate("audittime in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("audittime not in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("audittime between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("audittime not between", value1, value2, "audittime");
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