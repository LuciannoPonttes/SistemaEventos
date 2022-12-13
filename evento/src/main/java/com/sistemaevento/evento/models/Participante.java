package com.sistemaevento.evento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Entity
public class Participante implements Serializable {

    @Id
    private Long id;

    private  String nome;
    private  String email;

    @ManyToOne
    private EventoOnline eventoOnline;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EventoOnline getEventoOnline() {
        return eventoOnline;
    }

    public void setEventoOnline(EventoOnline eventoOnline) {
        this.eventoOnline = eventoOnline;
    }
}
