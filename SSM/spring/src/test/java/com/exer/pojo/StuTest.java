package com.exer.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StuTest {
    @Test//ioc容器测试
    public void testIOC(){
        //获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Stu stu = (Stu) ioc.getBean("stu");
        //通过ioc容器中的getBean方法获取bean，注意：若有两个不相同id的bean，但相同类型的bean则会报错
        Stu stu = ioc.getBean(Stu.class);
        Per bean = ioc.getBean(Per.class);
        System.out.println(stu);
        System.out.println(bean);
    }
    @Test
    public void testIOC2(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Stu stu = ioc.getBean("stu2", Stu.class);
        System.out.println(stu);
    }
    @Test//获取学生对象
    public void testIOC3(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Stu stu = ioc.getBean("stu", Stu.class);
        System.out.println(stu);
    }
    @Test
    public void testIOC4(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz clazz = ioc.getBean("clazz", Clazz.class);
        System.out.println(clazz);
    }
    @Test
    public void testPNamespace(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        PNamespace bean = ioc.getBean(PNamespace.class);
        System.out.println(bean);
    }
}
