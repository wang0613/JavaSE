package cn.itcast.demo08;

/*
构造代码块：定义在类中
局部代码块:定义在方法中，限定变量的作用域
执行顺序：
静态代码块 》 构造代码块 》构造函数
 */
public class Person {
    private String name;

    //构造代码块，创建几次对象调用几次
    //作用：可以给所有对象初始化
    {
        System.out.println("Person run");
        cry(); //抽取共性的
    }
    //构造函数是给对应的对象进行针对性的初始化。
    Person() {
//        cry();
        name = "baby";
    }

    Person(String name) {
//        cry();
        this.name = name;

    }
    //静态方法
    static void show() {
        System.out.println("show run");
    }
    public void cry() {
        System.out.println("哇哇哇哇！");
    }
    public void speak() {
        System.out.println("name "+ name);
    }

}
