package com.example.microservicesclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroservicesClientOneApplication {

    @GetMapping("/hello")
    public String get() {
        return "microservices-one";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesClientOneApplication.class, args);
    }

}
