package com.study.design.mediator;

/**
 * Created by Administrator on 2017/10/11.
 */
public abstract class User {
    private Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMyMediator() {
        return mediator;
    }

    public abstract void work();
}
