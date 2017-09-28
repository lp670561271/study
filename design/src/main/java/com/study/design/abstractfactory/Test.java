package com.study.design.abstractfactory;

/**
 * Created by Administrator on 2017/9/28.
 */
public class Test {

    public static void main(String [] args){
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
