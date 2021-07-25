package com.acpgroup.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acpgroup.desafio.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
