package cn.itcast.p1.otherapi.System;

import java.util.Properties;
import java.util.Set;

/**
 * System类：它不能被实例化 ,里面的方法动都是静态的
 *
 ** System.out 输出流。
 *     * System.in  输入流
 *     *
 *        常见方法：
 *     * static long    currentTimeMillis(); 返回当前时间（以毫秒为单位）。
 *       static void    exit(int status);  终止当前运行的Java虚拟机。
 *       static void    gc(); 运行垃圾回收器
 *        重点：
 *     * static Properties    getProperties();  确定当前的系统属性。
 *     stringPropertyNames();返回一组键
 *     getProperty(key); 通过键来获取值
 *
 */
public class SystemDemo {

    //不准备弄他，锁上
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) {

//        long l = System.currentTimeMillis();//默认1970年1月1日开始算的
//
//        long t = 5849671219462l;
//        System.out.println("l = " + l);
//        System.out.println("time = " + (l-t) /1000);//转换为秒

//        System.exit(0);//终止当前运行的Java虚拟机。
        propertiesShow();
        //(line.separator),用来获取任何系统的行分隔符，Java的跨平台性。
        //Java虚拟机启动的时候，就先拿到系统的信息，来确定方法。
        System.out.println("hello-"+LINE_SEPARATOR+"world");

        //自定义给系统设定一些属性信息，这些信息是全局的，其他程序也可以使用。
        System.setProperty("myKey","MyValue");
    }

    //properties(); 是map集合的子类，继承自Hashtable.
    private static void propertiesShow() {
        //获取系统的属性，并存储到了Properties集合中
        Properties prop = System.getProperties();
        //properties 集合中存储的都是String类型的键和值
        //最好使用它自己的存储和取出的方法来完成元素的操作
        /*
        Object setProperty(String key, String value)
         相当于Hashtable方法 put ，但是参数全是String类型。
         */
        //已经获取系统的了，要先将map集合转换为set集合,
        // stringPropertyNames();返回此属性列表中的一组键
        Set<String> names = prop.stringPropertyNames();
        for (String name : names) {
            String value =prop.getProperty(name);
            System.out.println(name+"："+value);

        }

    }

}
