package com.hexaware.hotelroom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.hotelroom.Entity.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long>{

}
