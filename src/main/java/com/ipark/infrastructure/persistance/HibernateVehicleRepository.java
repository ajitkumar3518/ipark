package com.ipark.infrastructure.persistance;


import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.ipark.domain.entity.Vehicle;
import com.ipark.domain.repository.VehicleRepository;


@Repository
public  class HibernateVehicleRepository implements VehicleRepository{

	public <S extends Vehicle> S save(S entity) {
		return null;
	}

	public <S extends Vehicle> Iterable<S> saveAll(Iterable<S> entities) {
		return null;
	}

	public Optional<Vehicle> findById(Integer id) {
		return null;
	}

	public boolean existsById(Integer id) {
		return false;
	}

	public Iterable<Vehicle> findAll() {
		return null;
	}

	public Iterable<Vehicle> findAllById(Iterable<Integer> ids) {
		return null;
	}

	public long count() {
		return 0;
	}

	public void deleteById(Integer id) {
		
	}

	public void delete(Vehicle entity) {
		
	}

	public void deleteAll(Iterable<? extends Vehicle> entities) {
		
	}

	public void deleteAll() {
		
	}

	

	
	
}
