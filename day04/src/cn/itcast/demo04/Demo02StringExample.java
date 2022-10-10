package cn.itcast.demo04;

import java.util.Scanner;

/*
键盘输入一个字符串，统计其中各种字符的出现次数：大小字母，数字，其他
思路：
1.Scanner 输入字符串 四个变量 一一检查String -----char【】 遍历检查判 变量++
 */
public class Demo02StringExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String in = input.next();
        int upperCount = 0;//大写字母
        int lowerCount = 0;//小写字母
        int numberCount = 0;//数字
        int otherCount = 0;//其他
        //把字符串转换为一个字符数组
        char[] chars = in.toCharArray();
        //遍历 那个东西接收一下
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

         if ('A' <= ch && ch <= 'Z'){
             upperCount++;
         }else if ('a' <= ch && ch <= 'z'){
             lowerCount++;
         }else if ('0' <= ch && ch <= '9' ){
             numberCount++;
         }else{
             otherCount++;
         }
        }
        System.out.println("大写字母有："+ upperCount);
        System.out.println("小写字母有："+ lowerCount);
        System.out.println("数字有："+ numberCount);
        System.out.println("其他有："+ otherCount);

    }
}
