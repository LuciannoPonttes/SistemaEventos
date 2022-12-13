package com.sistemaevento.evento.model;

import javax.persistence.*;

@Table(name = "TB_EVENTO_PRESENCIAL")
@Entity
public class EventoPresencial extends  Evento{

    @OneToOne
    private Local sala;


    public Local getSala() {
        return sala;
    }

    public void setSala(Local sala) {
        this.sala = sala;
    }
}
