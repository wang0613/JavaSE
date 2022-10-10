package cn.itcast.p18.io.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * IO练习：
 * 获取指定目录下，指定扩展名的名称（包含子目录）
 * 这些文件的绝对路径，写入到以个文本文件中
 * 简单说：就是建立一个指定扩展名文件的列表
 */
public class TestIO {
    public static void main(String[] args) throws IOException {

        /**
         * 1.必须进行深度遍历
         * 2.在遍历的过程中，使用过滤器，将符合条件的内容存储到容器中
         * 3.按照需求对容器中的内容进行遍历，并将绝对路径写入到文件中
         */
        File dir = new File("D:\\IdeaProjects\\S1 -code");

        List<File> list = new ArrayList<File>(); //list集合

        //匿名内部 过滤器
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java"); //或者过滤后缀名
            }
        };

        getFile(dir, filter, list);
        //dir 就是需要遍历的文件下
        File destFile = new File(dir, "javalist.txt");//明确目的地

        writeToFile(list, destFile);

    }

    /*
    对指定目录的内容进行深度遍历， 并按照过滤器进行过滤，经过滤后的内容存储到list集合中
     */
    public static void getFile(File dir, FilenameFilter filter, List<File> list) {

        File[] files = dir.listFiles(); //返回目录对象数组

        for (File file : files) {

            if (file.isDirectory()) {
                //递归啦！   【传入file注意】 这样才是遍历当前目录下
                getFile(file, filter, list);
            } else {
                //对遍历到的文件进行过滤器的过滤，将过滤后的文件添加到list集合中
                if (filter.accept(dir, file.getName())) {
                    list.add(file);
                }
            }
        }

    }

    public static void writeToFile(List<File> list, File destFile) throws IOException {

        BufferedWriter bufw = null;
        try {

            //明确目的地为 destFile
            bufw = new BufferedWriter(new FileWriter(destFile));

            //遍历list集合，每一个file中的绝对路径写入到文件中
            for (File file : list) {
                bufw.write(file.getAbsolutePath()); //将file中的绝对路径写给目的地
                bufw.newLine();
                bufw.flush();
            }

        } finally {

            if ((bufw) != null) {

                try {
                    bufw.close();
                } catch (IOException o) {
                    throw new RuntimeException("关闭失败");
                }
            }
        }

    }
}
