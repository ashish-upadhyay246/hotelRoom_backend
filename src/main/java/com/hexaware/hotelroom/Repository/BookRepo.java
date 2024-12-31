package com.hexaware.hotelroom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.hotelroom.Entity.Bookings;

@Repository
public interface BookRepo extends JpaRepository<Bookings, Long>{

}
