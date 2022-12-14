package com.sistemaevento.evento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaevento.evento.model.Local;
import com.sistemaevento.evento.service.SalaService;

@RestController
@CrossOrigin
@RequestMapping(value="sala")
public class SalaController {
	
	@Autowired
	private SalaService service;
	
	@PostMapping(value = "/incluirSala")
	private ResponseEntity IncluirLocal (@RequestBody Local local) {
		try {
			service.incluirLocal(local);
			return new ResponseEntity<>(null, HttpStatus.CREATED);
		} catch (Exception e) {
			return  new ResponseEntity(null, HttpStatus.BAD_REQUEST);
		}
	}

}
