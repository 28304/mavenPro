package com.exer.controller;

import com.exer.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParamController {

    @RequestMapping("/param/servletAPI")
    public String getParamByServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+" : "+password);
        return "success";
    }
    @RequestMapping("/param")
    public String getParam(@RequestParam(value = "username",required = false,defaultValue = "null") String username,@RequestParam("password") String password){
        System.out.println(username+" : "+password);
        return "success";
    }

    @RequestMapping("/param/pojo")
    public String getParamPojo(User user){
        System.out.println(user);
        return "success";
    }

}
