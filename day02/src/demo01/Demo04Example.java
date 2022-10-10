package demo01;
/*
循环嵌套：是指在一个循环语句的循环体中再定义一个循环语句
常见在for循环中嵌套for循环
案例：
打印直角三角形
 */
public class Demo04Example {
    public static void main(String[] args) {
        int i , j;
        //外层循环控制打印行数i<=9打印9行
        for (i = 1; i <=9; i++){
            //内循环控制打印每行的个数*
            for (j = 1; j <= i; j++){
                System.out.print("*");
            }
            //第一次j等于1 打印一个*，j自增为2，j<=i c此时i= 1，false然后执行换行语句
            System.out.println("\n");
            //换行结束 执行i++,i=2,成立，再次进入内循环，j <= 2,true 执行打印2个**j=3；
            //直到i=10，i<=9,false 循环结束！！！！！
        }
    }
}
