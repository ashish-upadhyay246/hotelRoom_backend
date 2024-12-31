package com.hexaware.hotelroom.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.hotelroom.Entity.Bookings;
import com.hexaware.hotelroom.Entity.Customer;
import com.hexaware.hotelroom.Entity.Room;
import com.hexaware.hotelroom.Service.BookService;
import com.hexaware.hotelroom.Service.CusService;
import com.hexaware.hotelroom.Service.RoomService;

@RestController
@RequestMapping("/api/bookings")
public class BookController {

	@Autowired BookService bser;
	@Autowired CusService cser;
	@Autowired RoomService rser;
	
	//add a booking
	@GetMapping("/add/{cid}/{rid}")
	public Bookings add(@PathVariable long cid, @PathVariable long rid) {
		Customer c= cser.getCustomerById(cid);
		Room r=rser.getRoomById(rid);
		Bookings b=new Bookings();
		b.setCustomer(c);
		b.setRoom(r);
		return bser.add(b);
		
	}
	
	//list all bookings
	@GetMapping("/getall")
	public List<Bookings> getall() {
		return bser.getall();
	}
	
	//update a booking
	@PutMapping("/update/{bid}/{cid}/{rid}")
	public Bookings update(@PathVariable long bid, @PathVariable long cid, @PathVariable long rid) {
		return bser.update(bid,cid,rid);
	}
	
	//delete a booking
	@DeleteMapping("/delete/{bid}")
	public String delete(@PathVariable long bid) {
		String s=bser.delete(bid);
		return s;
	}
	
}
