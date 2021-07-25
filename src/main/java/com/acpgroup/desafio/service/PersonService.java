package com.acpgroup.desafio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.acpgroup.desafio.entities.Person;

@Service
public interface PersonService {

	void addPerson(Person person);

	List<Person> getAllPerson();

	Person getPersonById(int id);

	void updatePersonNovoPerson(int id);

	void deletePersonById(int id);

}
