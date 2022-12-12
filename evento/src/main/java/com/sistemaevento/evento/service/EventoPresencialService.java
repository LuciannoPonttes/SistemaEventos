package com.sistemaevento.evento.service;

import com.sistemaevento.evento.model.EventoOnline;
import com.sistemaevento.evento.model.EventoPresencial;
import com.sistemaevento.evento.repository.EventoOnlineRepository;
import com.sistemaevento.evento.repository.EventoPresencialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoPresencialService {

    @Autowired
    private EventoPresencialRepository repository;

    public List< EventoPresencial> listar(){
        return repository.findAll();
    }
    public void incuir(EventoPresencial eventoOnline){
        repository.save(eventoOnline);
    }
}
