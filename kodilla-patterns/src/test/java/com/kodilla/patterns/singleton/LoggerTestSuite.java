package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void createLog() {
        logger.getInstance().log("log #1");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = logger.getInstance().getLastLog();
        System.out.println("Last log: " + lastLog);
        //Then
        Assert.assertEquals("log #1", lastLog);
    }
}
