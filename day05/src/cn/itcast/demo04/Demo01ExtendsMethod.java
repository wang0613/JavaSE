package cn.itcast.demo04;
/*
在父子类的继承关系中，创建子类对象，访问成员方法规则：
1.创建的对象是谁就与优先用谁，没有则向上找
注意事项：
无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类。
 */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        zi.method();//创建的是子类对象，所以优先用子类

    }
}
