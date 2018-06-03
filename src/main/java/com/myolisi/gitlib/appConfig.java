package com.myolisi.gitlib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class appConfig {
    public static void main(String[] args) {
        SpringApplication.run(appConfig.class, args);
    }
}
