package com.yiyang.service.impl;

import com.yiyang.dao.OutgoingMapper;
import com.yiyang.entity.Outgoing;
import com.yiyang.service.OutgoingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("OutgoingService")
public class OutgoingServiceImpl implements OutgoingService {

    @Autowired
    private OutgoingMapper outgoingMapper;

    @Override
    public int add(Outgoing outgoing) {
        return outgoingMapper.insert(outgoing);
    }

    @Override
    public Outgoing getOutgoing(Long id) {
        return outgoingMapper.selectByPrimaryKey(id.intValue());
    }

    @Override
    public int updateStatus(Long id, String Status) {
        return outgoingMapper.updateStatus(id.intValue(),Status);
    }
}
