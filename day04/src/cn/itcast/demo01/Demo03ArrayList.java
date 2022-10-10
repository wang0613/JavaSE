package cn.itcast.demo01;

import java.util.ArrayList;

/*
如果想使用ArrayList存储基本数据类型，必须使用对应的包装类。
基本类型         包装类：（引用类型，包装类都位于java.long包下）
int             integer
char            character
byte            Byte
short           short
long            Long

 */
public class Demo03ArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println(list);//[100, 200]
        System.out.println("***************************");

       int  num  = list.get(1);
        System.out.println(num);//200

    }

}
