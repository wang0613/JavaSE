package demo04;

public class Demo01If {
    public static void main(String[] args) {
        System.out.println("今天的天气不错，正在压马路，突然看到一个快乐的地方：网吧。");

        int age = 16;
        //判断条件是否成立，不成立输出回家吃饭，成立进入网吧。
        if (age >= 18){
            System.out.println("进入网吧，ok");
        }
        System.out.println("回家吃饭");
    }
}
