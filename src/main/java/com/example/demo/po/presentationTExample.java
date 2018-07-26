package com.example.demo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class presentationTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public presentationTExample() {
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

        public Criteria andPreIdIsNull() {
            addCriterion("pre_id is null");
            return (Criteria) this;
        }

        public Criteria andPreIdIsNotNull() {
            addCriterion("pre_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreIdEqualTo(Long value) {
            addCriterion("pre_id =", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdNotEqualTo(Long value) {
            addCriterion("pre_id <>", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdGreaterThan(Long value) {
            addCriterion("pre_id >", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pre_id >=", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdLessThan(Long value) {
            addCriterion("pre_id <", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdLessThanOrEqualTo(Long value) {
            addCriterion("pre_id <=", value, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdIn(List<Long> values) {
            addCriterion("pre_id in", values, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdNotIn(List<Long> values) {
            addCriterion("pre_id not in", values, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdBetween(Long value1, Long value2) {
            addCriterion("pre_id between", value1, value2, "preId");
            return (Criteria) this;
        }

        public Criteria andPreIdNotBetween(Long value1, Long value2) {
            addCriterion("pre_id not between", value1, value2, "preId");
            return (Criteria) this;
        }

        public Criteria andPreNameIsNull() {
            addCriterion("pre_name is null");
            return (Criteria) this;
        }

        public Criteria andPreNameIsNotNull() {
            addCriterion("pre_name is not null");
            return (Criteria) this;
        }

        public Criteria andPreNameEqualTo(String value) {
            addCriterion("pre_name =", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameNotEqualTo(String value) {
            addCriterion("pre_name <>", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameGreaterThan(String value) {
            addCriterion("pre_name >", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameGreaterThanOrEqualTo(String value) {
            addCriterion("pre_name >=", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameLessThan(String value) {
            addCriterion("pre_name <", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameLessThanOrEqualTo(String value) {
            addCriterion("pre_name <=", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameLike(String value) {
            addCriterion("pre_name like", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameNotLike(String value) {
            addCriterion("pre_name not like", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameIn(List<String> values) {
            addCriterion("pre_name in", values, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameNotIn(List<String> values) {
            addCriterion("pre_name not in", values, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameBetween(String value1, String value2) {
            addCriterion("pre_name between", value1, value2, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameNotBetween(String value1, String value2) {
            addCriterion("pre_name not between", value1, value2, "preName");
            return (Criteria) this;
        }

        public Criteria andPreCreateTimeIsNull() {
            addCriterion("pre_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPreCreateTimeIsNotNull() {
            addCriterion("pre_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPreCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("pre_create_time =", value, "preCreateTime");
            return (Criteria) this;
        }

        public Criteria andPreCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pre_create_time <>", value, "preCreateTime");
            return (Criteria) this;
        }

        public Criteria andPreCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pre_create_time >", value, "preCreateTime");
            return (Criteria) this;
        }

        public Criteria andPreCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pre_create_time >=", value, "preCreateTime");
            return (Criteria) this;
        }

        public Criteria andPreCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("pre_create_time <", value, "preCreateTime");
            return (Criteria) this;
        }

        public Criteria andPreCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pre_create_time <=", value, "preCreateTime");
            return (Criteria) this;
        }

        public Criteria andPreCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("pre_create_time in", values, "preCreateTime");
            return (Criteria) this;
        }

        public Criteria andPreCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pre_create_time not in", values, "preCreateTime");
            return (Criteria) this;
        }

        public Criteria andPreCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pre_create_time between", value1, value2, "preCreateTime");
            return (Criteria) this;
        }

        public Criteria andPreCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pre_create_time not between", value1, value2, "preCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmIdIsNull() {
            addCriterion("em_id is null");
            return (Criteria) this;
        }

        public Criteria andEmIdIsNotNull() {
            addCriterion("em_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmIdEqualTo(Integer value) {
            addCriterion("em_id =", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdNotEqualTo(Integer value) {
            addCriterion("em_id <>", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdGreaterThan(Integer value) {
            addCriterion("em_id >", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("em_id >=", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdLessThan(Integer value) {
            addCriterion("em_id <", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdLessThanOrEqualTo(Integer value) {
            addCriterion("em_id <=", value, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdIn(List<Integer> values) {
            addCriterion("em_id in", values, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdNotIn(List<Integer> values) {
            addCriterion("em_id not in", values, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdBetween(Integer value1, Integer value2) {
            addCriterion("em_id between", value1, value2, "emId");
            return (Criteria) this;
        }

        public Criteria andEmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("em_id not between", value1, value2, "emId");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeIsNull() {
            addCriterion("coincidence_degree is null");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeIsNotNull() {
            addCriterion("coincidence_degree is not null");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeEqualTo(String value) {
            addCriterion("coincidence_degree =", value, "coincidenceDegree");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeNotEqualTo(String value) {
            addCriterion("coincidence_degree <>", value, "coincidenceDegree");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeGreaterThan(String value) {
            addCriterion("coincidence_degree >", value, "coincidenceDegree");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("coincidence_degree >=", value, "coincidenceDegree");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeLessThan(String value) {
            addCriterion("coincidence_degree <", value, "coincidenceDegree");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeLessThanOrEqualTo(String value) {
            addCriterion("coincidence_degree <=", value, "coincidenceDegree");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeLike(String value) {
            addCriterion("coincidence_degree like", value, "coincidenceDegree");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeNotLike(String value) {
            addCriterion("coincidence_degree not like", value, "coincidenceDegree");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeIn(List<String> values) {
            addCriterion("coincidence_degree in", values, "coincidenceDegree");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeNotIn(List<String> values) {
            addCriterion("coincidence_degree not in", values, "coincidenceDegree");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeBetween(String value1, String value2) {
            addCriterion("coincidence_degree between", value1, value2, "coincidenceDegree");
            return (Criteria) this;
        }

        public Criteria andCoincidenceDegreeNotBetween(String value1, String value2) {
            addCriterion("coincidence_degree not between", value1, value2, "coincidenceDegree");
            return (Criteria) this;
        }

        public Criteria andPreCommentIsNull() {
            addCriterion("pre_comment is null");
            return (Criteria) this;
        }

        public Criteria andPreCommentIsNotNull() {
            addCriterion("pre_comment is not null");
            return (Criteria) this;
        }

        public Criteria andPreCommentEqualTo(String value) {
            addCriterion("pre_comment =", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentNotEqualTo(String value) {
            addCriterion("pre_comment <>", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentGreaterThan(String value) {
            addCriterion("pre_comment >", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentGreaterThanOrEqualTo(String value) {
            addCriterion("pre_comment >=", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentLessThan(String value) {
            addCriterion("pre_comment <", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentLessThanOrEqualTo(String value) {
            addCriterion("pre_comment <=", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentLike(String value) {
            addCriterion("pre_comment like", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentNotLike(String value) {
            addCriterion("pre_comment not like", value, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentIn(List<String> values) {
            addCriterion("pre_comment in", values, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentNotIn(List<String> values) {
            addCriterion("pre_comment not in", values, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentBetween(String value1, String value2) {
            addCriterion("pre_comment between", value1, value2, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreCommentNotBetween(String value1, String value2) {
            addCriterion("pre_comment not between", value1, value2, "preComment");
            return (Criteria) this;
        }

        public Criteria andPreDelStatusIsNull() {
            addCriterion("pre_del_status is null");
            return (Criteria) this;
        }

        public Criteria andPreDelStatusIsNotNull() {
            addCriterion("pre_del_status is not null");
            return (Criteria) this;
        }

        public Criteria andPreDelStatusEqualTo(Integer value) {
            addCriterion("pre_del_status =", value, "preDelStatus");
            return (Criteria) this;
        }

        public Criteria andPreDelStatusNotEqualTo(Integer value) {
            addCriterion("pre_del_status <>", value, "preDelStatus");
            return (Criteria) this;
        }

        public Criteria andPreDelStatusGreaterThan(Integer value) {
            addCriterion("pre_del_status >", value, "preDelStatus");
            return (Criteria) this;
        }

        public Criteria andPreDelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_del_status >=", value, "preDelStatus");
            return (Criteria) this;
        }

        public Criteria andPreDelStatusLessThan(Integer value) {
            addCriterion("pre_del_status <", value, "preDelStatus");
            return (Criteria) this;
        }

        public Criteria andPreDelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pre_del_status <=", value, "preDelStatus");
            return (Criteria) this;
        }

        public Criteria andPreDelStatusIn(List<Integer> values) {
            addCriterion("pre_del_status in", values, "preDelStatus");
            return (Criteria) this;
        }

        public Criteria andPreDelStatusNotIn(List<Integer> values) {
            addCriterion("pre_del_status not in", values, "preDelStatus");
            return (Criteria) this;
        }

        public Criteria andPreDelStatusBetween(Integer value1, Integer value2) {
            addCriterion("pre_del_status between", value1, value2, "preDelStatus");
            return (Criteria) this;
        }

        public Criteria andPreDelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_del_status not between", value1, value2, "preDelStatus");
            return (Criteria) this;
        }

        public Criteria andDate2IsNull() {
            addCriterion("DATE2 is null");
            return (Criteria) this;
        }

        public Criteria andDate2IsNotNull() {
            addCriterion("DATE2 is not null");
            return (Criteria) this;
        }

        public Criteria andDate2EqualTo(Date value) {
            addCriterionForJDBCDate("DATE2 =", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE2 <>", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2GreaterThan(Date value) {
            addCriterionForJDBCDate("DATE2 >", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE2 >=", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2LessThan(Date value) {
            addCriterionForJDBCDate("DATE2 <", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE2 <=", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2In(List<Date> values) {
            addCriterionForJDBCDate("DATE2 in", values, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE2 not in", values, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE2 between", value1, value2, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE2 not between", value1, value2, "date2");
            return (Criteria) this;
        }

        public Criteria andDate1IsNull() {
            addCriterion("DATE1 is null");
            return (Criteria) this;
        }

        public Criteria andDate1IsNotNull() {
            addCriterion("DATE1 is not null");
            return (Criteria) this;
        }

        public Criteria andDate1EqualTo(Date value) {
            addCriterionForJDBCDate("DATE1 =", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE1 <>", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1GreaterThan(Date value) {
            addCriterionForJDBCDate("DATE1 >", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE1 >=", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1LessThan(Date value) {
            addCriterionForJDBCDate("DATE1 <", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE1 <=", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1In(List<Date> values) {
            addCriterionForJDBCDate("DATE1 in", values, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE1 not in", values, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE1 between", value1, value2, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE1 not between", value1, value2, "date1");
            return (Criteria) this;
        }

        public Criteria andBz3IsNull() {
            addCriterion("BZ3 is null");
            return (Criteria) this;
        }

        public Criteria andBz3IsNotNull() {
            addCriterion("BZ3 is not null");
            return (Criteria) this;
        }

        public Criteria andBz3EqualTo(String value) {
            addCriterion("BZ3 =", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotEqualTo(String value) {
            addCriterion("BZ3 <>", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3GreaterThan(String value) {
            addCriterion("BZ3 >", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3GreaterThanOrEqualTo(String value) {
            addCriterion("BZ3 >=", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3LessThan(String value) {
            addCriterion("BZ3 <", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3LessThanOrEqualTo(String value) {
            addCriterion("BZ3 <=", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3Like(String value) {
            addCriterion("BZ3 like", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotLike(String value) {
            addCriterion("BZ3 not like", value, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3In(List<String> values) {
            addCriterion("BZ3 in", values, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotIn(List<String> values) {
            addCriterion("BZ3 not in", values, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3Between(String value1, String value2) {
            addCriterion("BZ3 between", value1, value2, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz3NotBetween(String value1, String value2) {
            addCriterion("BZ3 not between", value1, value2, "bz3");
            return (Criteria) this;
        }

        public Criteria andBz2IsNull() {
            addCriterion("BZ2 is null");
            return (Criteria) this;
        }

        public Criteria andBz2IsNotNull() {
            addCriterion("BZ2 is not null");
            return (Criteria) this;
        }

        public Criteria andBz2EqualTo(String value) {
            addCriterion("BZ2 =", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotEqualTo(String value) {
            addCriterion("BZ2 <>", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2GreaterThan(String value) {
            addCriterion("BZ2 >", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2GreaterThanOrEqualTo(String value) {
            addCriterion("BZ2 >=", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2LessThan(String value) {
            addCriterion("BZ2 <", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2LessThanOrEqualTo(String value) {
            addCriterion("BZ2 <=", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2Like(String value) {
            addCriterion("BZ2 like", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotLike(String value) {
            addCriterion("BZ2 not like", value, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2In(List<String> values) {
            addCriterion("BZ2 in", values, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotIn(List<String> values) {
            addCriterion("BZ2 not in", values, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2Between(String value1, String value2) {
            addCriterion("BZ2 between", value1, value2, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz2NotBetween(String value1, String value2) {
            addCriterion("BZ2 not between", value1, value2, "bz2");
            return (Criteria) this;
        }

        public Criteria andBz1IsNull() {
            addCriterion("BZ1 is null");
            return (Criteria) this;
        }

        public Criteria andBz1IsNotNull() {
            addCriterion("BZ1 is not null");
            return (Criteria) this;
        }

        public Criteria andBz1EqualTo(String value) {
            addCriterion("BZ1 =", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotEqualTo(String value) {
            addCriterion("BZ1 <>", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThan(String value) {
            addCriterion("BZ1 >", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1GreaterThanOrEqualTo(String value) {
            addCriterion("BZ1 >=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThan(String value) {
            addCriterion("BZ1 <", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1LessThanOrEqualTo(String value) {
            addCriterion("BZ1 <=", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Like(String value) {
            addCriterion("BZ1 like", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotLike(String value) {
            addCriterion("BZ1 not like", value, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1In(List<String> values) {
            addCriterion("BZ1 in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotIn(List<String> values) {
            addCriterion("BZ1 not in", values, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1Between(String value1, String value2) {
            addCriterion("BZ1 between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andBz1NotBetween(String value1, String value2) {
            addCriterion("BZ1 not between", value1, value2, "bz1");
            return (Criteria) this;
        }

        public Criteria andPreFactorIsNull() {
            addCriterion("pre_factor is null");
            return (Criteria) this;
        }

        public Criteria andPreFactorIsNotNull() {
            addCriterion("pre_factor is not null");
            return (Criteria) this;
        }

        public Criteria andPreFactorEqualTo(String value) {
            addCriterion("pre_factor =", value, "preFactor");
            return (Criteria) this;
        }

        public Criteria andPreFactorNotEqualTo(String value) {
            addCriterion("pre_factor <>", value, "preFactor");
            return (Criteria) this;
        }

        public Criteria andPreFactorGreaterThan(String value) {
            addCriterion("pre_factor >", value, "preFactor");
            return (Criteria) this;
        }

        public Criteria andPreFactorGreaterThanOrEqualTo(String value) {
            addCriterion("pre_factor >=", value, "preFactor");
            return (Criteria) this;
        }

        public Criteria andPreFactorLessThan(String value) {
            addCriterion("pre_factor <", value, "preFactor");
            return (Criteria) this;
        }

        public Criteria andPreFactorLessThanOrEqualTo(String value) {
            addCriterion("pre_factor <=", value, "preFactor");
            return (Criteria) this;
        }

        public Criteria andPreFactorLike(String value) {
            addCriterion("pre_factor like", value, "preFactor");
            return (Criteria) this;
        }

        public Criteria andPreFactorNotLike(String value) {
            addCriterion("pre_factor not like", value, "preFactor");
            return (Criteria) this;
        }

        public Criteria andPreFactorIn(List<String> values) {
            addCriterion("pre_factor in", values, "preFactor");
            return (Criteria) this;
        }

        public Criteria andPreFactorNotIn(List<String> values) {
            addCriterion("pre_factor not in", values, "preFactor");
            return (Criteria) this;
        }

        public Criteria andPreFactorBetween(String value1, String value2) {
            addCriterion("pre_factor between", value1, value2, "preFactor");
            return (Criteria) this;
        }

        public Criteria andPreFactorNotBetween(String value1, String value2) {
            addCriterion("pre_factor not between", value1, value2, "preFactor");
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