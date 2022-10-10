package cn.itcast.p15.io.p1.test;

import java.io.File;

/**
 * 练习：删除一个带内容的目录

 * 原理： 必须从里面往外边删，delete只能删除空文件夹。
 * 那就需要进行深度遍历
 */
public class RemoveDirTest {
    public static void main(String[] args) {

        File dir = new File("d:\\demo");

        removeDir(dir);

    }

    public static void removeDir(File dir) {

        File [] files = dir.listFiles(); //获取目录对象

        for (File file : files) {

            if (file.isDirectory()) {
                //如果是一个目录，就递归
                removeDir(file);
            } else if (file.isFile()) {
                file.delete(); //是文件就干掉
            }
        }
        //干掉文件之后，删除文件夹
        System.out.println(dir.delete());
    }
}
