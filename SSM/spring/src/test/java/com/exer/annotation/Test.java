package com.exer.annotation;

import com.exer.annotation.controller.UserController;
import com.exer.annotation.dao.UserDao;
import com.exer.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test1(){
        ApplicationContext ioc =new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserController bean = ioc.getBean(UserController.class);
//        bean.saveUser();
        System.out.println(bean);
        UserService userService = ioc.getBean(UserService.class);
        System.out.println(userService);
        UserDao userDao = ioc.getBean(UserDao.class);
        System.out.println(userDao);

    }
    @org.junit.Test
    public void test2(){
        ApplicationContext ioc =new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserDao userDao = ioc.getBean("userDaoImpl", UserDao.class);
        System.out.println(userDao);

    }
    @org.junit.Test
    public void test3(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserController bean = ioc.getBean(UserController.class);
        bean.saveUser();
    }
}
