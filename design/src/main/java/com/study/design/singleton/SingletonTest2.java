package com.study.design.singleton;

import java.util.Vector;

/**
 * Created by Administrator on 2017/9/28.
 */
public class SingletonTest2 {
    private static SingletonTest2 instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }

    private SingletonTest2() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonTest2();
        }
    }

    public static SingletonTest2 getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties() {
        SingletonTest2 shadow = new SingletonTest2();
        properties = shadow.getProperties();
    }
}
