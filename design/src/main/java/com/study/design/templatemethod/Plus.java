package com.study.design.templatemethod;

/**
 * Created by Administrator on 2017/10/9.
 */
public class Plus extends AbstractCalculator{

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
