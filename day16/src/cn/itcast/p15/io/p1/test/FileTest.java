package cn.itcast.p15.io.p1.test;

import java.io.File;

public class FileTest {
    /**
     * 需求：
     * 对指定的目录进行所有内容的列出（包含子目录的内容）
     * 也可以理解为： 深度遍历.   注意：尽量不要遍历C盘，系统文件容易访问容易发生空指针异常
     */
    public static void main(String[] args) {

        File dir = new File("D:\\IdeaProjects\\code\\day02");

        listALl(dir);

    }

    public static void listALl(File dir) {

        System.out.println(dir.getAbsolutePath()); //放在调用方法之后也可以

        //获取指定目录下的所有目录的文件夹和文件对象
        File[] files = dir.listFiles();

        for (File name : files) {

            if (name.isDirectory()) {
                listALl(name); //调用自己的方法：递归

            } else if (name.isFile()) {

                System.out.println(name.getAbsolutePath());
            }
        }


    }


}
