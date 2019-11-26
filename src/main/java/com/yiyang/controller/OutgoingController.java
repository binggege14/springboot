package com.yiyang.controller;

import com.yiyang.entity.Outgoing;
import com.yiyang.service.OutgoingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OutgoingController {
    @Autowired
    private OutgoingService outgoingService;

    @RequestMapping("/outgoing/get/{id}")
    public @ResponseBody
    String getOutgoing(@PathVariable("id") Long id){
        Outgoing outgoing=outgoingService.getOutgoing(id);
        return outgoing.getId()+"\t"+outgoing.getAuditstatus();
    }

    @RequestMapping("/outgoing/update/{id}&{status}")
    public @ResponseBody
    void updateStatus(@PathVariable("id") Long id,@PathVariable("status") String status){
        outgoingService.updateStatus(id,status);
    }
}
