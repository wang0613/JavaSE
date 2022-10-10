package demo01;

import java.util.Calendar;

public class 测试 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        for (int year = 1999; year < 1000000; year += 100) {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, 11); //西方人认为0为一月
            calendar.set(Calendar.DAY_OF_MONTH, 31);

//            System.out.println(year + "  " + calendar.get(Calendar.DAY_OF_WEEK));
            //如果星期日是1
            if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
                System.out.println(year);
                break;
            }

        }


    }
}
