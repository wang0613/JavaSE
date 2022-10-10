package cn.itcast.demo10;


/*设计模式：对问题行之有效的解决方案，其实他是一种思想。

1：单例设计模式。
    解决的问题：可以保证一个类在内存中对象的唯一性。
对于多个程序使用同一配置信息对象时，就要保证该对象的唯一性。
如何保证对象的唯一性呢？
1.不允许其他程序用new创建该类对象
2.在该类中创建一个本类实例。
3.对外提供一个方法让其他程序可以获取该对象
步骤：
1.私有化该类的构造函数
2.通过new在本类中创建一个本类对象
3.定义一个共有的方法，将创建的对象返回

 */
public class SingleDemo {
    public static void main(String[] args) {

        //不让创建对象，调用方法 1.对象调用  2.类名调用【静态】
        Single ss = Single.getInstance();//返回的是一个对象地址值

//    Single ss = Single.s;第二种方式调用，因为s本身就是一个静态成员变量 【成员变量时不可控的】

        Test t1 =Test.getInstance();
        t1.setNum(200);
        System.out.println(t1.getNum());//200

        Test t2 =Test.getInstance();
        t2.setNum(30);
        System.out.println(t2.getNum());//30





    }

}
