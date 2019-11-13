package com.yiyang.dao;

import com.yiyang.entity.Service;
import com.yiyang.entity.ServiceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ServiceMapper {
    long countByExample(ServiceExample example);

    int deleteByExample(ServiceExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(Service record);

    int insertSelective(Service record);

    List<Service> selectByExample(ServiceExample example);

    Service selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByExample(@Param("record") Service record, @Param("example") ServiceExample example);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
}