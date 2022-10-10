package cn.itcast.demo03;
/*
字符串的截取方法：
public String substring（int index）；截取从索引位置，一直到结尾，返回新的字符串
public String substring （int begin，int end），截取参数中间的字符串，
                注意事项：【begin end}左闭右开区间

 */
public class Demo04SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String substring = str1.substring(5);
        System.out.println(substring);//World

        String sub = str1.substring(0, 4);//截取0-4的内容
        System.out.println(sub);//Hell
        /*
        String str2 = "Hello";
        System.out.println(str2);//Hello
        srt2= "Java"；
        System.out.println(str2)//Java
        注意：这种写法字符串的内容依然么有发生改变
        str2中保存的是一个地址值，重新赋值只是改变了地址值

         */

    }
}
