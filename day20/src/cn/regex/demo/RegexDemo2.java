package cn.regex.demo;

public class RegexDemo2 {
    public static void main(String[] args) {

        /**
         * 正则表达式对字符串的操作：
         * 1.匹配
         *      其实用的就是String类中的 matches方法
         * 2.切割
         *      其实就是String类中的split方法 split(regex);根据简单切割
         * 3.替换
         *
         * 4.获取
         */
        showDemo_2();
    }

    //2.切割演示
    public static void showDemo_2() {
        String str = "rosettttttzhangmmmmwuzhao ";
//        String[] name = str.split("\\."); // +一次或者多次 .特殊符号代表任意字符 \\.转义
        String[] name = str.split("(.)");
        for (String n : name) {
            System.out.println("name = " + n);
        }
    }

    //1.演示匹配
    public static void showDemo_1() {
        //匹配手机号码是否正确

        String tel = "15830056412";
        String regex = "1[358]\\d{9}"; //最后9位都是0-9  \d数字0-9    \D非数字0-9

        boolean b = tel.matches(regex);
        System.out.println("tel = " + b);
    }
}
