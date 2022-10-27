package com.exer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestRestController {
//    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAllUser(){
        System.out.println("getAllUser");
        return "success";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("getUserById........"+id);
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertUser(){
        System.out.println("insertUser:post");
        return "success";
    }
    //注意浏览器只能发送get和post请求
    //要发送put和delete请求必须在web.xml里配置一个过滤器HiddenHttpMethodFilter
    //配置过滤器后发送的请求必须满足两个条件，才能将请求方式转换为put和delete
    //1.当前请求必须为post
    //2.配置<input type="hidden" name="_method" value="put">，name属性必须为_method
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUser(){
        System.out.println("updateUser:put");
        return "success";
    }
//    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable("id") Integer id){
        System.out.println("deleteUserById:::::::"+id);
        return "success";
    }

}
