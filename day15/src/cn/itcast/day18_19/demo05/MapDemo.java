package cn.itcast.day18_19.demo05;

import java.util.*;

/**
 * map集合方法演示
 */
public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
//        method(map);
//        keySetShow(map);
//        entrySetShow(map);
        getValues(map);
    }

    //1:keySet方法重点演示
    public static void keySetShow(Map<Integer, String> map) {
        map.put(8, "lisi");
        map.put(7, "wang");
        map.put(9, "zhou");
        map.put(4, "wangcai");

        //去除Map中的所有元素
        //1.通过keySet方法获取map中所有的键所在的Set集合，在通过Set的迭代器获取到每一个键
        //2.在对每一个键获取map集合的get() 获取其对应的值
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> it = keySet.iterator();
        while (it.hasNext()) {
            Integer key = it.next(); //找到了键
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }

    //2:entrySet()；方法演示
    public static void entrySetShow(Map<Integer, String> map) {
        map.put(8, "lisi");
        map.put(7, "wang");
        map.put(9, "zhou");
        map.put(4, "wangcai");

        //通过Map转成Set就可以迭代
        //找到了另一个方法entrySet();
// 该方法将键和值的映射关系通过对象存储到了Set集合中，而这个映射关系的类型就是Map.Entry类型(结婚证)
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        //Map.Entry 是map中的内部类
        Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> me = it.next();
            Integer key = me.getKey();
            String value = me.getValue();
            System.out.println(key + ":" + value);

        }

    }

    //Collection<V> values();方法演示; 获取所有的Value,返回到集合中
    public static void getValues(Map<Integer, String> map) {
        map.put(8, "lisi");
        map.put(7, "wang");
        map.put(9, "zhou");
        map.put(4, "wangcai");

        Collection<String> values = map.values();
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    //map集合方法演示
    public static void method(Map<Integer, String> map) { //学号和姓名

        //添加元素
        System.out.println(map.put(8, "wang")); //null 返回前一个和key关联的值
        System.out.println(map.put(8, "xiaoqiang"));
        //wang, 存储相同的键，值会覆盖

        map.put(10, "niuge");
        map.put(7, "sister");
        System.out.println(map);//{7=sister, 8=xiaoqiang, 10=niuge} 无序

        //删除
//        System.out.println(map.remove(10));

        //判断
        System.out.println(map.containsKey(7)); //true

        //获取
        System.out.println(map.get(7));//sister
        System.out.println(map.get(6));//null
        System.out.println(map);


    }
}
