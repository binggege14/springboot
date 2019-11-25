package com.yiyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller

public class IndexController {
    @RequestMapping("/first")
    public ModelAndView Index(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/test")
    public String test(){
        return "redirect:/yyzx1/yyzx/page/index.html";
    }


}

