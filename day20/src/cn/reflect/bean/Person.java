package cn.reflect.bean;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("person param run " + this.name +"···" +this.age);
    }

    public Person() {
        super();
        System.out.println("person rum");
    }

    public void show() {
        System.out.println(name + "··show run··" + age);
    }

    //私有方法
    private void method() {
        System.out.println("Person.method run");
    }

    public void paraMethod(String str, int num) {
        System.out.println("paraMethod run =  " + str + ", num = " + num);
    }

    public static void staticMethod() {
        System.out.println("Person.staticMethod run ····");
    }

}
