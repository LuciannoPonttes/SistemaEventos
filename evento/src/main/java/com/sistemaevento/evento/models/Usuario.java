package com.sistemaevento.evento.models;

import com.sistemaevento.evento.enums.PerfilUsuario;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Usuario implements Serializable {
    private String nome;
    private String senha;
    @Id
    private String matricula;
    private String indicadorHabilitado;

    private PerfilUsuario tipoUsuario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(String indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public PerfilUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(PerfilUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
