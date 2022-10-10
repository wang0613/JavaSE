package demo09;

public class Demo01Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i == 2){
                continue;//跳出当前循环，执行下一次循环。
            }
            System.out.println("i=" + i);
        }
    }
}
