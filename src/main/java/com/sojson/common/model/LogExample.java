package com.sojson.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNull() {
            addCriterion("APP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("APP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("APP_NAME =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("APP_NAME <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("APP_NAME >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("APP_NAME >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("APP_NAME <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("APP_NAME <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("APP_NAME like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("APP_NAME not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("APP_NAME in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("APP_NAME not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("APP_NAME between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("APP_NAME not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("LOG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("LOG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(Integer value) {
            addCriterion("LOG_TYPE =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(Integer value) {
            addCriterion("LOG_TYPE <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(Integer value) {
            addCriterion("LOG_TYPE >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOG_TYPE >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(Integer value) {
            addCriterion("LOG_TYPE <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(Integer value) {
            addCriterion("LOG_TYPE <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<Integer> values) {
            addCriterion("LOG_TYPE in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<Integer> values) {
            addCriterion("LOG_TYPE not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(Integer value1, Integer value2) {
            addCriterion("LOG_TYPE between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("LOG_TYPE not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("USER is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("USER is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("USER =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("USER <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("USER >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("USER >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("USER <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("USER <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("USER like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("USER not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("USER in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("USER not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("USER between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("USER not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNull() {
            addCriterion("METHOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("METHOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("METHOD_NAME =", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("METHOD_NAME <>", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("METHOD_NAME >", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("METHOD_NAME >=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("METHOD_NAME <", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("METHOD_NAME <=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("METHOD_NAME like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("METHOD_NAME not like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("METHOD_NAME in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("METHOD_NAME not in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("METHOD_NAME between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("METHOD_NAME not between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andRequestParamsIsNull() {
            addCriterion("REQUEST_PARAMS is null");
            return (Criteria) this;
        }

        public Criteria andRequestParamsIsNotNull() {
            addCriterion("REQUEST_PARAMS is not null");
            return (Criteria) this;
        }

        public Criteria andRequestParamsEqualTo(String value) {
            addCriterion("REQUEST_PARAMS =", value, "requestParams");
            return (Criteria) this;
        }

        public Criteria andRequestParamsNotEqualTo(String value) {
            addCriterion("REQUEST_PARAMS <>", value, "requestParams");
            return (Criteria) this;
        }

        public Criteria andRequestParamsGreaterThan(String value) {
            addCriterion("REQUEST_PARAMS >", value, "requestParams");
            return (Criteria) this;
        }

        public Criteria andRequestParamsGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_PARAMS >=", value, "requestParams");
            return (Criteria) this;
        }

        public Criteria andRequestParamsLessThan(String value) {
            addCriterion("REQUEST_PARAMS <", value, "requestParams");
            return (Criteria) this;
        }

        public Criteria andRequestParamsLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_PARAMS <=", value, "requestParams");
            return (Criteria) this;
        }

        public Criteria andRequestParamsLike(String value) {
            addCriterion("REQUEST_PARAMS like", value, "requestParams");
            return (Criteria) this;
        }

        public Criteria andRequestParamsNotLike(String value) {
            addCriterion("REQUEST_PARAMS not like", value, "requestParams");
            return (Criteria) this;
        }

        public Criteria andRequestParamsIn(List<String> values) {
            addCriterion("REQUEST_PARAMS in", values, "requestParams");
            return (Criteria) this;
        }

        public Criteria andRequestParamsNotIn(List<String> values) {
            addCriterion("REQUEST_PARAMS not in", values, "requestParams");
            return (Criteria) this;
        }

        public Criteria andRequestParamsBetween(String value1, String value2) {
            addCriterion("REQUEST_PARAMS between", value1, value2, "requestParams");
            return (Criteria) this;
        }

        public Criteria andRequestParamsNotBetween(String value1, String value2) {
            addCriterion("REQUEST_PARAMS not between", value1, value2, "requestParams");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionIsNull() {
            addCriterion("METHOD_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionIsNotNull() {
            addCriterion("METHOD_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionEqualTo(String value) {
            addCriterion("METHOD_DESCRIPTION =", value, "methodDescription");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionNotEqualTo(String value) {
            addCriterion("METHOD_DESCRIPTION <>", value, "methodDescription");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionGreaterThan(String value) {
            addCriterion("METHOD_DESCRIPTION >", value, "methodDescription");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("METHOD_DESCRIPTION >=", value, "methodDescription");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionLessThan(String value) {
            addCriterion("METHOD_DESCRIPTION <", value, "methodDescription");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionLessThanOrEqualTo(String value) {
            addCriterion("METHOD_DESCRIPTION <=", value, "methodDescription");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionLike(String value) {
            addCriterion("METHOD_DESCRIPTION like", value, "methodDescription");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionNotLike(String value) {
            addCriterion("METHOD_DESCRIPTION not like", value, "methodDescription");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionIn(List<String> values) {
            addCriterion("METHOD_DESCRIPTION in", values, "methodDescription");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionNotIn(List<String> values) {
            addCriterion("METHOD_DESCRIPTION not in", values, "methodDescription");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionBetween(String value1, String value2) {
            addCriterion("METHOD_DESCRIPTION between", value1, value2, "methodDescription");
            return (Criteria) this;
        }

        public Criteria andMethodDescriptionNotBetween(String value1, String value2) {
            addCriterion("METHOD_DESCRIPTION not between", value1, value2, "methodDescription");
            return (Criteria) this;
        }

        public Criteria andRequestIpIsNull() {
            addCriterion("REQUEST_IP is null");
            return (Criteria) this;
        }

        public Criteria andRequestIpIsNotNull() {
            addCriterion("REQUEST_IP is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIpEqualTo(String value) {
            addCriterion("REQUEST_IP =", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotEqualTo(String value) {
            addCriterion("REQUEST_IP <>", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpGreaterThan(String value) {
            addCriterion("REQUEST_IP >", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_IP >=", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLessThan(String value) {
            addCriterion("REQUEST_IP <", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_IP <=", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLike(String value) {
            addCriterion("REQUEST_IP like", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotLike(String value) {
            addCriterion("REQUEST_IP not like", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpIn(List<String> values) {
            addCriterion("REQUEST_IP in", values, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotIn(List<String> values) {
            addCriterion("REQUEST_IP not in", values, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpBetween(String value1, String value2) {
            addCriterion("REQUEST_IP between", value1, value2, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotBetween(String value1, String value2) {
            addCriterion("REQUEST_IP not between", value1, value2, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestUriIsNull() {
            addCriterion("REQUEST_URI is null");
            return (Criteria) this;
        }

        public Criteria andRequestUriIsNotNull() {
            addCriterion("REQUEST_URI is not null");
            return (Criteria) this;
        }

        public Criteria andRequestUriEqualTo(String value) {
            addCriterion("REQUEST_URI =", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriNotEqualTo(String value) {
            addCriterion("REQUEST_URI <>", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriGreaterThan(String value) {
            addCriterion("REQUEST_URI >", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_URI >=", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriLessThan(String value) {
            addCriterion("REQUEST_URI <", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_URI <=", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriLike(String value) {
            addCriterion("REQUEST_URI like", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriNotLike(String value) {
            addCriterion("REQUEST_URI not like", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriIn(List<String> values) {
            addCriterion("REQUEST_URI in", values, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriNotIn(List<String> values) {
            addCriterion("REQUEST_URI not in", values, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriBetween(String value1, String value2) {
            addCriterion("REQUEST_URI between", value1, value2, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriNotBetween(String value1, String value2) {
            addCriterion("REQUEST_URI not between", value1, value2, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestPathIsNull() {
            addCriterion("REQUEST_PATH is null");
            return (Criteria) this;
        }

        public Criteria andRequestPathIsNotNull() {
            addCriterion("REQUEST_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andRequestPathEqualTo(String value) {
            addCriterion("REQUEST_PATH =", value, "requestPath");
            return (Criteria) this;
        }

        public Criteria andRequestPathNotEqualTo(String value) {
            addCriterion("REQUEST_PATH <>", value, "requestPath");
            return (Criteria) this;
        }

        public Criteria andRequestPathGreaterThan(String value) {
            addCriterion("REQUEST_PATH >", value, "requestPath");
            return (Criteria) this;
        }

        public Criteria andRequestPathGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_PATH >=", value, "requestPath");
            return (Criteria) this;
        }

        public Criteria andRequestPathLessThan(String value) {
            addCriterion("REQUEST_PATH <", value, "requestPath");
            return (Criteria) this;
        }

        public Criteria andRequestPathLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_PATH <=", value, "requestPath");
            return (Criteria) this;
        }

        public Criteria andRequestPathLike(String value) {
            addCriterion("REQUEST_PATH like", value, "requestPath");
            return (Criteria) this;
        }

        public Criteria andRequestPathNotLike(String value) {
            addCriterion("REQUEST_PATH not like", value, "requestPath");
            return (Criteria) this;
        }

        public Criteria andRequestPathIn(List<String> values) {
            addCriterion("REQUEST_PATH in", values, "requestPath");
            return (Criteria) this;
        }

        public Criteria andRequestPathNotIn(List<String> values) {
            addCriterion("REQUEST_PATH not in", values, "requestPath");
            return (Criteria) this;
        }

        public Criteria andRequestPathBetween(String value1, String value2) {
            addCriterion("REQUEST_PATH between", value1, value2, "requestPath");
            return (Criteria) this;
        }

        public Criteria andRequestPathNotBetween(String value1, String value2) {
            addCriterion("REQUEST_PATH not between", value1, value2, "requestPath");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeIsNull() {
            addCriterion("EXCEPTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeIsNotNull() {
            addCriterion("EXCEPTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeEqualTo(String value) {
            addCriterion("EXCEPTION_CODE =", value, "exceptionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeNotEqualTo(String value) {
            addCriterion("EXCEPTION_CODE <>", value, "exceptionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeGreaterThan(String value) {
            addCriterion("EXCEPTION_CODE >", value, "exceptionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_CODE >=", value, "exceptionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeLessThan(String value) {
            addCriterion("EXCEPTION_CODE <", value, "exceptionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_CODE <=", value, "exceptionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeLike(String value) {
            addCriterion("EXCEPTION_CODE like", value, "exceptionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeNotLike(String value) {
            addCriterion("EXCEPTION_CODE not like", value, "exceptionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeIn(List<String> values) {
            addCriterion("EXCEPTION_CODE in", values, "exceptionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeNotIn(List<String> values) {
            addCriterion("EXCEPTION_CODE not in", values, "exceptionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeBetween(String value1, String value2) {
            addCriterion("EXCEPTION_CODE between", value1, value2, "exceptionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionCodeNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION_CODE not between", value1, value2, "exceptionCode");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailIsNull() {
            addCriterion("EXCEPTION_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailIsNotNull() {
            addCriterion("EXCEPTION_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailEqualTo(String value) {
            addCriterion("EXCEPTION_DETAIL =", value, "exceptionDetail");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailNotEqualTo(String value) {
            addCriterion("EXCEPTION_DETAIL <>", value, "exceptionDetail");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailGreaterThan(String value) {
            addCriterion("EXCEPTION_DETAIL >", value, "exceptionDetail");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_DETAIL >=", value, "exceptionDetail");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailLessThan(String value) {
            addCriterion("EXCEPTION_DETAIL <", value, "exceptionDetail");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_DETAIL <=", value, "exceptionDetail");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailLike(String value) {
            addCriterion("EXCEPTION_DETAIL like", value, "exceptionDetail");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailNotLike(String value) {
            addCriterion("EXCEPTION_DETAIL not like", value, "exceptionDetail");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailIn(List<String> values) {
            addCriterion("EXCEPTION_DETAIL in", values, "exceptionDetail");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailNotIn(List<String> values) {
            addCriterion("EXCEPTION_DETAIL not in", values, "exceptionDetail");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailBetween(String value1, String value2) {
            addCriterion("EXCEPTION_DETAIL between", value1, value2, "exceptionDetail");
            return (Criteria) this;
        }

        public Criteria andExceptionDetailNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION_DETAIL not between", value1, value2, "exceptionDetail");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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