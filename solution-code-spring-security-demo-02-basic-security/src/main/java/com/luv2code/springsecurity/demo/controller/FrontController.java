package com.luv2code.springsecurity.demo.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class FrontController {
    final private static Logger logger = Logger.getLogger(FrontController.class);

    public void init()
    {
        setlog();
    }

    public void setlog()
    {
        PropertyConfigurator.configure("C:\\logJar\\log4j.properties");
        logger.debug("==================== start ====================");
    }
}
