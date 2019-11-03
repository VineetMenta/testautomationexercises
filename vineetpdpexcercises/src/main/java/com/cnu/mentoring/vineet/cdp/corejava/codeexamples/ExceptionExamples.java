package com.cnu.mentoring.vineet.cdp.corejava.codeexamples;

import org.apache.log4j.Logger;

class SampleException extends Throwable {
	public String issue() {
		return "This is my custom message";
	}
}

public class ExceptionExamples {
	private static final Logger LOGGER = Logger.getLogger(ExceptionExamples.class);

	public static void main(String[] args) {
		try {
			throw new SampleException();
		} catch (SampleException ex) {
			LOGGER.info(ex.issue());
		}
	}
}
