package com.cj.logging.log4j;

import org.apache.log4j.Logger;

public class SimpleLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(SimpleLogger.class);
        logger.info("This is a sample message");
    }
}
