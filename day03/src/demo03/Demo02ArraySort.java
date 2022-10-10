package demo03;

import java.util.Arrays;
/*
Arrays.sort 数组升序排列
 */
public class Demo02ArraySort {
    public static void main(String[] args) {
        int [] array = new int[]{50,2,12,78,56,23,77};
        System.out.println("排列前为：");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Arrays.sort(array);//数组升序排列的方法

        System.out.println("升序排列后为：");

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ "\t");
        }
    }
}
