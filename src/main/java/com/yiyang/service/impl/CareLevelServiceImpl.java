package com.yiyang.service.impl;


import com.yiyang.dao.CareleveMapper;
import com.yiyang.entity.Care;
import com.yiyang.entity.Careleve;
import com.yiyang.service.CareLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CareLevelService")
public class CareLevelServiceImpl implements CareLevelService {
    @Autowired
    private CareleveMapper careleveMapper;
    @Override
    public int insertSelective(Careleve record) {
        return careleveMapper.insertSelective(record);
    }

    @Override
    public List<Careleve> selectAll(){
        return careleveMapper.selectAll();
    }

    @Override
    public List<Careleve> selectByName(String name) {
        return careleveMapper.selectByName(name);
    }

    @Override
    public List<Care> selectConnect(String name) { return careleveMapper.selectConnect(name); }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return careleveMapper.deleteByPrimaryKey(id);
    }
}
