package com.example.springk8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringK8sApplication {

     @GetMapping("/get")
     public String displayMessage() {
         return "deployed";
     }
    public static void main(String[] args) {
        SpringApplication.run(SpringK8sApplication.class, args);
    }

}
