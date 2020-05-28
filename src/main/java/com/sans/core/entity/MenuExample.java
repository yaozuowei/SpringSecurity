package com.sans.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,t_menu
     */
    public MenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,t_menu
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,t_menu
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,t_menu
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,t_menu
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,t_menu
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,t_menu
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,t_menu
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,t_menu
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,t_menu
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,t_menu
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：t_menu
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

        public Criteria andMenuGuidIsNull() {
            addCriterion("MENU_GUID is null");
            return (Criteria) this;
        }

        public Criteria andMenuGuidIsNotNull() {
            addCriterion("MENU_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuGuidEqualTo(String value) {
            addCriterion("MENU_GUID =", value, "menuGuid");
            return (Criteria) this;
        }

        public Criteria andMenuGuidNotEqualTo(String value) {
            addCriterion("MENU_GUID <>", value, "menuGuid");
            return (Criteria) this;
        }

        public Criteria andMenuGuidGreaterThan(String value) {
            addCriterion("MENU_GUID >", value, "menuGuid");
            return (Criteria) this;
        }

        public Criteria andMenuGuidGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_GUID >=", value, "menuGuid");
            return (Criteria) this;
        }

        public Criteria andMenuGuidLessThan(String value) {
            addCriterion("MENU_GUID <", value, "menuGuid");
            return (Criteria) this;
        }

        public Criteria andMenuGuidLessThanOrEqualTo(String value) {
            addCriterion("MENU_GUID <=", value, "menuGuid");
            return (Criteria) this;
        }

        public Criteria andMenuGuidLike(String value) {
            addCriterion("MENU_GUID like", value, "menuGuid");
            return (Criteria) this;
        }

        public Criteria andMenuGuidNotLike(String value) {
            addCriterion("MENU_GUID not like", value, "menuGuid");
            return (Criteria) this;
        }

        public Criteria andMenuGuidIn(List<String> values) {
            addCriterion("MENU_GUID in", values, "menuGuid");
            return (Criteria) this;
        }

        public Criteria andMenuGuidNotIn(List<String> values) {
            addCriterion("MENU_GUID not in", values, "menuGuid");
            return (Criteria) this;
        }

        public Criteria andMenuGuidBetween(String value1, String value2) {
            addCriterion("MENU_GUID between", value1, value2, "menuGuid");
            return (Criteria) this;
        }

        public Criteria andMenuGuidNotBetween(String value1, String value2) {
            addCriterion("MENU_GUID not between", value1, value2, "menuGuid");
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

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andMenuOrderIsNull() {
            addCriterion("MENU_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andMenuOrderIsNotNull() {
            addCriterion("MENU_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andMenuOrderEqualTo(Integer value) {
            addCriterion("MENU_ORDER =", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotEqualTo(Integer value) {
            addCriterion("MENU_ORDER <>", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderGreaterThan(Integer value) {
            addCriterion("MENU_ORDER >", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_ORDER >=", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderLessThan(Integer value) {
            addCriterion("MENU_ORDER <", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_ORDER <=", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderIn(List<Integer> values) {
            addCriterion("MENU_ORDER in", values, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotIn(List<Integer> values) {
            addCriterion("MENU_ORDER not in", values, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ORDER between", value1, value2, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ORDER not between", value1, value2, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("TARGET is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("TARGET =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("TARGET <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("TARGET >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("TARGET <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("TARGET <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("TARGET like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("TARGET not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("TARGET in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("TARGET not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("TARGET between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("TARGET not between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("MENU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("MENU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("MENU_TYPE =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("MENU_TYPE <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("MENU_TYPE >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_TYPE >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("MENU_TYPE <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("MENU_TYPE <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("MENU_TYPE like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("MENU_TYPE not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("MENU_TYPE in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("MENU_TYPE not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("MENU_TYPE between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("MENU_TYPE not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuStatusIsNull() {
            addCriterion("MENU_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMenuStatusIsNotNull() {
            addCriterion("MENU_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMenuStatusEqualTo(String value) {
            addCriterion("MENU_STATUS =", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotEqualTo(String value) {
            addCriterion("MENU_STATUS <>", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusGreaterThan(String value) {
            addCriterion("MENU_STATUS >", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_STATUS >=", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusLessThan(String value) {
            addCriterion("MENU_STATUS <", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusLessThanOrEqualTo(String value) {
            addCriterion("MENU_STATUS <=", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusLike(String value) {
            addCriterion("MENU_STATUS like", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotLike(String value) {
            addCriterion("MENU_STATUS not like", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusIn(List<String> values) {
            addCriterion("MENU_STATUS in", values, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotIn(List<String> values) {
            addCriterion("MENU_STATUS not in", values, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusBetween(String value1, String value2) {
            addCriterion("MENU_STATUS between", value1, value2, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotBetween(String value1, String value2) {
            addCriterion("MENU_STATUS not between", value1, value2, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andPermsIsNull() {
            addCriterion("PERMS is null");
            return (Criteria) this;
        }

        public Criteria andPermsIsNotNull() {
            addCriterion("PERMS is not null");
            return (Criteria) this;
        }

        public Criteria andPermsEqualTo(String value) {
            addCriterion("PERMS =", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsNotEqualTo(String value) {
            addCriterion("PERMS <>", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsGreaterThan(String value) {
            addCriterion("PERMS >", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsGreaterThanOrEqualTo(String value) {
            addCriterion("PERMS >=", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsLessThan(String value) {
            addCriterion("PERMS <", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsLessThanOrEqualTo(String value) {
            addCriterion("PERMS <=", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsLike(String value) {
            addCriterion("PERMS like", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsNotLike(String value) {
            addCriterion("PERMS not like", value, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsIn(List<String> values) {
            addCriterion("PERMS in", values, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsNotIn(List<String> values) {
            addCriterion("PERMS not in", values, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsBetween(String value1, String value2) {
            addCriterion("PERMS between", value1, value2, "perms");
            return (Criteria) this;
        }

        public Criteria andPermsNotBetween(String value1, String value2) {
            addCriterion("PERMS not between", value1, value2, "perms");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：t_menu
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：t_menu
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