package com.study.design.proxy;

/**
 * Created by Administrator on 2017/9/29.
 */
public class Source implements Sourceable {
    public void method() {
        System.out.println("the original method!");
    }
}
