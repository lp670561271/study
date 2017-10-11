package com.study.design.interpreter;

/**
 * Created by Administrator on 2017/10/11.
 */
public class Plus implements Expression {
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
