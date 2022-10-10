package cn.itcast.day16_17.demo01;
/*
基本数据类型对象包装类：
为了方便操作基本数据类型的值，将其封装成了对象，在对象中定义了属性和行为，丰富了该数据的操作
用于描述该对象的类，就称为基本数据类型的包装类。

byte     ------> Byte
short    ------> Short
int      ------>Integer  该类能在int类型和String类型之间互相切换
long     ------>Long
float    ------>Float
double   ------>Double
char     ------>Character
boolean  ------>Boolean
该包装对象主要用于基本类型和字符串之间的转换。

基本类型---->字符串
    1.基本数据类型+“”
    2.用String类中的静态方法 valueOf（基本数据类型数值）
字符串----->基本数据类型
    1.使用包装类中的静态方法 xxx parse(xxx类型的字符串)
        int    parseInt(int类型的字符串)
        long   parseLong(Long类型的字符串)
        boolean  parseBoolean(”Boolean类型的字符串“)
        只有Character没有parse方法
    2.如果字符串被Integer进行了封装
        可以使用另一个静态方法 intValue();   将一个Integer对象转换为基本数据类型值

 */
public class WrapperDemo {
    public static void main(String[] args) {

//        System.out.println(Integer.MAX_VALUE); //int的最大值
//        System.out.println((Integer.toBinaryString(6))); //10   0 二进制

//        int num = 4;
//        Integer i = new Integer(num);
//
//        //parseInt  静态的方法，把字符串转换为 int数字
//        int x = Integer.parseInt("123");
//        System.out.println(x); //123
//
//        System.out.println(Integer.parseInt("123"+1)); //1231 1不进行运算
//        System.out.println(Integer.parseInt("123")+1);//124

//        Integer i = new Integer("123");
        //将Integer转换为基本数据类型
//        System.out.println(i.intValue());//123
        /**
         * 整数具备这不同的进制体现
         *
         * 十进制-----> 其他进制
         *
         * 其他进制 ----> 十进制
         * System.out.println(Integer.parseInt("3c",16)) 16进制的3c转换为二进制
         */
//        System.out.println(Integer.toBinaryString(60)); //二进制
//        System.out.println(Integer.toOctalString(60)); //8进制
//        System.out.println(Integer.toHexString(60)); //16进制
//
//        System.out.println(Integer.toString(60,2)); //60转化为二进制
        Integer i = new Integer("3");
        Integer i1 = new Integer("5");

        System.out.println(i == i1); //false 不同对象

        System.out.println(i.equals(i1));  //true 比较的是数组是否相同

        System.out.println(i.compareTo(i1)); // 0相等 1大 -1小
    }

}
