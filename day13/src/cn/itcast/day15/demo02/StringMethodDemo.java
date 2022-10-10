package cn.itcast.day15.demo02;

/*
String方法演示
 */
public class StringMethodDemo {
    /**
     * 1.获取字符串的长度和个数:
     * int length
     * 2.根据位置获取字符
     * Char charAt(int ch);
     * 3.根据字符串获取字符第一次出现的位置
     * int indexOf(int ch);
     * int indexOf(int ch,int fromIndex);
     * int indexOf(String str);
     * int indexOf(String str,int fromIndex);
     * 4：返回字符在字符串最后一次出现的位置
     * int lastIndexOf(int ch);
     * int lastIndexOF(int ch, int fromIndex)
     * int lastIndexOF(String str)
     * int lastIndexOF(String str, int fromIndex)
     * 5.获取字符串的一部分字符串：也叫子串
     * String subString(int beginIndex)
     * String subString(int beginIndex, int endIndex);
     */
    public static void main(String[] args) {
        getLength();
    }

    public static void getLength() {
        String str = "abccode";
        System.out.println(str.length());
        System.out.println(str.charAt(2));//c

        //越界的异常为:StringIndexOutOfBoundsException 数组角标异常
        System.out.println(str.indexOf("a"));//0  ，没有表示-1
        //可以根据-1，判断字符或字符串是否存在

        System.out.println(str.lastIndexOf('d'));//5
    }
}