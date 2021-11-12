package com.example.log4j2example.ch1;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    final static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        MyObject obj = new MyObject(10, 20);
        logger.log(Level.ALL,"LOG TEST");
        logger.info("INFO TEST");
        logger.error("ERROR TEST");
        logger.debug("DEBUG TEST");
        logger.warn("WARN TEST");
        logger.fatal("FATAL TEST");
        logger.debug(obj);
        logger.error("ERROR2 TEST");
        System.out.println(logger.getLevel());
        System.out.println(logger.getLevel().intLevel());
    }
}

class MyObject {
    private final int a;
    private final int b;

    public MyObject(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}