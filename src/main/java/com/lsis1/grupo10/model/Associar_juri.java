package com.lsis1.grupo10.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Associar_juri {
    private int id_juri;
    private int id_competicao;
    private String data_criacao;

    private static final int INT_DEFAULT = 0;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Associar_juri() {
        this.id_juri = INT_DEFAULT;
        this.id_competicao = INT_DEFAULT;
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
    }

    public Associar_juri(int id_juri, int id_competicao) {
        this.id_juri = id_juri;
        this.id_competicao = id_competicao;
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
    }

    public int getId_juri() {
        return this.id_juri;
    }

    public void setId_juri(int id_juri) {
        this.id_juri = id_juri;
    }

    public int getId_competicao() {
        return this.id_competicao;
    }

    public void setId_competicao(int id_competicao) {
        this.id_competicao = id_competicao;
    }

    public String getData_criacao() {
        return this.data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (!(o instanceof Associar_juri)) {
            return false;
        }
        Associar_juri associar_juri = (Associar_juri) o;
        return id_juri == associar_juri.id_juri && id_competicao == associar_juri.id_competicao && Objects.equals(data_criacao, associar_juri.data_criacao);
    }

    @Override
    public String toString() {
        return "{" +
                " id_juri='" + getId_juri() + "'" +
                ", id_competicao='" + getId_competicao() + "'" +
                ", data_creacao='" + getData_criacao() + "'" +
                "}";
    }

}