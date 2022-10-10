package cn.itcastday14.demo08;
/*
join：在一个线程中调用other.join(),将等待other执行完后才继续本线程。　　

setPriority：设置线程的优先级 1-10
static int MAX_PRIORITY
          线程可以具有的最高优先级。
static int MIN_PRIORITY
          线程可以具有的最低优先级。
static int NORM_PRIORITY
          分配给线程的默认优先级。

yield:暂停当前的为线程，并运行其他线程，不会造成堵塞。静态方法

t1.interrupt();中断线程
 */
public class JoinDemo {
    public static void main(String[] args) throws Exception {
        Join j = new Join();

        Thread t1 = new Thread(j);
        Thread t2 = new Thread(j);

        t1.start();

        t2.start();
        t1.join();  //t1线程要申请加入进来，运行 , t1等待主线程终止结束，才运行
//        t2.setPriority(Thread.MAX_PRIORITY);

//        t1.interrupt();
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "··" + i);
        }
    }
}
