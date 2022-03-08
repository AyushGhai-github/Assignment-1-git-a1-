package com.springboot.assignmnet3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
	@Autowired
	private serviceClass serviceclass;
	
	
	
	@GetMapping("/find")
	public List<User_information> FindAll()
	{
		return serviceclass.FindAll();
	}

	@GetMapping("/find/{Zipcode}")
	public User_information findByZip(@PathVariable("Zipcode") int Zipcode)
	{
		return serviceclass.findByZip(Zipcode);
	}

}
