package com.paletter.tool;

import com.alibaba.fastjson.JSONObject;

public class StringUtils {

	public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
	
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
	public static String toJSONString(Object object) {
		if (object == null) return null;
		return JSONObject.toJSONString(object);
	}
	
	public static String toLowerCaseFirstChar(String str) {
		if (isEmpty(str)) return str;
		return Character.isLowerCase(str.charAt(0)) ? str : 
			(new StringBuilder()).append(Character.toLowerCase(str.charAt(0))).append(str.substring(1)).toString();
	}
	
	public static String toUpperCaseFirstChar(String str) {
		if (isEmpty(str)) return str;
		return Character.isUpperCase(str.charAt(0)) ? str : 
			(new StringBuilder()).append(Character.toUpperCase(str.charAt(0))).append(str.substring(1)).toString();
	}
}
