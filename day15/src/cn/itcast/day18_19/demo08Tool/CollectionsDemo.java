package cn.itcast.day18_19.demo08Tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections: 集合工具类
 * 里面的方法都是静态的
 * <p>
 * 如果提供给它们的集合或类对象为null，则此类的方法都抛出一个NullPointerException 。
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        demo01();

    }

    //Collections工具类方法演示
    public static void demo01() {

        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("abcdef");
        list.add("nbn");
        list.add("nba");
        list.add("nbn");

        //对list集合进行指定的排序
        Collections.sort(list); //可以对list集合进行重复元素的排序，自然排序
        System.out.println("list = " + list);


    }

    //sort方法实现原理  类型 T必须是Comparable子类，或者是T的父类
    public static <T extends Comparable<? super T>> void mySort(List<T> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {

                //其他不具备比较资格，无法compareTo
                if (list.get(i).compareTo(list.get(j)) > 0) {
//                    T temp = list.get(i);
//                    list.set(i, list.get(j));
//                    list.set(j, temp);
                    Collections.swap(list, i, j);
                }

            }

        }

    }
}
