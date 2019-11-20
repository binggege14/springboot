package com.yiyang.service;

import com.yiyang.entity.Foodlender;
import com.yiyang.entity.FoodlenderExample;

import java.util.List;

public interface FoodlenderService {
    //增
    int add(Foodlender fdl);
    //删
    int delete(int id);
    //改
    int edit(Foodlender fdl);
    //查
    List<Foodlender> getfoods(FoodlenderExample example);
    Foodlender selectByPrimaryKey(byte id);
}
