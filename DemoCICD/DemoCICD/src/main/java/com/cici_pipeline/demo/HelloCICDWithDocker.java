package com.cici_pipeline.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCICDWithDocker {
//using cicd with docker
    @GetMapping("/welcome")
    public String getMessage(){

        return "welcome Ashish Singh";
    }
}
