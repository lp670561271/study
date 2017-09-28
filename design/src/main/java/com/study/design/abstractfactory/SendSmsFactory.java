package com.study.design.abstractfactory;

/**
 * Created by Administrator on 2017/9/28.
 */
public class SendSmsFactory implements Provider{

    public Sender produce() {
        return new SmsSender();
    }
}
