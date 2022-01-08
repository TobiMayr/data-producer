package com.tobiasmayr.dataproducer.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    Logger logger = LoggerFactory.getLogger(HealthCheckController.class);

    @RequestMapping
    public String healthCheck(){
        logger.info("Health check reached");
        return "Healthy";
    }
}
