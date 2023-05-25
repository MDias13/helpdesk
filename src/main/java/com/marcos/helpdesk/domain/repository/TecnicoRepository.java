package com.marcos.helpdesk.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.marcos.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico,Integer> {

}
