package com.example.LoggingDemo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {
        logger.info("This message should go to console and file!");
        logger.debug("This is a debug message.");
        logger.warn("This is a warning with appenders.");
    }
}
