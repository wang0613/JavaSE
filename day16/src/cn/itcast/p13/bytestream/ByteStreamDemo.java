package cn.itcast.p13.bytestream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {

//        demo_write();
        demo_read();

    }

    private static void demo_read() throws IOException{
        FileInputStream fis = new FileInputStream("copyDemo.txt");

//        //一次读取一个字节, 注意：一个中文需要读取两次
//        int ch = fis.read();
//        System.out.println(ch);//97

//        int ch = 0;
//        while ((ch = fis.read()) != -1) {
//            System.out.println((char) ch);
//        }

        //推荐使用
//        byte [] buf = new byte[1024];
//        int len =0;
//        while ((len = fis.read(buf)) != -1) {
//            System.out.println(new String(buf,0,len));//len解码的数
//        }

//        System.out.println(fis.available());//返回字节数
        byte[] buf =new byte[fis.available()];
        fis.read(buf);
        System.out.println(new String(buf));

        fis.close();

    }

    //字节输出流
    private static void demo_write() throws IOException {

        //1.创建字节输出流对象，用于操作文件
        FileOutputStream fos = new FileOutputStream("copyDemo.txt");

        //2.写数据 直接写入到了目的地当中
        fos.write("abcde".getBytes());//getBytes();把字符串转换为byte数组

        //fos.flush; 没有用，直接写入
        fos.close();//关闭资源的动作要完成的

    }
}
