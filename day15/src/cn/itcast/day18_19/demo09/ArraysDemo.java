package cn.itcast.day18_19.demo09;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        /**
         * Arrays：集合框架工具类，里面的方法都是静态的
         */
        int[] arr = {3, 1, 2, 8, 9};

//        System.out.println(arr);//[I@7c30a502 哈希值

//        System.out.println(Arrays.toString(arr));//[3, 1, 2, 8, 9] 源码利用StringBuilder
//        demo();
        demo02();

    }

    private static void demo02() {
        /**
         * 如果数组中的元素是对象，那么转换为集合时，直接将数组中的元素作为集合中的元素进行集合存储
         *
         * 如果数组中的元素是基本数据类型，那么会将该数组作为集合中的元素进行存储
         */
        int[] arr = {30, 50, 61, 29};

        List<int[]> list = Arrays.asList(arr); //存储的是数组实体
        System.out.println("list = " + list);//[[I@7c30a502]

    }

    public static void demo() {
        /**
         *    重点 List  asList(数组)将数组转化为集合
         *        只能转换为List集合，set不允许相同元素。
         *    好处：可以使用集合中的方法操作字符串
         * 重点注意：
         *      数组的长度是固定的，所以对于集合的【增删方法】是不可以使用的，否则发生异常
         */
        String[] arrs = {"abc", "haah", "xixi"};
        List<String> list = Arrays.asList(arrs);

//        boolean xixi = list.contains("xixi");//判断是否包含
//        System.out.println("xixi = " + xixi);
        list.add("hehe"); // java.lang.UnsupportedOperationException不支持操作的异常
    }

    //实现toString()方法
    public static String myToString(int[] a) {
        if (a == null)
            return "null";

        int iMax = a.length - 1; //长度为0返回-1.打印[];
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) { //中间省略了条件判断，提高效率
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
}
