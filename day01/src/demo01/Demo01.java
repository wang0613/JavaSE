package demo01;
/*
    标识符：是指在程序中自己定义的内容，比如类名，方法名，变量名，都是标识符。
    命名规则：
        1.标识符可以是26个字母，数字，美元符号，下划线等。
        2.不能以数字开头
        3.不能是关键字
    命名规范：
        类名：大驼峰式HelloWorld
        变量名：小驼峰式
        方法名规范：小驼峰式；
*/
    /*
    常量的分类：
    1.字符串常量：凡是用双引号引起来的部分。如："abc" "HelloWorld";
    2.整数常量：直接写上数字，没有小数点，如100.255；
    3.浮点数常量：直接写上数字，有小数点 如：2.3；
    4.字符常量： 凡是用单引号引起来的【单个】字符。如：'A' '中'；
    5.布尔常量：只有两种取值：true false；
    6.空常量：null （不能直接打印）；
    */
public class Demo01 {
    public static void main(String[] args) {
        //创建一个变量
        int num1 = 10;
        num1 = 20;//重新赋值20.num1为20.
        System.out.println(num1);
        System.out.println("--------------");
        //byte 类型创建的值，不能超过左侧类型的取值范围,超过会报错。
        byte num2 = 30;
        System.out.println(num2);
        System.out.println("----------");
        short num3 = 50;
        System.out.println(num3);
        System.out.println("---------");
        /*long类型为最大的,如果long的赋值超过了int的范围，需要加上字母L或小写l；
        long > int > short > byte
        */
        long num4 = 50000000000000L;
        System.out.println(num4);
        System.out.println("-------");
        //float为单精度 必须要加F。double为双精度 d可以省略
        float num5 = 2.2f;
        double num6 = 3.33;
        System.out.println(num5);
        System.out.println(num6);
        System.out.println("-----------------");
        //char 单个字符，可以是整数，中文，字母；
        char ziFu  = '中';
        System.out.println(ziFu);
        System.out.println("-----------");
        //boolean 类型只有两种： true false；
        boolean var1 = true;
        System.out.println(var1);





    }
}
