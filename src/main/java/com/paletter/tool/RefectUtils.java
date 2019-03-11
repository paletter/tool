package com.paletter.tool;

public class RefectUtils {

	public static <T> T invokeGetMethod(Object obj, String method, Class<T> clazz) {
		if (obj == null) return null;
		if (StringUtils.isEmpty(method)) return null;
		try {
			Object rlt = obj.getClass().getMethod(method).invoke(obj);
			if (rlt == null) return null;
			return clazz.cast(rlt);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static Integer invokeGetInt(Object obj, String method) {
		return invokeGetMethod(obj, method, Integer.class);
	}
	
	public static String invokeGetString(Object obj, String method) {
		return invokeGetMethod(obj, method, String.class);
	}
	
	public static Boolean invokeGetBoolean(Object obj, String method) {
		return invokeGetMethod(obj, method, Boolean.class);
	}
}
