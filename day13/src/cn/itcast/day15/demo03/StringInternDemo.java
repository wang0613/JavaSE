package cn.itcast.day15.demo03;
/*
String中的Intern方法：

    可以对字符串池进行操作的
 */
public class StringInternDemo {
    public static void main(String[] args) {

        String s1 = new String("abc");//new的两个
        String s2 =s1.intern();//找池子里有没有，有直接用，没有则创建一个返回
        System.out.println(s1==s2);//false

        String s3 = "abc";
        String s4 = s3.intern();
        System.out.println(s3==s4); //true




    }
}
