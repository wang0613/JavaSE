package cn.itcast.demo01;

import java.util.ArrayList;

/*
ArrayList中的常用方法有：
public boolean add(E e);像集合中添加元素，参数类型和泛型一致
public E get (int index);从集合中获取元素，参数就是索引编号，返回值就是对应的元素
public E remove (int index);从集合中是删除元素，参数就是索引编号，返回值就是删除的元素
public int size();获取结合的尺寸长度，返回值是元素中的个数
 */
public class Demo02ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]
        System.out.println("----------------------------------------");

        boolean success  = list.add("令狐冲");
        System.out.println(list);//[令狐冲]
        System.out.println("添加的动作是否成功："+ success);//添加的动作是否成功：true
        System.out.println("--------------------------------------");

        list.add("东方不败");
        list.add("葵花宝典");
        list.add("风清扬");
        String name = list.get(2);//获取集合2号索引位置的元素
        System.out.println("2号索引位置的元素是："+ name);//2号索引位置的元素是：葵花宝典
        System.out.println("--------------------------------------------");

        //从机和中删除元素。remove索引值从0开始。
        String wholeMoved = list.remove(2);
        System.out.println("被删除的元素是：" + wholeMoved);//被删除的元素是：葵花宝典
        System.out.println("***********************************");

        //获取集合的长度
        int size = list.size();//返回值接收一下
        System.out.println("结合的长度是：" + size);//结合的长度是：3
        System.out.println("------------------------------------------");

        //结合的遍历{itli}快捷键
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "、");
        }
    }
}