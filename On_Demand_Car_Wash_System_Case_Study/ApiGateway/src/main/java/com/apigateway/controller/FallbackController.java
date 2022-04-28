package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {


	    @GetMapping("/userServiceFallback")
	    public String userServiceFallback(){
	        return "Customer-Service is down at this time !!!!," +
	                "Please try again later";
	    }

	 

	
	

}
