package com.fii.utilityservice.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fii.utilityservice.registration.model.Customer;
import com.fii.utilityservice.registration.service.RegistrationService;


/**
 * @author Shravya Peddiraju
 */
@Controller
public class RegistrationController {

	@Autowired
	RegistrationService registrationSerivce;

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public ModelAndView handleRequest(@ModelAttribute("customer") Customer customer) {

		String status = registrationSerivce.insertCustomer(customer);
		if ("registered".equals(status))
			return new ModelAndView("result");
		else
			return new ModelAndView("failure", "message", "Data could not be inserted!!!");
	}

}
