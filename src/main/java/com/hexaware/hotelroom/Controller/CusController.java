package com.hexaware.hotelroom.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.hotelroom.Entity.Customer;
import com.hexaware.hotelroom.Service.CusService;

@RestController
@RequestMapping("/api/customer")
public class CusController {

	@Autowired CusService cser;
	
	
	//add a customer
	@PostMapping("/add")
	public Customer add(@RequestBody Customer c) {
		return cser.add(c);
	}
	
}
