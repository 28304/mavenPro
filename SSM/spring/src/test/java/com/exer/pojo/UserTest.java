package com.exer.pojo;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test(){
//       ApplicationContext并没有提供刷新和销毁的方法，但它的子接口和实现类有
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
//      若没有指定多例，则默认在生成ioc容器的时候就把ioc容器里的对象创建完毕
        User bean = ioc.getBean(User.class);
        System.out.println(bean);
        ioc.close();
    }
}
