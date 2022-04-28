package com.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/contactServiceFallback")
    public String userServiceFallback(){
        return "User-Service is down at this time !!!!," +
                "Please try again later";
    }



}
