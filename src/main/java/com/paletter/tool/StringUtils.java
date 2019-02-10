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
}
