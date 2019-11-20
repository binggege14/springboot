package com.yiyang.service;

import com.yiyang.entity.Service;
import com.yiyang.entity.ServiceExample;

import java.util.List;

public interface ServiceService {
    int add(Service service);
    int delete(int id);
    int update(Service service);

    List<Service> getserves(ServiceExample example);
    Service selectkey(int id);
}
