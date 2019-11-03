package com.cnu.mentoring.vineet.cdp.corejava.codeexamples;

import org.apache.log4j.Logger;

public class StringExamples {
	private static final Logger LOGGER = Logger.getLogger(StringExamples.class);

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Hello World!");
		String str1 = new String("Hello World !");
		String str2 = "Hi World!";

		// String comparison is done using .equals() method
		display(str1.equals(str2));

		// String concatenation is done using the '+' operator or concat()
		display(str1.concat(str2));
		display(str1 + str2);

		// Accessing parts of string is done by substring(int startingIndex, int
		// endingIndex) method.
		// The starting index is inclusive and endingIndex is exclusive
		display(str1.substring(2));
		display(str1.substring(2, 5));

		// printing stringBuilder, should use toString method to give String output
		display(stringBuilder.toString());
		display(stringBuilder.length());
		display(stringBuilder.substring(2, 5));
		display(stringBuilder.reverse());
		display(stringBuilder.append("Hello World!"));
		display(stringBuilder.replace(12, stringBuilder.length(), " "));
		display(stringBuilder.charAt(5));
	}

	public static void display(Object string) {
		LOGGER.info(string);
	}
}
