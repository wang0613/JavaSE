package cn.itcastday14.demo05;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
jdk api的Lock锁的官方案例
 */
public class BoundedBuffer {  //缓冲区

    final Lock lock = new ReentrantLock(); //创建一个锁对象

    final Condition notFull = lock.newCondition(); //两个监视器
    final Condition notEmpty = lock.newCondition();

    final Object [] items = new Object[100];//对象数组
    int putptr ,takeptr ,count;//存 取 计数器

    public void put (Object o) throws InterruptedException {
        lock.lock();//给一只鸭子，拿到锁
        try {
     //判断标记的时候一定要用while ，安全，每一次醒来都会判断标记，
            // 如果是if()则不会判断，在哪里沉睡哪里，哪里苏醒
            while (count == items.length) {
                //false 不在造
                    notFull.await();
            }
            items[putptr] = o;  //来一只进入一只
            if (++putptr == items.length){
                putptr = 0;//到了100，就从0开始生产
            }
            ++count;
            notEmpty.signal(); //如果能够实现唤醒对象，则不需要全部唤醒。
        }
        finally {
            lock.unlock();
        }
    }
    public Object take() throws InterruptedException {
        lock.lock();
        try {
            while (count ==0 ) {
                notEmpty.await();
            }
            Object o =  items[takeptr] ;  //从0开始拿
            if (++takeptr== items.length) {
                takeptr =0;
            }
            --count;
            notFull.signal();
            return o;
        }
        finally {
            lock.unlock();
        }
    }
}
