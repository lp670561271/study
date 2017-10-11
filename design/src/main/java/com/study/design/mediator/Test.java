package com.study.design.mediator;

import com.study.design.iterator.Collection;
import com.study.design.iterator.Iterator;
import com.study.design.iterator.MyCollection;

/**
 * Created by Administrator on 2017/10/11.
 */
public class Test {

    public static void main(String [] args){
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
