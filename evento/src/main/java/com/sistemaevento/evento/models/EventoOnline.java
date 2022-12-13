package com.sistemaevento.evento.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class EventoOnline extends  Evento{

    @Id
    private  long id;
    @Embedded
    private Plataforma plataforma;
    @Embedded
    private Ferramenta ferramenta;
    @OneToMany
    private List<Participante> participantes;

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
}
