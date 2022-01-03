package org.acme;

import com.google.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class MyTest {

    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);


    @Inject
    TestService testService;


    @Test
    public void testCDI() {

        logger.info("--> running testCDI...");
        Assertions.assertNotNull(testService);
        // testService.test();
    }

}