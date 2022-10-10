package cn.itcastday14.demo02;

/**
 * 输入
 */
public class Input implements Runnable {


    Resource r;

    Input(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        int x = 0;

        while (true) {
            synchronized (r) {
                //第一次进入 不等待
                if (r.flag) {
                    try {
                        r.wait(); //等待线程, InterruptedException;中断异常
                    } catch (InterruptedException e) {

                    }
                }
                if (x == 0) {
                    r.name = "mike";
                    r.sex = "man";
                } else {
                    r.name = "丽丽";
                    r.sex = "女女女";
                }

                r.flag = true;
                r.notify(); //唤醒其他线程

            }
            x = (x + 1) % 2;  //if和else 之间的代码切换赋值
        }
    }
}
