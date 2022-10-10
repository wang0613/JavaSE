package cn.itcast.demo22;

public class Fu {
    {
        System.out.println("fu");
    }
    Fu() {

        System.out.println("fu constructor run");
        show();
    }

    void show() {
        System.out.println("父类方法执行了！！");
    }
}
