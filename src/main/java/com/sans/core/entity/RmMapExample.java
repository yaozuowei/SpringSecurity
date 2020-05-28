package com.sans.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RmMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,t_rm_map
     */
    public RmMapExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,t_rm_map
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,t_rm_map
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,t_rm_map
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,t_rm_map
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,t_rm_map
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,t_rm_map
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,t_rm_map
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,t_rm_map
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,t_rm_map
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,t_rm_map
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：t_rm_map
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

        public Criteria andRmMapIsNull() {
            addCriterion("RM_MAP is null");
            return (Criteria) this;
        }

        public Criteria andRmMapIsNotNull() {
            addCriterion("RM_MAP is not null");
            return (Criteria) this;
        }

        public Criteria andRmMapEqualTo(String value) {
            addCriterion("RM_MAP =", value, "rmMap");
            return (Criteria) this;
        }

        public Criteria andRmMapNotEqualTo(String value) {
            addCriterion("RM_MAP <>", value, "rmMap");
            return (Criteria) this;
        }

        public Criteria andRmMapGreaterThan(String value) {
            addCriterion("RM_MAP >", value, "rmMap");
            return (Criteria) this;
        }

        public Criteria andRmMapGreaterThanOrEqualTo(String value) {
            addCriterion("RM_MAP >=", value, "rmMap");
            return (Criteria) this;
        }

        public Criteria andRmMapLessThan(String value) {
            addCriterion("RM_MAP <", value, "rmMap");
            return (Criteria) this;
        }

        public Criteria andRmMapLessThanOrEqualTo(String value) {
            addCriterion("RM_MAP <=", value, "rmMap");
            return (Criteria) this;
        }

        public Criteria andRmMapLike(String value) {
            addCriterion("RM_MAP like", value, "rmMap");
            return (Criteria) this;
        }

        public Criteria andRmMapNotLike(String value) {
            addCriterion("RM_MAP not like", value, "rmMap");
            return (Criteria) this;
        }

        public Criteria andRmMapIn(List<String> values) {
            addCriterion("RM_MAP in", values, "rmMap");
            return (Criteria) this;
        }

        public Criteria andRmMapNotIn(List<String> values) {
            addCriterion("RM_MAP not in", values, "rmMap");
            return (Criteria) this;
        }

        public Criteria andRmMapBetween(String value1, String value2) {
            addCriterion("RM_MAP between", value1, value2, "rmMap");
            return (Criteria) this;
        }

        public Criteria andRmMapNotBetween(String value1, String value2) {
            addCriterion("RM_MAP not between", value1, value2, "rmMap");
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

        public Criteria andRoleGuidIsNull() {
            addCriterion("ROLE_GUID is null");
            return (Criteria) this;
        }

        public Criteria andRoleGuidIsNotNull() {
            addCriterion("ROLE_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleGuidEqualTo(String value) {
            addCriterion("ROLE_GUID =", value, "roleGuid");
            return (Criteria) this;
        }

        public Criteria andRoleGuidNotEqualTo(String value) {
            addCriterion("ROLE_GUID <>", value, "roleGuid");
            return (Criteria) this;
        }

        public Criteria andRoleGuidGreaterThan(String value) {
            addCriterion("ROLE_GUID >", value, "roleGuid");
            return (Criteria) this;
        }

        public Criteria andRoleGuidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_GUID >=", value, "roleGuid");
            return (Criteria) this;
        }

        public Criteria andRoleGuidLessThan(String value) {
            addCriterion("ROLE_GUID <", value, "roleGuid");
            return (Criteria) this;
        }

        public Criteria andRoleGuidLessThanOrEqualTo(String value) {
            addCriterion("ROLE_GUID <=", value, "roleGuid");
            return (Criteria) this;
        }

        public Criteria andRoleGuidLike(String value) {
            addCriterion("ROLE_GUID like", value, "roleGuid");
            return (Criteria) this;
        }

        public Criteria andRoleGuidNotLike(String value) {
            addCriterion("ROLE_GUID not like", value, "roleGuid");
            return (Criteria) this;
        }

        public Criteria andRoleGuidIn(List<String> values) {
            addCriterion("ROLE_GUID in", values, "roleGuid");
            return (Criteria) this;
        }

        public Criteria andRoleGuidNotIn(List<String> values) {
            addCriterion("ROLE_GUID not in", values, "roleGuid");
            return (Criteria) this;
        }

        public Criteria andRoleGuidBetween(String value1, String value2) {
            addCriterion("ROLE_GUID between", value1, value2, "roleGuid");
            return (Criteria) this;
        }

        public Criteria andRoleGuidNotBetween(String value1, String value2) {
            addCriterion("ROLE_GUID not between", value1, value2, "roleGuid");
            return (Criteria) this;
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
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：t_rm_map
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：t_rm_map
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