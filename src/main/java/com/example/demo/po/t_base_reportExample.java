package com.example.demo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class t_base_reportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public t_base_reportExample() {
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

        public Criteria andLineNameIsNull() {
            addCriterion("line_name is null");
            return (Criteria) this;
        }

        public Criteria andLineNameIsNotNull() {
            addCriterion("line_name is not null");
            return (Criteria) this;
        }

        public Criteria andLineNameEqualTo(String value) {
            addCriterion("line_name =", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotEqualTo(String value) {
            addCriterion("line_name <>", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThan(String value) {
            addCriterion("line_name >", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThanOrEqualTo(String value) {
            addCriterion("line_name >=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThan(String value) {
            addCriterion("line_name <", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThanOrEqualTo(String value) {
            addCriterion("line_name <=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLike(String value) {
            addCriterion("line_name like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotLike(String value) {
            addCriterion("line_name not like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameIn(List<String> values) {
            addCriterion("line_name in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotIn(List<String> values) {
            addCriterion("line_name not in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameBetween(String value1, String value2) {
            addCriterion("line_name between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotBetween(String value1, String value2) {
            addCriterion("line_name not between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNull() {
            addCriterion("line_id is null");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNotNull() {
            addCriterion("line_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdEqualTo(String value) {
            addCriterion("line_id =", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotEqualTo(String value) {
            addCriterion("line_id <>", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThan(String value) {
            addCriterion("line_id >", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThanOrEqualTo(String value) {
            addCriterion("line_id >=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThan(String value) {
            addCriterion("line_id <", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThanOrEqualTo(String value) {
            addCriterion("line_id <=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLike(String value) {
            addCriterion("line_id like", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotLike(String value) {
            addCriterion("line_id not like", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdIn(List<String> values) {
            addCriterion("line_id in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotIn(List<String> values) {
            addCriterion("line_id not in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdBetween(String value1, String value2) {
            addCriterion("line_id between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotBetween(String value1, String value2) {
            addCriterion("line_id not between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andTowerNameIsNull() {
            addCriterion("tower_name is null");
            return (Criteria) this;
        }

        public Criteria andTowerNameIsNotNull() {
            addCriterion("tower_name is not null");
            return (Criteria) this;
        }

        public Criteria andTowerNameEqualTo(String value) {
            addCriterion("tower_name =", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameNotEqualTo(String value) {
            addCriterion("tower_name <>", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameGreaterThan(String value) {
            addCriterion("tower_name >", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("tower_name >=", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameLessThan(String value) {
            addCriterion("tower_name <", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameLessThanOrEqualTo(String value) {
            addCriterion("tower_name <=", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameLike(String value) {
            addCriterion("tower_name like", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameNotLike(String value) {
            addCriterion("tower_name not like", value, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameIn(List<String> values) {
            addCriterion("tower_name in", values, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameNotIn(List<String> values) {
            addCriterion("tower_name not in", values, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameBetween(String value1, String value2) {
            addCriterion("tower_name between", value1, value2, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerNameNotBetween(String value1, String value2) {
            addCriterion("tower_name not between", value1, value2, "towerName");
            return (Criteria) this;
        }

        public Criteria andTowerIdIsNull() {
            addCriterion("tower_id is null");
            return (Criteria) this;
        }

        public Criteria andTowerIdIsNotNull() {
            addCriterion("tower_id is not null");
            return (Criteria) this;
        }

        public Criteria andTowerIdEqualTo(String value) {
            addCriterion("tower_id =", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdNotEqualTo(String value) {
            addCriterion("tower_id <>", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdGreaterThan(String value) {
            addCriterion("tower_id >", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdGreaterThanOrEqualTo(String value) {
            addCriterion("tower_id >=", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdLessThan(String value) {
            addCriterion("tower_id <", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdLessThanOrEqualTo(String value) {
            addCriterion("tower_id <=", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdLike(String value) {
            addCriterion("tower_id like", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdNotLike(String value) {
            addCriterion("tower_id not like", value, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdIn(List<String> values) {
            addCriterion("tower_id in", values, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdNotIn(List<String> values) {
            addCriterion("tower_id not in", values, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdBetween(String value1, String value2) {
            addCriterion("tower_id between", value1, value2, "towerId");
            return (Criteria) this;
        }

        public Criteria andTowerIdNotBetween(String value1, String value2) {
            addCriterion("tower_id not between", value1, value2, "towerId");
            return (Criteria) this;
        }

        public Criteria andMaintainerIsNull() {
            addCriterion("maintainer is null");
            return (Criteria) this;
        }

        public Criteria andMaintainerIsNotNull() {
            addCriterion("maintainer is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainerEqualTo(String value) {
            addCriterion("maintainer =", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotEqualTo(String value) {
            addCriterion("maintainer <>", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerGreaterThan(String value) {
            addCriterion("maintainer >", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerGreaterThanOrEqualTo(String value) {
            addCriterion("maintainer >=", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLessThan(String value) {
            addCriterion("maintainer <", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLessThanOrEqualTo(String value) {
            addCriterion("maintainer <=", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLike(String value) {
            addCriterion("maintainer like", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotLike(String value) {
            addCriterion("maintainer not like", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerIn(List<String> values) {
            addCriterion("maintainer in", values, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotIn(List<String> values) {
            addCriterion("maintainer not in", values, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerBetween(String value1, String value2) {
            addCriterion("maintainer between", value1, value2, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotBetween(String value1, String value2) {
            addCriterion("maintainer not between", value1, value2, "maintainer");
            return (Criteria) this;
        }

        public Criteria andParentregionIsNull() {
            addCriterion("parentregion is null");
            return (Criteria) this;
        }

        public Criteria andParentregionIsNotNull() {
            addCriterion("parentregion is not null");
            return (Criteria) this;
        }

        public Criteria andParentregionEqualTo(String value) {
            addCriterion("parentregion =", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionNotEqualTo(String value) {
            addCriterion("parentregion <>", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionGreaterThan(String value) {
            addCriterion("parentregion >", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionGreaterThanOrEqualTo(String value) {
            addCriterion("parentregion >=", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionLessThan(String value) {
            addCriterion("parentregion <", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionLessThanOrEqualTo(String value) {
            addCriterion("parentregion <=", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionLike(String value) {
            addCriterion("parentregion like", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionNotLike(String value) {
            addCriterion("parentregion not like", value, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionIn(List<String> values) {
            addCriterion("parentregion in", values, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionNotIn(List<String> values) {
            addCriterion("parentregion not in", values, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionBetween(String value1, String value2) {
            addCriterion("parentregion between", value1, value2, "parentregion");
            return (Criteria) this;
        }

        public Criteria andParentregionNotBetween(String value1, String value2) {
            addCriterion("parentregion not between", value1, value2, "parentregion");
            return (Criteria) this;
        }

        public Criteria andLineLengthIsNull() {
            addCriterion("line_length is null");
            return (Criteria) this;
        }

        public Criteria andLineLengthIsNotNull() {
            addCriterion("line_length is not null");
            return (Criteria) this;
        }

        public Criteria andLineLengthEqualTo(String value) {
            addCriterion("line_length =", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthNotEqualTo(String value) {
            addCriterion("line_length <>", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthGreaterThan(String value) {
            addCriterion("line_length >", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthGreaterThanOrEqualTo(String value) {
            addCriterion("line_length >=", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthLessThan(String value) {
            addCriterion("line_length <", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthLessThanOrEqualTo(String value) {
            addCriterion("line_length <=", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthLike(String value) {
            addCriterion("line_length like", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthNotLike(String value) {
            addCriterion("line_length not like", value, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthIn(List<String> values) {
            addCriterion("line_length in", values, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthNotIn(List<String> values) {
            addCriterion("line_length not in", values, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthBetween(String value1, String value2) {
            addCriterion("line_length between", value1, value2, "lineLength");
            return (Criteria) this;
        }

        public Criteria andLineLengthNotBetween(String value1, String value2) {
            addCriterion("line_length not between", value1, value2, "lineLength");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("datetime is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("datetime is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("datetime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("datetime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("datetime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datetime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(Date value) {
            addCriterionForJDBCDate("datetime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datetime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("datetime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("datetime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datetime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datetime not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthIsNull() {
            addCriterion("datetime_month is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthIsNotNull() {
            addCriterion("datetime_month is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthEqualTo(Date value) {
            addCriterionForJDBCDate("datetime_month =", value, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthNotEqualTo(Date value) {
            addCriterionForJDBCDate("datetime_month <>", value, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthGreaterThan(Date value) {
            addCriterionForJDBCDate("datetime_month >", value, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datetime_month >=", value, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthLessThan(Date value) {
            addCriterionForJDBCDate("datetime_month <", value, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("datetime_month <=", value, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthIn(List<Date> values) {
            addCriterionForJDBCDate("datetime_month in", values, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthNotIn(List<Date> values) {
            addCriterionForJDBCDate("datetime_month not in", values, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datetime_month between", value1, value2, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andDatetimeMonthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("datetime_month not between", value1, value2, "datetimeMonth");
            return (Criteria) this;
        }

        public Criteria andValtageIsNull() {
            addCriterion("valtage is null");
            return (Criteria) this;
        }

        public Criteria andValtageIsNotNull() {
            addCriterion("valtage is not null");
            return (Criteria) this;
        }

        public Criteria andValtageEqualTo(String value) {
            addCriterion("valtage =", value, "valtage");
            return (Criteria) this;
        }

        public Criteria andValtageNotEqualTo(String value) {
            addCriterion("valtage <>", value, "valtage");
            return (Criteria) this;
        }

        public Criteria andValtageGreaterThan(String value) {
            addCriterion("valtage >", value, "valtage");
            return (Criteria) this;
        }

        public Criteria andValtageGreaterThanOrEqualTo(String value) {
            addCriterion("valtage >=", value, "valtage");
            return (Criteria) this;
        }

        public Criteria andValtageLessThan(String value) {
            addCriterion("valtage <", value, "valtage");
            return (Criteria) this;
        }

        public Criteria andValtageLessThanOrEqualTo(String value) {
            addCriterion("valtage <=", value, "valtage");
            return (Criteria) this;
        }

        public Criteria andValtageLike(String value) {
            addCriterion("valtage like", value, "valtage");
            return (Criteria) this;
        }

        public Criteria andValtageNotLike(String value) {
            addCriterion("valtage not like", value, "valtage");
            return (Criteria) this;
        }

        public Criteria andValtageIn(List<String> values) {
            addCriterion("valtage in", values, "valtage");
            return (Criteria) this;
        }

        public Criteria andValtageNotIn(List<String> values) {
            addCriterion("valtage not in", values, "valtage");
            return (Criteria) this;
        }

        public Criteria andValtageBetween(String value1, String value2) {
            addCriterion("valtage between", value1, value2, "valtage");
            return (Criteria) this;
        }

        public Criteria andValtageNotBetween(String value1, String value2) {
            addCriterion("valtage not between", value1, value2, "valtage");
            return (Criteria) this;
        }

        public Criteria andTerrainIsNull() {
            addCriterion("terrain is null");
            return (Criteria) this;
        }

        public Criteria andTerrainIsNotNull() {
            addCriterion("terrain is not null");
            return (Criteria) this;
        }

        public Criteria andTerrainEqualTo(String value) {
            addCriterion("terrain =", value, "terrain");
            return (Criteria) this;
        }

        public Criteria andTerrainNotEqualTo(String value) {
            addCriterion("terrain <>", value, "terrain");
            return (Criteria) this;
        }

        public Criteria andTerrainGreaterThan(String value) {
            addCriterion("terrain >", value, "terrain");
            return (Criteria) this;
        }

        public Criteria andTerrainGreaterThanOrEqualTo(String value) {
            addCriterion("terrain >=", value, "terrain");
            return (Criteria) this;
        }

        public Criteria andTerrainLessThan(String value) {
            addCriterion("terrain <", value, "terrain");
            return (Criteria) this;
        }

        public Criteria andTerrainLessThanOrEqualTo(String value) {
            addCriterion("terrain <=", value, "terrain");
            return (Criteria) this;
        }

        public Criteria andTerrainLike(String value) {
            addCriterion("terrain like", value, "terrain");
            return (Criteria) this;
        }

        public Criteria andTerrainNotLike(String value) {
            addCriterion("terrain not like", value, "terrain");
            return (Criteria) this;
        }

        public Criteria andTerrainIn(List<String> values) {
            addCriterion("terrain in", values, "terrain");
            return (Criteria) this;
        }

        public Criteria andTerrainNotIn(List<String> values) {
            addCriterion("terrain not in", values, "terrain");
            return (Criteria) this;
        }

        public Criteria andTerrainBetween(String value1, String value2) {
            addCriterion("terrain between", value1, value2, "terrain");
            return (Criteria) this;
        }

        public Criteria andTerrainNotBetween(String value1, String value2) {
            addCriterion("terrain not between", value1, value2, "terrain");
            return (Criteria) this;
        }

        public Criteria andStationmap1IsNull() {
            addCriterion("stationmap_1 is null");
            return (Criteria) this;
        }

        public Criteria andStationmap1IsNotNull() {
            addCriterion("stationmap_1 is not null");
            return (Criteria) this;
        }

        public Criteria andStationmap1EqualTo(Float value) {
            addCriterion("stationmap_1 =", value, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1NotEqualTo(Float value) {
            addCriterion("stationmap_1 <>", value, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1GreaterThan(Float value) {
            addCriterion("stationmap_1 >", value, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1GreaterThanOrEqualTo(Float value) {
            addCriterion("stationmap_1 >=", value, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1LessThan(Float value) {
            addCriterion("stationmap_1 <", value, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1LessThanOrEqualTo(Float value) {
            addCriterion("stationmap_1 <=", value, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1In(List<Float> values) {
            addCriterion("stationmap_1 in", values, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1NotIn(List<Float> values) {
            addCriterion("stationmap_1 not in", values, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1Between(Float value1, Float value2) {
            addCriterion("stationmap_1 between", value1, value2, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap1NotBetween(Float value1, Float value2) {
            addCriterion("stationmap_1 not between", value1, value2, "stationmap1");
            return (Criteria) this;
        }

        public Criteria andStationmap2IsNull() {
            addCriterion("stationmap_2 is null");
            return (Criteria) this;
        }

        public Criteria andStationmap2IsNotNull() {
            addCriterion("stationmap_2 is not null");
            return (Criteria) this;
        }

        public Criteria andStationmap2EqualTo(Float value) {
            addCriterion("stationmap_2 =", value, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2NotEqualTo(Float value) {
            addCriterion("stationmap_2 <>", value, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2GreaterThan(Float value) {
            addCriterion("stationmap_2 >", value, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2GreaterThanOrEqualTo(Float value) {
            addCriterion("stationmap_2 >=", value, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2LessThan(Float value) {
            addCriterion("stationmap_2 <", value, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2LessThanOrEqualTo(Float value) {
            addCriterion("stationmap_2 <=", value, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2In(List<Float> values) {
            addCriterion("stationmap_2 in", values, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2NotIn(List<Float> values) {
            addCriterion("stationmap_2 not in", values, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2Between(Float value1, Float value2) {
            addCriterion("stationmap_2 between", value1, value2, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andStationmap2NotBetween(Float value1, Float value2) {
            addCriterion("stationmap_2 not between", value1, value2, "stationmap2");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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