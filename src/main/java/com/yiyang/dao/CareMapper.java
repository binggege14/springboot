package com.yiyang.dao;

import java.util.List;

import com.yiyang.entity.Care;
import com.yiyang.entity.CareExample;
import org.apache.ibatis.annotations.Param;

public interface CareMapper {
    long countByExample(CareExample example);

    int deleteByExample(CareExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Care record);

    int insertSelective(Care record);

    List<Care> selectByExample(CareExample example);

    Care selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Care record, @Param("example") CareExample example);

    int updateByExample(@Param("record") Care record, @Param("example") CareExample example);

    int updateByPrimaryKeySelective(Care record);

    int updateByPrimaryKey(Care record);
}