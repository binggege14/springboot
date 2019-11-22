package com.yiyang.service;

import com.yiyang.entity.Bed;

public interface BedService {

    //注册床位
    int regiter(Bed bed);

    //查找
    Bed getBed(Long id);

    //编辑床位信息
    int editBed(Bed bed);

    //更新状态
    int updateBed(Long id,String bed_status);

    //删除床位
    int delBed(Long id);
}
