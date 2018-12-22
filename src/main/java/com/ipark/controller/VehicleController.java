package com.ipark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ipark.domain.entity.Vehicle;
import com.ipark.domain.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	
	public List<Vehicle> getVehicle() {
		System.out.println("VehicleController.getVehicle():::::::::");	
		List<Vehicle> vechList = vehicleService.getVechList();
		
		return vechList;
	
	}
	

}
