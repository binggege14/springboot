package com.yiyang.service;

import com.yiyang.entity.YyUser;

public interface YyUserService {

    //注册用户
    int regiter(YyUser yyUser);

    //按条件查找用户
    YyUser getYyUser(Long id);

    //编辑用户
    int editYyUser(YyUser yyUser);

    //删除用户
    int delYyUser(Long id);

    //用户登录
    YyUser login(String staffNumber,String staffPwd);

    //修改密码
    int updatePwd(String staffNumber,String staffNPwd);
}
