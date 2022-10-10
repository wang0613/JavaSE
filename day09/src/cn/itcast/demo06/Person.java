package cn.itcast.demo06;

public class Person {
    private String name;
    private int age;
    static String country = "CN"; //静态变量

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() { //成员方法
        System.out.println(Person.country+ ":"+this.name+":"+this.age);
    }
    public static void method() { //静态方法

        System.out.println(Person.country);
    }

}
