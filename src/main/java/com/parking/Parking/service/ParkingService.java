package com.parking.Parking.service;

import com.parking.Parking.Exception.ResourceNotFoundException;
import com.parking.Parking.entities.Parking;
import com.parking.Parking.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingService {

    @Autowired
    private ParkingRepository parkingRepository;

    public List<Parking> getAll(){
        return parkingRepository.findAll();
    }
    public Parking createParking(Parking parking){
        return parkingRepository.save(parking);
    }

    public Parking findById(int id){
        return parkingRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Parking with such id doesnt exist"));
    }

    public void deleteParking(Parking parking){
        parkingRepository.delete(parking);
    }





}
