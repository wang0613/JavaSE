package cn.itcast.p4.otherapi.Date;

import java.util.Date;

/**
 * Date : 时间
 * Data : 数据
 *           y年代表整数y - 1900 。
 * 注意：     一个月由0到11的整数表示; 0是1月，1是2月，等等; 11月12日。
 *          日期（月的一天）以通常的方式从1到31的整数表示。
 *          一小时由0到23之间的整数表示。因此，从午夜到凌晨1点的时间是小时0，从中午到下午1点的小时是12小时。
 *          一般以0〜59的整数表示。
 * 常用方法：
 * boolean after(Date when);  比较日期对象，是否在之后。
 * boolean before(Date when);  之前
 * boolean equals(Object obj)  比较两个日期来平等。
 *
 *  int   compareTo(Date anotherDate); 比较两个日期进行订购。
 *  String   toString()  将此 Date对象转换为 String的形式：
 *
 */
public class DateFDemo {
    public static void main(String[] args) {

        long time = System.currentTimeMillis(); //1970年1月一日开始
        System.out.println("time = " + time);// 1585034551982 当前时间的毫秒值

        Date d = new Date(); //将当前的时间和日期封装对象
        System.out.println("d = " + d); //Tue Mar 24 15:23:55 GMT+08:00 2020

        //将指定的毫秒值封装成对象
        Date date2 = new Date(1585034551982l) ;//long类型记得加 l
        System.out.println("date2 = " + date2);

        //日期对象转换为毫秒值
        long time1 = date2.getTime();
        System.out.println("time1 = " + time1);
    }
    /**
     * 日期对象和毫秒值之间的转换
     *
     * 毫秒值转成日期对象
     *      1.通过Date对象的构造方法完成  new Date(timeMillis);
     *      2.还可以通过setTime设置 setTime(long time);
     *      因为通过Date对象的方法的方法对该日期的各个字段（年月日）进行操作。
     *
     * 日期对象--->毫秒值
     *      1.long getTime() 返回自1970年1月1日以来，由此 Date对象表示的00:00:00 GMT的毫秒数
     *      因为可以通过具体的数值进行运算
     */
}
