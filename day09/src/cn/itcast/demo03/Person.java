package cn.itcast.demo03;

/*
构造函数：构建对象时调用的函数，作用：可以给对象初始化
创建对象都必须要通过构造函数初始化。
1：一个类如果没有定义过构造函数，那么类中就会有一个默认的空参构造函数。
2：如果类中定义了指定的构造函数，那么该类中的默认构造函数将不复存在。
普通函数和构造函数的区别【重点】：
构造函数：对象创建时就会调用与之对应的构造函数，对对象进行初始化。
普通函数：对象创建后，需要该函数功能时才调用。

构造函数：对象创建时，只会调用一次。
普通函数：对象创建之后，可以调用多次。

什么时候定义构造函数：
在描述一些事物时，该事物已经具备的一些功能，这些内容都定义在构造函数中。

多个构造函数在一个函数中存在，只能有一个形势：【重载】
 */
public class Person {
    private String name;
    private int age;

    //定义一个Person类的构造函数,
    Person() {//这就是一个构造函数，并且还是空参数的
        name = "baby";
        age = 1;
        System.out.println("Person run");
    }
    //如果小孩出生就有名字
    Person(String name) {
//        name =name; 这用的都是自己栈内存中的局部变量
        this.name = name; //通过this关键字调用对象中的name
    }
    //名字和年龄
    Person(String name, int age) {
        this.name =name;
        this.age = age;
    }

    //    Person(){};若果没有定义，默认的就有一个
    //成员方法
    public void speak() {
        System.out.println(name + ":" + age);
    }
}
