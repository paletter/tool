package com.paletter.tool;

public class ThreadUtils {

	public static void sleep(long millSecond) {
		
		try {
			Thread.currentThread().sleep(millSecond);
		} catch (InterruptedException e) {
		}
	}
}
