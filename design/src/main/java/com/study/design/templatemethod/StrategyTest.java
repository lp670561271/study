package com.study.design.templatemethod;

/**
 * Created by Administrator on 2017/10/9.
 */
public class StrategyTest {
    public static void main(String [] args){
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp,"\\+");
        System.out.println(result);
    }
}
