package cn.itcast.demo08;

public class StaticDemo {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.speak();      //   Person run  哇哇哇哇！  name baby
        Person p2 = new Person("旺财");
        p2.speak();     //  Person run  哇哇哇哇！  name 旺财

        Person.show();  //show run 这个跟创建对象有关系

    }
}
