package com.paletter.tool;

import java.io.*;

public class IOWriterTool {

	public static int DEFAULT_BUFFERED_LENGTH = 1048576;// 1M
	
	public static void writeContent(OutputStream os, String str) throws IOException {
		os.write(str.getBytes());
		os.flush();
	}
	
	public static void writeContent(OutputStream os, String str, String charset) throws IOException {
		os.write(str.getBytes(charset));
		os.flush();
	}
	
	@SuppressWarnings("restriction")
	public static void writeContentWithLine(OutputStream os, String str) throws IOException {
		os.write(str.getBytes());
		os.write(System.lineSeparator().getBytes());
		os.flush();
	}
	
	public static void printlnWithFlush(OutputStream os, String str) {
		PrintWriter writer = new PrintWriter(os);
		writer.println(str);
		writer.flush();
	}
	
	public static void write(OutputStream os, InputStream is) throws IOException {
		byte[] b = new byte[DEFAULT_BUFFERED_LENGTH];
		int ins;
		while((ins = is.read(b)) != -1) {
			os.write(b, 0, ins);
			os.flush();
		}
	}
}
