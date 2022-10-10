package cn.itcast.day15.demo02;

/*
String ：转换
    分割字符串：
    String []    split(String regex)正则表达式
    将字符串转化为字符数组
    char []      toCharArray()  //单个字符
    将字符串转换为字节数组
    byte[]       getBytes();
    将字符串的字母转换为小写
    String       toUpperCase();
    String       toLowerCase(); 转换为大写
    返回从替换所有出现的导致一个字符串 oldChar在此字符串 newChar 。
    String       replace(char oldChar, char newChar)
    返回一个字符串，其值为此字符串，并删除任何前导和尾随空格。
    String        trim()
String ：判断
    判断两个字符串内容是否相等
    boolean       equals(object obj)
    boolean      equalsIgnoreCase(object obj) 忽略大小写
    判断是否包含指定的字符串
    boolean      contains(String str)
    测试此字符串是否以指定的前缀开头或结尾。
    boolean       startsWith(String prefix)
    boolean       endsWith(String prefix)
    在指定索引处开始的此字符串的子字符串是否以指定的前缀开头。
    boolean       startsWith(String prefix, int toffset)
    用字典顺序进行比较
    int            compareTo()  相等返回0 ，大于返回一个大于0的数
    返回 true如果，且仅当 length()为 0
    boolean       isEmpty()
 */
public class StringMethodDemo02 {
    public static void main(String[] args) {
//        splitString();
//        method();
        compare();
    }

    public static void splitString() {
        String s = "张三,李四,王五";
        String[] str = s.split(","); //根据,分割字符串

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        char[] chars = s.toCharArray(); //转换为字符数组
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

    }

    public static void method() {
        String str = "abc";
        System.out.println("ABC".toLowerCase().equals(str));//转换为小写，进行比较
        System.out.println(str.equalsIgnoreCase("ABC"));//忽略大小写

        //判断字符串是否包含的内容
        System.out.println(str.contains("a"));
    }

    public static void compare() {
        String string = "a";
        int c = string.compareTo("c");
        System.out.println("c = " + c); //-2

        System.out.println("abc".compareTo("bcd")); // -1


    }
}
