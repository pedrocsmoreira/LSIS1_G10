package com.lsis1.grupo10.model;

import java.util.ArrayList;
import java.util.Objects;

import com.lsis1.grupo10.handler.LoginHandler;

public class Equipa extends User {
    private String password;
    private ArrayList<String> competicoes = new ArrayList<>();
    private ArrayList<Elementos_equipa> elementos = new ArrayList<>();
    private boolean organizadorLogadoAssociado = false;

    public Equipa() {
        super();
    }

    public Equipa(String nome, String password) {
        super(nome);
        this.password = password;
    }

    public ArrayList<String> getCompeticoes() {
        return competicoes;
    }

    public void setCompeticoes(ArrayList<String> competicoes) {
        this.competicoes = competicoes;
    }

    public void addCompeticao(Competicao comp){
        LoginHandler lh = new LoginHandler();
        if(lh.getUser().getId() == comp.getId_organizador()){
            organizadorLogadoAssociado = true;
        }
        this.competicoes.add(comp.getNome());
    }

    public boolean isOrganizadorLogadoAssociado() {
        return organizadorLogadoAssociado;
    }

    public void setOrganizadorLogadoAssociado(boolean organizadorLogadoAssociado) {
        this.organizadorLogadoAssociado = organizadorLogadoAssociado;
    }

    public ArrayList<Elementos_equipa> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Elementos_equipa> elementos) {
        this.elementos = elementos;
    }

    public String getPassword() {
        return this.password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Equipa)) {
            return false;
        }
        Equipa equipa = (Equipa) o;
        return Objects.equals(password, equipa.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getNome(), password, super.getData_criacao());
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + super.getNome() + "'" +
                ", password='" + getPassword() + "'" +
                ", data_creacao='" + getData_criacao() + "'" +
                "}";
    }

}