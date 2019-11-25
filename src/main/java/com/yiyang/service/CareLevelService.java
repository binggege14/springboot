package com.yiyang.service;

import com.yiyang.entity.Care;
import com.yiyang.entity.Careleve;

import java.util.List;

public interface CareLevelService {
    int insertSelective(Careleve record);
    List<Careleve> selectAll();
    List<Careleve> selectByName(String name);
    List<Care> selectConnect(String name);
    int deleteByPrimaryKey(Integer id);
}
