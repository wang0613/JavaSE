package cn.itcastday13.demo13;

public class Demo extends Thread{
    private String name;

    Demo(String name) {
        //super();
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("···x="+i+"···name："+Thread.currentThread().getName());
        }
    }

}
