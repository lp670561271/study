package com.study.design.iterator;

/**
 * Created by Administrator on 2017/10/11.
 */
public class Test {

    public static void main(String [] args){
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
    }
}
