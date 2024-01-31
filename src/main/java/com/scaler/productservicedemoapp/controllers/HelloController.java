package com.scaler.productservicedemoapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This class will have multiple methods that will be serving HTTP request  at /hello
// This controller will be service Rest (HTTP) APIs

// localhost:8080/hello
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/say-hello")
    public String sayhello(){
        return "Hey hii";
    }

    @GetMapping("/say/{name}/{times}")
    public String sayHello(@PathVariable("name") String name,
                           @PathVariable("times") int times){

        String answer = "";
        for (int i=0; i<times; i++) {
            answer += "Hello " + name;
            answer += "<br>";
        }
        return answer;
    }
}
