package cn.itcast.demo20;

public class NiMingDemo {
    public static void main(String[] args) {

//        Outer o = new Outer();
//        o.method();

        show(new Inner() {
            @Override
            public void show1() {

            }
            @Override
            public void show2() {

            }
        });  //调用show方法！
    }
    //创建一个方法
    public static void show(Inner in) {
        in.show1();
        in.show1();
    }
}
