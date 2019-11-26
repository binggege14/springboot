package com.yiyang.controller;

import com.yiyang.entity.Bed;
import com.yiyang.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BedController {

    @Autowired
    private BedService bedService;

    //查找床位
    @RequestMapping("/bed/get/{id}")
    public @ResponseBody String getBed(@PathVariable("id")Long id){
        Bed bed=bedService.getBed(id);
        return "id:"+bed.getId()+"status:"+bed.getBedStatus()+"roomnumber:"+bed.getRoomNumber();
    }

    //删除床位
    @RequestMapping("/bed/del/{id}")
    public @ResponseBody void delBed(@PathVariable("id") Long id){
        bedService.delBed(id);
    }

    //更新床位状态
    @RequestMapping("/bed/updateStatus/{id}&{status}")
    public @ResponseBody void updateBedStatus(@PathVariable("id") Long id,@PathVariable("status") String status){
        bedService.updateBed(id,status);
    }
}
