package com.clone.rider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.IOException;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationClass {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(ApplicationClass.class, args);

    }
}
