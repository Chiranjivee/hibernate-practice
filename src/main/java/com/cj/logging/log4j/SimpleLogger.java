package com.cj.logging.log4j;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class SimpleLogger {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(SimpleLogger.class);
        logger.info("This is a sample message");
    }
}
