package cn.itcastday14.demo04;

public class Customer implements Runnable {

    private Resource r;

    Customer(Resource r) {
        this.r = r;

    }

    @Override
    public void run() {
        //使劲消费
        while (true) {
            r.out();
        }
    }
}
