package com.lsis1.grupo10.model;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Associar_equipa is a class that represents a table in a database
 */
public class Associar_equipa {
    private int id_competicao;
    private int id_equipa;
    private String data_criacao;

    private static final int INT_DEFAULT = 0;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    public Associar_equipa() {
        this.id_competicao = INT_DEFAULT;
        this.id_equipa = INT_DEFAULT;
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
    }

    public Associar_equipa(int id_competicao, int id_equipa) {
        this.id_competicao = id_competicao;
        this.id_equipa = id_equipa;
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
    }

    public int getId_competicao() {
        return this.id_competicao;
    }

    public void setId_competicao(int id_competicao) {
        this.id_competicao = id_competicao;
    }

    public int getId_equipa() {
        return this.id_equipa;
    }

    public void setId_equipa(int id_equipa) {
        this.id_equipa = id_equipa;
    }

    public String getData_criacao() {
        return this.data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Associar_equipa)) {
            return false;
        }
        Associar_equipa associar_equipa = (Associar_equipa) o;
        return id_competicao == associar_equipa.id_competicao
                && id_equipa == associar_equipa.id_equipa && Objects.equals(data_criacao, associar_equipa.data_criacao);
    }

    @Override
    public String toString() {
        return "{" +
                ", id_competicao='" + getId_competicao() + "'" +
                ", id_equipa='" + getId_equipa() + "'" +
                ", data_creacao='" + getData_criacao() + "'" +
                "}";
    }

}