package cn.itcast.p13.bytestream;

import java.io.*;

/**
 * copy map3 演示
 */
public class CopyMap3Test {
    public static void main(String[] args) throws IOException {

//        copy_1();  效率稍微快一点
//        copy_2();
//        copy_3();
        copy_4();

    }

    //千万别用，没有效率
    private static void copy_4() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\CloudMusic\\123.mp3");
        FileOutputStream fos = new FileOutputStream("D:\\CloudMusic\\456.mp3");

        int ch = 0;
        while ((ch = fis.read()) != -1) {
            fos.write(ch);
    }

        fos.close();
        fis.close();
    }

    //不推荐使用， 文件过大
    public static void copy_3() throws IOException  {
        FileInputStream fis = new FileInputStream("D:\\CloudMusic\\123.mp3");
        FileOutputStream fos = new FileOutputStream("D:\\CloudMusic\\456.mp3");

        byte [] buf = new byte[fis.available()]; //有多大弄多大数组
        fis.read(buf);
        fos.write(buf);
        fis.close();
        fos.close();

    }

    public static void copy_2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\CloudMusic\\123.mp3");
        BufferedInputStream bufis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("D:\\CloudMusic\\456.mp3");
        BufferedOutputStream bufos = new BufferedOutputStream(fos);
         //稍微有点多余
 /*       byte [] buf = new byte[1024];
        int len = 0;
        while ((len =bufis.read(buf)) != -1) {
            bufos.write(buf,0,len);
            bufos.flush(); //刷新
        }  */

        int ch = 0;
        while ((ch =bufis.read()) != -1) {
            bufos.write(ch);
//            bufos.flush(); //如果一个字节刷新一次，速度很慢很慢很慢
        }
        bufos.close();
        bufis.close();
    }

    public static void copy_1() throws IOException {

        FileInputStream fis = new FileInputStream("D:\\CloudMusic\\123.mp3");
        FileOutputStream fos = new FileOutputStream("D:\\CloudMusic\\456.mp3");

        byte [] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            fos.write(buf,0,len); //从byte数组写入，0开始，len写入的个数
        }

        fos.close();
        fis.close();


    }
}
