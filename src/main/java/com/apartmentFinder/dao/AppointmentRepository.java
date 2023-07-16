package com.apartmentFinder.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.apartmentFinder.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	@Query("SELECT a FROM Appointment a WHERE a.userid = :id")
	List<Appointment> findAll(int id);

	@Transactional
	@Modifying
	@Query("DELETE FROM Appointment a WHERE a.appointmentid=:appointmentid")
	void delete(@Param(value = "appointmentid") int appointmentid);

}
