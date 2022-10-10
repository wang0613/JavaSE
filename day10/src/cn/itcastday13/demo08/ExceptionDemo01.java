package cn.itcastday13.demo08;
/*
try catch finally 代码块组合特点：
1.
    try catch finally
2.
    try catch（多个）当没有资源需要定义时，可以不用定义finally
3.
    try finally 异常无法catch处理，但是资源必须关闭！
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {

        Demo d = new Demo();
        try {
            int num = d.show(-1);
            System.out.println(num);//发生异常，代码不执行
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
//            return;结束函数，不执行Over 但一定会执行 finally
            System.exit(0); //退出jvm，后面的都不会执行！
        }
        //finally 通常用于关闭（释放）资源
        finally {
            System.out.println("finally!");
        }
        System.out.println("Over!");
    }
}
