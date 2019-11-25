package com.yiyang.service;

import com.yiyang.entity.Outgoing;

public interface OutgoingService {

    //添加外出信息
    int add(Outgoing outgoing);

    //按条件查询查询
    Outgoing getOutgoing(Long id);

    //修改审批状态.时间以后加
    int updateStatus(Long id,String Status);
}
