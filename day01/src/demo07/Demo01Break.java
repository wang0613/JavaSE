package demo07;
/*
break语句；
需求：
打印十行，第四行打断！！
你好！！1
你好！！2
你好！！3
 */
public class Demo01Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            if (i ==4)//第四行开始打断！！后面不要！！
                break;
            System.out.println("你好！！"+ i);

        }
    }
}
