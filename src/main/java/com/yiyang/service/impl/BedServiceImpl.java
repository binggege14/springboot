package com.yiyang.service.impl;

import com.yiyang.dao.BedMapper;
import com.yiyang.entity.Bed;
import com.yiyang.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("BedService")
public class BedServiceImpl implements BedService {

    @Autowired
    private BedMapper bedMapper;


    @Override
    public int regiter(Bed bed) {
        return bedMapper.insert(bed);
    }

    @Override
    public Bed getBed(Long id) {
        return bedMapper.selectByPrimaryKey(id.intValue());
    }

    @Override
    public int editBed(Bed bed) {
        return bedMapper.updateByPrimaryKey(bed);
    }

    @Override
    public int updateBed(Long id, String bed_status) {
        return bedMapper.updateBedStatus(id.intValue(),bed_status);
    }

    @Override
    public int delBed(Long id) {
        return bedMapper.deleteByPrimaryKey(id.intValue());
    }
}
