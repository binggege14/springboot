package com.yiyang.service.impl;

import com.yiyang.dao.CheckinMapper;
import com.yiyang.entity.Checkin;
import com.yiyang.service.CheckinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("CheckinService")
public class CheckinServiceImpl implements CheckinService {
    @Autowired
    private CheckinMapper checkinMapper;

    @Override
    public int add(Checkin checkin){
        return  checkinMapper.insert(checkin);
    }
    @Override
    public int delet(int id){
        return  checkinMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Checkin checkin) {
        return checkinMapper.updateByPrimaryKey(checkin);
    }

    @Override
    public ArrayList<Checkin> getCheckin() {
        return (ArrayList<Checkin>) checkinMapper.selectByExample();
    }


}
