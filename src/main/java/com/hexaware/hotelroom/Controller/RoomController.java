package com.hexaware.hotelroom.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.hotelroom.Entity.Room;
import com.hexaware.hotelroom.Service.RoomService;

@RestController
@RequestMapping("/api/room")
public class RoomController {

	@Autowired RoomService rser;
	
	
	//add a room
	@PostMapping("/add")
	public Room add(@RequestBody Room r) {
		return rser.add(r);
	}
	
}
