package com.ipark.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipark.domain.entity.Vehicle;
import com.ipark.domain.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	public List<Vehicle> getVechList(){
		
		return (List<Vehicle>) vehicleRepository.findAll();	
	}
}
