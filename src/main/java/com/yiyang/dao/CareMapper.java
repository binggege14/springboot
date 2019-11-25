package com.yiyang.dao;

import java.util.List;
import java.util.Map;

import com.yiyang.entity.Care;
import com.yiyang.entity.CareExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
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
    Care selectByName(String name);
    List<Care> CareList(@Param("firstIndex") int firstIndex,@Param("lastIndex") int lastIndex);
    List<Care> selectAll();
    List<Care> selectByKey(String key);
    List<String> selectNames();
}