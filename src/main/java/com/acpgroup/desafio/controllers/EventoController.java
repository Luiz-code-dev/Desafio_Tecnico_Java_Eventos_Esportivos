package com.acpgroup.desafio.controllers;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.acpgroup.desafio.entities.Evento;
import com.acpgroup.desafio.service.EventoService;
import com.acpgroup.desafio.service.EventoServiceImpl;

@Controller
public class EventoController {

	@Autowired
	EventoService eventoService;


	public EventoController(EventoServiceImpl eventoServiceImpl) {
		this.eventoService = eventoServiceImpl;
	}

	@RequestMapping(value = "/evento/register")
	public ModelAndView getRegisterPage() {
		return new ModelAndView("addEvento", "evento", new Evento());
	}

	@RequestMapping(value = "/evento/register", method = RequestMethod.POST)
	public String handleRegisterForm(@Valid @ModelAttribute("evento") Evento evento, BindingResult bindingResult)
			throws SQLException {
		if (bindingResult.hasErrors()) {
			return "addEvento";
		}
		eventoService.addEvento(evento);

		return "redirect:/";
	}

	@RequestMapping(value = "/eventos")
	public ModelAndView getUsersPage() {
		return new ModelAndView("eventos", "eventos", eventoService.getAllEventos());
	}

	@RequestMapping(value = "/updateEvento/{id}", method = RequestMethod.POST)
	public String updateStatus(@PathVariable("id") int id) {
		eventoService.updateEvento(id);
		return "redirect:/eventos";
	}

	@RequestMapping(value = "/deleteEvento/{id}", method = RequestMethod.POST)
	public String handleItemDelete(@PathVariable("id") int id) {
		eventoService.deleteEventoById(id);
		return "redirect:/evento";
	}

}
