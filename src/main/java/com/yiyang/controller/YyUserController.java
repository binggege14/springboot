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
}
