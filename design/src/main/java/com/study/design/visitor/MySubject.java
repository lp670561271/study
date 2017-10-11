package com.study.design.visitor;

/**
 * Created by Administrator on 2017/10/11.
 */
public class MySubject implements Subject {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getSubject() {
        return "love";
    }
}
