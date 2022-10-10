package demo01;
/*
循环语句分为： while循环 do while 循环 for循环
while循环语句：
1.while 会不断地进行条件判断
2.（条件判断）条件成立 {}大括号内的执行语句就会执行
3.        直到条件不成立，while循环结束
格式：
//如果没有循环条件，就会陷入死循环！！不会结束！！！！！
    while（循环条件）{
    执行语句
    }
 */
public class Demo01While {
    public static void main(String[] args) {
        int x =1;
        while(x <= 4){
            System.out.println("x= " + x);
            x++;
            //第一次执行 X = 1，条件成立 打印，x并自增
            //直到第五次循环x自增为 x = 5，不满足条件while循环结束！
        }
    }
}
