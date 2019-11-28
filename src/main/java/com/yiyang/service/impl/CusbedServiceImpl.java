package com.yiyang.service.impl;

import com.yiyang.dao.CusBedMapper;
import com.yiyang.entity.CusBed;
import com.yiyang.service.CusbedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CusbesService")
public class CusbedServiceImpl implements CusbedService {
    @Autowired
    private CusBedMapper cusBedMapper;

    @Override
    public int regiter(CusBed bed) {
        return cusBedMapper.insert(bed);
    }

    @Override
    public CusBed getCusBed(Long id) {
        return cusBedMapper.selectByPrimaryKey(id.intValue());
    }

    @Override
    public int editCusBed(CusBed bed) {
        return cusBedMapper.updateByPrimaryKey(bed);
    }

    @Override
    public int delCusBed(Long id) {
        return cusBedMapper.deleteByPrimaryKey(id.intValue());
    }
}
