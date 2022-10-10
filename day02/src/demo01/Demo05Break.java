package demo01;
/*
break语句：
在switch语句：终止某个case并跳出switch结构
循环语句中使用：跳出循环语句，执行后面的代码
 */
public class Demo05Break {
    public static void main(String[] args) {
        int x =1;
        while(x <=4){
            System.out.println("x=" + x);
            //当x等于3 时终止，只会打印到x=3,程序停止执行！！！
            if (x == 3){
                break;
            }
            x++;
        }
    }
}
