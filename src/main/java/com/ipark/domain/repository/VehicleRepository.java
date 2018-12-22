package com.ipark.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.ipark.domain.entity.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {
	
}
