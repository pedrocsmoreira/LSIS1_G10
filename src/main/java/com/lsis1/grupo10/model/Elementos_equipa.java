package com.lsis1.grupo10.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Elementos_equipa {
    private int id;
    private int id_equipa;
    private String nome;
    private String email;
    private String data_criacao;

    private static final int INT_DEFAULT = 0;
    private static final String STR_DEFAULT = "";
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Elementos_equipa() {
        this.id_equipa = INT_DEFAULT;
        this.nome = STR_DEFAULT;
        this.email = STR_DEFAULT;
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
    }

    public Elementos_equipa(int id_equipa, String nome, String email) {
        this.id_equipa = id_equipa;
        this.nome = nome;
        this.email = email;
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
    }

    public int getId_equipa() {
        return this.id_equipa;
    }

    public void setId_equipa(int id_equipa) {
        this.id_equipa = id_equipa;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData_criacao() {
        return this.data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (!(o instanceof Elementos_equipa)) {
            return false;
        }
        Elementos_equipa elementos_equipa = (Elementos_equipa) o;
        return id_equipa == elementos_equipa.id_equipa && Objects.equals(nome, elementos_equipa.nome) && Objects.equals(email, elementos_equipa.email) && Objects.equals(data_criacao, elementos_equipa.data_criacao);
    }

    @Override
    public String toString() {
        return "{" +
                " id_equipa='" + getId_equipa() + "'" +
                ", nome='" + getNome() + "'" +
                ", email='" + getEmail() + "'" +
                ", data_creacao='" + getData_criacao() + "'" +
                "}";
    }

}