package com.acpgroup.desafio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.acpgroup.desafio.entities.Evento;

@Service
public interface EventoService {
	
	void addEvento(Evento evento);

	List<Evento> getAllEventos();

	Evento getPersonById(int id);

	void updateEvento(int id);

	void deleteEventoById(int id);

}
