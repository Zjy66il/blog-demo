package org.zjy.blog.entity;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public ArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table article
     *
     * @mbg.generated
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

        public Criteria andArticleIdIsNull() {
            addCriterion("ARTICLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("ARTICLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("ARTICLE_ID =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("ARTICLE_ID <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("ARTICLE_ID >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ARTICLE_ID >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("ARTICLE_ID <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("ARTICLE_ID <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("ARTICLE_ID in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("ARTICLE_ID not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("ARTICLE_ID between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ARTICLE_ID not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andPublicTimeIsNull() {
            addCriterion("PUBLIC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPublicTimeIsNotNull() {
            addCriterion("PUBLIC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPublicTimeEqualTo(Double value) {
            addCriterion("PUBLIC_TIME =", value, "publicTime");
            return (Criteria) this;
        }

        public Criteria andPublicTimeNotEqualTo(Double value) {
            addCriterion("PUBLIC_TIME <>", value, "publicTime");
            return (Criteria) this;
        }

        public Criteria andPublicTimeGreaterThan(Double value) {
            addCriterion("PUBLIC_TIME >", value, "publicTime");
            return (Criteria) this;
        }

        public Criteria andPublicTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("PUBLIC_TIME >=", value, "publicTime");
            return (Criteria) this;
        }

        public Criteria andPublicTimeLessThan(Double value) {
            addCriterion("PUBLIC_TIME <", value, "publicTime");
            return (Criteria) this;
        }

        public Criteria andPublicTimeLessThanOrEqualTo(Double value) {
            addCriterion("PUBLIC_TIME <=", value, "publicTime");
            return (Criteria) this;
        }

        public Criteria andPublicTimeIn(List<Double> values) {
            addCriterion("PUBLIC_TIME in", values, "publicTime");
            return (Criteria) this;
        }

        public Criteria andPublicTimeNotIn(List<Double> values) {
            addCriterion("PUBLIC_TIME not in", values, "publicTime");
            return (Criteria) this;
        }

        public Criteria andPublicTimeBetween(Double value1, Double value2) {
            addCriterion("PUBLIC_TIME between", value1, value2, "publicTime");
            return (Criteria) this;
        }

        public Criteria andPublicTimeNotBetween(Double value1, Double value2) {
            addCriterion("PUBLIC_TIME not between", value1, value2, "publicTime");
            return (Criteria) this;
        }

        public Criteria andHeatIsNull() {
            addCriterion("HEAT is null");
            return (Criteria) this;
        }

        public Criteria andHeatIsNotNull() {
            addCriterion("HEAT is not null");
            return (Criteria) this;
        }

        public Criteria andHeatEqualTo(Double value) {
            addCriterion("HEAT =", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotEqualTo(Double value) {
            addCriterion("HEAT <>", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatGreaterThan(Double value) {
            addCriterion("HEAT >", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatGreaterThanOrEqualTo(Double value) {
            addCriterion("HEAT >=", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLessThan(Double value) {
            addCriterion("HEAT <", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLessThanOrEqualTo(Double value) {
            addCriterion("HEAT <=", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatIn(List<Double> values) {
            addCriterion("HEAT in", values, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotIn(List<Double> values) {
            addCriterion("HEAT not in", values, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatBetween(Double value1, Double value2) {
            addCriterion("HEAT between", value1, value2, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotBetween(Double value1, Double value2) {
            addCriterion("HEAT not between", value1, value2, "heat");
            return (Criteria) this;
        }

        public Criteria andCommendNumIsNull() {
            addCriterion("COMMEND_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCommendNumIsNotNull() {
            addCriterion("COMMEND_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCommendNumEqualTo(Integer value) {
            addCriterion("COMMEND_NUM =", value, "commendNum");
            return (Criteria) this;
        }

        public Criteria andCommendNumNotEqualTo(Integer value) {
            addCriterion("COMMEND_NUM <>", value, "commendNum");
            return (Criteria) this;
        }

        public Criteria andCommendNumGreaterThan(Integer value) {
            addCriterion("COMMEND_NUM >", value, "commendNum");
            return (Criteria) this;
        }

        public Criteria andCommendNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMEND_NUM >=", value, "commendNum");
            return (Criteria) this;
        }

        public Criteria andCommendNumLessThan(Integer value) {
            addCriterion("COMMEND_NUM <", value, "commendNum");
            return (Criteria) this;
        }

        public Criteria andCommendNumLessThanOrEqualTo(Integer value) {
            addCriterion("COMMEND_NUM <=", value, "commendNum");
            return (Criteria) this;
        }

        public Criteria andCommendNumIn(List<Integer> values) {
            addCriterion("COMMEND_NUM in", values, "commendNum");
            return (Criteria) this;
        }

        public Criteria andCommendNumNotIn(List<Integer> values) {
            addCriterion("COMMEND_NUM not in", values, "commendNum");
            return (Criteria) this;
        }

        public Criteria andCommendNumBetween(Integer value1, Integer value2) {
            addCriterion("COMMEND_NUM between", value1, value2, "commendNum");
            return (Criteria) this;
        }

        public Criteria andCommendNumNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMEND_NUM not between", value1, value2, "commendNum");
            return (Criteria) this;
        }

        public Criteria andReadNumIsNull() {
            addCriterion("READ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andReadNumIsNotNull() {
            addCriterion("READ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andReadNumEqualTo(Integer value) {
            addCriterion("READ_NUM =", value, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumNotEqualTo(Integer value) {
            addCriterion("READ_NUM <>", value, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumGreaterThan(Integer value) {
            addCriterion("READ_NUM >", value, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("READ_NUM >=", value, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumLessThan(Integer value) {
            addCriterion("READ_NUM <", value, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumLessThanOrEqualTo(Integer value) {
            addCriterion("READ_NUM <=", value, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumIn(List<Integer> values) {
            addCriterion("READ_NUM in", values, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumNotIn(List<Integer> values) {
            addCriterion("READ_NUM not in", values, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumBetween(Integer value1, Integer value2) {
            addCriterion("READ_NUM between", value1, value2, "readNum");
            return (Criteria) this;
        }

        public Criteria andReadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("READ_NUM not between", value1, value2, "readNum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table article
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table article
     *
     * @mbg.generated
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