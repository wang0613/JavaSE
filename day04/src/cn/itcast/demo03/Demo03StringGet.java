package cn.itcast.demo03;
/*
String类中与获取相关的常用方法有：
public int length（），获取字符串中的所有字符个数，拿到个数
public String concat（String str），将当前的字符串和参数字符串拼接，返回值新的字符串
public char charAt（int index）获取指定位置的单个字符，索引值0开始
public int indexOf（String str）查找参数字符串中首次出现的索引位置，如果没有返回-1值

 */
public class Demo03StringGet {
    public static void main(String[] args) {
        int length = "hnvkdnmgdflkbjld".length();
        System.out.println(length);//16

        //拼接字符串,字符串时常量，拼接内容发生改变的时候，必然是产生了一个新的字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3= str1.concat(str2);
        System.out.println(str3);//HelloWorld

        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在一号索引位置的字符是："+ ch);//e

        //查找参数字符传在本来字符串但中出现的第一次索引位置，没有返回一个-1
        String or = "HelloWord";
        int index = or.indexOf("d");
        System.out.println("第一次索引位置是："+ index);//8

        System.out.println("get".indexOf("abc"));//-1


    }
}
