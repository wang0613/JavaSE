package cn.itcast.day16_17.demo01;
/*
1.5版本新特性： 自动装箱拆箱
 */
public class WrapperDemo02 {
    public static void main(String[] args) {

        Integer i = 3 ; // new Integer(3)自动装箱 简化书写

        i  = i +3; // i= new Integer(i.intValue()) +3;   //i.intValue()自动拆箱
//        System.out.println(i);  //6

        Integer a = new Integer(127);
        Integer b = new Integer(127);
        System.out.println(a==b); //false
        System.out.println(a.equals(b)); //true

        //jdk 1.5以后，自动装箱，如果是一个字节，那么该数据会被共享不会重新开辟空间
        Integer x  = 128;
        Integer y = 128;
        System.out.println(x==y); //127 true 分水岭  128 false
        System.out.println(x.equals(y)); //true

//        show(55);
    }
    public static void show(Object o) { //Object o = new Integer(55); 多态
        System.out.println("o = " + o);
    }
}
