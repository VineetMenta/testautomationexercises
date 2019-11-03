package com.cnu.mentoring.vineet.cdp.corejava.codeexamples;

import org.apache.log4j.Logger;

enum Shape {
	LINE(2), TRIANGLE(3), SQUARE(4), RECTANGLE(4), PENTAGON(5), HEXAGON(6);

	private int numberOfVertices;

	Shape(int numberOfVertices) {
		this.numberOfVertices = numberOfVertices;
	}

	public int getNumberOfVertices() {
		return this.numberOfVertices;
	}

}

public class EnumExample {
	private static final Logger LOGGER = Logger.getLogger(EnumExample.class);

	public static void main(String[] args) {
		Shape line = Shape.LINE;
		Shape triangle = Shape.TRIANGLE;
		Shape square = Shape.SQUARE;
		LOGGER.info(line.getNumberOfVertices());
		LOGGER.info(triangle.getNumberOfVertices());
		LOGGER.info(square.getNumberOfVertices());
	}
}