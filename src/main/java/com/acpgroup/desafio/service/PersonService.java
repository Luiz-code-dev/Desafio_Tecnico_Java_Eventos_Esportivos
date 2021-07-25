package com.acpgroup.desafio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.acpgroup.desafio.entities.Person;

@Service
public interface PersonService {

	void addPerson(Person person);

	List<Person> getAllEventos();

	Person getPersonById(int id);

	void updatePersonNovoEvento(int id);

	void deletePersonById(int id);

}
