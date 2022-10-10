package cn.itcast.demo11;

public class DemoMain {
    public static void main(String[] args) {
        //守先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标，供电脑使用
//        Mouse mouse = new Mouse();
        //向上转型
        USB usbMouse = new Mouse();
        //传递进去，参数是USB类型，传递时的是USB鼠标
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数是USb类型，传递进去的是一个是是实现类对象
        computer.useDevice(keyboard);//正确写法，发生向上转型
        //使用子类对象 匿名对象 也可以。
//        computer.useDevice(new Keyboard());//也是正确写法

        computer.powerOff();
        System.out.println("===============================");
        method(10.0);//正确写法 double -- double
        method(20);  //也是正确写法 int ---- double
        int a = 30;
        method(a);//30.0
    }

    public static void method(double num) {
        System.out.println(num);
    }

}
