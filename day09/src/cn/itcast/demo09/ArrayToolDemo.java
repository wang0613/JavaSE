package cn.itcast.demo09;

import java.lang.reflect.Array;

public class ArrayToolDemo {

    public static void main(String[] args) {
       /* int[] arr = {10, 20, 56, 87, 21};
        ArrayTool tool = new ArrayTool();

        int max = tool.getMax(arr);
        System.out.println(max);*/


        int a = 10;
         int b = 20;
         swap(a,b);
        System.out.println("a="+a+"\tb="+b);


    }
    public static void swap(int x,int y)
    {
        int temp = x;
        x = y;
        y = temp;
    }


}
