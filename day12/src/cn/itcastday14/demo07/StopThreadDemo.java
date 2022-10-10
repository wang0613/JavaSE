package cn.itcastday14.demo07;

/*
停止线程：
 1.stop方法
 2.run方法结束

 怎么控制线程的任务结束？
任务中都会有循环结构，只要控制循环就可以结束任务
控制循环通常用标记来完成

如果线程处于了冻结状态，就无法读取标记，如何结束呢？
可以使用Interrupt()方法将线程从冻结转态强制恢复到运行状态中，让线程具备cpu的执行资格
但是强制动作会发生InterruptException异常，要进行处理

 */
public class StopThreadDemo {
    public static void main(String[] args) {

        StopThread st = new StopThread();

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);

        t1.start();
        t2.setDaemon(true); //守护线程
        t2.start();

        int num = 1;
        for (; ; ) {
            if (++num == 50) {
//                st.setFlag();
//                t1.interrupt(); //清除冻结 t1
//                t2.interrupt();//清除冻结 t2
                break;
            }
            System.out.println("main····" + num);
        }
        System.out.println("···over···");
    }

}
