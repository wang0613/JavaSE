package cn.itcast.demo03;
/*
java long.String代表字符串：
1.字符串的内容永不可变
2.真是因为字符串的内容不可可改变，所以字符串是可以共享的
3.字符串效果上相当于char[]字符数组，但底层原理是byte[]字节数组
三种构造方法：
public String();创建一个空白字符串，没有任何内容。
public String (char[]array);根据字符数组的内容，来创建对应的字符串
public String （byte[]array）;根据字节数组的内容，来创建对应的字符串
 */
public class Demo01String {
    public static void main(String[] args) {
        //小括号留空，使用空参构造
        String str1 = new String();
        System.out.println(str1);//打印结果为空白

        //根据字符数组
        char[]charArray = {'A','d','g'};
        String str2 = new String(charArray);
        System.out.println(str2);//Adg

        //根据字节数组创建字符串
        byte[]byteArray = {97,98,99};//对应ABC
        String str3 = new String(byteArray);
        System.out.println(str3);//abc

        //直接创建
        String st4 = "hello";
        System.out.println(st4);


    }
}
