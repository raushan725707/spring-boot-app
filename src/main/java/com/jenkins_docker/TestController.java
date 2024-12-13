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

    @GetMapping("/second")
    ResponseEntity<?> test2(){
        return ResponseEntity.ok("\"Hello from spring boot app\"");
    }

    @GetMapping("/test")
    ResponseEntity<?> test3(){
        System.out.println("hello from spring boot app");
        return ResponseEntity.ok("\"Hello from spring boot app\"");
    }
    @GetMapping("/test2")
    ResponseEntity<?> test4(){
        System.out.println("hello from spring boot app");
        return ResponseEntity.ok("\"Hello from spring boot app\"");
    }

    @GetMapping("/test4")
    ResponseEntity<?> test5(){
        System.out.println("hello from spring boot app");
        return ResponseEntity.ok("\"Hello from spring boot app\"");
    }

    @GetMapping("/hello/world")
    ResponseEntity<?> helloWorld(){
        return ResponseEntity.ok("hello world");

    }

}
