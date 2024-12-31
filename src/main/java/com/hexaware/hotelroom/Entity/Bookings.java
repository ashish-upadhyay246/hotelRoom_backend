package com.hexaware.hotelroom.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Bookings {
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	private Customer customer;
	
	@ManyToOne
	private Room room;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Bookings(long id, Customer customer, Room room) {
		super();
		this.id = id;
		this.customer = customer;
		this.room = room;
	}
	
	public Bookings() {}

	@Override
	public String toString() {
		return "Bookings [id=" + id + ", customer=" + customer + ", room=" + room + "]";
	}

	
	

}
