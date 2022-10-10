package cn.itcastday13.demo18;

/**
 * 懒汉式
 */
public class Single2 {

    private static Single2 s = null; //先为空

    private Single2() {

    }

    public static Single2 getInstance() {

        //同步代码块解决安全问题，双重判断解决效率问题
        if (s == null) {
            //Single2.class 类的Class对象
            synchronized (Single2.class) {
                if (s == null)  //这里创建
                    s = new Single2();
            }
        }
        return s;
    }
}
