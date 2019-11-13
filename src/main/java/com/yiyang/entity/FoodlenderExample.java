package com.yiyang.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FoodlenderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodlenderExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Byte value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Byte value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Byte value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Byte value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Byte value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Byte> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Byte> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Byte value1, Byte value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Byte value1, Byte value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andFoodnameIsNull() {
            addCriterion("foodname is null");
            return (Criteria) this;
        }

        public Criteria andFoodnameIsNotNull() {
            addCriterion("foodname is not null");
            return (Criteria) this;
        }

        public Criteria andFoodnameEqualTo(String value) {
            addCriterion("foodname =", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotEqualTo(String value) {
            addCriterion("foodname <>", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameGreaterThan(String value) {
            addCriterion("foodname >", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("foodname >=", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLessThan(String value) {
            addCriterion("foodname <", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLessThanOrEqualTo(String value) {
            addCriterion("foodname <=", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameLike(String value) {
            addCriterion("foodname like", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotLike(String value) {
            addCriterion("foodname not like", value, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameIn(List<String> values) {
            addCriterion("foodname in", values, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotIn(List<String> values) {
            addCriterion("foodname not in", values, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameBetween(String value1, String value2) {
            addCriterion("foodname between", value1, value2, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodnameNotBetween(String value1, String value2) {
            addCriterion("foodname not between", value1, value2, "foodname");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIsNull() {
            addCriterion("foodtype is null");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIsNotNull() {
            addCriterion("foodtype is not null");
            return (Criteria) this;
        }

        public Criteria andFoodtypeEqualTo(String value) {
            addCriterion("foodtype =", value, "foodtype");
            return (Criteria) this;
        }

        public Criteria andFoodtypeNotEqualTo(String value) {
            addCriterion("foodtype <>", value, "foodtype");
            return (Criteria) this;
        }

        public Criteria andFoodtypeGreaterThan(String value) {
            addCriterion("foodtype >", value, "foodtype");
            return (Criteria) this;
        }

        public Criteria andFoodtypeGreaterThanOrEqualTo(String value) {
            addCriterion("foodtype >=", value, "foodtype");
            return (Criteria) this;
        }

        public Criteria andFoodtypeLessThan(String value) {
            addCriterion("foodtype <", value, "foodtype");
            return (Criteria) this;
        }

        public Criteria andFoodtypeLessThanOrEqualTo(String value) {
            addCriterion("foodtype <=", value, "foodtype");
            return (Criteria) this;
        }

        public Criteria andFoodtypeLike(String value) {
            addCriterion("foodtype like", value, "foodtype");
            return (Criteria) this;
        }

        public Criteria andFoodtypeNotLike(String value) {
            addCriterion("foodtype not like", value, "foodtype");
            return (Criteria) this;
        }

        public Criteria andFoodtypeIn(List<String> values) {
            addCriterion("foodtype in", values, "foodtype");
            return (Criteria) this;
        }

        public Criteria andFoodtypeNotIn(List<String> values) {
            addCriterion("foodtype not in", values, "foodtype");
            return (Criteria) this;
        }

        public Criteria andFoodtypeBetween(String value1, String value2) {
            addCriterion("foodtype between", value1, value2, "foodtype");
            return (Criteria) this;
        }

        public Criteria andFoodtypeNotBetween(String value1, String value2) {
            addCriterion("foodtype not between", value1, value2, "foodtype");
            return (Criteria) this;
        }

        public Criteria andFoodlabelIsNull() {
            addCriterion("foodlabel is null");
            return (Criteria) this;
        }

        public Criteria andFoodlabelIsNotNull() {
            addCriterion("foodlabel is not null");
            return (Criteria) this;
        }

        public Criteria andFoodlabelEqualTo(String value) {
            addCriterion("foodlabel =", value, "foodlabel");
            return (Criteria) this;
        }

        public Criteria andFoodlabelNotEqualTo(String value) {
            addCriterion("foodlabel <>", value, "foodlabel");
            return (Criteria) this;
        }

        public Criteria andFoodlabelGreaterThan(String value) {
            addCriterion("foodlabel >", value, "foodlabel");
            return (Criteria) this;
        }

        public Criteria andFoodlabelGreaterThanOrEqualTo(String value) {
            addCriterion("foodlabel >=", value, "foodlabel");
            return (Criteria) this;
        }

        public Criteria andFoodlabelLessThan(String value) {
            addCriterion("foodlabel <", value, "foodlabel");
            return (Criteria) this;
        }

        public Criteria andFoodlabelLessThanOrEqualTo(String value) {
            addCriterion("foodlabel <=", value, "foodlabel");
            return (Criteria) this;
        }

        public Criteria andFoodlabelLike(String value) {
            addCriterion("foodlabel like", value, "foodlabel");
            return (Criteria) this;
        }

        public Criteria andFoodlabelNotLike(String value) {
            addCriterion("foodlabel not like", value, "foodlabel");
            return (Criteria) this;
        }

        public Criteria andFoodlabelIn(List<String> values) {
            addCriterion("foodlabel in", values, "foodlabel");
            return (Criteria) this;
        }

        public Criteria andFoodlabelNotIn(List<String> values) {
            addCriterion("foodlabel not in", values, "foodlabel");
            return (Criteria) this;
        }

        public Criteria andFoodlabelBetween(String value1, String value2) {
            addCriterion("foodlabel between", value1, value2, "foodlabel");
            return (Criteria) this;
        }

        public Criteria andFoodlabelNotBetween(String value1, String value2) {
            addCriterion("foodlabel not between", value1, value2, "foodlabel");
            return (Criteria) this;
        }

        public Criteria andFoodpriceIsNull() {
            addCriterion("foodprice is null");
            return (Criteria) this;
        }

        public Criteria andFoodpriceIsNotNull() {
            addCriterion("foodprice is not null");
            return (Criteria) this;
        }

        public Criteria andFoodpriceEqualTo(Double value) {
            addCriterion("foodprice =", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceNotEqualTo(Double value) {
            addCriterion("foodprice <>", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceGreaterThan(Double value) {
            addCriterion("foodprice >", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("foodprice >=", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceLessThan(Double value) {
            addCriterion("foodprice <", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceLessThanOrEqualTo(Double value) {
            addCriterion("foodprice <=", value, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceIn(List<Double> values) {
            addCriterion("foodprice in", values, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceNotIn(List<Double> values) {
            addCriterion("foodprice not in", values, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceBetween(Double value1, Double value2) {
            addCriterion("foodprice between", value1, value2, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodpriceNotBetween(Double value1, Double value2) {
            addCriterion("foodprice not between", value1, value2, "foodprice");
            return (Criteria) this;
        }

        public Criteria andFoodimageIsNull() {
            addCriterion("foodimage is null");
            return (Criteria) this;
        }

        public Criteria andFoodimageIsNotNull() {
            addCriterion("foodimage is not null");
            return (Criteria) this;
        }

        public Criteria andFoodimageEqualTo(String value) {
            addCriterion("foodimage =", value, "foodimage");
            return (Criteria) this;
        }

        public Criteria andFoodimageNotEqualTo(String value) {
            addCriterion("foodimage <>", value, "foodimage");
            return (Criteria) this;
        }

        public Criteria andFoodimageGreaterThan(String value) {
            addCriterion("foodimage >", value, "foodimage");
            return (Criteria) this;
        }

        public Criteria andFoodimageGreaterThanOrEqualTo(String value) {
            addCriterion("foodimage >=", value, "foodimage");
            return (Criteria) this;
        }

        public Criteria andFoodimageLessThan(String value) {
            addCriterion("foodimage <", value, "foodimage");
            return (Criteria) this;
        }

        public Criteria andFoodimageLessThanOrEqualTo(String value) {
            addCriterion("foodimage <=", value, "foodimage");
            return (Criteria) this;
        }

        public Criteria andFoodimageLike(String value) {
            addCriterion("foodimage like", value, "foodimage");
            return (Criteria) this;
        }

        public Criteria andFoodimageNotLike(String value) {
            addCriterion("foodimage not like", value, "foodimage");
            return (Criteria) this;
        }

        public Criteria andFoodimageIn(List<String> values) {
            addCriterion("foodimage in", values, "foodimage");
            return (Criteria) this;
        }

        public Criteria andFoodimageNotIn(List<String> values) {
            addCriterion("foodimage not in", values, "foodimage");
            return (Criteria) this;
        }

        public Criteria andFoodimageBetween(String value1, String value2) {
            addCriterion("foodimage between", value1, value2, "foodimage");
            return (Criteria) this;
        }

        public Criteria andFoodimageNotBetween(String value1, String value2) {
            addCriterion("foodimage not between", value1, value2, "foodimage");
            return (Criteria) this;
        }

        public Criteria andMomalflagIsNull() {
            addCriterion("momalflag is null");
            return (Criteria) this;
        }

        public Criteria andMomalflagIsNotNull() {
            addCriterion("momalflag is not null");
            return (Criteria) this;
        }

        public Criteria andMomalflagEqualTo(String value) {
            addCriterion("momalflag =", value, "momalflag");
            return (Criteria) this;
        }

        public Criteria andMomalflagNotEqualTo(String value) {
            addCriterion("momalflag <>", value, "momalflag");
            return (Criteria) this;
        }

        public Criteria andMomalflagGreaterThan(String value) {
            addCriterion("momalflag >", value, "momalflag");
            return (Criteria) this;
        }

        public Criteria andMomalflagGreaterThanOrEqualTo(String value) {
            addCriterion("momalflag >=", value, "momalflag");
            return (Criteria) this;
        }

        public Criteria andMomalflagLessThan(String value) {
            addCriterion("momalflag <", value, "momalflag");
            return (Criteria) this;
        }

        public Criteria andMomalflagLessThanOrEqualTo(String value) {
            addCriterion("momalflag <=", value, "momalflag");
            return (Criteria) this;
        }

        public Criteria andMomalflagLike(String value) {
            addCriterion("momalflag like", value, "momalflag");
            return (Criteria) this;
        }

        public Criteria andMomalflagNotLike(String value) {
            addCriterion("momalflag not like", value, "momalflag");
            return (Criteria) this;
        }

        public Criteria andMomalflagIn(List<String> values) {
            addCriterion("momalflag in", values, "momalflag");
            return (Criteria) this;
        }

        public Criteria andMomalflagNotIn(List<String> values) {
            addCriterion("momalflag not in", values, "momalflag");
            return (Criteria) this;
        }

        public Criteria andMomalflagBetween(String value1, String value2) {
            addCriterion("momalflag between", value1, value2, "momalflag");
            return (Criteria) this;
        }

        public Criteria andMomalflagNotBetween(String value1, String value2) {
            addCriterion("momalflag not between", value1, value2, "momalflag");
            return (Criteria) this;
        }

        public Criteria andSuppleweekIsNull() {
            addCriterion("suppleweek is null");
            return (Criteria) this;
        }

        public Criteria andSuppleweekIsNotNull() {
            addCriterion("suppleweek is not null");
            return (Criteria) this;
        }

        public Criteria andSuppleweekEqualTo(String value) {
            addCriterion("suppleweek =", value, "suppleweek");
            return (Criteria) this;
        }

        public Criteria andSuppleweekNotEqualTo(String value) {
            addCriterion("suppleweek <>", value, "suppleweek");
            return (Criteria) this;
        }

        public Criteria andSuppleweekGreaterThan(String value) {
            addCriterion("suppleweek >", value, "suppleweek");
            return (Criteria) this;
        }

        public Criteria andSuppleweekGreaterThanOrEqualTo(String value) {
            addCriterion("suppleweek >=", value, "suppleweek");
            return (Criteria) this;
        }

        public Criteria andSuppleweekLessThan(String value) {
            addCriterion("suppleweek <", value, "suppleweek");
            return (Criteria) this;
        }

        public Criteria andSuppleweekLessThanOrEqualTo(String value) {
            addCriterion("suppleweek <=", value, "suppleweek");
            return (Criteria) this;
        }

        public Criteria andSuppleweekLike(String value) {
            addCriterion("suppleweek like", value, "suppleweek");
            return (Criteria) this;
        }

        public Criteria andSuppleweekNotLike(String value) {
            addCriterion("suppleweek not like", value, "suppleweek");
            return (Criteria) this;
        }

        public Criteria andSuppleweekIn(List<String> values) {
            addCriterion("suppleweek in", values, "suppleweek");
            return (Criteria) this;
        }

        public Criteria andSuppleweekNotIn(List<String> values) {
            addCriterion("suppleweek not in", values, "suppleweek");
            return (Criteria) this;
        }

        public Criteria andSuppleweekBetween(String value1, String value2) {
            addCriterion("suppleweek between", value1, value2, "suppleweek");
            return (Criteria) this;
        }

        public Criteria andSuppleweekNotBetween(String value1, String value2) {
            addCriterion("suppleweek not between", value1, value2, "suppleweek");
            return (Criteria) this;
        }

        public Criteria andSupplytypeIsNull() {
            addCriterion("supplytype is null");
            return (Criteria) this;
        }

        public Criteria andSupplytypeIsNotNull() {
            addCriterion("supplytype is not null");
            return (Criteria) this;
        }

        public Criteria andSupplytypeEqualTo(String value) {
            addCriterion("supplytype =", value, "supplytype");
            return (Criteria) this;
        }

        public Criteria andSupplytypeNotEqualTo(String value) {
            addCriterion("supplytype <>", value, "supplytype");
            return (Criteria) this;
        }

        public Criteria andSupplytypeGreaterThan(String value) {
            addCriterion("supplytype >", value, "supplytype");
            return (Criteria) this;
        }

        public Criteria andSupplytypeGreaterThanOrEqualTo(String value) {
            addCriterion("supplytype >=", value, "supplytype");
            return (Criteria) this;
        }

        public Criteria andSupplytypeLessThan(String value) {
            addCriterion("supplytype <", value, "supplytype");
            return (Criteria) this;
        }

        public Criteria andSupplytypeLessThanOrEqualTo(String value) {
            addCriterion("supplytype <=", value, "supplytype");
            return (Criteria) this;
        }

        public Criteria andSupplytypeLike(String value) {
            addCriterion("supplytype like", value, "supplytype");
            return (Criteria) this;
        }

        public Criteria andSupplytypeNotLike(String value) {
            addCriterion("supplytype not like", value, "supplytype");
            return (Criteria) this;
        }

        public Criteria andSupplytypeIn(List<String> values) {
            addCriterion("supplytype in", values, "supplytype");
            return (Criteria) this;
        }

        public Criteria andSupplytypeNotIn(List<String> values) {
            addCriterion("supplytype not in", values, "supplytype");
            return (Criteria) this;
        }

        public Criteria andSupplytypeBetween(String value1, String value2) {
            addCriterion("supplytype between", value1, value2, "supplytype");
            return (Criteria) this;
        }

        public Criteria andSupplytypeNotBetween(String value1, String value2) {
            addCriterion("supplytype not between", value1, value2, "supplytype");
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