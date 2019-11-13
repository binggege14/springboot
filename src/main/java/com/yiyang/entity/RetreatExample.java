package com.yiyang.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RetreatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RetreatExample() {
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

        public Criteria andRetreattimeIsNull() {
            addCriterion("retreattime is null");
            return (Criteria) this;
        }

        public Criteria andRetreattimeIsNotNull() {
            addCriterion("retreattime is not null");
            return (Criteria) this;
        }

        public Criteria andRetreattimeEqualTo(Date value) {
            addCriterionForJDBCDate("retreattime =", value, "retreattime");
            return (Criteria) this;
        }

        public Criteria andRetreattimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("retreattime <>", value, "retreattime");
            return (Criteria) this;
        }

        public Criteria andRetreattimeGreaterThan(Date value) {
            addCriterionForJDBCDate("retreattime >", value, "retreattime");
            return (Criteria) this;
        }

        public Criteria andRetreattimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("retreattime >=", value, "retreattime");
            return (Criteria) this;
        }

        public Criteria andRetreattimeLessThan(Date value) {
            addCriterionForJDBCDate("retreattime <", value, "retreattime");
            return (Criteria) this;
        }

        public Criteria andRetreattimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("retreattime <=", value, "retreattime");
            return (Criteria) this;
        }

        public Criteria andRetreattimeIn(List<Date> values) {
            addCriterionForJDBCDate("retreattime in", values, "retreattime");
            return (Criteria) this;
        }

        public Criteria andRetreattimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("retreattime not in", values, "retreattime");
            return (Criteria) this;
        }

        public Criteria andRetreattimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("retreattime between", value1, value2, "retreattime");
            return (Criteria) this;
        }

        public Criteria andRetreattimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("retreattime not between", value1, value2, "retreattime");
            return (Criteria) this;
        }

        public Criteria andRetreattypeIsNull() {
            addCriterion("retreattype is null");
            return (Criteria) this;
        }

        public Criteria andRetreattypeIsNotNull() {
            addCriterion("retreattype is not null");
            return (Criteria) this;
        }

        public Criteria andRetreattypeEqualTo(String value) {
            addCriterion("retreattype =", value, "retreattype");
            return (Criteria) this;
        }

        public Criteria andRetreattypeNotEqualTo(String value) {
            addCriterion("retreattype <>", value, "retreattype");
            return (Criteria) this;
        }

        public Criteria andRetreattypeGreaterThan(String value) {
            addCriterion("retreattype >", value, "retreattype");
            return (Criteria) this;
        }

        public Criteria andRetreattypeGreaterThanOrEqualTo(String value) {
            addCriterion("retreattype >=", value, "retreattype");
            return (Criteria) this;
        }

        public Criteria andRetreattypeLessThan(String value) {
            addCriterion("retreattype <", value, "retreattype");
            return (Criteria) this;
        }

        public Criteria andRetreattypeLessThanOrEqualTo(String value) {
            addCriterion("retreattype <=", value, "retreattype");
            return (Criteria) this;
        }

        public Criteria andRetreattypeLike(String value) {
            addCriterion("retreattype like", value, "retreattype");
            return (Criteria) this;
        }

        public Criteria andRetreattypeNotLike(String value) {
            addCriterion("retreattype not like", value, "retreattype");
            return (Criteria) this;
        }

        public Criteria andRetreattypeIn(List<String> values) {
            addCriterion("retreattype in", values, "retreattype");
            return (Criteria) this;
        }

        public Criteria andRetreattypeNotIn(List<String> values) {
            addCriterion("retreattype not in", values, "retreattype");
            return (Criteria) this;
        }

        public Criteria andRetreattypeBetween(String value1, String value2) {
            addCriterion("retreattype between", value1, value2, "retreattype");
            return (Criteria) this;
        }

        public Criteria andRetreattypeNotBetween(String value1, String value2) {
            addCriterion("retreattype not between", value1, value2, "retreattype");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonIsNull() {
            addCriterion("retreatreason is null");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonIsNotNull() {
            addCriterion("retreatreason is not null");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonEqualTo(String value) {
            addCriterion("retreatreason =", value, "retreatreason");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonNotEqualTo(String value) {
            addCriterion("retreatreason <>", value, "retreatreason");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonGreaterThan(String value) {
            addCriterion("retreatreason >", value, "retreatreason");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonGreaterThanOrEqualTo(String value) {
            addCriterion("retreatreason >=", value, "retreatreason");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonLessThan(String value) {
            addCriterion("retreatreason <", value, "retreatreason");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonLessThanOrEqualTo(String value) {
            addCriterion("retreatreason <=", value, "retreatreason");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonLike(String value) {
            addCriterion("retreatreason like", value, "retreatreason");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonNotLike(String value) {
            addCriterion("retreatreason not like", value, "retreatreason");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonIn(List<String> values) {
            addCriterion("retreatreason in", values, "retreatreason");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonNotIn(List<String> values) {
            addCriterion("retreatreason not in", values, "retreatreason");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonBetween(String value1, String value2) {
            addCriterion("retreatreason between", value1, value2, "retreatreason");
            return (Criteria) this;
        }

        public Criteria andRetreatreasonNotBetween(String value1, String value2) {
            addCriterion("retreatreason not between", value1, value2, "retreatreason");
            return (Criteria) this;
        }

        public Criteria andStatuIsNull() {
            addCriterion("statu is null");
            return (Criteria) this;
        }

        public Criteria andStatuIsNotNull() {
            addCriterion("statu is not null");
            return (Criteria) this;
        }

        public Criteria andStatuEqualTo(String value) {
            addCriterion("statu =", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotEqualTo(String value) {
            addCriterion("statu <>", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThan(String value) {
            addCriterion("statu >", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThanOrEqualTo(String value) {
            addCriterion("statu >=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThan(String value) {
            addCriterion("statu <", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThanOrEqualTo(String value) {
            addCriterion("statu <=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLike(String value) {
            addCriterion("statu like", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotLike(String value) {
            addCriterion("statu not like", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuIn(List<String> values) {
            addCriterion("statu in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotIn(List<String> values) {
            addCriterion("statu not in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuBetween(String value1, String value2) {
            addCriterion("statu between", value1, value2, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotBetween(String value1, String value2) {
            addCriterion("statu not between", value1, value2, "statu");
            return (Criteria) this;
        }

        public Criteria andAsktimeIsNull() {
            addCriterion("asktime is null");
            return (Criteria) this;
        }

        public Criteria andAsktimeIsNotNull() {
            addCriterion("asktime is not null");
            return (Criteria) this;
        }

        public Criteria andAsktimeEqualTo(Date value) {
            addCriterionForJDBCDate("asktime =", value, "asktime");
            return (Criteria) this;
        }

        public Criteria andAsktimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("asktime <>", value, "asktime");
            return (Criteria) this;
        }

        public Criteria andAsktimeGreaterThan(Date value) {
            addCriterionForJDBCDate("asktime >", value, "asktime");
            return (Criteria) this;
        }

        public Criteria andAsktimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("asktime >=", value, "asktime");
            return (Criteria) this;
        }

        public Criteria andAsktimeLessThan(Date value) {
            addCriterionForJDBCDate("asktime <", value, "asktime");
            return (Criteria) this;
        }

        public Criteria andAsktimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("asktime <=", value, "asktime");
            return (Criteria) this;
        }

        public Criteria andAsktimeIn(List<Date> values) {
            addCriterionForJDBCDate("asktime in", values, "asktime");
            return (Criteria) this;
        }

        public Criteria andAsktimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("asktime not in", values, "asktime");
            return (Criteria) this;
        }

        public Criteria andAsktimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("asktime between", value1, value2, "asktime");
            return (Criteria) this;
        }

        public Criteria andAsktimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("asktime not between", value1, value2, "asktime");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIsNull() {
            addCriterion("auditopinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIsNotNull() {
            addCriterion("auditopinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditopinionEqualTo(String value) {
            addCriterion("auditopinion =", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotEqualTo(String value) {
            addCriterion("auditopinion <>", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionGreaterThan(String value) {
            addCriterion("auditopinion >", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionGreaterThanOrEqualTo(String value) {
            addCriterion("auditopinion >=", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLessThan(String value) {
            addCriterion("auditopinion <", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLessThanOrEqualTo(String value) {
            addCriterion("auditopinion <=", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLike(String value) {
            addCriterion("auditopinion like", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotLike(String value) {
            addCriterion("auditopinion not like", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIn(List<String> values) {
            addCriterion("auditopinion in", values, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotIn(List<String> values) {
            addCriterion("auditopinion not in", values, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionBetween(String value1, String value2) {
            addCriterion("auditopinion between", value1, value2, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotBetween(String value1, String value2) {
            addCriterion("auditopinion not between", value1, value2, "auditopinion");
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