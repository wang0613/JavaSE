package cn.itcast.demo11;
/*
super语句必须定义在构造函数的第一行。
super和this只能有一个，而且必须是第一行。
 */
public class Zi extends Fu{
    int num;

    Zi() {
//        super(); //默认赠送的，调用的是父类空参数的构造函数
//        super(20);
        System.out.println("Zi run");
//        return; 隐士的
    }

}
