package com.hexaware.hotelroom.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hotelroom.Entity.Bookings;
import com.hexaware.hotelroom.Entity.Customer;
import com.hexaware.hotelroom.Entity.Room;
import com.hexaware.hotelroom.Exceptions.BookingNotFoundException;
import com.hexaware.hotelroom.Repository.BookRepo;
import com.hexaware.hotelroom.Repository.CusRepo;
import com.hexaware.hotelroom.Repository.RoomRepo;

@Service
public class BookService {

	@Autowired BookRepo brep;
	@Autowired CusRepo crep;
	@Autowired RoomRepo rrep;

	//add a booking
	public Bookings add(Bookings b) {
		return brep.save(b);
	}

	//to get all bookings
	public List<Bookings> getall() {
		return brep.findAll();
	}

	//delete a booking
	public String delete(long bid) {
		Bookings b=brep.findById(bid).orElse(null);
		if(b!=null) {
			brep.deleteById(bid);
			return "Booking deleted.";
		}
		else {
			throw new BookingNotFoundException("Booking with ID: "+bid+" not found!");
		}
	}

	//update a booking details
	public Bookings update(long bid, long cid, long rid) {
		Bookings b=brep.findById(bid).orElse(null);
		Customer c= crep.findById(cid).orElse(null);
		Room r= rrep.findById(rid).orElse(null);		
		if(b!=null) {
			b.setCustomer(c);
			b.setRoom(r);
			return b;
		}
		return null;
	}
}
