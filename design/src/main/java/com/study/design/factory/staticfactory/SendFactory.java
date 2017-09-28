package com.study.design.factory.staticfactory;

/**
 * Created by Administrator on 2017/9/28.
 */
public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
