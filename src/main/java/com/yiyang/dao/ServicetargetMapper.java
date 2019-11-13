package com.yiyang.dao;

import com.yiyang.entity.Servicetarget;
import com.yiyang.entity.ServicetargetExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ServicetargetMapper {
    long countByExample(ServicetargetExample example);

    int deleteByExample(ServicetargetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Servicetarget record);

    int insertSelective(Servicetarget record);

    List<Servicetarget> selectByExample(ServicetargetExample example);

    Servicetarget selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Servicetarget record, @Param("example") ServicetargetExample example);

    int updateByExample(@Param("record") Servicetarget record, @Param("example") ServicetargetExample example);

    int updateByPrimaryKeySelective(Servicetarget record);

    int updateByPrimaryKey(Servicetarget record);
}