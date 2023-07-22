package com.parking.Parking.controller;

import com.parking.Parking.entities.Parking;
import com.parking.Parking.repository.ParkingRepository;
import com.parking.Parking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @GetMapping("/Parkings")
    @CrossOrigin(origins = "http://localhost:4200/parkings")

    public List<Parking> getAllParkings(){
        return parkingService.getAll();

    }

    @PostMapping("/Parkings")
    @CrossOrigin(origins = "http://localhost:4200/addparking")

    public Parking createParking(@RequestBody Parking parking){
        Parking parkingObj= new Parking();
        parkingObj= parkingService.createParking(parking);
        return parkingObj;
    }

    @GetMapping("/Parkings/{id}")
    @CrossOrigin(origins = "http://localhost:4200/parkings")
    public Parking getParkingById(@PathVariable int id){
        Parking parkingObj= parkingService.findById(id);
        return parkingObj;
    }


    @PutMapping("/Parkings/{id}")
    public ResponseEntity<Parking> upadateParking(@PathVariable int id,@RequestBody Parking parkingDetails){
        Parking parkingObj= parkingService.findById(id);
        parkingObj.setFull(parkingDetails.getFull());
        parkingObj.setPosition(parkingDetails.getPosition());
        parkingObj.setUser(parkingDetails.getUser());

        Parking updatedParking= parkingService.createParking(parkingObj);
        return ResponseEntity.ok(updatedParking);

    }

    @DeleteMapping("/Parkings/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteParking(@PathVariable int id){
        Parking parkingObj= parkingService.findById(id);
        parkingService.deleteParking(parkingObj);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted" , Boolean.TRUE);
        return ResponseEntity.ok(response);

    }

}
