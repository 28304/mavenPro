package com.exer.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void testShow(){
        //获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取ioc容器中的对象
        HelloWorld helloworld = (HelloWorld) ioc.getBean("helloworld");
        helloworld.show();
    }
}
