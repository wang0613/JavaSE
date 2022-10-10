package cn.itcast.demo04;
/*
题目：
定义一个方法把数组{1，2，3}拼接成一个字符串，格式：[word1#word2#word3]；
 思路：
 拼接字符串：word 数组元素#，判断是不是最后一个

 */
public class Demo01StringExample {
    public static void main(String[] args) {
        int []array = {1,2,3};
        String result = formArrayToString(array);
        System.out.println(result);
    }
    public static String formArrayToString(int[]array){
        String str1 = "[";

        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                str1= str1+"word"+ array[i]+ "]";//
            }else {
                str1 = str1+"word"+array[i]+"#";
            }
        }
        return str1;
    }
}
