package JavaPrograms.IFElse;

import java.util.*;

class PrintDate {
    public static void main(String args[]) {
        int day, month, year;
        int second, minute, hour;
        Calendar date = Calendar.getInstance();

        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR_OF_DAY);

        System.out.println("current date is " + day + "/" + (month + 1) + "/" + year);

        System.out.println("current time is " + hour + "/" + minute + ":" + second);
    }
}
