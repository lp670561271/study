package com.study.design.proxy;

/**
 * Created by Administrator on 2017/9/29.
 */
public class ProxyTest {
    public static void main(String[] args){
        Sourceable source = new Proxy();
        source.method();
    }
}
