package com.yiyang.service.impl;

import com.yiyang.dao.CareMapper;
import com.yiyang.entity.Care;
import com.yiyang.entity.CareExample;
import com.yiyang.service.CareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("CareService")
public class CareServiceImpl implements CareService {
    @Autowired
    private CareMapper careMapper;

    @Override
    public int insertSelective(Care record) {
        return careMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return careMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Care record) {
        return careMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Care> selectByExample(CareExample example) {
        return careMapper.selectByExample(example);
    }

    @Override
    public Care selectByName(String name) {
        return careMapper.selectByName(name);
    }

    @Override
    public List<Care> CareList(int firstIndex, int lastIndex) {
        return careMapper.CareList(firstIndex,lastIndex);
    }

    @Override
    public List<Care> selectAll() {
        return careMapper.selectAll();
    }

    @Override
    public List<Care> selectByKey(String key) {
        return careMapper.selectByKey(key);
    }



}
