package cn.itcast.demo11;

public  class Fu {
    int num;

    Fu() {
        num = 20; //可以会在父类的构造函数中初始化
        System.out.println("Fu run");
    }
    Fu(int num) {
        System.out.println("Fu num run");
    }

}
