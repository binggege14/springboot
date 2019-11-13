package com.yiyang.service;

import com.yiyang.entity.Care;
import org.apache.catalina.Server;

/**
 * 用户接口
 */
public interface UserService {



    Care selectByPrimaryKey(Long id);




}
