package com.yiyang.controller;

import com.yiyang.entity.YyUser;
import com.yiyang.service.YyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YyUserController {

    @Autowired
    private YyUserService yyUserService;

    //按编号查找用户
    @RequestMapping("/yyUser/get/{id}")
    public @ResponseBody
    String getYyUser(@PathVariable("id") Long id){
        YyUser yyUser=yyUserService.getYyUser(id);
        return "id:"+yyUser.getId()+",name:"+yyUser.getStaffName();
    }

    //删除用户
    @RequestMapping("/yyUser/del/{id}")
    public @ResponseBody void delYyUser(@PathVariable("id") Long id){
        yyUserService.delYyUser(id);
    }

    //登录
    @RequestMapping("/yyUser/login/{staff_number}&{staff_pwd}")
    public @ResponseBody String login(@PathVariable("staff_number") String staff_number,@PathVariable("staff_pwd") String staff_pwd){
        YyUser yyUser=yyUserService.login(staff_number,staff_pwd);
        return "id:"+yyUser.getId()+",name:"+yyUser.getStaffName()+",del:"+yyUser.getDelFlag();
    }

    //修改密码
    @RequestMapping("/yyUser/updatePwd/{staff_number}&{staff_pwd}")
    public @ResponseBody void updatePwd(@PathVariable("staff_number") String staff_number,@PathVariable("staff_pwd") String staff_pwd){
        yyUserService.updatePwd(staff_number,staff_pwd);
    }
}
