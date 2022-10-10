package cn.it.io.p2.objectstream.bean;

import java.io.Serializable;

//实现可序列化
public class Person implements Serializable  /*标记接口*/ {
    /**
     * Serializable:同于给被序列化的类加上ID号
     * 用于判断类和对象是否是同一个版本
     */
    private static final long serialVersionUID = 9527l; //声明id号
    /**
     * transient: 非静态数据不想被序列化，可以使用这个关键字修饰
     */
    public transient String name;
    private static int age; //静态的东西，无法写入到内存中，静态在方法区中的静态区

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
