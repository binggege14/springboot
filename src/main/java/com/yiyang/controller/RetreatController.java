package com.yiyang.controller;

import com.yiyang.entity.Retreat;
import com.yiyang.service.RetreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RetreatController {
    @Autowired
    private RetreatService retreatService;

    @RequestMapping("/retreat/get/{id}")
    public @ResponseBody String getRetreat(@PathVariable("id") Long id){
        Retreat retreat = retreatService.getRetreat(id);
        return retreat.getId()+"\t"+retreat.getStatu();
    }

    @RequestMapping("/retreat/update/{id}&{status}")
    public @ResponseBody
    void updateStatus(@PathVariable("id") Long id,@PathVariable("status") String status){
        retreatService.updateStatus(id, status);
    }
}
