package cn.itcastday14.demo01;

/**
 * synchronized Java语言的关键字，当它用来修饰一个方法或者一个代码块的时候，
 * 能够保证在同一时刻最多只有一个线程执行该段代码。
 * (1:)当两个并发线程访问同一个对象object中的这个synchronized(this)同步代码块时，
 * 一个时间内只能有一个线程得到执行。另一个线程必须等待当前线程执行完这个代码块以后才能执行该代码块。
 * (2:)然而，当一个线程访问object的一个synchronized(this)同步代码块时，
 * 另一个线程仍然可以访问该object中的非synchronized(this)同步代码块。
 * (3:)尤其关键的是，当一个线程访问object的一个synchronized(this)同步代码块时，
 * 其他线程对object中所有其它synchronized(this)同步代码块的访问将被阻塞。
 * (4:)第三个例子同样适用其它同步代码块。也就是说，
 * 当一个线程访问object的一个synchronized(this)同步代码块时，
 * 它就获得了这个object的对象锁。结果，其它线程对该object对象所有同步代码部分的访问都被暂时阻塞。
 * (5:)以上规则对其它对象锁同样适用.
 */
//输入
public class Input implements Runnable {

    //这样就可以两个类同时操作一个对象
    Resource r;

    Input(Resource r) {
        this.r = r;
    }
//    Object obj = new Object();

    @Override
    public void run() {
        int x = 0;

        while (true) {
            //出现线程安全问题， 加上锁
            synchronized (r) {
                if (x == 0) {
                    r.name = "mike";
                    r.sex = "man";
                } else {
                    r.name = "丽丽";
                    r.sex = "女女女";
                }
            }
            x = (x + 1) % 2;  //if和else 之间的代码切换赋值
        }
    }
}
