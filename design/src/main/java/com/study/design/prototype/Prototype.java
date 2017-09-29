package com.study.design.prototype;

import java.io.*;

/**
 * Created by Administrator on 2017/9/29.
 */
public class Prototype implements Cloneable ,Serializable {

    private static final long serialVersionUID = -5469525782715320457L;

    private String string;

    private SerializableObject obj;

    public Prototype(String string) {
        this.string = string;
        this.obj = new SerializableObject("init");
    }

    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
         /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

    class SerializableObject implements Serializable {

        public SerializableObject(String name) {
            this.name = name;
        }

        private static final long serialVersionUID = 6077582302927433820L;

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
