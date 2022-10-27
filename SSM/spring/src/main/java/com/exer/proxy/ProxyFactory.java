package com.exer.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    public Object getProxy(){
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object ret = null;
                try {
                    System.out.println("日志:方法"+method.getName()+"参数："+ Arrays.toString(args));
                    ret = method.invoke(target, args);
                    System.out.println("日志结果"+ret);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("异常"+e);
                } finally {
                    System.out.println("关闭流");
                }
                return ret;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,h);
    }
}
