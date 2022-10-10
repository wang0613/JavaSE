package cn.itcast.p17.io.properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {

        /**
         * Map：
         *   !--Hashtable
         *      !--properties
         * properties集合：
         * 特点：
         *      1.该集合中的键和值都是【字符串】类型
         *      2.该集合中数据可以保存在流中，或者从流中获取
         *  通常该集合用于操作以键值对形式存在的配置文件
         */
//        propertiesDemo();
//        showProp();
//        showStore();
//        showStream();
//        myLoad();
        test();
    }

    /**
     * properties集合的存和取
     */
    public static void propertiesDemo() {

        //创建一个properties集合
        Properties prop = new Properties(); //创建一个没有默认值的空属性列表

        //存储元素
        prop.setProperty("zhang", "63"); // 原理就是：调用put方法
        prop.setProperty("wang", "18");
        prop.setProperty("zhou", "58");
        prop.setProperty("li", "60");

        //修改元素
        prop.setProperty("zhou", "50"); //键相同，值覆盖

        //取出元素
        Set<String> names = prop.stringPropertyNames(); //返回全部键，

        for (String name : names) {
            String value = prop.getProperty(name); //通过键 来获取值

            System.out.println(name + " : " + value); //键
        }


    }

    /**
     * 演示：properties和流相关的方法
     * list();
     */
    public static void showProp() {

        Properties prop = new Properties();

        prop.setProperty("zhou", "50");
        prop.setProperty("wang", "94");
        prop.setProperty("liu", "20");
        prop.setProperty("san", "40");

        prop = System.getProperties();//获取系统信息

        //list方法：将属性列表输出到指定的输出流，调试用。
        prop.list(System.out); //输出流为控制台
    }

    /**
     * store :持久化存储到文件中
     */
    public static void showStore() throws IOException {

        Properties prop = new Properties();

        prop.setProperty("zhou", "50");
        prop.setProperty("wang", "94");
        prop.setProperty("liu", "20");
        prop.setProperty("san", "40");

        //想要将这些集合中的字符串键值信息，持久化存储到问文件中
        //需要关联输出流
        FileOutputStream fos = new FileOutputStream("info.txt");

        //将集合中的数据存储到文件中，使用store方法
        prop.store(fos, "name+age"); //解释信息：不要写中文，使用的ISO编码

        fos.close(); //关流
    }

    /**
     * 导入已有的配置信息， Load();
     */
    public static void showStream() throws IOException {

        Properties prop = new Properties();

        //集合中的数据来自于 一个文件
        //注意： 必须要保证该文件中数据是【键值对】
        //需要使用到读取流

        FileInputStream fis = new FileInputStream("info.txt");

        //使用load 方法，读取属性列表,加载到集合中
        prop.load(fis);

        prop.list(System.out);//list输出到控制台

        fis.close();
    }

    //模拟load()方法
    public static void myLoad() throws IOException {

        Properties prop = new Properties();

        BufferedReader bufr = new BufferedReader(new FileReader("info.txt"));

        String line = null;
        while ((line = bufr.readLine()) != null) {

            //判断是否为 注释！！！
            if (line.startsWith("#")) {
                continue;
            }

            String[] arr = line.split("="); //利用等号切割为两个字符串
//            System.out.println(arr[0] +"  "+ arr[1]);

            prop.setProperty(arr[0], arr[1]); //存储到集合中
        }

        prop.list(System.out); //输出在控制台
        bufr.close();
    }


    //对已有的配置文件信息，进行修改
    //1.读取文件,并将这个文件键值数据存储到集合中，
    //2.对集合中的数据进行修改。
    //3.再将通过流修改的数据存储到文件中
    public static void test() throws IOException {

        //读取这个文件,文件不一定存在，先封装成对象
        File file = new File("info.txt");
        //如果文件不存在，创建一个.
        if ((file.exists())) {
            file.createNewFile();
        }
        FileReader fr = new FileReader(file); //操作封装对象

        //创建集合配置信息
        Properties prop = new Properties();

        //将流中的信息，存储到集合中
        prop.load(fr);

        prop.setProperty("wang", "30");//重写设置，但是没有保存

        //输出流
        FileWriter fw = new FileWriter(file);//直接操作封装对象

        prop.store(fw, "000");//重新写入

//        prop.list(System.out);//打印测试一下

        fw.close();
        fr.close();
    }


}

