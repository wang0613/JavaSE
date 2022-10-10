package cn.itcast.demo10;

//懒汉式 缺点：线程问题
public class Single2 {//类加载进来，没有对象，只有调用了个getInstance方法之后，才会创建对象
    //延迟加载形式
    private static Single2 s = null;

    private Single2() {

    }

    public static Single2 getInstance() {
        if (s == null)
            s = new Single2();
        return s;
    }
}
