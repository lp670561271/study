package com.study.design.chain;

/**
 * Created by Administrator on 2017/10/11.
 */
public class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
