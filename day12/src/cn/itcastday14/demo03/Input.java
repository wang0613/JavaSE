package cn.itcastday14.demo03;

public class Input implements Runnable {
    Resource r;

    Input(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {
            if (x == 0) {
                r.set("mike", "man");
            } else {
                r.set("丽丽", "女");
            }
            x = (x + 1) % 2;
        }

    }
}
