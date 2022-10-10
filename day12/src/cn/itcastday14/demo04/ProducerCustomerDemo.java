package cn.itcastday14.demo04;

/**
 * 生产者，消费者案例
 *
 * 多生产者，多消费者
 */
public class ProducerCustomerDemo {
    public static void main(String[] args) {

        //创建资源
        Resource r = new Resource();
        //分配任务
        Producer  p = new Producer(r);
        Customer c = new Customer(r);
        //创建线程
        Thread t0 = new Thread(p);
        Thread t1 = new Thread(p); //两个生产者

        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);//两个消费者

        t0.start();
        t1.start();
        t2.start();//开启线程
        t3.start();
    }
}
