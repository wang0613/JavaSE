package cn.regex.demo;

/**
 * 正则表达式：（正确规则）
 *
 * 正则表达式用于操作字符串数据
 * 通过一些特定的符号来体现的
 *
 * 我们为了搞定正则表达式，必须学习一些符号
 * 虽然简化了书写，但是阅读性差
 * Greedy 数量词
 * X?       X，一次或一次也没有
 * X*       X，零次或多次
 * X+       X，一次或多次
 * X{n}     X，恰好 n 次
 * X{n,}    X，至少 n 次
 * X{n,m}   X，至少 n 次，但是不超过 m 次
 */
public class RegexDemo {
    public static void main(String[] args) {

        /**
         * 需求：定义一个功能对QQ号进行校验
         *
         * 要去：长度5-15位 只能是数组 0不能开头
         */
        String qq = "12345678";

        String regex = "[1-9][0-9]{4,14}"; //正则表达式

//        boolean b = qq.matches(regex); //检测正则表达式
//        System.out.println("b = " + b); //true

        String str = "aoob";
//        String reg = "ao?b";  //o?  要么一次，要么一次都没有 才是true
//        String reg = "ao+b";  //o+ 表示 最少一次，或者多次  才是true
//        String reg = "ao*b";  // o*  0次或者多次都为true
        String reg = "ao{3}b";  // o{3} o的次数为3才是true
        boolean b = str.matches(reg);
        System.out.println("b = " + b); //false  true  true false
    }


    //未使用正则表达式
    public static void checkQQ(String qq) {

        int len = qq.length();
        if (len >= 5 && len <= 15) {

            if (!(qq.startsWith("0"))) {
                try {
                    Long l = Long.parseLong(qq); //解析字符串为 long类型
                    System.out.println(l + "正确！！！");
                } catch (NumberFormatException e) {
                    System.out.println(qq + ":含有非法字符"); //数字格式化异常
                }
            } else {
                System.out.println(qq + "：不能是0开头");
            }
        } else {
            System.out.println(qq + "：长度错误!!!");
        }
    }
}
