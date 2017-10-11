package com.study.design.mediator;

/**
 * Created by Administrator on 2017/10/11.
 */
public class User2 extends User {

    public User2(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
