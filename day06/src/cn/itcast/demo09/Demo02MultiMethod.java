package cn.itcast.demo09;
/*
在多态的代码中，成员方法的访问规则是：
1：看new出来的是谁就优先用谁。
口诀：
编译看左边，运行看右边。

成员变量：编译看左边，运行还看【左边。】
成员方法：编译看左边，运行还看【右边。】
 */
public class Demo02MultiMethod {
    public static void main(String[] args) {

        Fu obj = new Zi();

        //new的是子类，所以用的是子类
        obj.method();
        obj.methodFu();//子类没有，父类有，向上找到父类使用。
        //编译看左，左边是Fu，Fu中没有methodZi（）方法，所以报错。
//        obj.methodZi();
    }
}
