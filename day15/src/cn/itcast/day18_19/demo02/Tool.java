package cn.itcast.day18_19.demo02;

/**
 * 用一个工具类对Person对象进行设置和获取
 */
public class Tool<QQ> {

    //老式方法
//   private Object object;
//
//    public Object getObject() {
//        return object;
//    }
//
//    public void setObject(Object object) {
//        this.object = object;
//    }

    //在jdk1.5以后，使用泛型来接收类中ing需要操作的引用数据类型
    //泛型类： 什么使用用？ 当类中的操作引用数据类型不确定的时候，用泛型来表示。
    private QQ q;

    public QQ getQ() {
        return q;
    }

    public void setQ(QQ q) {
        this.q = q;
    }
 
    //泛型方法
    public <W> void show(W str) {
        System.out.println("show =" + str);
    }

    public void print(QQ str) {
        System.out.println("print = " + str);
    }

}
