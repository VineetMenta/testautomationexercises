package com.cnu.mentoring.vineet.cdp.corejava.codeexamples;

import org.apache.log4j.Logger;

public class KeyWordExamples {
	private static final Logger LOGGER = Logger.getLogger(KeyWordExamples.class);

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			try {
				exceptionExample();
				continue;
			} catch (Exception ex) {
				ex.printStackTrace();
				break;
			}
		}
	}

	public static void exceptionExample() throws Exception {
		try {
			print("Hello World!");
			throw new Exception();
		} catch (Exception ex) {
			print("Exception caught");
		} finally {
			print("This will run even if the exception is caught");
		}
	}

	public static void print(Object object) {
		LOGGER.info(object);
	}
}
