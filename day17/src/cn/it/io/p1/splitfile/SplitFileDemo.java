package cn.it.io.p1.splitfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 文件切割
 */
public class SplitFileDemo {

    public static final int SIZE = 1024 * 1024;

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Game\\0.png");
        splitDemo_2(file);

    }

    //利用键值对切割
    public static void splitDemo_2(File file) throws IOException {
        //1.读取文件
        FileInputStream fis = new FileInputStream(file);

        byte[] buf = new byte[SIZE];
        //
        FileOutputStream fos = null;

        int len = 0;
        int count = 1;

        /**
         * 切割文件时：必须要记录被切割文件的名称，以及切割出文件的个数，以方便合并
         * 这个信息为了进行简单的描述，所以使用键值对的方式，用到了Properties对象
         */
        Properties prop = new Properties();

        File dir = new File("D:\\Game\\partfiles");
        if (dir.exists()) {
            dir.mkdirs(); // 创建多级目录
        }

        while ((len = fis.read(buf)) != -1) {

            //循环存储碎片文件
            fos = new FileOutputStream(new File(dir, ((count++) + ".part")));
            fos.write(buf, 0, len);
            fos.close();

        }
        prop.setProperty("partcount",count+" "); //存放文件个数
        prop.setProperty("filename",file.getName()); //存放文件名称


        fos = new FileOutputStream(new File(dir, count + ".properties"));
        // 将prop集合中的数据放在文件中
        prop.store(fos,"save file info");

        fis.close();
        fos.close();
    }

    //简单切割
    public static void splitDemo_1(File file) throws IOException {

        //用读取流关联文件
        FileInputStream fis = new FileInputStream(file);

        //自定义缓冲区，因为是按照1m来切割，定义一个1m缓冲区
        byte[] buf = new byte[SIZE];

        //创建目的 3个
        FileOutputStream fos = null;

        int len = 0;
        int count = 1;

        File dir = new File("D:\\Game\\partfiles");
        if (dir.exists()) {
            dir.mkdirs(); // 创建多级目录
        }

        while ((len = fis.read(buf)) != -1) {

            fos = new FileOutputStream(new File(dir, ((count++) + ".part")));
            fos.write(buf, 0, len);
        }
        fis.close();
        fos.close();

    }
}