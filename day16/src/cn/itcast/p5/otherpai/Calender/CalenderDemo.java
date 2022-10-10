package cn.itcast.p5.otherpai.Calender;

import java.util.Calendar;

/**
 * Date日期类 被 Calender取代
 * <p>
 * Calender 日历类：抽象类
 */
public class CalenderDemo {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        c.set(2011, 3, 20); //设置时间
        c.add(Calendar.MONTH, 2);

        showDate(c);

    }

    public static void showDate(Calendar c) {
        /**
         *    get(字段); 返回给定的字段的值，字段都是静态的
         *          Calendar.YEAR 年
         */
        int year = c.get(Calendar.YEAR);//获取年
        int month = c.get(Calendar.MONTH);//获取月份 【0开始】
        int day = c.get(Calendar.DAY_OF_MONTH);// 获取月中的某一天

        int week = c.get(Calendar.DAY_OF_WEEK);//4 【星期日为第一天】

        System.out.println(year + "年" + (month + 1) + "月" + day + "日," + getWeek(week));
    }

    private static String getWeek(int i) {
        String[] weeks = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

        return weeks[i];
    }
}
