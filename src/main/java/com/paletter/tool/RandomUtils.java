package com.paletter.tool;

import java.util.Random;

public class RandomUtils {

	private static Random RANDOM = new Random();
	
	public static int nextInt(int i) {
		return RANDOM.nextInt(i);
	}
	
	public static int random(int min, int max) {
		return RANDOM.nextInt(max - min) + min;
	}
}
