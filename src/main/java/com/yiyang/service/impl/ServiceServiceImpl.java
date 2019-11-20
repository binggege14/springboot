package com.yiyang.service.impl;

import com.yiyang.dao.ServiceMapper;
import com.yiyang.entity.Service;
import com.yiyang.entity.ServiceExample;
import com.yiyang.service.ServiceService;

import java.util.List;
@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
    private ServiceMapper serviceMapper;
    @Override
    public int add(Service service) {
        return serviceMapper.insert(service);
    }

    @Override
    public int delete(int id) {
        return serviceMapper.deleteByPrimaryKey((byte) id);
    }

    @Override
    public int update(Service service) {
        return serviceMapper.updateByPrimaryKey(service);
    }

    @Override
    public List<Service> getserves(ServiceExample example) {
        return serviceMapper.selectByExample(example);
    }

    @Override
    public Service selectkey(int id) {
        return serviceMapper.selectByPrimaryKey((byte) id);
    }
}
