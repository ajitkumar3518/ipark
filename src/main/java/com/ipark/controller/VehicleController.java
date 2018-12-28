package com.ipark.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ipark.domain.entity.Vehicle;
import com.ipark.domain.entity.VehicleDTO;
import com.ipark.domain.repository.VehicleRepository;

@RestController
@RequestMapping("/vehicle")

public class VehicleController {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public Iterable<Vehicle> getLists() {
		System.out.println("StudentController:getLists()::::::::::");
		return vehicleRepository.findAll();
	}
	
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Vehicle> getById(@PathVariable( "id" ) Integer id) {
		System.out.println("VehicleController:getId()::::::::::");
		return vehicleRepository.findById(id);
}
	@RequestMapping(value= "/add", method=RequestMethod.POST)
	public ResponseEntity<?>addVehicle(@RequestBody VehicleDTO vehicleDto) {
		System.out.println("VehicleController:getList():::::::");
		Vehicle vehicle=new Vehicle();
		vehicle.setId(vehicleDto.getId());
		vehicle.setName(vehicleDto.getName());
		vehicle.setPrice(vehicleDto.getPrice());
		
		vehicleRepository.save(vehicle);
		
		return new ResponseEntity<Vehicle>(vehicle, new HttpHeaders(), HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/update{id}",method=RequestMethod.PUT)
	public ResponseEntity<?> updateVehicle(@PathVariable( "id" ) Integer id, @RequestBody VehicleDTO vehicleDto )  {
		System.out.println("VehicleController:updateVehicle::::::");
		boolean isExist=vehicleRepository.existsById(id);
		Vehicle vehicle=new Vehicle();
		if(isExist) {
			vehicle.setId(vehicleDto.getId());
			vehicle.setName(vehicleDto.getName());
			vehicle.setPrice(vehicleDto.getPrice());
		}else {
			return new ResponseEntity<String>("vehicle does't exist", new HttpHeaders(), HttpStatus.NOT_FOUND);
				
			}
		vehicleRepository.save(vehicle);
		return new ResponseEntity<Vehicle>(vehicle, new HttpHeaders(), HttpStatus.OK);
		
		}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteVehicle(@PathVariable( "id" ) Integer id) {
		System.out.println("StudentController:deleteVehicle()::::::::::");
		vehicleRepository.deleteById(id);
		return new ResponseEntity<String>("Deleted Successfully", new HttpHeaders(), HttpStatus.OK);
	}
}
