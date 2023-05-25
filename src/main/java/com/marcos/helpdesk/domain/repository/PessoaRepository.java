package com.marcos.helpdesk.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer> {

}
