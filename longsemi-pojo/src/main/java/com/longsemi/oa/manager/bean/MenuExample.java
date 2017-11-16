package com.longsemi.oa.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andAppIsNull() {
            addCriterion("app is null");
            return (Criteria) this;
        }

        public Criteria andAppIsNotNull() {
            addCriterion("app is not null");
            return (Criteria) this;
        }

        public Criteria andAppEqualTo(String value) {
            addCriterion("app =", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotEqualTo(String value) {
            addCriterion("app <>", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppGreaterThan(String value) {
            addCriterion("app >", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppGreaterThanOrEqualTo(String value) {
            addCriterion("app >=", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLessThan(String value) {
            addCriterion("app <", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLessThanOrEqualTo(String value) {
            addCriterion("app <=", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLike(String value) {
            addCriterion("app like", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotLike(String value) {
            addCriterion("app not like", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppIn(List<String> values) {
            addCriterion("app in", values, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotIn(List<String> values) {
            addCriterion("app not in", values, "app");
            return (Criteria) this;
        }

        public Criteria andAppBetween(String value1, String value2) {
            addCriterion("app between", value1, value2, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotBetween(String value1, String value2) {
            addCriterion("app not between", value1, value2, "app");
            return (Criteria) this;
        }

        public Criteria andApp1IsNull() {
            addCriterion("app1 is null");
            return (Criteria) this;
        }

        public Criteria andApp1IsNotNull() {
            addCriterion("app1 is not null");
            return (Criteria) this;
        }

        public Criteria andApp1EqualTo(String value) {
            addCriterion("app1 =", value, "app1");
            return (Criteria) this;
        }

        public Criteria andApp1NotEqualTo(String value) {
            addCriterion("app1 <>", value, "app1");
            return (Criteria) this;
        }

        public Criteria andApp1GreaterThan(String value) {
            addCriterion("app1 >", value, "app1");
            return (Criteria) this;
        }

        public Criteria andApp1GreaterThanOrEqualTo(String value) {
            addCriterion("app1 >=", value, "app1");
            return (Criteria) this;
        }

        public Criteria andApp1LessThan(String value) {
            addCriterion("app1 <", value, "app1");
            return (Criteria) this;
        }

        public Criteria andApp1LessThanOrEqualTo(String value) {
            addCriterion("app1 <=", value, "app1");
            return (Criteria) this;
        }

        public Criteria andApp1Like(String value) {
            addCriterion("app1 like", value, "app1");
            return (Criteria) this;
        }

        public Criteria andApp1NotLike(String value) {
            addCriterion("app1 not like", value, "app1");
            return (Criteria) this;
        }

        public Criteria andApp1In(List<String> values) {
            addCriterion("app1 in", values, "app1");
            return (Criteria) this;
        }

        public Criteria andApp1NotIn(List<String> values) {
            addCriterion("app1 not in", values, "app1");
            return (Criteria) this;
        }

        public Criteria andApp1Between(String value1, String value2) {
            addCriterion("app1 between", value1, value2, "app1");
            return (Criteria) this;
        }

        public Criteria andApp1NotBetween(String value1, String value2) {
            addCriterion("app1 not between", value1, value2, "app1");
            return (Criteria) this;
        }

        public Criteria andApp2IsNull() {
            addCriterion("app2 is null");
            return (Criteria) this;
        }

        public Criteria andApp2IsNotNull() {
            addCriterion("app2 is not null");
            return (Criteria) this;
        }

        public Criteria andApp2EqualTo(String value) {
            addCriterion("app2 =", value, "app2");
            return (Criteria) this;
        }

        public Criteria andApp2NotEqualTo(String value) {
            addCriterion("app2 <>", value, "app2");
            return (Criteria) this;
        }

        public Criteria andApp2GreaterThan(String value) {
            addCriterion("app2 >", value, "app2");
            return (Criteria) this;
        }

        public Criteria andApp2GreaterThanOrEqualTo(String value) {
            addCriterion("app2 >=", value, "app2");
            return (Criteria) this;
        }

        public Criteria andApp2LessThan(String value) {
            addCriterion("app2 <", value, "app2");
            return (Criteria) this;
        }

        public Criteria andApp2LessThanOrEqualTo(String value) {
            addCriterion("app2 <=", value, "app2");
            return (Criteria) this;
        }

        public Criteria andApp2Like(String value) {
            addCriterion("app2 like", value, "app2");
            return (Criteria) this;
        }

        public Criteria andApp2NotLike(String value) {
            addCriterion("app2 not like", value, "app2");
            return (Criteria) this;
        }

        public Criteria andApp2In(List<String> values) {
            addCriterion("app2 in", values, "app2");
            return (Criteria) this;
        }

        public Criteria andApp2NotIn(List<String> values) {
            addCriterion("app2 not in", values, "app2");
            return (Criteria) this;
        }

        public Criteria andApp2Between(String value1, String value2) {
            addCriterion("app2 between", value1, value2, "app2");
            return (Criteria) this;
        }

        public Criteria andApp2NotBetween(String value1, String value2) {
            addCriterion("app2 not between", value1, value2, "app2");
            return (Criteria) this;
        }

        public Criteria andApp3IsNull() {
            addCriterion("app3 is null");
            return (Criteria) this;
        }

        public Criteria andApp3IsNotNull() {
            addCriterion("app3 is not null");
            return (Criteria) this;
        }

        public Criteria andApp3EqualTo(String value) {
            addCriterion("app3 =", value, "app3");
            return (Criteria) this;
        }

        public Criteria andApp3NotEqualTo(String value) {
            addCriterion("app3 <>", value, "app3");
            return (Criteria) this;
        }

        public Criteria andApp3GreaterThan(String value) {
            addCriterion("app3 >", value, "app3");
            return (Criteria) this;
        }

        public Criteria andApp3GreaterThanOrEqualTo(String value) {
            addCriterion("app3 >=", value, "app3");
            return (Criteria) this;
        }

        public Criteria andApp3LessThan(String value) {
            addCriterion("app3 <", value, "app3");
            return (Criteria) this;
        }

        public Criteria andApp3LessThanOrEqualTo(String value) {
            addCriterion("app3 <=", value, "app3");
            return (Criteria) this;
        }

        public Criteria andApp3Like(String value) {
            addCriterion("app3 like", value, "app3");
            return (Criteria) this;
        }

        public Criteria andApp3NotLike(String value) {
            addCriterion("app3 not like", value, "app3");
            return (Criteria) this;
        }

        public Criteria andApp3In(List<String> values) {
            addCriterion("app3 in", values, "app3");
            return (Criteria) this;
        }

        public Criteria andApp3NotIn(List<String> values) {
            addCriterion("app3 not in", values, "app3");
            return (Criteria) this;
        }

        public Criteria andApp3Between(String value1, String value2) {
            addCriterion("app3 between", value1, value2, "app3");
            return (Criteria) this;
        }

        public Criteria andApp3NotBetween(String value1, String value2) {
            addCriterion("app3 not between", value1, value2, "app3");
            return (Criteria) this;
        }

        public Criteria andApp4IsNull() {
            addCriterion("app4 is null");
            return (Criteria) this;
        }

        public Criteria andApp4IsNotNull() {
            addCriterion("app4 is not null");
            return (Criteria) this;
        }

        public Criteria andApp4EqualTo(String value) {
            addCriterion("app4 =", value, "app4");
            return (Criteria) this;
        }

        public Criteria andApp4NotEqualTo(String value) {
            addCriterion("app4 <>", value, "app4");
            return (Criteria) this;
        }

        public Criteria andApp4GreaterThan(String value) {
            addCriterion("app4 >", value, "app4");
            return (Criteria) this;
        }

        public Criteria andApp4GreaterThanOrEqualTo(String value) {
            addCriterion("app4 >=", value, "app4");
            return (Criteria) this;
        }

        public Criteria andApp4LessThan(String value) {
            addCriterion("app4 <", value, "app4");
            return (Criteria) this;
        }

        public Criteria andApp4LessThanOrEqualTo(String value) {
            addCriterion("app4 <=", value, "app4");
            return (Criteria) this;
        }

        public Criteria andApp4Like(String value) {
            addCriterion("app4 like", value, "app4");
            return (Criteria) this;
        }

        public Criteria andApp4NotLike(String value) {
            addCriterion("app4 not like", value, "app4");
            return (Criteria) this;
        }

        public Criteria andApp4In(List<String> values) {
            addCriterion("app4 in", values, "app4");
            return (Criteria) this;
        }

        public Criteria andApp4NotIn(List<String> values) {
            addCriterion("app4 not in", values, "app4");
            return (Criteria) this;
        }

        public Criteria andApp4Between(String value1, String value2) {
            addCriterion("app4 between", value1, value2, "app4");
            return (Criteria) this;
        }

        public Criteria andApp4NotBetween(String value1, String value2) {
            addCriterion("app4 not between", value1, value2, "app4");
            return (Criteria) this;
        }

        public Criteria andApp5IsNull() {
            addCriterion("app5 is null");
            return (Criteria) this;
        }

        public Criteria andApp5IsNotNull() {
            addCriterion("app5 is not null");
            return (Criteria) this;
        }

        public Criteria andApp5EqualTo(String value) {
            addCriterion("app5 =", value, "app5");
            return (Criteria) this;
        }

        public Criteria andApp5NotEqualTo(String value) {
            addCriterion("app5 <>", value, "app5");
            return (Criteria) this;
        }

        public Criteria andApp5GreaterThan(String value) {
            addCriterion("app5 >", value, "app5");
            return (Criteria) this;
        }

        public Criteria andApp5GreaterThanOrEqualTo(String value) {
            addCriterion("app5 >=", value, "app5");
            return (Criteria) this;
        }

        public Criteria andApp5LessThan(String value) {
            addCriterion("app5 <", value, "app5");
            return (Criteria) this;
        }

        public Criteria andApp5LessThanOrEqualTo(String value) {
            addCriterion("app5 <=", value, "app5");
            return (Criteria) this;
        }

        public Criteria andApp5Like(String value) {
            addCriterion("app5 like", value, "app5");
            return (Criteria) this;
        }

        public Criteria andApp5NotLike(String value) {
            addCriterion("app5 not like", value, "app5");
            return (Criteria) this;
        }

        public Criteria andApp5In(List<String> values) {
            addCriterion("app5 in", values, "app5");
            return (Criteria) this;
        }

        public Criteria andApp5NotIn(List<String> values) {
            addCriterion("app5 not in", values, "app5");
            return (Criteria) this;
        }

        public Criteria andApp5Between(String value1, String value2) {
            addCriterion("app5 between", value1, value2, "app5");
            return (Criteria) this;
        }

        public Criteria andApp5NotBetween(String value1, String value2) {
            addCriterion("app5 not between", value1, value2, "app5");
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