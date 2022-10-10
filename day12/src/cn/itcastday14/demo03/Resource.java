package cn.itcastday14.demo03;

/*
代码优化
 */
public class Resource {

    private String name;
    private String sex;
    private boolean flag = false;

    //优化同步为同步函数
    public synchronized void set(String name, String sex) {
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {

            }
        }
        this.name = name;
        this.sex = sex;
        flag = true;
        notify(); //唤醒输出线程
    }

    public synchronized void out() {
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("name = " + name + ", sex = " + sex);
        flag = false;
        notify(); //唤醒输入线程
    }
}
