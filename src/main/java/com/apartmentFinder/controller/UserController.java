package com.apartmentFinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apartmentFinder.model.User;
import com.apartmentFinder.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	// update user details and redirects to list page
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	public String updateUser(@PathVariable(name = "id") int id, @ModelAttribute("user") User user) {
		System.out.println("Inside update Details");
		String password = user.getPassword();
		String contactno = user.getContactno();
		String emailaddress = user.getEmailaddress();
		System.out.println(contactno);
		userService.update(id, password, contactno, emailaddress);
		return "redirect:/list";
	}

	// returns edit profile page
	@RequestMapping("/edit/{userid}")
	public String editUserProfile(Model model, @PathVariable(name = "userid") int id) {
		System.out.println("Inside edit profile");
		User user = userService.get(id);
		model.addAttribute("user", user);
		return "edit_profile";
	}

}
