package cn.itcast.day16_17.demo03;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        //list接口
        List li = new ArrayList();

        show(li);

    }
    public static void show(List list) {

        //添加元素
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");
        System.out.println("list = " + list);

        //指定位置的元素
        list.add(1,"abc9");


        //删除元素 可以删除索引 或者内容
        list.remove("abc4");
//        System.out.println("remove:"+list.remove(2)); //返回被删除的元素 abc3

        //修改元素
        System.out.println("Set:" +list.set(1,"abc1")); //Set:abc2

        //获取元素
        System.out.println("get:"+ list.get(0)); //java.lang.IndexOutOfBoundsException

        //获取子列表
        System.out.println("subList:"+ list.subList(0,1));






    }
}
