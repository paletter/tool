package com.paletter.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DateUtils {

	/** yyyy-MM-dd */
	public static final String FORMAT_YMD = "yyyy-MM-dd";
	/** yyyy-MM-dd HH:mm:ss */
	public static final String FORMAT_YMD_HMS = "yyyy-MM-dd HH:mm:ss";
	/** HH:mm */
	public static final String FORMAT_HM = "HH:mm";
	
	/**
	 * Parse String to Date
	 * @param date
	 * @param format
	 * @return
	 */
	public static Date parse(String date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Parse Date to String
	 * @param date
	 * @param format
	 * @return
	 */
	public static String format(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.format(date);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

    /**
     * Add days
     * @param date
     * @param dayNum
     * @return
     */
    public static Date addDay(Date date, int dayNum) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        gc.add(GregorianCalendar.DATE, dayNum);
        return gc.getTime();
    }
    
    /**
     * Add days
     * @param date
     * @param dayNum
     * @return
     */
    public static String addDayFormat(Date date, int dayNum, String format) {
    	GregorianCalendar gc = new GregorianCalendar();
    	gc.setTime(date);
    	gc.add(GregorianCalendar.DATE, dayNum);
    	return format(gc.getTime(), format);
    }

    /**
     * <p>
     * splitDate("2017-12-30", "2018-01-02") = ["2017-12-30", "2017-12-31", "2018-01-01", "2018-01-02"]
     * </p>
     * @param startMonth
     * @param endMonth
     * @return
     */
    public static List<String> splitDate(String startDate, String endDate) {
    	List<String> dateList = new ArrayList<>();
    	Date start = DateUtils.parse(startDate, "yyyy-MM-dd");
		Date end = DateUtils.parse(endDate, "yyyy-MM-dd");
		while (start.compareTo(end) <= 0) {
			dateList.add(DateUtils.format(start, "yyyy-MM-dd"));
			start = DateUtils.addDay(start, 1);
		}
		return dateList;
    }
}
