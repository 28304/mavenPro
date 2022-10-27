package com.exer.proxy;

public class CalculatorStaticProxy implements Calculator {

    private CalculatorImpl target;

    public CalculatorStaticProxy(CalculatorImpl target) {
        this.target = target;
    }


    @Override
    public int add(int i, int j) {
        System.out.println("日志");
        int ret = target.add(i, j);
        System.out.println("日志结果"+ret);
        return ret;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("日志");
        int ret = target.sub(i, j);
        System.out.println("日志结果"+ret);
        return ret;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("日志");
        int ret = target.mul(i, j);
        System.out.println("日志结果"+ret);
        return ret;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("日志");
        int ret = target.div(i, j);
        System.out.println("日志结果"+ret);
        return ret;
    }
}
