package com.javatechie.springjenkins;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case executing...");
        logger.info("Test case executing second log statement...");
        assertEquals(true, true);
    }

}
