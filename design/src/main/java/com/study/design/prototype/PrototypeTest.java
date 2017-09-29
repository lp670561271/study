package com.study.design.prototype;

import java.io.IOException;

/**
 * Created by Administrator on 2017/9/29.
 */
public class PrototypeTest {

    public static void main(String [] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype("1");
        Prototype prototype1 = (Prototype) prototype.clone();
        Prototype prototype2 = (Prototype) prototype.deepClone();
        prototype.getObj().setName("propotype");

        System.out.println("propotype1 string : "+ prototype1.getString() +" " + prototype1.getObj().getName());
        System.out.println("propotype2 string : "+ prototype2.getString() +" "+ prototype2.getObj().getName());
    }
}
