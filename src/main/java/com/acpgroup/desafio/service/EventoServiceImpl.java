package com.acpgroup.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acpgroup.desafio.entities.Evento;
import com.acpgroup.desafio.repositories.EventoRepository;

@Service
public class EventoServiceImpl implements EventoService {
	
	@Autowired
	EventoRepository eventoRepository;

	@Override
	public void addEvento(Evento evento) {
		eventoRepository.save(evento);
		
	}

	@Override
	public List<Evento> getAllEventos() {
		List<Evento> eventoList = eventoRepository.findAll();
		return eventoList;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Evento getPersonById(int id) {
		return eventoRepository.getOne(id);
	}

	@Override
	public void updateEvento(int id) {
		}

	@Override
	public void deleteEventoById(int id) {
		}
	
	

}
