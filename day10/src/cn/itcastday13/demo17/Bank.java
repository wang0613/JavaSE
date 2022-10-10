package cn.itcastday13.demo17;

/*
由同步修饰符，修饰的函数叫做同步函数。
同步函数使用的锁是 this

同步函数和同步代码快的区别：
1.同步函数的锁是this
2.同步代码块的锁是任意对象 【开发常用】

synchronized代码块时会锁定当前的对象，
只有执行完该代码块才能释放该对象锁，下一个线程才能执行并锁定该对象。
synchronized只锁定对象，每个对象只有一个锁（lock）与之相关联

当一个线程访问对象的一个synchronized(this)同步代码块时，
另一个线程仍然可以访问该对象中的非synchronized(this)同步代码块。

1. synchronized关键字不能继承。
虽然可以使用synchronized来定义方法，但synchronized并不属于方法定义的一部分，因此，
synchronized关键字不能被继承。如果在父类中的某个方法使用了synchronized关键字，
而在子类中覆盖了这个方法，在子类中的这个方法默认情况下并不是同步的，
而必须显式地在子类的这个方法中加上synchronized关键字才可以。
2.在定义接口方法时不能使用synchronized关键字。
3.构造方法不能使用synchronized关键字，但可以使用synchronized代码块来进行同步。

A. 无论synchronized关键字加在方法上还是对象上，如果它作用的对象是非静态的，则它取得的锁是对象；
如果synchronized作用的对象是一个静态方法或一个类，则它取得的锁是对类，该类所有的对象同一把锁。
B. 每个对象只有一个锁（lock）与之相关联，谁拿到这个锁谁就可以运行它所控制的那段代码。
C. 实现同步是要很大的系统开销作为代价的，甚至可能造成死锁，所以尽量避免无谓的同步控制。

 */
public class Bank {

    //    private Object obj = new Object();
    private int sum;

    //同步函数
    public synchronized void add(int num) {
        //同步代码块 线程锁
//      synchronized ( obj) {
        sum = sum + num;
        System.out.println("sum = " + sum);
//      }
    }
}
