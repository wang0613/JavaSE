package demo01;
/*
do ··while 循环语句：
格式：
do {
    执行语句
} while （循环条件）；

do后面是执行语句意味着：循环体会无条件执行一次（while语句的区别）
然后再根据循环条件是否满足来决定是否继续执行！！！！

 */
public class Demo02DoWhile {
    public static void main(String[] args) {
        int x =1;
        //先执行一次x = 1；
        do {
            System.out.println("x = " + x);
            x++;
        } while (x <= 4);
        //x自增一直到x自增为5，不满足条件结束do while循环。
    }
}
