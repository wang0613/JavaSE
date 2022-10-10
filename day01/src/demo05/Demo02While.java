package demo05;
/*
while需求：
计算1--10的和
 */
public class Demo02While {
    public static void main(String[] args) {
        int i =1;
        int sum = 0;
        //循环结构
        while (i <= 10){
            sum = sum +i;//循环中需要进行和下一个数+的运算，并让下一个数自增
            i++;
        }
        System.out.println(sum);
    }
}
