package com.parking.Parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class ParkingApplication {


	public static void main(String[] args) {
		SpringApplication.run(ParkingApplication.class, args);
	}

}
