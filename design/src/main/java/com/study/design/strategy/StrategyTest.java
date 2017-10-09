package com.study.design.strategy;

/**
 * Created by Administrator on 2017/10/9.
 */
public class StrategyTest {
    public static void main(String [] args){
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
