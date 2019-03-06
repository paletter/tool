package com.paletter.tool;

import java.util.Random;

public class RandomUtils {

	private static Random RANDOM = new Random();
	
	/**
	 * RandomUtils.nextInt(1) = 0 or 1
	 */
	public static int nextInt(int i) {
		return RANDOM.nextInt(i);
	}
	
	public static boolean hit(double rate) {
		return hit(1000000, rate * 1000000);
	}
	
	public static boolean hit(int cardinal, int target) {
		int rlt = RANDOM.nextInt(cardinal);
		return rlt < target;
	}
	
	public static boolean hit(int cardinal, float target) {
		int rlt = RANDOM.nextInt(cardinal);
		return rlt < target;
	}
	
	public static boolean hit(int cardinal, double target) {
		int rlt = RANDOM.nextInt(cardinal);
		return rlt < target;
	}
	
	public static boolean hit(float cardinal, float target) {
		int rlt = RANDOM.nextInt((int) cardinal);
		return rlt < target;
	}
	
	public static boolean hit(double cardinal, float target) {
		int rlt = RANDOM.nextInt((int) cardinal);
		return rlt < target;
	}
	
	/**
	 * return end >= value >= start.
	 * <pre>
	 * randomInt(1, 2) = 1 or 2
	 * </pre>
	 */
	public static Integer randomInt(int start, int end) {
		int bound = end - start + 1;
		return start + RANDOM.nextInt(bound);
	}
}
