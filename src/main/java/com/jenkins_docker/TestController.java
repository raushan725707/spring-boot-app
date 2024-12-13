package com.jenkins_docker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping
    public String testEndpoint() {
        return "Test Endpoint is working!";
    }


    @GetMapping("/hello/world")
    ResponseEntity<?> helloWorld(){
        return ResponseEntity.ok("hello world");

    }

    @GetMapping("/demo")
public String demo(){
        return "hello";
    }


    @GetMapping("/demod")
    public String demod(){
        return "hello";
    }

}
