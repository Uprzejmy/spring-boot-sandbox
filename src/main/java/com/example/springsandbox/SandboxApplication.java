package com.example.springsandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SandboxApplication {

    Logger logger = LoggerFactory.getLogger(SandboxApplication.class);

    @RequestMapping("/")
    String home() {
        logger.info("/ resource requested");
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SandboxApplication.class, args);
    }

}