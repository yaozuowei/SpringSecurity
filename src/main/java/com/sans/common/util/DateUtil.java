package com.sans.common.util;


import com.sans.exception.NullParameterException;
import com.sans.exception.PlatException;

import javax.sql.DataSource;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 日期相关的静态处理函数
 *
 */
public final class DateUtil {

	/**
	 * 默认日期格式：yyyy-MM-dd
	 */
	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

	/**
	 * 默认时间格式：yyyy-MM-dd HH:mm:ss
	 */
	public static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 默认时间格式：yyyy-MM-dd HH:mm
	 */
	public static final String DEFAULT_DATEMIN_PATTERN = "yyyy-MM-dd HH:mm";

	/**
	 * 默认时间戳格式，到毫秒 yyyy-MM-dd HH:mm:ss SSS
	 */
	public static final String DEFAULT_DATEDETAIL_PATTERN = "yyyy-MM-dd HH:mm:ss SSS";

	/**
	 * 全用"-"分割的format格式
	 */
	public static final String DEFAULT_DATEDETAIL_PATTERN_1 = "yyyy-MM-dd-HH-mm-ss-SSS";

	/**
	 * @功能 取默认当前时间
	 * @说明 如果系统默认当前时间是jvm时间，则调用currentJvmDate;否则调用currentDbDate
	 * @return
	 */
	public static Date currentDate() {
		return currentJvmDate();
	}
	
	/**
	 * @功能 取默认当前时间
	 * @说明 如果系统默认当前时间是jvm时间，则调用currentJvmDate;否则调用currentDbDate
	 * @return
	 */
	public static java.sql.Date currentSqlDate() {
		return new java.sql.Date(new Date().getTime());
	}

	/**
	 * 取得当前系统时间
	 *
	 * @return
	 */
	public static Timestamp currentTimestamp() {
		return new Timestamp(System.currentTimeMillis());
	}

	/**
	 * @功能 取当前java虚拟机时间
	 * @return
	 */
	public static Date currentJvmDate() {
		return new Date();
	}

	/**
	 * @功能 取当前数据库时间
	 * @说明 数据库类型根据当前数据库链接获取
	 * @param ds
	 *            数据源
	 * @return
	 */
	public static Date currentDbDate(DataSource ds) {
		throw new RuntimeException("功能尚未实现");
	}

	/**
	 * @功能 将日期字符串解析我日期类型数据。
	 * @param dateString
	 * @param formatString
	 * @return
	 */
	public static Date toDate(String dateString, String formatString) throws ParseException, NullParameterException {
		try {
			if (StringUtil.isEmpty(dateString) || StringUtil.isEmpty(formatString)) {
				throw new NullParameterException();
			}
			return getDateParser(formatString).parse(dateString.trim());
		} catch (ParseException e) {
			throw new PlatException(e);
		}
	}

	/**
	 * @功能 根据dateField各字段值构造时间
	 * @param year
	 * @param month
	 * @param day
	 * @param hour
	 * @param minute
	 * @param second
	 * @param millisecond
	 * @return
	 */
	public static Date toDate(int year, int month, int day, int hour, int minute, int second, int millisecond)
			throws IllegalArgumentException {
		throw new RuntimeException("功能尚未实现");
	}

	/**
	 * @功能 将日期转换为指定格式的字符串
	 * @param date
	 * @param fromatString
	 * @return
	 */
	public static String toDateString(Date date, String fromatString) {
		try {
			if (date == null || StringUtil.isEmpty(fromatString)) {
				throw new NullParameterException();
			}
			return getDateParser(fromatString).format(date);
		} catch (NullParameterException e) {
			throw new PlatException(e);
		}

	}

	/**
	 * 将java.util.Date对象转换为字符串，使用默认日期格
	 *
	 * @param date
	 * @return
	 */
	public static String toDateString(Date date) {
		return getDateParser(DEFAULT_DATE_PATTERN).format(date);
	}

	private static Map<String, SimpleDateFormat> parsers = new HashMap<String, SimpleDateFormat>();

	private static SimpleDateFormat getDateParser(String pattern) {
		SimpleDateFormat parser = parsers.get(pattern);
		if (parser == null) {
			parser = new SimpleDateFormat(pattern);
			parsers.put(pattern, parser);
		}
		return (SimpleDateFormat) parser;
	}

	/**
	 * 时间相加 小时
	 */
	public static Date addDateByHour(Date date, int hour) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.HOUR_OF_DAY, hour);
		return cal.getTime();
	}

	/**
	 * 时间相加 小时
	 */
	public static Date addDateByMin(Date date, int min) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MINUTE, min);
		return cal.getTime();
	}

	/**
	 * 将String类型转换为Date，根据自定义模式
	 */
	public static Date string2Date(String date, String pattern) {
		DateFormat dataformat = new SimpleDateFormat(pattern);
		dataformat.setLenient(false);
		try {
			return dataformat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			// return new Date();
			throw new PlatException(e);
		}
	}

	/**
	 * @param date
	 *            格式（Fri Oct 31 18:00:00 UTC+0800 2008 ）
	 * @return
	 */
	public static String toDateString(String date) {
		// Fri Oct 31 18:00:00 UTC+0800 2008
		Map month = new HashMap();
		month.put("Jan", "01");
		month.put("Feb", "02");
		month.put("Mar", "03");
		month.put("Apr", "04");
		month.put("May", "05");
		month.put("Jun", "06");
		month.put("Jul", "07");
		month.put("Aug", "08");
		month.put("Sep", "09");
		month.put("Oct", "10");
		month.put("Nov", "11");
		month.put("Dec", "12");

		String[] split = date.split(" "); // 根据空格组成数组

		// 通过修改这里可以得到你想要的格式
		String dateStr = split[5] + "-" + month.get(split[1]) + "-" + split[2] + " " + split[3];

		return dateStr;
	}

	/**
	 * 取得系统当前年份
	 * @return
	 */
	public static int currentYear()
	{
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.YEAR);
	}

}
