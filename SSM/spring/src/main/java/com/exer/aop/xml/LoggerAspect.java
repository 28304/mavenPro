package com.exer.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LoggerAspect {

    public void pointCut(){}

    public void beforeAdviceMethod(JoinPoint joinPoint){
        //获取链接点对应方法信息
        Signature signature = joinPoint.getSignature();
        //获取链接点对应方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知:"+signature.getName()+",参数："+ Arrays.toString(args));
    }

    public void afterAdviceMethod(JoinPoint joinPoint){
        //获取链接点对应方法信息
        Signature signature = joinPoint.getSignature();
        System.out.println("后置通知:"+signature.getName()+"在finally里执行，一般用来关闭资源");
    }

    public void AfterReturningAdviceMethod(JoinPoint joinPoint,Object ret){
        //若程序出现异常则不会执行
        //获取链接点对应方法信息
        Signature signature = joinPoint.getSignature();
        System.out.println("返回通知:"+signature.getName()+",结果："+ ret);
    }

    public void afterThrowingAdviceMethod(JoinPoint joinPoint,Throwable ex){
        //获取链接点对应方法信息
        Signature signature = joinPoint.getSignature();
        System.out.println("异常通知:"+signature.getName()+"一般用于事务回滚");
        System.out.println("异常通知:类型:"+ex);
    }


    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){
        Object ret = null;
        try {
            System.out.println("环绕通知--前置通知");
            ret = joinPoint.proceed();
            System.out.println("环绕通知--返回通知");
        } catch (Throwable throwable) {
            System.out.println("环绕通知--异常通知");
            throwable.printStackTrace();
        } finally {
            System.out.println("环绕通知--后置通知");
        }
        return ret;
    }
}
