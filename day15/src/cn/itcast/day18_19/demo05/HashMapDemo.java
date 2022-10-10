package cn.itcast.day18_19.demo05;

import cn.itcast.day18_19.bean.Student;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
    public static void main(String[] args) {

        /**
         * 讲学生对象(Student)和学生的归属地(String)通过键和值存储到map集合当中
         */
        HashMap<Student, String> hm = new HashMap<Student, String>();

        hm.put(new Student("liming", 38), "北京");
        hm.put(new Student("wangwu", 28), "南阳");
        hm.put(new Student("xioaqiang", 6), "深圳");
        hm.put(new Student("wangcai", 2), "广州");
        hm.put(new Student("xioaqiang", 6), "中关村");

//        Set<Student> keySet = hm.keySet();
//        Iterator<Student> it = keySet.iterator();
        Iterator<Student> it = hm.keySet().iterator();
        while (it.hasNext()) {
            Student key = it.next();
            String value = hm.get(key);
            System.out.println(key.getName() + "···" + key.getAge() + "--" + value);
        }

    }
}
