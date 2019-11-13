package com.yiyang.dao;

import com.yiyang.entity.CusBed;
import com.yiyang.entity.CusBedExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CusBedMapper {
    long countByExample(CusBedExample example);

    int deleteByExample(CusBedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CusBed record);

    int insertSelective(CusBed record);

    List<CusBed> selectByExample(CusBedExample example);

    CusBed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CusBed record, @Param("example") CusBedExample example);

    int updateByExample(@Param("record") CusBed record, @Param("example") CusBedExample example);

    int updateByPrimaryKeySelective(CusBed record);

    int updateByPrimaryKey(CusBed record);
}