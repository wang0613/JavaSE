package cn.itcast.demo04;

/*
当成员变量和局部变量重名时，可以用this关键字来区分。
this(1)：指向当前对象
就是所在函数所属对象的引用。
this(2):构造函数之间相互调用
注意：只能定义在构造函数的第一行。因为初始化动作要先执行。
 */
public class Person {
    private String name;
    private int age;

    Person() {
//        this("haHa");
        name = "baby";
        age = 1;
        System.out.println("Person run");
    }

    Person(String name) {
//        name =name; 这用的都是自己栈内存中的局部变量
        this.name = name; //通过this关键字调用对象中的name
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.speak();//调用成员方法
    }

    //成员方法
    public void speak() {
        System.out.println(name + ":" + age);
    }

    //判断是不是同龄人
    public boolean compare(Person p) {
//        if (this.age == p.age) {
//            return true;
//        } else
//            return false;
        return this.age == p.age; //简短写法
    }
}
