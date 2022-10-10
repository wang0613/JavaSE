package demo08;
/*
计算个位数不是2，3，4，7并且不能被3整除的数有：1-100内的和
 */
public class Demo02Continue {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=100; i++){
            if (i%10==2 || i%10==3 || i%10==4 || i%10==7 || i%3 == 0){
                continue;
            }
            sum = sum + i;//累加
        }
        System.out.println("1-100内个位数不是2，3，4，7并且不能被3整除的数和为："+sum);
    }
}
