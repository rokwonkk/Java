package Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        /**
         *
         *  Calendar year month day + time
         *  Date     year month day + time
         *
         */
        Calendar cal = new GregorianCalendar();

        Calendar cal1 = Calendar.getInstance();

        //오늘 날짜(get)
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;    // 0 ~ 11
        int day = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println(year +"년 "+ month +"월 "+ day +"일 "+ hour +"시 "+ minute +"분 "+ second + "초 ");

        //날짜를 셋팅(set)
        cal.set(Calendar.YEAR, 2024);
        cal.set(Calendar.MONTH, 3-1);
        cal.set(Calendar.DATE, 1);

        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH)+1;    // 0 ~ 11
        day = cal.get(Calendar.DATE);

        System.out.println(year +"년 "+ month +"월 "+ day +"일 ");

        //요일 1 ~ 7 -> 일 ~ 토
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(weekday);

        //지정한 달의 마지막 날짜 28 29 30 31
        int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(lastday);
    }
}