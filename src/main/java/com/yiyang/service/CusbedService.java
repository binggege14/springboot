package com.yiyang.service;

import com.yiyang.entity.CusBed;

public interface CusbedService {
    //注册床位
    int regiter(CusBed bed);

    //查找
    CusBed getCusBed(Long id);

    //编辑床位信息
    int editCusBed(CusBed bed);

    //删除床位
    int delCusBed(Long id);
}
