package demo11;

/**
 * 计算机类：
 */
public class Computer {

    String cpu ;//Cpu
    String board;//主板
    String lcd;//显示器
    String disk;//硬盘
    String memory;//内存


    public void showInFo(){
        System.out.println("cpu为："+ cpu);
        System.out.println("主板为："+ board );
        System.out.println("显示器为："+ lcd);
        System.out.println("硬盘为："+ disk);
        System.out.println("内存为："+ memory);
    }

}
