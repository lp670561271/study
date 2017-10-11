package com.study.design.visitor;

import com.study.design.state.Context;
import com.study.design.state.State;

/**
 * Created by Administrator on 2017/10/11.
 */
public class Test {
    public static void main(String [] args){
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
