package com.study.design.iterator;

/**
 * Created by Administrator on 2017/10/11.
 */
public interface Iterator {
    //前移
    public Object previous();
    //后移
    public Object next();
    public boolean hasNext();
    //取得第一个元素
    public Object first();
}
