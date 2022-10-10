package cn.itcast.demo06;
/*
静态不能直接访问非静态：、
原因：因为在内存当中【先】有的静态内容，【后】又的非静态内容
静态方法当中不能有this，
原因：因为this代表当前对象，通过谁调用的方法，谁就是对象
 */
public class MyClass {
    int num ;//成员变量
    static int numStatic;//静态变量

    public void method(){
        System.out.println("这是一个成员方法!");
        //成员方法可以访问静态变量，成员变量
        System.out.println(numStatic);
        System.out.println(num);
    }
    public static void methodStatic (){
        //静态方法不能直接访问成员变量
//        System.out.println(num)
        System.out.println(numStatic);
        System.out.println("这是一个静态方法！");
//        System.out.println(this);
    }

}
