package com.sistemaevento.evento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class EventoPresencial extends  Evento{

    @Id
    private long id;

    @OneToOne
    private Local sala;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public Local getSala() {
        return sala;
    }

    public void setSala(Local sala) {
        this.sala = sala;
    }
}
