package com.yiyang.service.impl;

import com.yiyang.dao.YyUserMapper;
import com.yiyang.entity.YyUser;
import com.yiyang.service.YyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("YyUserService")
public class YyUserServiceImpl implements YyUserService {

    @Autowired
    private YyUserMapper yyUserMapper;

    //添加用户
    public int regiter(YyUser yyUser) {
        return yyUserMapper.insert(yyUser);
    }

    //按条件查找用户
    public YyUser getYyUser(Long id) {
        return yyUserMapper.selectByPrimaryKey(id.intValue());
    }

    //编辑用户信息
    public int editYyUser(YyUser yyUser){return yyUserMapper.updateByPrimaryKey(yyUser);}

    //删除用户
    public int delYyUser(Long id) {
        return yyUserMapper.deleteByPrimaryKey(id.intValue());
    }

    //用户登录
    public YyUser login(String staffNumber,String staffPwd){
        return yyUserMapper.login(staffNumber,staffPwd);
    }

    //修改密码
    public int updatePwd(String staffNumber,String staffNPwd){
        return yyUserMapper.updatePwd(staffNumber,staffNPwd);
    }
}
