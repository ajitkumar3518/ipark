package com.ipark.infrastructure.persistance;


import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.ipark.domain.entity.Vehicle;
import com.ipark.domain.repository.VehicleRepository;


@Repository
public  class HibernateVehicleRepository implements VehicleRepository{

	public <S extends Vehicle> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Vehicle> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Vehicle> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<Vehicle> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<Vehicle> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Vehicle entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends Vehicle> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
