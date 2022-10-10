package cn.itcast.demo07;

public class StaticCodeDemo {
    static {
        System.out.println("优先于主函数执行！！");
    }
    public static void main(String[] args) {

//        new StaticCode().show();//哈哈哈 【静态会优先执行】   呵呵呵
//        new StaticCode().show();//静态代码块的内容只执行一次
        StaticCode.show();
    }

}
