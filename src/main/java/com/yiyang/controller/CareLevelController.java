package com.yiyang.controller;

import com.alibaba.fastjson.JSON;
import com.yiyang.entity.Care;
import com.yiyang.entity.Careleve;
import com.yiyang.service.CareLevelService;
import com.yiyang.service.CareService;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Controller
public class CareLevelController {
    @Autowired
    private CareLevelService careLevelService;


//    @RequestMapping(value="list/{name}/{statu}/{remark}",method=RequestMethod.GET)
//    @ResponseBody
//    public ModelAndView insertCarelevel(@PathVariable String name, @PathVariable String statu, @PathVariable String remark){
//        Careleve careleve=new Careleve(name,statu,remark);
//        careLevelService.insertSelective(careleve);
//        System.out.println(name+statu+remark);
//        return null;
//    }
    @RequestMapping(value="carelevel",method = RequestMethod.POST)
    @ResponseBody
    public String SelectAll(){

        return JSON.toJSONString(careLevelService.selectAll());
    }
//    护理级别层添加
    @RequestMapping(value="carelevel/add",method = RequestMethod.POST)
    @ResponseBody
    public void Add(Careleve careleve){
//        System.out.println(careleve.getStatus());
//        System.out.println(careleve.getLevelName());
        careLevelService.insertSelective(careleve);

    }
    //    护理内容层添加
    @RequestMapping(value="carelevel/addcare",method = RequestMethod.POST)
    @ResponseBody
    public void AddCare(Careleve careleve,HttpSession session){
        careleve.setLevelName(String.valueOf(session.getAttribute("levelName")));
//        System.out.println(session.getAttribute("levelName"));
//        System.out.println(careleve.getRemarks());
//        System.out.println(careleve.getStatus());
        careLevelService.insertSelective(careleve);

    }
    @RequestMapping(value="carelevel/GetName",method = RequestMethod.POST)
    @ResponseBody
    public void GetName(String name,HttpServletRequest request){
        HttpSession session=request.getSession();

        session.setAttribute("levelName",name);
        System.out.println(name);
//        return "redirect:/yyzx1/yyzx/page/hljb_hlnrpz.html";
    }
    @RequestMapping(value="carelevel/set",method = RequestMethod.POST)
    @ResponseBody
    public String Set(HttpSession session){
       String name=String.valueOf(session.getAttribute("levelName"));

        List<Care> cares =careLevelService.selectConnect(name);

        return  JSON.toJSONString(cares);


    }
    @RequestMapping(value="carelevel/delset",method = RequestMethod.POST)
    @ResponseBody
    public void DelSet(int id){
      careLevelService.deleteByPrimaryKey(id);
    }

}
