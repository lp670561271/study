package com.study.design.decorator;

/**
 * Created by Administrator on 2017/9/29.
 */
public class DecoratorTest {
    public static void main(String[] args){
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
