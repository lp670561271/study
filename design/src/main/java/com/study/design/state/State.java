package com.study.design.state;

/**
 * Created by Administrator on 2017/10/11.
 */
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("execute the first opt!");
    }
    public void method2(){
        System.out.println("execute the second opt!");
    }
}
