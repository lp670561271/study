package com.study.design.command;

/**
 * Created by Administrator on 2017/10/11.
 */
public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command = command;
    }
    public void action(){
        command.exe();
    }
}
