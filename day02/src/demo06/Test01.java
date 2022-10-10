package demo06;
/*
获取100内所有能够被3整除的个数和和
 */
public class Test01 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if ( i % 3 ==0){
                count ++;
                sum = sum + i;
            }
        }
        System.out.println("1-100中能够被三整除的数有：" + count );
        System.out.println("总和是：" + sum);
    }
}
