package com.acpgroup.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acpgroup.desafio.entities.Person;
import com.acpgroup.desafio.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository personRepository;

	
	@Override
	public void addPerson(Person person) {
		personRepository.save(person);

	}

	@Override
	public List<Person> getAllEventos() {
		List<Person> peopleList = personRepository.findAll();
		return peopleList;
	}
	

	@SuppressWarnings("deprecation")
	@Override
	public Person getPersonById(int id) {
		return personRepository.getOne(id);
	}

	@Override
	public void updatePersonNovoEvento(int id) {
	}

	@Override
	public void deletePersonById(int id) {
	}

}
