package com.lsis1.grupo10.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Robot {
    private int id;
    private int id_equipa;
    private String nome;
    private String mac_adr;
    private String data_criacao;

    private static final int INT_DEFAULT = 0;
    private static final String STR_DEFAULT = "";
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Robot() {
        this.id_equipa = INT_DEFAULT;
        this.nome = STR_DEFAULT;
        this.mac_adr = STR_DEFAULT;
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
    }

    public Robot(int id_equipa, String nome, String mac_adr) {
        this.id_equipa = id_equipa;
        this.nome = nome;
        this.mac_adr = mac_adr;
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
    }

    public int getId_equipa() {
        return this.id_equipa;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMac_adr() {
        return this.mac_adr;
    }

    public void setMac_adr(String mac_adr) {
        this.mac_adr = mac_adr;
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
        if (!(o instanceof Robot)) {
            return false;
        }
        Robot robot = (Robot) o;
        return id_equipa == robot.id_equipa && Objects.equals(nome, robot.nome)
                && Objects.equals(mac_adr, robot.mac_adr) && Objects.equals(data_criacao, robot.data_criacao);
    }

    @Override
    public String toString() {
        return "{" + "id=" + id +
                " id_equipa='" + getId_equipa() + "'" +
                ", nome='" + getNome() + "'" +
                ", mac_adr='" + getMac_adr() + "'" +
                ", data_creacao='" + getData_criacao() + "'" +
                "}";
    }

}