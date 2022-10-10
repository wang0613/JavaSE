package cn.itcast.day16_17.demo04;

import java.util.LinkedList;

/*
链表结构 集合
 */
public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList link = new LinkedList();

        link.addFirst("abc1");
        link.addFirst("abc2");
        link.addFirst("abc3");
        link.addFirst("abc4");

        System.out.println(link);//[abc4, abc3, abc2, abc1]
//        System.out.println(link.getFirst()); //abc4 获取第一个但不删除
//        System.out.println(link.getFirst()); //abc4

        //remove会改变长度
//        System.out.println(link.removeFirst()); //abc4 获取元素但是删除
//        System.out.println(link.removeFirst()); //abc3

//        System.out.println(link); //[abc2, abc1]

        //为空返回真，不为空删除
        while (!link.isEmpty()) {
            System.out.println(link.removeFirst());//虽然可以取得元素，但是集合中的元素无了
        }


        System.out.println(link);//[] 空集合


//        Iterator it = link.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//
//        }
    }
}
