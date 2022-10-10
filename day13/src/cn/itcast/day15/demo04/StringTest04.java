package cn.itcast.day15.demo04;

/*
模拟trim功能，去除字符串两端的空白
1.定义两个变量，
    一个作为从头开始判断字符串空格的角标，不断++
    一个作为从尾开始判断字符串空格的角标，不断--
2.判断到不是空格为止，取头尾之间的字符串即可

 */
public class StringTest04 {
    public static void main(String[] args) {

        String s = "   a  b   c    ";
        String s1 = myTrim(s);
        System.out.println("s1 = " + s1);


    }

    public static String myTrim(String s) {
        int start = 0, end = s.length()-1;

        while ((start <= end) && (s.charAt(start) == ' ')) {
            start++;
        }
        while ((start <= end) && (s.charAt(end) == ' ')) {
            end--;
        }
        return s.substring(start,end+1);
    }
}
