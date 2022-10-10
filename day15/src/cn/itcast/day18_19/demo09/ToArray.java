package cn.itcast.day18_19.demo09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 集合转数组
 */
public class ToArray {
    public static void main(String[] args) {
        /**
         * 集合转换为数组？
         *使用的就是Collection接口中的toArray();
         *
         * Object[]    toArray()
         * 返回一个包含此集合中所有元素的数组。
         * <T> T[]     toArray(T[] a)
         * 返回包含此集合中所有元素的数组; 返回的数组的运行时类型是指定数组的运行时类型。
         *
         * 集合转换为数组: 可以对集合中的元素操作的方法进行【限定】，不允许对其进行增删。
         */
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("abc2");
        list.add("abc3");

        /**
         *  toArray() 方法需要传入一个指定类型的数组，返回一个新数组
         *  但是长度的大小如何定义？
         *  如果长度小于集合的size，那么该方法会创建一个同类型并和集合相同的size的数组
         *  如果长度大于集合的size，那么该方法就会使用指定的数组，存储集合的元素，其他位置就位null
         *
         *  所以建议： 最后长度就指定为，集合的size。
         */
        String[] arr = list.toArray(new String[list.size()]);
        /*
        为什么要Arrays.toString(), 因为集合转换后是是引用类型的String，直接打印就是散码
        两种方法：
        1.重写toString() 方法
        2.利用工具类 Arrays.toString()
         */
        System.out.println("arr = " + Arrays.toString(arr));



    }
}
