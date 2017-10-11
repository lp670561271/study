package com.study.design.visitor;

/**
 * Created by Administrator on 2017/10/11.
 */
public class MyVisitor implements Visitor {
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
