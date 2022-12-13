package com.sistemaevento.evento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;

@Entity
public class Local implements Serializable {

    @Id
    private Long id;
    private  String nome;
    private  String localizacao;
    private  int qntCadeira;

    @OneToMany
    private List<Item> items;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getQntCadeira() {
        return qntCadeira;
    }

    public void setQntCadeira(int qntCadeira) {
        this.qntCadeira = qntCadeira;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
