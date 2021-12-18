package com.nal.log.log4jdemo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4jController {

    public static final Logger LOGGER = LogManager.getLogger(Log4jController.class);

    @GetMapping("/race")
    public String getUserId(@RequestParam("userId") String userId) {
        LOGGER.info("user id: " + userId);
        return "Greetings from Spring Boot!";
    }

}