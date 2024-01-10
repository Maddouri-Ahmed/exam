package com.example.examenahmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ExamenAhmedApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenAhmedApplication.class, args);
    }

}
