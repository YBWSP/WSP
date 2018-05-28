package com.zhy.people.mappers;

import com.zhy.people.beans.CommonTask;
import com.zhy.people.beans.CommonTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COMMON_TASK
     *
     * @mbg.generated
     */
    long countByExample(CommonTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COMMON_TASK
     *
     * @mbg.generated
     */
    int deleteByExample(CommonTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COMMON_TASK
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String FLOWID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COMMON_TASK
     *
     * @mbg.generated
     */
    int insert(CommonTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COMMON_TASK
     *
     * @mbg.generated
     */
    int insertSelective(CommonTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COMMON_TASK
     *
     * @mbg.generated
     */
    List<CommonTask> selectByExample(CommonTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COMMON_TASK
     *
     * @mbg.generated
     */
    CommonTask selectByPrimaryKey(String FLOWID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COMMON_TASK
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CommonTask record, @Param("example") CommonTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COMMON_TASK
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CommonTask record, @Param("example") CommonTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COMMON_TASK
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CommonTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COMMON_TASK
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CommonTask record);
}