package demo03;
/*
需求：
while循环写出
1-100的和
 */
public class Demo01Count {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100){
            sum = sum + i;//对sum进行累加
            i++;
        }
        System.out.println("1-100的总数是"+ sum);//5050
    }

}
