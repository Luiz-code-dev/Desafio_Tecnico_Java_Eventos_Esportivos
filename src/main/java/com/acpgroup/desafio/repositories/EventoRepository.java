package com.acpgroup.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acpgroup.desafio.entities.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer>{

}
