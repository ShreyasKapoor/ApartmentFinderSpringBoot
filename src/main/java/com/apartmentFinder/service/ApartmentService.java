package com.apartmentFinder.service;

import com.apartmentFinder.dao.ApartmentRepository;
import com.apartmentFinder.model.Apartment;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ApartmentService {

	@Autowired
	private ApartmentRepository repo;

	public List<Apartment> listAll() {
		return repo.findAll();
	}

	public Apartment getOne(int id) {
		return repo.getOne(id);
	}
}