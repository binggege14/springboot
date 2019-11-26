package com.yiyang.service;

import com.yiyang.entity.Retreat;

public interface RetreatService {

    int add(Retreat retreat);

    Retreat getRetreat(Long id);

    int updateStatus(Long id,String Status);
}
