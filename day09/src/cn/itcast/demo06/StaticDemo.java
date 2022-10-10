package cn.itcast.demo06;

public class StaticDemo {

    public static void main(String[] args) {
        Person.method();
        Person p = new Person("小强", 20);
        p.show();
    }
}
