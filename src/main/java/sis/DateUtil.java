package sis;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by AidenChoi on 2016. 11. 20..
 */
public class DateUtil {
    public Date createDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }
}
