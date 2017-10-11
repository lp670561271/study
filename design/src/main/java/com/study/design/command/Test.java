package com.study.design.command;

import com.study.design.chain.MyHandler;

/**
 * Created by Administrator on 2017/10/11.
 */
public class Test {
    public static void main(String [] rags){
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
