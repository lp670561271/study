package com.study.design.builder;

/**
 * Created by Administrator on 2017/9/28.
 */
public class MailSender implements Sender {

    public void send() {
        System.out.println("this is mailsender!");
    }
}
