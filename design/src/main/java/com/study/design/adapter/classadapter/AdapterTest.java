package com.study.design.adapter.classadapter;

/**
 * Created by Administrator on 2017/9/29.
 */
public class AdapterTest {

    public static void main(String [] args){
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
