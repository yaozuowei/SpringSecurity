package com.sans.common.util;



import com.sans.exception.NullParameterException;

import java.security.InvalidParameterException;
import java.util.*;
import java.util.regex.Pattern;

public final class StringUtil {
	private static final int TWO_BYTE_START = 0x100;

	/**
	 * @功能 判断字符串是否为空
	 * @说明 null或这trim().length==0 为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return null == str || str.trim().length() == 0;
	}

	/**
	 * @功能 将source根据指定的分界符delimiter，切成字符串数组
	 * @param source
	 *            源字符串
	 *            分界符
	 * @param trimTokens
	 *            切分出的字符串是否需要去除空格
	 * @param ignoreEmptyTokens
	 *            是否去除空字符串
	 * @return
	 * @throws NullParameterException
	 */
	public static String[] split(String source, String delimiter, boolean trimTokens, boolean ignoreEmptyTokens) {

		if (source == null || delimiter == null) {
			throw new RuntimeException(new NullParameterException());
		}
		StringTokenizer st = new StringTokenizer(source, delimiter);
		List<String> tokens = new ArrayList<String>();
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if (trimTokens) {
				token = token.trim();
			}
			if (!(ignoreEmptyTokens && token.length() == 0)) {
				tokens.add(token);
			}
		}
		return (String[]) tokens.toArray(new String[tokens.size()]);

	}

	/**
	 * @功能 将source根据指定的分界符集合，切成字符串数组
	 * @param source
	 *            源字符串
	 * @param delimiters
	 *            分界符集合
	 * @param trimTokens
	 *            切分出的字符串是否需要去除空格
	 * @param ignoreEmptyTokens
	 *            是否去除空字符串
	 * @return
	 * @throws NullParameterException
	 */
	public static String[] split(String source, String[] delimiters, boolean trimTokens, boolean ignoreEmptyTokens)
			throws NullParameterException {
		if (source == null || delimiters == null) {
			throw new NullParameterException();
		}
		Pattern pattern = Pattern.compile("[" + arrayToString(delimiters, "", false) + "]+");
		String[] strs = pattern.split(source);
		if (strs == null || strs.length == 0) {
			return null;
		}
		List<String> result = new ArrayList<String>();
		if (trimTokens) {
			for (String str : strs) {
				str = str.trim();
			}
		}
		if (ignoreEmptyTokens) {
			for (String str : strs) {
				if (!isEmpty(str)) {
					result.add(str);
				}
			}
		}
		if (result.size() == 0) {
			return null;
		}
		return result.toArray(new String[] {});
	}

	/**
	 * @功能 将soure数组变成通过delimiter链接的字符串
	 * @param source
	 * @param delimiter
	 * @param appendTail
	 *            是否在字符串末尾增加delimiter
	 * @return
	 */
	public static <T> String arrayToString(T[] source, String delimiter, boolean appendTail) {
		if (source == null) {
			return "";
		}
		StringBuffer bf = new StringBuffer();
		for (int i = 0; i < source.length; i++) {
			if (i == 0) {
				bf.append(source[i]);
			} else {
				bf.append(delimiter + source[i]);
			}
		}
		if (appendTail) {
			bf.append(delimiter);
		}
		return bf.toString();
	}

	/**
	 * @功能 将soure集合变成通过delimiter链接的字符串
	 * @param source
	 * @param delimiter
	 * @param appendTail
	 *            是否在字符串末尾增加delimiter
	 * @return
	 */
	public static <T> String listToString(List<T> source, String delimiter, boolean appendTail) {
		if (source == null) {
			return "";
		}
		StringBuffer bf = new StringBuffer();
		for (int i = 0; i < source.size(); i++) {
			if (i == 0) {
				bf.append(source.get(i));
			} else {
				bf.append(delimiter + source.get(i));
			}
		}
		if (appendTail) {
			bf.append(delimiter);
		}
		return bf.toString();
	}

	/**
	 * @功能 将soure集合变成通过delimiter链接的字符串
	 * @param source
	 * @param delimiter
	 * @param appendTail
	 *            是否在字符串末尾增加delimiter
	 * @return
	 */
	public static String setToString(Set<String> source, String delimiter, boolean appendTail) {
		if (source == null) {
			return "";
		}
		StringBuffer bf = new StringBuffer();
		for (String string : source) {
			if (bf.length() == 0) {
				bf.append(string);
			} else {
				bf.append(delimiter + string);
			}
		}
		if (appendTail) {
			bf.append(delimiter);
		}
		return bf.toString();
	}

	/**
	 * @功能 将source集合变成有，链接的字符串，并将source集合的每个值的两端加上单引号
	 * @说明 数据库设置in (param) 参数专用
	 * @param source
	 * @return
	 */
	public static String listToStringForSqlInParam(List<String> source) {
		if (source == null) {
			return "";
		}
		String delimiter = ",";
		StringBuffer bf = new StringBuffer();
		for (int i = 0; i < source.size(); i++) {
			if (i == 0) {
				bf.append("'" + source.get(i) + "'");
			} else {
				bf.append(delimiter + "'" + source.get(i) + "'");
			}
		}
		return bf.toString();
	}

	/**
	 * @功能 unicode转为本地字符
	 * @param s
	 *            Unicode编码的字符串
	 * @return String
	 */
	public static String unicode2native(String s) {
		if (s == null || s.length() == 0) {
			return null;
		}
		char[] buffer = new char[s.length() * 2];
		char c;
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= TWO_BYTE_START) {
				c = s.charAt(i);
				byte[] buf = ("" + c).getBytes();
				buffer[j++] = (char) buf[0];
				buffer[j++] = (char) buf[1];
			} else {
				buffer[j++] = s.charAt(i);
			}
		}
		return new String(buffer, 0, j);
	}

	/**
	 * 本地字符集转换成unicode
	 * 
	 * @return java.lang.String
	 */
	public static String native2unicode(String s) {
		if (s == null || s.length() == 0) {
			return null;
		}
		byte[] buffer = new byte[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= TWO_BYTE_START) {
				return s;
			}
			buffer[i] = (byte) s.charAt(i);
		}
		return new String(buffer);
	}

	/**
	 * 校验字符串参数
	 * 
	 * @param str
	 *            字符串参数
	 * @param maxLength
	 *            字符串最大长度
	 * @return 校验通过的字符串
	 * @throws NullParameterException
	 * @throws IllegalArgumentException
	 * @throws InvalidParameterException
	 */
	public static String validateString(String str, int maxLength, boolean allowNull)
			throws NullParameterException, IllegalArgumentException {
		if (str == null || str.trim().length() == 0) {
			if (allowNull) {
				return str;
			} else {
				throw new NullParameterException();
			}
		}
		str = str.trim();
		if (str.length() > maxLength) {
			throw new IllegalArgumentException("字符串超过最大长度");
		}
		return str;
	}

	/**
	 * 
	 * @param str
	 * @param maxLength
	 * @param regex
	 *            正则表达式
	 * @return
	 */
	public static String validateString(String str, int maxLength, String regex) {
		throw new RuntimeException();
	}

	/**
	 * 
	 * @param str
	 * @param maxLength
	 * @param exclusiveString,不允许包含的字符串
	 * @return
	 * @throws IllegalArgumentException
	 * @throws NullParameterException
	 * @throws InvalidParameterException
	 */
	public static String validateString(String str, int maxLength, String[] exclusiveString)
			throws IllegalArgumentException, NullParameterException {
		str = validateString(str, maxLength, false);
		if (exclusiveString != null && exclusiveString.length > 0) {
			for (int i = 0; i < exclusiveString.length; i++) {
				if (exclusiveString[i] != null) {
					if (str.indexOf(exclusiveString[i]) > 0) {
						throw new IllegalArgumentException("字符串包含非法字符，非法字符包括：" + exclusiveString[i]);		
					}
				}
			}
		}

		return str;
	}

	public static String replaceHtml(String old) {
		String rt = replace(old, "<", "&lt;");
		rt = replace(rt, ">", "&gt;");
		rt = replace(rt, "'", "&quot;");
		rt = replace(rt, "'", "&quot;");
		rt = replace(rt, "\"", "&quot;");
		return rt;
	}

	public static String replace(String inString, String oldPattern, String newPattern) {
		if (inString == null) {
			return null;
		}
		if (oldPattern == null || newPattern == null) {
			return inString;
		}

		StringBuffer sbuf = new StringBuffer();
		// output StringBuffer we'll build up
		int pos = 0; // Our position in the old string
		int index = inString.indexOf(oldPattern);
		// the index of an occurrence we've found, or -1
		int patLen = oldPattern.length();
		while (index >= 0) {
			sbuf.append(inString.substring(pos, index));
			sbuf.append(newPattern);
			pos = index + patLen;
			index = inString.indexOf(oldPattern, pos);
		}
		sbuf.append(inString.substring(pos));

		// remember to append any characters to the right of a match
		return sbuf.toString();
	}
	
	/**
	 * 生成随机长度的字符窜
	 * @param length
	 * @return
	 */
	public static String generateStr(int length) {
		String sources = "0123456789ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random rand = new Random();
		StringBuffer flag = new StringBuffer();
		for (int j = 0; j < length; j++) {
			flag.append(sources.charAt(rand.nextInt(61)) + "");
		}
		return flag.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(generateStr(32));
	}
	
	/**
	 * 在字符串前面，按照总长度，补齐字符
	 * 
	 * @param str
	 *            要填补的字符串
	 * @param totalLength
	 *            总长度，补齐后的长度
	 * @param padChar
	 *            填补的字符
	 * @return 如果IsEmpty(str)则，返回长度为totalLength的字符为padChar的字符串。
	 *         <p>
	 *         如果str的长度大于等于totalLength，则返回str；
	 *         <p>
	 *         如果str的长度小于totalLength,则在str左侧填补padChar
	 * @see com.example.demo.common.util.StringUtil#IsEmpty(String)
	 */
	/**
	 * @param str
	 * @param totalLength
	 * @param padChar
	 * @return
	 */
	public static String padLeft(String str, int totalLength, char padChar) {
		if (isEmpty(str)) {
			char[] chars = new char[totalLength];
			Arrays.fill(chars, padChar);
			return new String(chars);
		}
		if (str.length() >= totalLength) {
			return str;
		}

		char[] chars = new char[totalLength];
		char[] strChars = str.toCharArray();
		Arrays.fill(chars, 0, totalLength - strChars.length, padChar);
		System.arraycopy(strChars, 0, chars, totalLength - strChars.length,
				strChars.length);
		return new String(chars);
	}
	/**
	 * 截取字符串最后一个end字符
	 * @param str
	 * @param end
	 * @return
	 */
	public static String trimEnd(String str,char end) {
		if(str.charAt(str.length()-1)==end) {
			return str.substring(0,str.length()-1);
		}
		return str;
	}

}
