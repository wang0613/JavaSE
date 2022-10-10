package cn.itcast.p15.io.file.demo;

import cn.itcast.p15.io.filter.FilterByHidden;
import cn.itcast.p15.io.filter.SuffixFilter;

import java.io.File;

public class FileListDemo {
    public static void main(String[] args) {

//        listDemo();
//        listDemo_2();
        listDemo_3();
    }

    /**
     * list();只能获取目录名称，
     * listFiles(); 返回目录对象数组
     */
    public static void listDemo_3() {

        File dir = new File("c:\\");

        File[] files = dir.listFiles(new FilterByHidden());
        for (File file : files) {
            System.out.println(file);
        }

    }

    //添加过滤器 获取目录【名称】
    public static void listDemo_2() {

        File dir = new File("D:\\IdeaProjects\\S1 -code\\day01\\src\\demo01");

//        String[] names = dir.list(new FilterByJava());//过滤器
        String[] names = dir.list(new SuffixFilter(".java"));

        for (String name : names) {
            System.out.println("name = " + name);
        }

    }

    //获取目录演示（未添加过滤器）
    public static void listDemo() {

        File file = new File("D:\\"); //必须是目录，文件会发生空指针异常，因为数组无法创建成功

        /**
         *  获取当前目录下的文件以及文件夹名称，包含隐藏文件。
         *      调用list方法的file对象中封装的必须是目录
         *      否则会发生空指针异常 NullPointerException
         *  如果访问的是系统级目录，也会发生空指针异常
         *
         *  如果访问的是空目录的话，数组是存在的，但是没有东西，长度为0。
         */
        String[] names = file.list(); //获取C盘下文件目录，包括隐藏目录

        for (String name : names) {
            System.out.println(name);
        }

    }
}
