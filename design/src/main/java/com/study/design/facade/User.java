package com.study.design.facade;

/**
 * Created by Administrator on 2017/9/30.
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
