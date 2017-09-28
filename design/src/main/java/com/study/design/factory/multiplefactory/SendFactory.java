package com.study.design.factory.multiplefactory;

/**
 * Created by Administrator on 2017/9/28.
 */
public class SendFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
