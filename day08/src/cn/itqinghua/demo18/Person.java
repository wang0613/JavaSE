package cn.itqinghua.demo18;

public abstract class Person {
    private String name;
    private int age;

    public Person() {

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void say();
}
