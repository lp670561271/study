package com.study.design.factory.multiplefactory;

/**
 * Created by Administrator on 2017/9/28.
 */
public class SmsSender implements Sender {

    public void send() {
        System.out.println("this is sms sender!");
    }
}
