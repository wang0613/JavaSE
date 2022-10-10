package cn.itcast.p6.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

    //换行分隔符
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    /**
     * IO异常的处理
     * @param args
     * @throws IOException
     */
    public static void main(String[] args)  {

        FileWriter fw = null; //声明对象 引用变量 null，因为流的兑现创建有异常发生

        try {

            //进行初始化
            fw = new FileWriter("k:\\demo.txt");
            fw.write("ABC "+LINE_SEPARATOR+"NBA");//错误直接去catch了
        } catch (IOException e) {

            System.out.println(e.toString());
            System.out.println(e.getMessage());//获取异常信息
        }finally {

            //如果fw 不等于空，才有资格执行关闭流的动作
            if (fw != null)
            //资源必须关闭，finally里面 单独处理close的异常
            try {
                //文件没有创建成功
                fw.close();
            } catch (IOException e){
                throw new RuntimeException("关闭失败");
            }
        }
        /**
         * 位置错误 会出现两个异常：IO异常 和空指针异常：
         *  因为位置错误，无法创建对象fw，
         *  所以在catch之后，finally中的close，无法调用，所以出现空指针异常
         */
    }
}
