package org.zjy.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.zjy.blog.entity.Article2label;
import org.zjy.blog.entity.Article2labelExample;

@Mapper
public interface Article2labelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article2label
     *
     * @mbg.generated
     */
    long countByExample(Article2labelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article2label
     *
     * @mbg.generated
     */
    int deleteByExample(Article2labelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article2label
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article2label
     *
     * @mbg.generated
     */
    int insert(Article2label record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article2label
     *
     * @mbg.generated
     */
    int insertSelective(Article2label record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article2label
     *
     * @mbg.generated
     */
    List<Article2label> selectByExample(Article2labelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article2label
     *
     * @mbg.generated
     */
    Article2label selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article2label
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Article2label record, @Param("example") Article2labelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article2label
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Article2label record, @Param("example") Article2labelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article2label
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Article2label record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article2label
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Article2label record);
}