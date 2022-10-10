package cn.itcastday14.demo01;

/**
 * 输出
 */
public class Output implements Runnable {

    Resource r;
    Output(Resource r) {
        this.r = r;
    }
//    Object obj = new Object();

    @Override
    public void run() {

          while (true) {

              //obj 两个类用的不是不一把锁。 r 两类在同时操作一个对象
              synchronized (r) {
                  System.out.println(r.name + "···" + r.sex);
          }
      }
    }
}
