package com.yiyang.service;

import com.yiyang.entity.Checkin;

import java.util.ArrayList;
import java.util.List;

public interface CheckinService {
    //增
    int add(Checkin checkin);
    //删
    int delet(int id);
    //改
    int update(Checkin checkin);
    //查
    ArrayList<Checkin> getCheckin();
}
