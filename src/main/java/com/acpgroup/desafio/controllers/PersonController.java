package com.acpgroup.desafio.controllers;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.acpgroup.desafio.entities.Person;
import com.acpgroup.desafio.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	PersonService personService;

	
	@RequestMapping("/registrar")
	public ModelAndView getRegisterPage() {
		return new ModelAndView("addUser", "person", new Person());
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String handleRegisterForm(@Valid @ModelAttribute("person") Person person, BindingResult bindingResult)
			throws SQLException {
		if (bindingResult.hasErrors()) {
			return "addUser";
		}
		personService.addPerson(person);

		return "redirect:/";
	}

	@RequestMapping("/ eventos")
	public ModelAndView getUsersPage() {
		return new ModelAndView("eventos", "eventos", personService.getAllEventos());
	}

}
