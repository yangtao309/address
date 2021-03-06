package com.zero.address.dao.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.zero.address.dao.entity.Area;
import com.zero.address.dao.entity.AreaExample;

@Repository
public interface AreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Wed Jan 10 00:14:39 CST 2018
     */
    long countByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Wed Jan 10 00:14:39 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Wed Jan 10 00:14:39 CST 2018
     */
    int insert(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Wed Jan 10 00:14:39 CST 2018
     */
    int insertSelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Wed Jan 10 00:14:39 CST 2018
     */
    List<Area> selectByExample(AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Wed Jan 10 00:14:39 CST 2018
     */
    Area selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Wed Jan 10 00:14:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Wed Jan 10 00:14:39 CST 2018
     */
    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Wed Jan 10 00:14:39 CST 2018
     */
    int updateByPrimaryKeySelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area
     *
     * @mbg.generated Wed Jan 10 00:14:39 CST 2018
     */
    int updateByPrimaryKey(Area record);
}