package com.yiyang.controller;

import com.yiyang.entity.CusBed;
import com.yiyang.service.CusbedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CusBedController {
    @Autowired
    private CusbedService cusbedService;

    //查找床位
    @RequestMapping("/cusbed/get/{id}")
    public @ResponseBody
    String getCusBed(@PathVariable("id")Long id){
        CusBed bed=cusbedService.getCusBed(id);
        return "id:"+bed.getId()+"flag:"+bed.getDelFlag();
    }

    //删除床位
    @RequestMapping("/cusbed/del/{id}")
    public @ResponseBody void delCusBed(@PathVariable("id") Long id){
        cusbedService.delCusBed(id);
    }
}
