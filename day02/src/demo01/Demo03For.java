package demo01;
/*
for循环语句：
格式：
    for（初始换表达式；循环条件；操作表达式）{
        执行语句
    }
执行顺序：
    for（1·· 2 ···3）{
        4
    } 然后继续执行 2---3 ---4直到不满足条件循环结束
初始化表达式：【1】在程序最开始执行。只做一次
 */
public class Demo03For {
    public static void main(String[] args) {
        //案例：求1-4相加的和
        int sum = 0;
        for (int i =1; i<=4 ;i++){
            sum += i;//相当于 sum =sum +i；实现sum与i的累加
            //第一轮 sum=i+0；-->1
            //第二轮此时sum= 1，i= 2 》sum=i +1 -->3
            //第三轮为6 第四轮sum= 6 i=4 sum = 10；
        }
        System.out.println("和为：" + sum);
    }
}
