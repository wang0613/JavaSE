package cn.itcast.day16_17.demo01;

import java.util.Arrays;

/*
对一个字符串的数值进行从大到小的排序
20 78 9 -7 88 36 29

思路：
1. 空格连接 分割为小字符串
2. 字符串转换为基本数据类型 使用包装类
 */
public class WrapperTest01 {
    public static void main(String[] args) {

        String numString = "20 78 9 -7 88 36 29";
        System.out.println(numString);
        String temp = sortString(numString);
        System.out.println(temp);

    }
    public static String sortString(String number) {

        //1.将字符串变成字符串数组
        String[] arr = splitString(number);
        //2.将字符串数组变成int数组
        int [] intArray = toIntArray(arr);
        //3.Int数组排序
        mySortArray(intArray);
        //4 排序后的int数组变成字符串
        String result  = toString(intArray);
        return result;
    }
    public static String[] splitString(String number) {

        String[] str_arr = number.split(" ");

        return  str_arr;
    }
    public static int[] toIntArray(String [] str_arr) {

        int [] arr = new int[str_arr.length];

        for (int i = 0; i < arr.length; i++) {
            //利用Integer中的parseInt 转化为Int
             arr[i] = Integer.parseInt(str_arr[i]);
        }
        return arr;

    }
    public static void mySortArray(int []arr) {
        Arrays.sort(arr);
    }

    public static String toString(int []arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1) {
                sb.append(arr[i]+" ");
            } else  {
                sb.append(arr[i]);
            }

        }
        return sb.toString();
    }


}
