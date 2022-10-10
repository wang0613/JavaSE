package cn.itcastday13.demo09;
/*
异常的案例：
老师用电脑上课
两个对象

分析其中的问题：   
比如：电脑蓝屏，冒烟啦。

 */
public class ExceptionTest {
    public static void main(String[] args) {

        Teacher t = new Teacher("毕姥爷");
        try {
            t.prelect();
        }
        //捕捉电脑冒烟后，没有教学的异常！
        catch (NoPlanException e) {
            System.out.println(e.toString());
            System.err.println("换人！"); //就是在创建一个学生对象！

        }
    }
}
