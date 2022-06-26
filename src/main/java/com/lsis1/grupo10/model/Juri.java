package com.lsis1.grupo10.model;

import java.util.ArrayList;
import java.util.Objects;

import com.lsis1.grupo10.handler.LoginHandler;

public class Juri extends User {
    private String email;
    private String password;
    private boolean organizadorLogadoAssociado;
    private ArrayList<String> competicoes;

    private static final String STR_DEFAULT = "";

    public Juri() {
        super();
        this.email = STR_DEFAULT;
        this.password = STR_DEFAULT;
        this.organizadorLogadoAssociado = false;
        this.competicoes = new ArrayList<>();
    }

    public Juri(String nome, String email, String password) {
        super(nome);
        this.email = email;
        this.password = password;
        this.organizadorLogadoAssociado = false;
        this.competicoes = new ArrayList<>();
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getCompeticoes() {
        return this.competicoes;
    }

    public void setCompeticoes(ArrayList<String> competicoes) {
        this.competicoes = competicoes;
    }

    public boolean isOrganizadorLogadoAssociado() {
        return this.organizadorLogadoAssociado;
    }

    public void setOrganizadorLogadoAssociado(boolean organizadorLogadoAssociado) {
        this.organizadorLogadoAssociado = organizadorLogadoAssociado;
    }
    public void addCompeticao(Competicao comp){
        LoginHandler lh = new LoginHandler();
        if(lh.getUser().getId() == comp.getId_organizador()){
            organizadorLogadoAssociado = true;
        }
        this.competicoes.add(comp.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Juri)) {
            return false;
        }
        Juri elementos_juri = (Juri) o;
        return Objects.equals(getNome(), elementos_juri.getNome()) && Objects.equals(email, elementos_juri.email)
                && Objects.equals(password, elementos_juri.password);
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", email='" + getEmail() + "'" +
                ", password='" + getPassword() + "'" +
                ", data_creacao='" + getData_criacao() + "'" +
                "}";
    }

}