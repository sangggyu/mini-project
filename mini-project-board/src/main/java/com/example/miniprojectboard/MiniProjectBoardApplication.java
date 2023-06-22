package com.example.miniprojectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class MiniProjectBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniProjectBoardApplication.class, args);
    }

}
