package demo09;

public class Test03 {
    public static void main(String[] args) {
        int i= 0;//公鸡数量
        int j = 0;//小鸡数量

        for ( i = 1; i <= 20; i++) {
            for (j = 1; j <= 33; j++) {
                int k = 100-i - j;//雏鸡数量
                //雏鸡的数量必须是3的倍数
                if (k % 3==0 && 5*i+3*j+k/3==100 ){
                    System.out.println("公鸡数量："+i);
                    System.out.println("母鸡数量："+ j);
                    System.out.println("小鸡数量："+k);
                    System.out.println("------------");
                }
            }
        }
}
}
