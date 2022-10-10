package cn.itcastday14.demo06;

/**
 * wait 和 sleep方法的区别：
 *
 * 1.wait方法可以指定时间或不指定时间
 *   sleep方法必须指定时间
 * 2.在同步中时对于cpu的执行权和锁的处理不同
 *   wait：释放执行权，释放锁
 *   sleep：释放执行权，不释放锁
 *
 *
 *   void show() {
 *       synchronized(this) { //t0 t1 t2全部冲进来
 *           wait(); //t0 t1 t2全部死了
 *       }
 *   }
 *   void method() {
 *        synchronized(this) {
 *            wait();
 *       }
 *   }
 *
 */
public class DifferenceDemo {

}
