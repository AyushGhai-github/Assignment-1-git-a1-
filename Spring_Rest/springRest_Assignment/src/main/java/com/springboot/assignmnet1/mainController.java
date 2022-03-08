package com.springboot.assignmnet1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
	
	@RequestMapping("/hello")
	public String hello()
	{
		System.out.println("successful");
		return "Hello World";
	}

}
