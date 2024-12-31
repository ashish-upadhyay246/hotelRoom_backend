package com.hexaware.hotelroom.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Room {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String type;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Room(long id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	
	public Room() {}

	@Override
	public String toString() {
		return "Room [id=" + id + ", type=" + type + "]";
	}
	
	

}
