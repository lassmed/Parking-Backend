package com.parking.Parking.repository;

import com.parking.Parking.entities.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepository extends JpaRepository<Parking,Integer> {
    void deleteById(int id);
}
