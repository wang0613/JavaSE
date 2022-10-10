package cn.itcast.demo10;

//饿汉式
/*
不让创建对象，调用方法 1.对象调用  2.类名调用【静态】
 */
public class Single { //类一加载，对象就存在了。

    //2.通过new在本类中创建一个本类对象
    private static Single s = new Single(); //静态的的访问内容必须静态的
    //s本身就是一个静态成员变量

    //1.私有化该类的构造函数
    private Single() {

    }

    //    3.定义一个共有的方法，
    public static Single getInstance() { //方法可控的，成员变量时不可控的,所以把静态成员变量私有化。
        return s; //将创建的对象返回

    }
}
