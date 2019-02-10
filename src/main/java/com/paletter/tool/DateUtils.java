package com.paletter.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

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
}
