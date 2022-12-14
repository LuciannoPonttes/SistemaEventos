package com.sistemaevento.evento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaevento.evento.model.Local;
import com.sistemaevento.evento.repository.SalaRepository;

@Service
public class SalaService {
	
	@Autowired
	private SalaRepository repository;

	public void incluirLocal(Local local) {
		repository.save(local);
		
	}

}
