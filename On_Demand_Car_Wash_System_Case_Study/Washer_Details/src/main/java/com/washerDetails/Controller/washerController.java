package com.washerDetails.Controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.washerDetails.Repository.Service.washerService;
import com.washerDetails.model.Washers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/washer")
public class washerController {
	
	@Autowired
	private washerService service;
	
	//THIS IS USE TO GET ALL WASHERS
	@GetMapping("/")
    public ResponseEntity<List<Washers>> getAllWashers() {
        List<Washers> list = service.getAllWashers();

        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));

    }
	
	//THIS IS USE TO ADD NEW WASHER
	@PostMapping("/")
	public ResponseEntity<Washers> addWasher(@RequestBody Washers washer)
	{
		try {
			System.out.println(washer);
			service.setWasher(washer);
			return ResponseEntity.ok(washer);
			}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	//THIS IS TO GET WASHER BY ID
	@GetMapping("/{id}")
    public ResponseEntity<Washers> getCustomerById(@PathVariable("id") int id) {

        try {
            Washers washer = service.getWasherById(id);
            return ResponseEntity.of(Optional.of(washer));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }
		//THIS IS USE TO UPDATE THE WASHER
    @PutMapping("/{id}")
    public ResponseEntity<Washers> updateCustomer(@RequestBody Washers washer, @PathVariable("id") int id) {
    	  Washers washer1 = null;
        try {
            washer =service.updateWasherById(washer);
            return ResponseEntity.ok().body(washer1);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    //THIS IS USE TO DELETE THE WASHER
    @DeleteMapping("/{id}")
    public ResponseEntity<Washers> deleteCustomer(@PathVariable("id") int id) {
        try {
            Washers washer = service.getWasherById(id);
            service.deleteWasherById(id);
            return ResponseEntity.ok().body(washer);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
	

	
	


}
