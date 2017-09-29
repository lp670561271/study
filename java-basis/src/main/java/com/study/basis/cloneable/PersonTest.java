package com.study.basis.cloneable;

/**
 * Created by Administrator on 2017/9/29.
 */
public class PersonTest {

    public static void main(String [] args) throws CloneNotSupportedException {
        Name name = new Name("John", "Chen");
        Person person = new Person(name, 28);
        Person personOfCopy = (Person) person.clone();
        name.setFirstName("Johnny");
        name.setLastName("Qin");
        person.setAge(29);
        System.out.println(personOfCopy.getName().getFirstName() +" " + personOfCopy.getName().getLastName() + " " + personOfCopy.getAge());
    }
}
