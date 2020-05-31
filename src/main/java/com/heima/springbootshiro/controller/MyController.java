package com.heima.springbootshiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping({"/","index"})
    public String index(Model model){

        model.addAttribute("msg","Hello Shiro");

        return "index";
    }

}
