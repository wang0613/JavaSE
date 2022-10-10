package cn.itcast.day18_19.demo06;

import cn.itcast.day18_19.Comparator.ComparatorByName;
import cn.itcast.day18_19.bean.Student;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        /**
         * 讲学生对象(Student)和学生的归属地(String)通过键和值存储到map集合当中
         */
        TreeMap<Student, String> tm = new TreeMap<Student, String>(new ComparatorByName());

        tm.put(new Student("liming", 38), "北京");
        tm.put(new Student("wangwu", 28), "南阳");
        tm.put(new Student("xioaqiang", 6), "深圳"); //相同的键值会被覆盖
        tm.put(new Student("wangcai", 2), "广州");
        tm.put(new Student("xioaqiang", 6), "中关村");

        Iterator<Map.Entry<Student, String>> it = tm.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Student, String> me = it.next();
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName()+":"+key.getAge()+"-"+value);
        }

    }
}
