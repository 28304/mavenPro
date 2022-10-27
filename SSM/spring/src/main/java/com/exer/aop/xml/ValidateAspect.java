package com.exer.aop.xml;

import org.springframework.stereotype.Component;

@Component
public class ValidateAspect {

    public void pointCut(){}


    public void beforeAdviceMethod(){
        System.out.println("前置通知2！！！！！！！！！！！");
    }
}
