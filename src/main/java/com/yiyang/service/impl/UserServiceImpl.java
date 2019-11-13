package com.yiyang.service.impl;

import com.yiyang.dao.CareMapper;
import com.yiyang.entity.Care;
import com.yiyang.service.UserService;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private CareMapper careMapper;


    @Override
    public Care selectByPrimaryKey(Long id) {
        return careMapper.selectByPrimaryKey(id);
    }
}

