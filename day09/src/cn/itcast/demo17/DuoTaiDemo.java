package cn.itcast.demo17;
/*
多态中成员的特点：
1.成员变量
    编译和运行都看等号【左边】；
2.成员方法
    编译看左边中有没有调用的函数，没有则编译失败！
    运行看右边：参考右边对象有没有所调用的函数，没有则向上找。
3.静态方法
    简单说：编译和运行都看【左边】。
    对于静态方法，是不需要对象的，直接通过类名来调用！

 */
public class DuoTaiDemo {
    public static void main(String[] args) {

        //多态的写法
        Fu fu = new Zi(); //调用子类的变量
//        System.out.println(fu.num); //3，如果父类没有就会报错！！
        fu.show(); //zi show run ，没有则想上找。

        fu.method();//Fu static method run
        //静态方法可以通过类名来调用
        Zi.method();
    }
}
