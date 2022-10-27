package com.exer.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)//切面类的优先级，值越小优先级越高，默认为Integer的最大值（21亿左右）
public class ValidateAspect {
    @Pointcut("execution(* com.exer.proxy.CalculatorImpl.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void beforeAdviceMethod(){
        System.out.println("前置通知2！！！！！！！！！！！");
    }
}
