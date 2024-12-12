package com.jenkins_docker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping
    ResponseEntity<?> test(){
        return ResponseEntity.ok("\"Hello from spring boot app\"");
    }

}
