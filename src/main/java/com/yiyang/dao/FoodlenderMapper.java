package com.yiyang.dao;

import com.yiyang.entity.Foodlender;
import com.yiyang.entity.FoodlenderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FoodlenderMapper {
    long countByExample(FoodlenderExample example);

    int deleteByExample(FoodlenderExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(Foodlender record);

    int insertSelective(Foodlender record);

    List<Foodlender> selectByExample(FoodlenderExample example);

    Foodlender selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") Foodlender record, @Param("example") FoodlenderExample example);

    int updateByExample(@Param("record") Foodlender record, @Param("example") FoodlenderExample example);

    int updateByPrimaryKeySelective(Foodlender record);

    int updateByPrimaryKey(Foodlender record);
}