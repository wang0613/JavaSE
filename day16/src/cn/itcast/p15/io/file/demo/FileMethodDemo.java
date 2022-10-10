package cn.itcast.p15.io.file.demo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileMethodDemo {
    public static void main(String[] args) throws IOException {

        /**
         * File对象常见方法：
         *   1. 获取
         *      1.1 获取文件名称 getName();
         *      1.2 获取文件路径 getPath();   getAbsolutePath();
         *      1.3 获取文件大小 length();
         *      1.4 获取文件的修改时间 lastModified()
         *   2.创建和删除
         *      boolean  createNewFile(); 创建未存在的文件，已存在，无法创建
         *      static File    createTempFile(String prefix, String suffix)
         *       创建一个临时文件，指定名称和 文件后缀
         *      static File    createTempFile(String prefix, String suffix, File directory)
         *       创建一个临时文件，指定名称 文件后缀和文件目录
         *    删除
         *      boolean delete(); 删除文件
         *      void    deleteOnExit();  虚拟机结束时，删除文件或者目录
         *    文件夹的创建
         *      boolean mkdir(); 创建未存在的文件夹   delete删除，如果文件夹中有文件，无法删除
         *      boolean mkdirs(); 创建多级文件夹  delete只能删除最终文件夹，父级无法删除
         *    3.判断
         *      boolean exists(); 判断文件是否存在
         *              isFile()
         *              isDirectory();
         *    4. 重命名
         *      boolean   renameTo(); 把文件f1重命名为f2
         *
         *  静态方法： 获取系统的根目录 ：
         *          File.ListRoots(); 返回一个File对象数组
         *
         *    获取盘符空间
         *    file.getFreeSpace()
         *    file.getTotalSpace()
         *    file.getUsableSpace()
         */

//        getDemo();
//        createAndDeleteDemo();
//        isDemo();
//        renameToDemo();
        listRootsDemo();
    }

    //系统根目录
    public static void listRootsDemo() {

        File[] files = File.listRoots(); //静态方法 获取系统根目录

        for (File file : files) {
            System.out.println(file);
        }

        File file = new File("d:\\");//封装d盘，获取空间

        System.out.println("getFreeSpace = " + file.getFreeSpace());
        System.out.println("getTotalSpace = " + file.getTotalSpace());
        System.out.println("getUsableSpace = " + file.getUsableSpace());
    }

    public static void renameToDemo() {

        File f1 = new File("D:\\0.mp3");
        File f2 = new File("D:\\9.mp3");

        boolean b = f1.renameTo(f2); // 把f1 文件重命名为 f2 的名称
        System.out.println("b = " + b);

    }

    // 判断的方法演示
    public static void isDemo() {
        File file = new File("aaa.txt");

//        boolean s = file.mkdir(); //注意： 创建aaa.txt 文件夹
//        System.out.println("s = " + s);

/*
        boolean b = file.exists(); //判断文件是否存在
        System.out.println("b = " + b);

        System.out.println(file.isFile()); //是不是文件
        System.out.println(file.isDirectory()); //是不是目录   */

    }

    //创建和删除演示
    public static void createAndDeleteDemo() throws IOException {

        //文件的创建和删除
//        File file = new File("file.txt");
        /**
         * 和 输出流不一样，如果文件不存在则创建， 如果文件存在，则不创建、
         */
//        boolean flag = file.createNewFile();
//        System.out.println("flag = " + flag);
//
//        boolean del = file.delete();
//        System.out.println("del = " + del); //删除成功

        //文件夹的创建和删除
        File dir = new File("abc\\a\\b");
        //创建多级文件夹
        boolean flag = dir.mkdirs(); //make directory
        System.out.println(flag);

        System.out.println(dir.delete()); //如果文件夹中有内容，是不会删除的。
        //如果文件正在被流所操作，是无法删除的
    }

    //获取的方法
    public static void getDemo() {

        File file = new File("a.txt");
//        File file = new File("D:\\IdeaProjects\\S1 -code\\a.txt");
//        File file = new File("arr.txt");  不存在文件

        String name = file.getName(); //获取名称

        String path = file.getPath(); //相对项目路径
        String absPath = file.getAbsolutePath(); //获取绝对路径

        Long lon = file.length(); //文件长度

        Long time = file.lastModified(); //最后一次修改时间

        //格式化为有效的时间
        Date date = new Date(time);
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        String str_date = dateFormat.format(date);

        System.out.println("parent: =" + file.getParent());//获取文件父目录,相对路径为null

        System.out.println("name = " + name);
        System.out.println("path = " + path);
        System.out.println("absPath = " + absPath);
        System.out.println("lon = " + lon);
        System.out.println("time = " + time);
        System.out.println("str_date = " + str_date);

    }
}
