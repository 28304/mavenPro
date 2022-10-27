package com.exer.proxy;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int ret=i+j;
        System.out.println("内部add方法");
        return ret;
    }

    @Override
    public int sub(int i, int j) {
        int ret=i-j;
        System.out.println("内部sub方法");
        return ret;
    }

    @Override
    public int mul(int i, int j) {
        int ret=i*j;
        System.out.println("内部mul方法");
        return ret;
    }

    @Override
    public int div(int i, int j) {
        int ret=i/j;
        System.out.println("内部div方法");
        return ret;
    }
}
