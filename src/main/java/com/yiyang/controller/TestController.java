package com.yiyang.controller;

import com.yiyang.entity.Care;
import com.yiyang.entity.Checkin;
import com.yiyang.entity.CheckinExample;
import com.yiyang.service.CheckinService;
import com.yiyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class TestController {

    @Autowired
    private UserService userService;
    private CheckinService checkinService;

    public TestController(CheckinService checkinService) {
        this.checkinService = checkinService;
    }

    @RequestMapping("/index")
    public ModelAndView test(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping("/text")
    public ModelAndView text(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/user/get/{uid}")
    public @ResponseBody String getUser(@PathVariable("uid") Long uid){
//        User user= userService.selectByPrimaryKey(uid);
        Care care=userService.selectByPrimaryKey(uid);
        return "{\"uid\":\""+care.getId()+"\",\"uname\":\""+care.getName()+"\"}";
    }

    @RequestMapping("/checkin")
    public @ResponseBody String selectByExample(CheckinExample example){
        List<Checkin> checkins= (List<Checkin>) checkinService.selectByExample(example);
        Checkin checkin=new Checkin();
//        checkins.add(checkin);
        return "{\"id\":\""+checkin.getId()+"\",\"创建者\":\""+checkin.getCreateBy()+"\"}";

    }

    @RequestMapping("/ID")
    public @ResponseBody String selectId(Integer id){
        Checkin checkin=checkinService.selectByPrimaryKey(id);
        return "{\"id\":\""+checkin.getId()+"\",\"创建者\":\""+checkin.getCreateBy()+"\"}";
    }


}
