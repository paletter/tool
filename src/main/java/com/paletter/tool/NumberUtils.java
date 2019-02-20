package com.paletter.tool;

import java.math.BigDecimal;

public class NumberUtils {

	public static Integer add(Integer i1, Integer i2) {
		if (i1 == null) i1 = 0;
		if (i2 == null) i2 = 0;
		return i1 + i2;
	}

	public static Float divideFloat(Integer arg1, Integer arg2) {
		return Float.valueOf(arg1) / Float.valueOf(arg2);
	}
	
	public static Float divideFloat(Float arg1, Integer arg2) {
		return Float.valueOf(arg1) / Float.valueOf(arg2);
	}
	
	public static Float divideFloat(Integer arg1, Integer arg2, int scale) {
		if (arg2 == 0) return 0f;
		BigDecimal b1 = BigDecimal.valueOf(arg1);
		BigDecimal b2 = BigDecimal.valueOf(arg2);
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).floatValue();
	}
	
	public static Float divideFloat(Float arg1, Integer arg2, int scale) {
		if (arg2 == 0) return 0f;
		BigDecimal b1 = BigDecimal.valueOf(arg1);
		BigDecimal b2 = BigDecimal.valueOf(arg2);
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).floatValue();
	}
	
	public static Float divideFloat(Float arg1, Float arg2, int scale) {
		if (arg2 == 0) return 0f;
		BigDecimal b1 = BigDecimal.valueOf(arg1);
		BigDecimal b2 = BigDecimal.valueOf(arg2);
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).floatValue();
	}
	
	public static Integer divideInteger(Integer arg1, Integer arg2, int roundingMode) {
		if (arg2 == 0) return 0;
		BigDecimal b1 = BigDecimal.valueOf(arg1);
		BigDecimal b2 = BigDecimal.valueOf(arg2);
		return b1.divide(b2, 0, roundingMode).intValue();
	}
	
	public static Integer divideInteger(Double arg1, Integer arg2, int roundingMode) {
		if (arg2 == 0) return 0;
		BigDecimal b1 = BigDecimal.valueOf(arg1);
		BigDecimal b2 = BigDecimal.valueOf(arg2);
		return b1.divide(b2, 0, roundingMode).intValue();
	}
	
	public static Integer divideInteger(Double arg1, Integer arg2) {
		return divideInteger(arg1, arg2, BigDecimal.ROUND_HALF_UP);
	}
	
	public static Integer divideInteger(Integer arg1, Integer arg2) {
		return divideInteger(arg1, arg2, BigDecimal.ROUND_HALF_UP);
	}
	
	public static BigDecimal divideBigDecimal(Integer i1, Integer i2) {
		return divideBigDecimal(i1, i2, 2);
	}
	
	public static BigDecimal divideBigDecimal(Integer i1, Integer i2, int scale) {
		if (i1 == null) i1 = 0;
		if (i2 == null) return BigDecimal.ZERO;
		return divideBigDecimal(new BigDecimal(i1), new BigDecimal(i2), scale);
	}
	
	public static BigDecimal divideBigDecimal(BigDecimal b1, BigDecimal b2) {
		return divideBigDecimal(b1, b2, 2);
	}
	
	public static BigDecimal divideBigDecimal(BigDecimal b1, BigDecimal b2, int scale) {
		if (b1 == null) b1 = BigDecimal.ZERO;
		if (b2 == null) return BigDecimal.ZERO;
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP);
	}

	public static Float multiFloat(Float arg1, Float arg2, int scale) {
		BigDecimal b1 = BigDecimal.valueOf(arg1);
		BigDecimal b2 = BigDecimal.valueOf(arg2);
		return b1.multiply(b2).setScale(scale, BigDecimal.ROUND_HALF_UP).floatValue();
	}
	
	public static Integer multiInteger(Float... arg1) {
		BigDecimal r = null;
		for (Float f : arg1) {
			BigDecimal b = BigDecimal.valueOf(f);
			if (r == null) r = b;
			else r = b.multiply(r);
		}
		return r.setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
	}
	
	public static Integer multiInteger(Float arg1, Integer arg2) {
		BigDecimal b1 = BigDecimal.valueOf(arg1);
		BigDecimal b2 = BigDecimal.valueOf(arg2);
		return b1.multiply(b2).setScale(0, BigDecimal.ROUND_HALF_UP).intValue();
	}
	
	public static Integer nullForZero(Integer i) {
		return i == null ? 0 : i;
	}
	
	public static Integer getIntAvg(Integer max, Integer min) {
		if (max == null || min == null) return 0;
		return min + (max - min) / 2;
	}
	
	public static Float addFloat(Float...floats) {
		BigDecimal r = BigDecimal.ZERO;
		for (Float f : floats) r = r.add(new BigDecimal(f + ""));
		return r.floatValue();
	}
	
	public static Float addFloat(int scale, Float...floats) {
		BigDecimal r = BigDecimal.ZERO;
		for (Float f : floats) r = r.add(new BigDecimal(f + ""));
		return r.setScale(scale, BigDecimal.ROUND_HALF_UP).floatValue();
	}
	
	public static Float subFloat(Float f1, Float...floats) {
		BigDecimal r = new BigDecimal(f1 + "");
		for (Float f : floats) r = r.subtract(new BigDecimal(f + ""));
		return r.floatValue();
	}
	
	public static Float subFloat(int scale, Float f1, Float...floats) {
		BigDecimal r = new BigDecimal(f1 + "");
		for (Float f : floats) r = r.subtract(new BigDecimal(f + ""));
		return r.setScale(scale, BigDecimal.ROUND_HALF_UP).floatValue();
	}
	
	public static Float setScale(Float f, int scale) {
		return new BigDecimal(f + "").setScale(scale, BigDecimal.ROUND_UP).floatValue();
	}
}
