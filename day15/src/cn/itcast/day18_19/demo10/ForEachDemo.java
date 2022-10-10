package cn.itcast.day18_19.demo10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * jdk 1.5: foreach语句：
 * 格式：
 *      for(类型 变量 ：Collection集合 || 数组){
 *
 *          }
 *  传统for 和高级for的区别？
 *     1.传统for可以完成对语句执行很多次，可以自定义循环次数和条件。
 *       而高级for是一种简化的形式
 *       他必须有被遍历的目标。该目标要么是数组，要么是Collection单列集合。
 *     2.对于数组的遍历，如果仅仅是获取数组中的元素，那么foreach就完了
 *     如果要对数组的角标进行操作，建议使用普通for循环
 */
public class ForEachDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("ABC1");
        list.add("ABC2");
        list.add("ABC3");
        list.add("ABC4");


//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String s = it.next();
//            System.out.println("s = " + s);
//        } 【被替换】

        //iter 快捷键：就是把迭代动作简化为一个语句
        for (String s : list) {
            System.out.println(s);
        }

        int []arr = {20,5,10,5};
        for (int i : arr) {
            System.out.println("i = " + i);
        }
        /*可以使用foreach遍历map集合吗？

            不能，map是双列，但是可以将map转成单列的Set，就可以用了
         */
        Map<Integer,String> map = new HashMap<>();
        map.put(3,"李四");
        map.put(1,"wangyi");
        map.put(8,"wang");
        map.put(9,"张三");

        //高级for循环的两种迭代器形式
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key +"," +value);
        }

        for (Map.Entry<Integer, String> me : map.entrySet()) {
            System.out.println(me.getKey()+","+me.getValue());

        }

    }
}
