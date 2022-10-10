package cn.it.io.p1.splitfile;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

/**
 * 文件合并
 */
public class MergeFile {
    public static void main(String[] args) throws IOException {

        File dir = new File("D:\\Game\\partfiles");
        mergeFile_2(dir);

    }

    //升级版： 读取配置文件
    public static void mergeFile_2(File dir) throws IOException {

        //通过过滤器来获取到指定目录下的 配置文件对象
        File[] files = dir.listFiles(new SuffixFilter(".properties"));
        //可能不止一个， 可能没有
        if (files.length != 1) {
            throw new RuntimeException(dir + ",该目录下没有prop文件，或者不唯一");
        }
        File confile = files[0]; //记录配置文件对象

        //获取该配置文件中的信息
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(confile); //流关联配置文件

        prop.load(fis); //将流中的信息，加载到配置文件中

        String fileName = prop.getProperty("filename"); //通过键获取值（文件名）

        //获取该目录下的碎片文件，
        File[] partFiles = dir.listFiles(new SuffixFilter(".part"));

        //将碎片文件和流对象进行关联，并存储到集合中
        ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
        for (int i = 0; i < partFiles.length; i++) {
            al.add(new FileInputStream(partFiles[i]));
        }

        //将多个流合并为一个序列流
        Enumeration<FileInputStream> en = Collections.enumeration(al);
        SequenceInputStream sis = new SequenceInputStream(en);

        //封装将 组合后的文件放在dir下面
        FileOutputStream fos = new FileOutputStream(new File(dir, fileName));

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = sis.read(buf)) != -1) {
            fos.write(buf, 0, len);

        }

        fos.close();
        sis.close();


    }

    public static void mergeFile(File dir) throws IOException {

        //将多个流放入到一个容器中
        ArrayList<FileInputStream> al = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            //将文件封装，因为文件在dir 下面
            al.add(new FileInputStream(new File(dir, i + ".part")));
        }

        Enumeration<FileInputStream> en = Collections.enumeration(al);

        SequenceInputStream sis = new SequenceInputStream(en); //多个源变成一个

        //封装将 组合后的文件放在dir下面
        FileOutputStream fos = new FileOutputStream(new File(dir, "coll.png"));

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = sis.read(buf)) != -1) {
            fos.write(buf, 0, len);

        }

        sis.close(); //将多个流合并之后，会一起释放
        fos.close();

    }

}
