package cn.itcast.day16_17.demo03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo02 {
    public static void main(String[] args) {

        List li = new ArrayList();
        show(li);
    }

    public static void show(List list) {

        list.add("abc1");
        list.add("abc2");
        list.add("abc3");


        //list的特有取出方式之一
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }


        // 获取所有的元素 因为是Collection的子类，所以可以调用iterator来
//        Iterator it = list.iterator();
        //在迭代过程中，不要使用集合操作元素，容易出现异常
        //可以使用Iterator接口中的子接口ListIterator来完成在迭代中对元素进行更多的操作
//        while (it.hasNext()) {
//            Object obj = it.next(); //java.util.ConcurrentModificationException
//
//            if (obj.equals("abc2")) {
//              list.add("abc9"); //集合和迭代器同时对元素进行操作，出现了异常
//
//            } else {
//                System.out.println("next:" + obj);
//            }
//        }
//        System.out.println(list);

        System.out.println("原列表为："+list);
        ListIterator it = list.listIterator();//获取列表迭代器对象
        //他可以实现在迭代过程中完成对元素的增删改查

        while (it.hasNext()) {
            Object obj = it.next();
            if(obj.equals("abc2")) {
//                it.add("abc9");
                it.set("abc9");
            }
        }
        System.out.println(it.hasNext()); //遍历之后没了
        System.out.println(it.hasPrevious()); //有上一个元素
        System.out.println(list);

        System.out.println("---------------");
        while (it.hasPrevious()) {
            System.out.println("hasPrevious: "+it.hasPrevious());
        }
        System.out.println(list);

    }
}
