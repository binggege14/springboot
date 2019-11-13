package com.yiyang.dao;

import com.yiyang.entity.Carehistory;
import com.yiyang.entity.CarehistoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CarehistoryMapper {
    long countByExample(CarehistoryExample example);

    int deleteByExample(CarehistoryExample example);

    int deleteByPrimaryKey(Long customid);

    int insert(Carehistory record);

    int insertSelective(Carehistory record);

    List<Carehistory> selectByExample(CarehistoryExample example);

    Carehistory selectByPrimaryKey(Long customid);

    int updateByExampleSelective(@Param("record") Carehistory record, @Param("example") CarehistoryExample example);

    int updateByExample(@Param("record") Carehistory record, @Param("example") CarehistoryExample example);

    int updateByPrimaryKeySelective(Carehistory record);

    int updateByPrimaryKey(Carehistory record);
}