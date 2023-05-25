package com.marcos.helpdesk.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.helpdesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
