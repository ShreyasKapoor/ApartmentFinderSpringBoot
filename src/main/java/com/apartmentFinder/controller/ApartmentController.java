package com.apartmentFinder.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apartmentFinder.model.Apartment;
import com.apartmentFinder.service.ApartmentService;

@Controller
public class ApartmentController {

	@Autowired
	private ApartmentService apartmentService;

	// return apartment list page
	@RequestMapping("/list")
	public String viewHomePage(HttpServletRequest request, Model model) {
		System.out.println("Inside get all");
		List<Apartment> apartmentList = apartmentService.listAll();
		model.addAttribute("apartmentList", apartmentList);
		model.addAttribute("userid", request.getSession().getAttribute("userid"));
		System.out.println("No of apartments = " + apartmentList.size());

		return "apartments";
	}

}
