package cn.itcastday14.demo02;

/**
 * 输出
 */
public class Output implements Runnable {

    Resource r;
    Output(Resource r) {
        this.r = r;
    }


    @Override
    public void run() {

          while (true) {

              synchronized (r) {
                  if (!r.flag) {
                      try {
                          r.wait(); //InterruptedException;中断异常
                       }
                      catch (InterruptedException e) {

                      }
                  }
                  System.out.println(r.name + "···" + r.sex);
                  r.flag = false;
                 r.notify();
          }
      }
    }
}
