package com.hexaware.hotelroom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.hotelroom.Entity.Customer;

@Repository
public interface CusRepo extends JpaRepository <Customer, Long>{

}
