package com.exer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testViewController {
    @RequestMapping("/test/view/thymeleafView")
    public String testThymeleaf(){
        return "success";
    }
    @RequestMapping("/test/view/forward")
    public String testForward(){
        return "forward:/test/model";
    }
    @RequestMapping("/test/view/redirect")
    public String testRedirect(){
        return "redirect:/test/model";
    }
}
