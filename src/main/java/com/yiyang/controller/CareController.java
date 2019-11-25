package com.yiyang.controller;

import com.alibaba.fastjson.JSON;
import com.yiyang.dao.CareMapper;
import com.yiyang.entity.Care;
import com.yiyang.entity.CareExample;
import com.yiyang.service.CareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CareController {
    @Autowired
    private CareService careService;
    @RequestMapping(value="care",method = RequestMethod.POST)
    @ResponseBody
    public void insertCare(Care care){
        careService.insertSelective(care);
//        System.out.print(care.getName());

    }
    @RequestMapping(value="care/selectbykey",method = RequestMethod.POST)
    @ResponseBody
    public String select(String key){
        String keyword = "%" + key + "%";
        return JSON.toJSONString(careService.selectByKey(keyword));

    }
    @RequestMapping(value="care/list",method = RequestMethod.POST)
    @ResponseBody
    public String CareList(){

        return JSON.toJSONString(careService.selectAll());
    }
    @RequestMapping(value="care/del",method = RequestMethod.POST)
    @ResponseBody
    public void del(long id){
       System.out.print(id);
       careService.deleteByPrimaryKey(id);
    }
    @RequestMapping(value="care/selectnames",method = RequestMethod.POST)
    @ResponseBody
    public String selectNames(){
        List<String> names=new ArrayList<>();
      List<Care> cares=careService.selectAll();
      for (int i=0;i<cares.size();i++){
          names.add(cares.get(i).getName());
      }
        return JSON.toJSONString(names);
    }
    @RequestMapping(value="care/change",method = RequestMethod.POST)
    @ResponseBody
    public void update(Care care){

        careService.updateByPrimaryKeySelective(care);
    }



}
