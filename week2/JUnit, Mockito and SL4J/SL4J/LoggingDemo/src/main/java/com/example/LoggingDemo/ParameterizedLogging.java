package com.example.LoggingDemo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {
        String username = "Alice";
        int attempts = 5;

        logger.info("User {} attempted login {} times", username, attempts);
    }
}
