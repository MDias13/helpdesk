package com.marcos.helpdesk.dbservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.helpdesk.domain.Chamado;
import com.marcos.helpdesk.domain.Cliente;
import com.marcos.helpdesk.domain.Tecnico;
import com.marcos.helpdesk.domain.enums.Perfil;
import com.marcos.helpdesk.domain.enums.Prioridade;
import com.marcos.helpdesk.domain.enums.Status;
import com.marcos.helpdesk.domain.repository.ChamadoRepository;
import com.marcos.helpdesk.domain.repository.ClienteRepository;
import com.marcos.helpdesk.domain.repository.TecnicoRepository;

@Service
public class DBservice {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB () {
		Tecnico tec1 = new Tecnico(null, "Marcos Aurelio", "123456789101", "Marcos@email.com", "123");
		tec1.addPerfis(Perfil.ADMIN);
		
		
		Cliente cli1 = new Cliente(null, "Lucas Aurelio", "123456789102", "lucas@email.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "CHamado01","Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
