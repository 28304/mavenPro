package com.exer.controller;

import com.exer.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Controller
public class TestAjaxController {
    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, @RequestBody Map<String,Object> map, HttpServletResponse response) throws IOException {
        System.out.println(id);
        System.out.println(map);
        response.getWriter().write("hello,ajax");
    }
    @RequestMapping("/test/ajaxResponseBody")
    @ResponseBody
    public User testAjaxResponse(){
        User admin = new User(1001, "admin", "123456");
        return admin;
    }
    @RequestMapping("/test/ajaxRequestBody")
    @ResponseBody
    public User testAjaxRequestBody(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}
