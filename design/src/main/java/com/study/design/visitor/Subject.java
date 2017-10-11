package com.study.design.visitor;

/**
 * Created by Administrator on 2017/10/11.
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}
