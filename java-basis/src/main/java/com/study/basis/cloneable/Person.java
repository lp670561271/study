package com.study.basis.cloneable;

/**
 * Created by Administrator on 2017/9/29.
 */
public class Person implements Cloneable {
    private Name name;
    private int age;

    public Person(Name name, int age) {
        this.name = name;
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
