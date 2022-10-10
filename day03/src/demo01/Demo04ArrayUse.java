package demo01;
/*
动态初始化数组，都有一个默认值：
整数：0
浮点数：0.0
字符：\u0000
布尔：false
引用：null
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        //动态初始化
        int []array = new int[5];
        System.out.println(array);//[I@16d3586
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
        System.out.println("------------");

        array[1] = 123;//赋值把123交给array中的1号元素
        System.out.println(array[1]);

    }
}
