package com.marcos.helpdesk.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.helpdesk.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado,Integer> {

}
