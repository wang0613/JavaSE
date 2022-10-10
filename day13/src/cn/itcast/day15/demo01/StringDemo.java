package cn.itcast.day15.demo01;

/*
String类的特点：
字符串对象一旦被初始化，就不会被改变。

 */
public class StringDemo {
    public static void main(String[] args) {

//        String s = "abs";
//        s = "abc"; //指向的不是同一对象
//        String s1 = "abs";
//
//        //(1)abs因为创建在字符串常量池，如果有直接拿过来用
//        System.out.println(s==s1);//true

//        System.out.println("s = " + s);

        //(2)区别
        String s = "abc"; //在字符串常量池创建的字符串，并把值付给了s变量
        //这个是创建两个对象一个new，一个字符串对象在堆内存
        String s2 = new String("abc");
        System.out.println(s == s2);//false

        System.out.println(s.equals(s2));//true
    }

}
