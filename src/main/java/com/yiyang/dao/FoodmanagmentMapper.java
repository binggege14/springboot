package com.yiyang.dao;

import com.yiyang.entity.Foodmanagment;
import com.yiyang.entity.FoodmanagmentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FoodmanagmentMapper {
    long countByExample(FoodmanagmentExample example);

    int deleteByExample(FoodmanagmentExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(Foodmanagment record);

    int insertSelective(Foodmanagment record);

    List<Foodmanagment> selectByExample(FoodmanagmentExample example);

    Foodmanagment selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") Foodmanagment record, @Param("example") FoodmanagmentExample example);

    int updateByExample(@Param("record") Foodmanagment record, @Param("example") FoodmanagmentExample example);

    int updateByPrimaryKeySelective(Foodmanagment record);

    int updateByPrimaryKey(Foodmanagment record);
}