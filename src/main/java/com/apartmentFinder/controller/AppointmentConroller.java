package com.apartmentFinder.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apartmentFinder.model.Apartment;
import com.apartmentFinder.model.Appointment;
import com.apartmentFinder.service.ApartmentService;
import com.apartmentFinder.service.AppointmentService;

@Controller
public class AppointmentConroller {

	@Autowired
	private AppointmentService appointmentService;

	@Autowired
	private ApartmentService apartmentService;

	@RequestMapping("/delete/{appointmentid}")
	public String deleteProduct(@PathVariable(name = "appointmentid") int appointmentid) {
		// service.delete(id);
		appointmentService.delete(appointmentid);

		return "redirect:/list";
	}

	// return page to book appointments
	@RequestMapping(value = "/bookAppointment/{apartmentid}/{userid}")
	public String bookAppointment(Model model, @PathVariable(name = "userid") int id,
			@PathVariable(name = "apartmentid") int apartmentid, @ModelAttribute("appointment") Appointment appointment,
			@Valid String appointmenttime) {
		System.out.println("Inside Book appointment function");
		appointment.setApartmentid(apartmentid);
		appointment.setUserid(id);
		appointment.setAppointmentTime(appointmenttime);
		appointmentService.save(appointment);

		return "redirect:/list";
	}

	// return page to book appointments
	@RequestMapping(value = "/book/{apartmentid}/{userid}")
	public String book(Model model, @PathVariable(name = "userid") int id,
			@PathVariable(name = "apartmentid") int apartmentid) {
		System.out.println("Inside Book appointment");
		Apartment apartment = apartmentService.getOne(apartmentid);
		model.addAttribute("apartment", apartment);
		model.addAttribute("userid", id);
		Appointment appointment = new Appointment();
		model.addAttribute("appointment", appointment);
		List<String> options = new ArrayList<String>();
		options.add("08:00-10:00");
		options.add("10:00-12:00");
		options.add("15:00-17:00");
		model.addAttribute("appointmentTimeOptions", options);
		return "appointment";
	}

	// returns edit profile page
	@RequestMapping("/manage/{userid}")
	public String manageAppointment(Model model, @PathVariable(name = "userid") int id) {
		System.out.println("Inside manage Appointment");
		List<Appointment> appointment = appointmentService.findAll(id);
		model.addAttribute("appointment", appointment);
		return "manage_appointments";
	}

}
