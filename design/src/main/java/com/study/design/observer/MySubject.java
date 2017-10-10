package com.study.design.observer;

/**
 * Created by Administrator on 2017/10/10.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
