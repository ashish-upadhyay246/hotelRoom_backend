package com.hexaware.hotelroom.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hotelroom.Entity.Customer;
import com.hexaware.hotelroom.Repository.CusRepo;

@Service
public class CusService {
	
	@Autowired CusRepo crep;

	//add a customer
	public Customer add(Customer c) {
		return crep.save(c);
	}

	//return Customer from id
	public Customer getCustomerById(long cid) {
		return crep.findById(cid).orElse(null);
	}
	
	

}
