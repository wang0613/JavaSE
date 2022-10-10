package cn.itcast.demo03;
/*
分割字符串的方法：
public String []split（String regex）；按照参数的规则分割成若干部分

 */
public class Demo06StringSplit {
    public static void main(String[] args) {
        //创建一个新的字符串
        String string = "aaa,bbb,ccc";
        String[] split = string.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
