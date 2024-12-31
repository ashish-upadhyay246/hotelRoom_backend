package com.hexaware.hotelroom.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hotelroom.Entity.Room;
import com.hexaware.hotelroom.Repository.RoomRepo;

@Service
public class RoomService {

	@Autowired RoomRepo rrep;
	
	//add a room
	public Room add(Room r) {
		return rrep.save(r);
	}

	//return Room by id
	public Room getRoomById(long rid) {
		return rrep.findById(rid).orElse(null);
	}

}
