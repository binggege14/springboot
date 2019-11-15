package com.yiyang.controller;

import com.yiyang.entity.Care;
import com.yiyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public ModelAndView test(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping("/user/get/{uid}")
    public @ResponseBody String getUser(@PathVariable("uid") Long uid){
//        User user= userService.selectByPrimaryKey(uid);
        Care care=userService.selectByPrimaryKey(uid);

        return "{\"uid\":\""+care.getId()+"\",\"uname\":\""+care.getName()+"\"}";
    }



}
