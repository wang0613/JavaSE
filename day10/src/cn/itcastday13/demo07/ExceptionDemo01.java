package cn.itcastday13.demo07;
/*
异常处理的捕捉形势：
这是可以对异常进行针对性的来处理方式。
具体格式：
try  {
 //需要被检测异常的代码！
   }
catch(异常量 变量) { //该变量用于接收发生异常的对象。
    //处理异常的代码！
  }
finally {
    //一定会被执行的代码！
}
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        int []arr = new int[0];
        Demo d = new Demo();
        try {
            int num = d.method(null,-100); //数值没毛病，不走catch
            System.out.println(num);
        }
        //抛什么，捕捉什么
        catch (FuShuIndexException e) { //FuShuIndexException是异常的子类，能够调用异常中的方法
            System.out.println("message:" +e.getMessage()); //getMessage获取详细的异常信息:"角标变负数啦！"
            System.out.println("String:" +e);//默认toString

//            e.printStackTrace();//jvm默认的异常处理机制就是调用异常对象的这个方法。
            System.out.println("负数角标异常！");
        }
        // 多catch情况
        catch (NullPointerException e) {
            System.out.println(e);
        }
        // 多catch情况,父类的catch放在最下面
        catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("Over");
         //运行结果：   负数角标异常！
        //Over
    }
}

