package cn.itcast.p20.io.sequence.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * 序列流演示：
 * SequenceInputStream: 不仅可以合并文本 File，也可以合并媒体文件
 *
 * 需求: 将1.txt 2.txt 3.txt 合并数据到一个文件中
 */
public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException {
/**
 * SequenceInputStream​(InputStream s1, InputStream s2)
 * 通过记住两个参数来初始化新创建的 SequenceInputStream ，这两个参数将按顺序读取，
 * SequenceInputStream​(Enumeration <? extends InputStream> e)
 * 通过记住参数初始化新创建的 SequenceInputStream ，该参数必须是 Enumeration
 */

        //利用vector容器添加 读取流
//        Vector<FileInputStream> v = new Vector<FileInputStream>();
//
//        v.add(new FileInputStream("1.txt"));
//        v.add(new FileInputStream("2.txt"));
//        v.add(new FileInputStream("3.txt"));

        //getElements();返回此向量的组件的枚举。
//        Enumeration<FileInputStream> en = v.elements();


        //使用ArrayList高效，但是没有枚举，只能自己创建一个
        ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
        for (int i = 1; i <= 3; i++) {
            al.add(new FileInputStream(i + ".txt"));
        }

        //集合工具类完成
        Enumeration<FileInputStream> en = Collections.enumeration(al);

//        final Iterator<FileInputStream> it = al.iterator();
        //匿名内部类  枚举是被迭代器所取代的
//        Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {
//            @Override
//            public boolean hasMoreElements() {
//                return it.hasNext();
//            }
//
//            @Override
//            public FileInputStream nextElement() {
//                return it.next();
//            }
//        };


        //将多个输入流的枚举 序列流
        SequenceInputStream sis = new SequenceInputStream(en);

        FileOutputStream fos = new FileOutputStream("sequence.txt");//明确目的地
        //自己创建创建一个缓冲区
        byte[] buf = new byte[1024];
        int len = 0;
        //读取到 缓冲区
        while ((len = sis.read(buf)) != -1) {
            fos.write(buf, 0, len); //从缓冲区写入
        }

        fos.close();
        sis.close();

    }
}
