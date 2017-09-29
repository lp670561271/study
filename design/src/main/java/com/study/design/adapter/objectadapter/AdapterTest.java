package com.study.design.adapter.objectadapter;

/**
 * Created by Administrator on 2017/9/29.
 */
public class AdapterTest {

    public static void main(String [] args){
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}
