package com.study.design.bridge;

/**
 * Created by Administrator on 2017/9/30.
 */
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
