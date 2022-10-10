package cn.itcast.p4.otherapi.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期类练习：
 * 2020-3-7 到 2020-4-20， 中间有多少天？
 * 
 * 思路： 两个日期相减就行了
 * 必须要有两个进行减法运算的数（毫秒值 Date对象）
 * 
 * 1.字符串————————》Date对象
 * 2.Date对象------》毫秒值 
 * 3. 相减
 */
public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        String str_date1 = "2020-3-7 ";
        String str_date2 ="2020-4-20";
        
        Test(str_date1,str_date2);
    }

    private static void Test(String str_date1,String str_date2) throws ParseException {
        //1.将日期字符串转换为Date对象
        DateFormat dateFormat = DateFormat.getDateInstance();
        dateFormat = new SimpleDateFormat("yyyy-MM-dd"); //哪一种都可以

        Date d1 = dateFormat.parse(str_date1);//parse转换为日期对象
        Date d2 = dateFormat.parse(str_date2);
        
        //2.日期对象转换为毫秒值
        Long time1 = d1.getTime();
        Long time2 = d2.getTime();
        
        Long time =Math.abs(time1 - time2) ;//数学类中的绝对值

        int day = getDay(time);
        System.out.println("day = " + day);
        
    }

    //将毫秒值转换 为 日期
    private static int getDay(Long time) {
        int day = (int)(time/1000/60/60/24);
        return day;
    }
}
