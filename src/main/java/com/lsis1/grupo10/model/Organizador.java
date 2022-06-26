package com.lsis1.grupo10.model;

import java.util.Objects;

public class Organizador extends User {
    private String password;
    private String email;

    private static final String STR_DEFAULT = "";
    
    public Organizador() {
        super();
        this.email = STR_DEFAULT;
        this.password = STR_DEFAULT;
    }

    public Organizador(String nome, String password) {
        super(nome);
        this.password = password;
    }

    public Organizador(String nome, String email, String password) {
        super(nome);
        this.password = password;
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Organizador password(String password) {
        setPassword(password);
        return this;
    }

    public Organizador email(String email) {
        setEmail(email);
        return this;
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
        if (!(o instanceof Organizador)) {
            return false;
        }
        Organizador organizador = (Organizador) o;
        return Objects.equals(getNome(), organizador.getNome()) && Objects.equals(password, organizador.password)
                && Objects.equals(getData_criacao(), organizador.getData_criacao());
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", password='" + getPassword() + "'" +
                ", data_creacao='" + getData_criacao() + "'" +
                "}";
    }

}