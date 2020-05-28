package com.sans.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,t_user
     */
    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,t_user
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,t_user
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,t_user
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,t_user
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,t_user
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,t_user
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,t_user
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,t_user
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,t_user
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,t_user
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：t_user
     */
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

        public Criteria andUserGuidIsNull() {
            addCriterion("USER_GUID is null");
            return (Criteria) this;
        }

        public Criteria andUserGuidIsNotNull() {
            addCriterion("USER_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andUserGuidEqualTo(String value) {
            addCriterion("USER_GUID =", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotEqualTo(String value) {
            addCriterion("USER_GUID <>", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidGreaterThan(String value) {
            addCriterion("USER_GUID >", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidGreaterThanOrEqualTo(String value) {
            addCriterion("USER_GUID >=", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidLessThan(String value) {
            addCriterion("USER_GUID <", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidLessThanOrEqualTo(String value) {
            addCriterion("USER_GUID <=", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidLike(String value) {
            addCriterion("USER_GUID like", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotLike(String value) {
            addCriterion("USER_GUID not like", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidIn(List<String> values) {
            addCriterion("USER_GUID in", values, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotIn(List<String> values) {
            addCriterion("USER_GUID not in", values, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidBetween(String value1, String value2) {
            addCriterion("USER_GUID between", value1, value2, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotBetween(String value1, String value2) {
            addCriterion("USER_GUID not between", value1, value2, "userGuid");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIsNull() {
            addCriterion("DELETE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIsNotNull() {
            addCriterion("DELETE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteDateEqualTo(Date value) {
            addCriterion("DELETE_DATE =", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotEqualTo(Date value) {
            addCriterion("DELETE_DATE <>", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateGreaterThan(Date value) {
            addCriterion("DELETE_DATE >", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DELETE_DATE >=", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateLessThan(Date value) {
            addCriterion("DELETE_DATE <", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateLessThanOrEqualTo(Date value) {
            addCriterion("DELETE_DATE <=", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIn(List<Date> values) {
            addCriterion("DELETE_DATE in", values, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotIn(List<Date> values) {
            addCriterion("DELETE_DATE not in", values, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateBetween(Date value1, Date value2) {
            addCriterion("DELETE_DATE between", value1, value2, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotBetween(Date value1, Date value2) {
            addCriterion("DELETE_DATE not between", value1, value2, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelIsNull() {
            addCriterion("CREATE_USER_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelIsNotNull() {
            addCriterion("CREATE_USER_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelEqualTo(String value) {
            addCriterion("CREATE_USER_LABEL =", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelNotEqualTo(String value) {
            addCriterion("CREATE_USER_LABEL <>", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelGreaterThan(String value) {
            addCriterion("CREATE_USER_LABEL >", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_LABEL >=", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelLessThan(String value) {
            addCriterion("CREATE_USER_LABEL <", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_LABEL <=", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelLike(String value) {
            addCriterion("CREATE_USER_LABEL like", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelNotLike(String value) {
            addCriterion("CREATE_USER_LABEL not like", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelIn(List<String> values) {
            addCriterion("CREATE_USER_LABEL in", values, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelNotIn(List<String> values) {
            addCriterion("CREATE_USER_LABEL not in", values, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelBetween(String value1, String value2) {
            addCriterion("CREATE_USER_LABEL between", value1, value2, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_LABEL not between", value1, value2, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelIsNull() {
            addCriterion("UPDATE_USER_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelIsNotNull() {
            addCriterion("UPDATE_USER_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelEqualTo(String value) {
            addCriterion("UPDATE_USER_LABEL =", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelNotEqualTo(String value) {
            addCriterion("UPDATE_USER_LABEL <>", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelGreaterThan(String value) {
            addCriterion("UPDATE_USER_LABEL >", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_LABEL >=", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelLessThan(String value) {
            addCriterion("UPDATE_USER_LABEL <", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_LABEL <=", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelLike(String value) {
            addCriterion("UPDATE_USER_LABEL like", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelNotLike(String value) {
            addCriterion("UPDATE_USER_LABEL not like", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelIn(List<String> values) {
            addCriterion("UPDATE_USER_LABEL in", values, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelNotIn(List<String> values) {
            addCriterion("UPDATE_USER_LABEL not in", values, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_LABEL between", value1, value2, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_LABEL not between", value1, value2, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelIsNull() {
            addCriterion("DELETE_USER_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelIsNotNull() {
            addCriterion("DELETE_USER_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelEqualTo(String value) {
            addCriterion("DELETE_USER_LABEL =", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelNotEqualTo(String value) {
            addCriterion("DELETE_USER_LABEL <>", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelGreaterThan(String value) {
            addCriterion("DELETE_USER_LABEL >", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_USER_LABEL >=", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelLessThan(String value) {
            addCriterion("DELETE_USER_LABEL <", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelLessThanOrEqualTo(String value) {
            addCriterion("DELETE_USER_LABEL <=", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelLike(String value) {
            addCriterion("DELETE_USER_LABEL like", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelNotLike(String value) {
            addCriterion("DELETE_USER_LABEL not like", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelIn(List<String> values) {
            addCriterion("DELETE_USER_LABEL in", values, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelNotIn(List<String> values) {
            addCriterion("DELETE_USER_LABEL not in", values, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelBetween(String value1, String value2) {
            addCriterion("DELETE_USER_LABEL between", value1, value2, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelNotBetween(String value1, String value2) {
            addCriterion("DELETE_USER_LABEL not between", value1, value2, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andRecordVersionIsNull() {
            addCriterion("RECORD_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andRecordVersionIsNotNull() {
            addCriterion("RECORD_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andRecordVersionEqualTo(Integer value) {
            addCriterion("RECORD_VERSION =", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionNotEqualTo(Integer value) {
            addCriterion("RECORD_VERSION <>", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionGreaterThan(Integer value) {
            addCriterion("RECORD_VERSION >", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECORD_VERSION >=", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionLessThan(Integer value) {
            addCriterion("RECORD_VERSION <", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionLessThanOrEqualTo(Integer value) {
            addCriterion("RECORD_VERSION <=", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionIn(List<Integer> values) {
            addCriterion("RECORD_VERSION in", values, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionNotIn(List<Integer> values) {
            addCriterion("RECORD_VERSION not in", values, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionBetween(Integer value1, Integer value2) {
            addCriterion("RECORD_VERSION between", value1, value2, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("RECORD_VERSION not between", value1, value2, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("USER_NO like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("USER_NO not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserSystemIsNull() {
            addCriterion("USER_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andUserSystemIsNotNull() {
            addCriterion("USER_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andUserSystemEqualTo(String value) {
            addCriterion("USER_SYSTEM =", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemNotEqualTo(String value) {
            addCriterion("USER_SYSTEM <>", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemGreaterThan(String value) {
            addCriterion("USER_SYSTEM >", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SYSTEM >=", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemLessThan(String value) {
            addCriterion("USER_SYSTEM <", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemLessThanOrEqualTo(String value) {
            addCriterion("USER_SYSTEM <=", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemLike(String value) {
            addCriterion("USER_SYSTEM like", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemNotLike(String value) {
            addCriterion("USER_SYSTEM not like", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemIn(List<String> values) {
            addCriterion("USER_SYSTEM in", values, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemNotIn(List<String> values) {
            addCriterion("USER_SYSTEM not in", values, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemBetween(String value1, String value2) {
            addCriterion("USER_SYSTEM between", value1, value2, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemNotBetween(String value1, String value2) {
            addCriterion("USER_SYSTEM not between", value1, value2, "userSystem");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDirectTelIsNull() {
            addCriterion("DIRECT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andDirectTelIsNotNull() {
            addCriterion("DIRECT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andDirectTelEqualTo(String value) {
            addCriterion("DIRECT_TEL =", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelNotEqualTo(String value) {
            addCriterion("DIRECT_TEL <>", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelGreaterThan(String value) {
            addCriterion("DIRECT_TEL >", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECT_TEL >=", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelLessThan(String value) {
            addCriterion("DIRECT_TEL <", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelLessThanOrEqualTo(String value) {
            addCriterion("DIRECT_TEL <=", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelLike(String value) {
            addCriterion("DIRECT_TEL like", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelNotLike(String value) {
            addCriterion("DIRECT_TEL not like", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelIn(List<String> values) {
            addCriterion("DIRECT_TEL in", values, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelNotIn(List<String> values) {
            addCriterion("DIRECT_TEL not in", values, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelBetween(String value1, String value2) {
            addCriterion("DIRECT_TEL between", value1, value2, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelNotBetween(String value1, String value2) {
            addCriterion("DIRECT_TEL not between", value1, value2, "directTel");
            return (Criteria) this;
        }

        public Criteria andExtra1IsNull() {
            addCriterion("EXTRA1 is null");
            return (Criteria) this;
        }

        public Criteria andExtra1IsNotNull() {
            addCriterion("EXTRA1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra1EqualTo(String value) {
            addCriterion("EXTRA1 =", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotEqualTo(String value) {
            addCriterion("EXTRA1 <>", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1GreaterThan(String value) {
            addCriterion("EXTRA1 >", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA1 >=", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1LessThan(String value) {
            addCriterion("EXTRA1 <", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1LessThanOrEqualTo(String value) {
            addCriterion("EXTRA1 <=", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1Like(String value) {
            addCriterion("EXTRA1 like", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotLike(String value) {
            addCriterion("EXTRA1 not like", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1In(List<String> values) {
            addCriterion("EXTRA1 in", values, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotIn(List<String> values) {
            addCriterion("EXTRA1 not in", values, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1Between(String value1, String value2) {
            addCriterion("EXTRA1 between", value1, value2, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotBetween(String value1, String value2) {
            addCriterion("EXTRA1 not between", value1, value2, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra2IsNull() {
            addCriterion("EXTRA2 is null");
            return (Criteria) this;
        }

        public Criteria andExtra2IsNotNull() {
            addCriterion("EXTRA2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra2EqualTo(String value) {
            addCriterion("EXTRA2 =", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotEqualTo(String value) {
            addCriterion("EXTRA2 <>", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2GreaterThan(String value) {
            addCriterion("EXTRA2 >", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA2 >=", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2LessThan(String value) {
            addCriterion("EXTRA2 <", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2LessThanOrEqualTo(String value) {
            addCriterion("EXTRA2 <=", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2Like(String value) {
            addCriterion("EXTRA2 like", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotLike(String value) {
            addCriterion("EXTRA2 not like", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2In(List<String> values) {
            addCriterion("EXTRA2 in", values, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotIn(List<String> values) {
            addCriterion("EXTRA2 not in", values, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2Between(String value1, String value2) {
            addCriterion("EXTRA2 between", value1, value2, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotBetween(String value1, String value2) {
            addCriterion("EXTRA2 not between", value1, value2, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra3IsNull() {
            addCriterion("EXTRA3 is null");
            return (Criteria) this;
        }

        public Criteria andExtra3IsNotNull() {
            addCriterion("EXTRA3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra3EqualTo(String value) {
            addCriterion("EXTRA3 =", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotEqualTo(String value) {
            addCriterion("EXTRA3 <>", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3GreaterThan(String value) {
            addCriterion("EXTRA3 >", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA3 >=", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3LessThan(String value) {
            addCriterion("EXTRA3 <", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3LessThanOrEqualTo(String value) {
            addCriterion("EXTRA3 <=", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3Like(String value) {
            addCriterion("EXTRA3 like", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotLike(String value) {
            addCriterion("EXTRA3 not like", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3In(List<String> values) {
            addCriterion("EXTRA3 in", values, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotIn(List<String> values) {
            addCriterion("EXTRA3 not in", values, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3Between(String value1, String value2) {
            addCriterion("EXTRA3 between", value1, value2, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotBetween(String value1, String value2) {
            addCriterion("EXTRA3 not between", value1, value2, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra4IsNull() {
            addCriterion("EXTRA4 is null");
            return (Criteria) this;
        }

        public Criteria andExtra4IsNotNull() {
            addCriterion("EXTRA4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra4EqualTo(String value) {
            addCriterion("EXTRA4 =", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4NotEqualTo(String value) {
            addCriterion("EXTRA4 <>", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4GreaterThan(String value) {
            addCriterion("EXTRA4 >", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA4 >=", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4LessThan(String value) {
            addCriterion("EXTRA4 <", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4LessThanOrEqualTo(String value) {
            addCriterion("EXTRA4 <=", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4Like(String value) {
            addCriterion("EXTRA4 like", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4NotLike(String value) {
            addCriterion("EXTRA4 not like", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4In(List<String> values) {
            addCriterion("EXTRA4 in", values, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4NotIn(List<String> values) {
            addCriterion("EXTRA4 not in", values, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4Between(String value1, String value2) {
            addCriterion("EXTRA4 between", value1, value2, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4NotBetween(String value1, String value2) {
            addCriterion("EXTRA4 not between", value1, value2, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra5IsNull() {
            addCriterion("EXTRA5 is null");
            return (Criteria) this;
        }

        public Criteria andExtra5IsNotNull() {
            addCriterion("EXTRA5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra5EqualTo(String value) {
            addCriterion("EXTRA5 =", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5NotEqualTo(String value) {
            addCriterion("EXTRA5 <>", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5GreaterThan(String value) {
            addCriterion("EXTRA5 >", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA5 >=", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5LessThan(String value) {
            addCriterion("EXTRA5 <", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5LessThanOrEqualTo(String value) {
            addCriterion("EXTRA5 <=", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5Like(String value) {
            addCriterion("EXTRA5 like", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5NotLike(String value) {
            addCriterion("EXTRA5 not like", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5In(List<String> values) {
            addCriterion("EXTRA5 in", values, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5NotIn(List<String> values) {
            addCriterion("EXTRA5 not in", values, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5Between(String value1, String value2) {
            addCriterion("EXTRA5 between", value1, value2, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5NotBetween(String value1, String value2) {
            addCriterion("EXTRA5 not between", value1, value2, "extra5");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：t_user
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：t_user
     */
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