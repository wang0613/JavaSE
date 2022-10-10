package cn.itcast.p4.otherapi.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormat ： 日期格式化的抽象类。
 * <p>
 * static DateFormat     getInstance()
 * 获取在日期和时间上使用SHORT样式的默认日期/时间格式化程序。
 * <p>
 * static DateFormat     getTimeInstance()
 * 获取默认格式化样式为默认的 FORMAT语言环境的时间格式化 程序 。
 * static DateFormat     getTimeInstance(int style)
 * 获取默认的 FORMAT区域设置的【给定格式化样式】的时间格式化 程序
 */
public class DateFormatDemo {

    public static void main(String[] args) throws ParseException {
//        show01();
        show02();

    }

    /**
     * 将日期格式字符串---》 日期对象
     *      Date    parse(String source)
     *      从给定字符串的开始解析文本以生成日期。
     */
    public static void show02() throws ParseException {
        String str_date = "2020年4月2日";

        //格式化日期
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);

        Date date = dateFormat.parse(str_date);//抛异常，转换异常
        System.out.println("date = " + date);//Thu Apr 02 00:00:00 GMT+08:00 2020


    }

    /**
     *       对日期对象进行格式化
     * 将日期对象--->为日期格式的字符串
     *      使用的是DateFormat类中的format方法
     */
    public static void show01() {
        Date d = new Date();

        //DateFormat.getInstance(); 获取日期格式化对象，具有默认的风格
        DateFormat dateFormat = DateFormat.getInstance();
        String format = dateFormat.format(d);
        System.out.println("format = " + format);//2020/3/24 下午8:13

        //DateFormat.getTimeInstance(); 获取到秒
        String str_format = DateFormat.getTimeInstance().format(d);
        System.out.println("str_format = " + str_format);//下午8:15:35

        //传入指定的样式    static int     FULL 恒定的全风格图案
        String str_format02 = DateFormat.getTimeInstance(DateFormat.FULL).format(d);
        System.out.println("str_format02 = " + str_format02);// GMT+08:00 下午8:21:43

        // static  int   MEDIUM  中等风格图案的常数
        String str_format03 = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(d);
        System.out.println("str_format03 = " + str_format03);//下午8:23:41
        System.out.println("-----------------------------------");
        /**
         * 如果风格是自定义的，怎么搞？
         */
        dateFormat = new SimpleDateFormat("yyyy--MM-dd");//y代表年，M代表月，d代表日
        String format1 = dateFormat.format(d);
        System.out.println("format1 = " + format1); //2020--03-24
    }
}
