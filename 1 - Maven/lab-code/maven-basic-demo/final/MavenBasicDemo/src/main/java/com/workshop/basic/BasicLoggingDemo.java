package com.workshop.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicLoggingDemo {

	private static final Logger LOGGER = LoggerFactory.getLogger(BasicLoggingDemo.class);

	public static void main(String[] args) {
		LOGGER.info("Some basic information");
		LOGGER.warn("Warning ! Something bad happened");
		LOGGER.error("An error occurred");
	}
}
