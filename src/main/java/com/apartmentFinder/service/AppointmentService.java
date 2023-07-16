package com.apartmentFinder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apartmentFinder.dao.AppointmentRepository;
import com.apartmentFinder.model.Appointment;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepository repo;

	public void save(Appointment appointment) {
		repo.save(appointment);
	}

	public List<Appointment> findAll(int id) {
		return repo.findAll(id);
	}

	public void delete(int appointmentid) {
		repo.delete(appointmentid);
	}

}
