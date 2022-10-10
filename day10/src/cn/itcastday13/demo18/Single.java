package cn.itcastday13.demo18;

/**
 * 饿汉式 【简单】
 * 私有构造方法，创建静态方法返回对象
 */
public class Single {

    public static final Single s = new Single();

    private Single() {

    }
    public static Single getInstance() {
        return s; //返回对象
    }
}
