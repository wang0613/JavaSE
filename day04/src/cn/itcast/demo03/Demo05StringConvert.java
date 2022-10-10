package cn.itcast.demo03;
/*
String类中与转换相关的方法：
public char[]toCharArray（）；将当前的字符串拆分成字符数组作为返回值
public byte[]getBytes（）；获取当前字符串底层的字节数组
public String replace（charSequence oldString ， charSequence new String）;
将所有出现的老字符串替换为新的字符串，返回新的字符串
 */
public class Demo05StringConvert {
    public static void main(String[] args) {
        //转换为字节数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);//H
        System.out.println(chars.length);//5

        //转化成字节数组
        byte[]bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]+ "\t");//97,98,99

        }
        //转换成新的字符串
        String string = "Hello";
        String s = string.replace("l", "o");
        System.out.println("\n"+s);//Heooo
    }
}
