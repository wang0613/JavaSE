package cn.itcast.day18_19.demo08Tool;


import cn.itcast.day18_19.Comparator.ComparatorByLength;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections: 集合工具类
 * 里面的方法都是静态的
 * <p>
 * 如果提供给它们的集合或类对象为null，则此类的方法都抛出一个NullPointerException 。
 */
public class CollectionsDemo02  {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    //Collections工具类方法演示
    public static void demo01() {

        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("abcdef");
        list.add("nbn");
        list.add("nba");
        list.add("nbn");

//        mySort(list,new ComparatorByLength());  //按照长度排序
        Collections.sort(list, new ComparatorByLength()); //利用工具类

        System.out.println("list = " + list);
    }

    //二叉树查找（二分法）
    public static void demo02() {

        List<String> list = new ArrayList<String>();
        list.add("abc1");
        list.add("abcdef");
        list.add("nbn");
        list.add("nba");
        list.add("zzz");
//        Collections.sort(list); //排序
        System.out.println("list = " + list);

//        int index = Collections.binarySearch(list, "nba");//查询元素的位置
//        System.out.println("index = " + index);

        //获取最大值
        String max = Collections.max(list);
        System.out.println("max = " + max);

    }

    public static <T> void mySort(List<T> list, Comparator<? super T> com) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if ((com.compare(list.get(i), list.get(j))) > 0) {
                    Collections.swap(list, i, j);
                }

            }

        }

    }
}
