package cn.itcast.demo03;
/*
比较字符串的内容：
public Boolean equals （object obj）；参数可以是任何对象
注意事项：
任何参数都能用object进行接收
 */
public class Demo02StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        char[]charArray = {'H','e','l','l','o'};
        String str2 = new String(charArray);
        System.out.println(str1.equals(str2));//true

        //public boolean equalsIgnoreCase(String str);忽略大小写进行内容比较
        String str3 = "hello";
        System.out.println(str1.equalsIgnoreCase(str3));//true


    }
}
