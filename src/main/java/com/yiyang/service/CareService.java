package com.yiyang.service;

import com.yiyang.entity.Care;
import com.yiyang.entity.CareExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CareService {
    int insertSelective(Care record);
    int deleteByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(Care record);
    List<Care> selectByExample(CareExample example);
    Care selectByName(String name);
    List<Care> CareList(@Param("firstIndex") int firstIndex,@Param("lastIndex") int lastIndex);
    List<Care> selectAll();
    List<Care> selectByKey(String key);

}
