package cn.itcastday14.demo09;
/*
多线程面试题：(2)
错误在第一行，应该被abstract修饰
 */
public class Test implements Runnable { //如果不覆盖重写，那么这个类必须是抽象类

    //这里的参数是非法的，必须空参的覆盖重写
//    @Override
//    public void run(Thread r) {
//
//    }

    @Override
    public void run() {

    }
}
