package org.acme;

import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class TestService {

    private static final Logger logger = LoggerFactory.getLogger(TestService.class);

    public String test() {
        logger.debug("--> test service");
        return "hello from TestService";
    }

}
