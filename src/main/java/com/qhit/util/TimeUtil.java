package com.qhit.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    // 日期格式
    private static String dateFormat = "yyyy-MM-dd hh:mm:ss";
    /**
     * 将字符串转为日期格式
     *
     * @param dateStr
     *            符合格式的时间字符串
     * @return
     */
    public static Date format(String dateStr) {

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Date date = null;

        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
