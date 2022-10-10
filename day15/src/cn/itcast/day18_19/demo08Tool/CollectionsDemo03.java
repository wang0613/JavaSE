package cn.itcast.day18_19.demo08Tool;

import cn.itcast.day18_19.Comparator.ComparatorByLength;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class CollectionsDemo03 {
    public static void main(String[] args) {
//        show();
        show01();
    }

    //replaceAll(); 替换元素     fill(List l, T obj)替换集合中所有元素 。
    private static void show01() {
        List<String> list = new ArrayList<String>();
        list.add("abc12");
        list.add("abc23");
        list.add("abc98");
        list.add("abc89");
        System.out.println("Old:list = " + list);

        Collections.replaceAll(list, "abc98", "abc45"); //更换元素
        //set(int indexOf(element),element)--->两个方法合二为一

        Collections.fill(list,"abc");//替换集合中所有的元素

        System.out.println("New：list = " + list);

    }

    // reverseOrder();方法演示
    public static void show() {
   /*     TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int temp = o2.compareTo(o1); //倒叙打印
                return temp;
            }
        });*/

        // 传入比较器 ：自然排序的反转
//        TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
        //利用长度排序
//        TreeSet<String> ts = new TreeSet<String>(new    ComparatorByLength());
        //长度的反转排序
        TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparatorByLength()));
        ts.add("abc");
        ts.add("nabb");
//        ts.add("nabb"); 不允许重复元素
        ts.add("nba");
        ts.add("li");
        ts.add("zzz");
        ts.add("z");
        System.out.println("ts = " + ts);
    }


}
