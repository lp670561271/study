package com.study.design.strategy;

/**
 * Created by Administrator on 2017/10/9.
 */
public class Plus extends AbstractCalculator implements ICalculator {

    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
