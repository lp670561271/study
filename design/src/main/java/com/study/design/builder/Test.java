package com.study.design.builder;

/**
 * Created by Administrator on 2017/9/28.
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
