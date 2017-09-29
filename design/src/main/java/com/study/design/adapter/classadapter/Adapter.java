package com.study.design.adapter.classadapter;

/**
 * Created by Administrator on 2017/9/29.
 */
public class Adapter extends Source implements Targetable {
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
