package com.lsis1.grupo10.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Ronda {
    private int id;
    private String data_criacao;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private int id_competicao;
    private String tipo;
    private String numero;

    public Ronda() {
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
    }

    public Ronda(int id_competicao, String tipo, String numero) {
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
        this.id_competicao = id_competicao;
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getData_criacao() {
        return this.data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public int getId_competicao() {
        return this.id_competicao;
    }

    public void setId_competicao(int id_competicao) {
        this.id_competicao = id_competicao;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ronda)) {
            return false;
        }
        Ronda ronda = (Ronda) o;
        return Objects.equals(data_criacao, ronda.data_criacao)
                && id_competicao == ronda.id_competicao && Objects.equals(tipo, ronda.tipo)
                && Objects.equals(numero, ronda.numero);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                " data_creacao='" + getData_criacao() + "'" +
                ", id_competicao='" + getId_competicao() + "'" +
                ", tipo='" + getTipo() + "'" +
                ", numero='" + getNumero() + "'" +
                "}";
    }

}