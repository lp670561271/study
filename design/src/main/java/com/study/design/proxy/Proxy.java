package com.study.design.proxy;

import java.util.Random;

/**
 * Created by Administrator on 2017/9/29.
 */
public class Proxy implements Sourceable {

    private Sourceable source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    public void method() {
        Random rand = new Random();
        if(rand.nextBoolean()){
            source.method();
        }else{
            System.out.println("先看你的表现，上自习以后再说");
        }
    }

    private void atfer() {
        System.out.println("after proxy!");
    }

    private void before() {
         System.out.println("before proxy!");
     }
}
