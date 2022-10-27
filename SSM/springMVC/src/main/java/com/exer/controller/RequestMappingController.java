package com.exer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
//@RequestMapping("/test")
public class RequestMappingController {
    //设置请求的方式，get，post等等,不匹配时则报405错误：Request method 'GET' not supported
    @RequestMapping(
            value = {"/hello","/abc"},
            method = {RequestMethod.POST,RequestMethod.GET},
            //参数条件必须全部满足，否则报错400：参数不匹配
            params = {"username"}
    )
    public String hello(){
        return "success";
    }
    @RequestMapping("/")
    public String protal(){
        return "index";
    }
    //？表示任意的单个字符（不包括特殊符号比如；？ /）
    //* 表示任意个数的任意字符（不包括特殊符号比如；？ /）
    //** 表示任意层数的目录（解决了不能使用/的问题），只能/**/，中间不允许出现其他字符
    @RequestMapping("/a?a/test/ant")
    public String Ant(){
        return "success";
    }
//    @RequestMapping("/a*a/test/ant")
//    public String Ant2(){
//        return "success";
//    }
//    @RequestMapping("/a?a/**/ant")
//    public String Ant3(){
//        return "success";
//    }

    @RequestMapping("/test/rest/{username}/{id}")
    public String testRest(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("id=="+id+"::"+"username=="+username);
        return "success";
    }

}
