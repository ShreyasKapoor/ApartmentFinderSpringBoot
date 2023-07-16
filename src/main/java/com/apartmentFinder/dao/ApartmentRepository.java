package com.apartmentFinder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.apartmentFinder.model.Apartment;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

	@Query("SELECT a FROM Apartment a WHERE a.apartmentid = :apartmentid")
	public Apartment getOne(@Param("apartmentid") int apartmentid);

}