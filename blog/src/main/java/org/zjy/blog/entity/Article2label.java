package org.zjy.blog.entity;

public class Article2label {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article2label.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article2label.ARTICLE_ID
     *
     * @mbg.generated
     */
    private Integer articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article2label.LABEL
     *
     * @mbg.generated
     */
    private String label;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article2label.ID
     *
     * @return the value of article2label.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article2label.ID
     *
     * @param id the value for article2label.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article2label.ARTICLE_ID
     *
     * @return the value of article2label.ARTICLE_ID
     *
     * @mbg.generated
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article2label.ARTICLE_ID
     *
     * @param articleId the value for article2label.ARTICLE_ID
     *
     * @mbg.generated
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article2label.LABEL
     *
     * @return the value of article2label.LABEL
     *
     * @mbg.generated
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article2label.LABEL
     *
     * @param label the value for article2label.LABEL
     *
     * @mbg.generated
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }
}