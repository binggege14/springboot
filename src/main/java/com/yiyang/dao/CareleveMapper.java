package com.yiyang.dao;

import com.yiyang.entity.Careleve;
import com.yiyang.entity.CareleveExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CareleveMapper {
    long countByExample(CareleveExample example);

    int deleteByExample(CareleveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Careleve record);

    int insertSelective(Careleve record);

    List<Careleve> selectByExample(CareleveExample example);

    Careleve selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Careleve record, @Param("example") CareleveExample example);

    int updateByExample(@Param("record") Careleve record, @Param("example") CareleveExample example);

    int updateByPrimaryKeySelective(Careleve record);

    int updateByPrimaryKey(Careleve record);
}