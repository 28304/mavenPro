package com.exer.AOP;

import com.exer.proxy.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPAnnotationTest {
    @Test
    public void test1(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator bean = ioc.getBean(Calculator.class);
//        bean.add(1, 1);
//        System.out.println();
        bean.sub(2,2);
//        bean.div(1,0);
    }
}
