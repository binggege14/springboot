package com.yiyang.service.impl;

import com.yiyang.dao.RetreatMapper;
import com.yiyang.entity.Retreat;
import com.yiyang.service.RetreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("RetreatService")
public class RetreatServiceImpl implements RetreatService {

    @Autowired
    private RetreatMapper retreatMapper;

    @Override
    public int add(Retreat retreat) {
        return retreatMapper.insert(retreat);
    }

    @Override
    public Retreat getRetreat(Long id) {
        return retreatMapper.selectByPrimaryKey(id.intValue());
    }

    @Override
    public int updateStatus(Long id, String Status) {
        return retreatMapper.updateStatus(id.intValue(),Status);
    }
}
