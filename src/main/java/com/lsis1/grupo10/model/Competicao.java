package com.lsis1.grupo10.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;

import com.lsis1.grupo10.handler.LoginHandler;

public class Competicao {
    private int id;
    private int id_organizador;
    private String nome_organizador;
    private int nrondas;
    private int max_equipas;
    private ArrayList<String> equipasRegistadas;
    private ArrayList<String> jurisRegistados;
    private String nome;
    private String desc;
    private String data_criacao;

    private int idequipaassociada = 0;

    private boolean jurilogadoAssociado;
    private boolean organizadorlogadoAssociado;
    private boolean equipalogadoAssociado;
    private String data_conclusao;

    private String estado;
    private static final int INT_DEFAULT = 0;
    private static final String STR_DEFAULT = "";
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Competicao() {
        this.id_organizador = INT_DEFAULT;
        this.nome = STR_DEFAULT;
        this.desc = STR_DEFAULT;
        this.nrondas = INT_DEFAULT;
        this.max_equipas = INT_DEFAULT;
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
        this.nome_organizador = STR_DEFAULT;
        this.jurilogadoAssociado = false;
        this.organizadorlogadoAssociado = false;
        this.equipalogadoAssociado = false;
        this.equipasRegistadas = new ArrayList<>();
        this.jurisRegistados = new ArrayList<>();
    }

    public Competicao(int id_organizador, String nome_organizador, String nome, boolean jurilogadoAssociado, boolean organizadorlogadoAssociado, ArrayList<String> equipasRegistadas, ArrayList<String> jurisRegistadas, String desc, int nrondas, int max_equipas) {
        this.id_organizador = id_organizador;
        this.nome = nome;
        this.desc = desc;
        this.nrondas = nrondas;
        this.max_equipas = max_equipas;
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
        this.nome_organizador = nome_organizador;
        this.jurilogadoAssociado = jurilogadoAssociado;
        this.organizadorlogadoAssociado = organizadorlogadoAssociado;
        this.equipasRegistadas = equipasRegistadas;
        this.jurisRegistados = jurisRegistados;
    }

    public int getIdequipaassociada() {
        return this.idequipaassociada;
    }

    public void setIdequipaassociada(int idequipaassociada) {
        this.idequipaassociada = idequipaassociada;
    }


    public boolean isJurilogadoAssociado() {
        return this.jurilogadoAssociado;
    }

    public void setJurilogadoAssociado(boolean jurilogadoAssociado) {
        this.jurilogadoAssociado = jurilogadoAssociado;
    }

    public int getId_organizador() {
        return this.id_organizador;
    }

    public void setId_organizador(int id_organizador) {
        LoginHandler lh = new LoginHandler();
        if(lh.getUser().getId() == id_organizador){
            this.organizadorlogadoAssociado = true;
        }
        this.id_organizador = id_organizador;
    }

    public int getMax_equipas() {
        return this.max_equipas;
    }

    public void setMax_equipas(int max_equipas) {
        this.max_equipas = max_equipas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_criacao() {
        return this.data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public boolean isEquipalogadoAssociado() {
        return this.equipalogadoAssociado;
    }

    public void setEquipalogadoAssociado(boolean equipalogadoAssociado) {
        this.equipalogadoAssociado = equipalogadoAssociado;
    }

    public int getNrondas() {
        return this.nrondas;
    }

    public void setNrondas(int nrondas) {
        this.nrondas = nrondas;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getData_conclusao() {
        return this.data_conclusao;
    }

    public void setData_conclusao(String data_conclusao) {
        this.data_conclusao = data_conclusao;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_organizador() {
        return this.nome_organizador;
    }

    public void setNome_organizador(String nome_organizador) {
        this.nome_organizador = nome_organizador;
    }

    public ArrayList<String> getEquipasRegistadas() {
        return this.equipasRegistadas;
    }

    public boolean isOrganizadorlogadoAssociado() {
        return this.organizadorlogadoAssociado;
    }

    public void setOrganizadorlogadoAssociado(boolean organizadorlogadoAssociado) {
        this.organizadorlogadoAssociado = organizadorlogadoAssociado;
    }

    public void setEquipasRegistadas(ArrayList<String> equipasRegistadas) {
        this.equipasRegistadas = equipasRegistadas;
    }

    public ArrayList<String> getJurisRegistados() {
        return this.jurisRegistados;
    }

    public void setJurisRegistados(ArrayList<String> jurisRegistados) {
        this.jurisRegistados = jurisRegistados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Competicao that = (Competicao) o;
        return id == that.id && id_organizador == that.id_organizador && nrondas == that.nrondas && max_equipas == that.max_equipas && Objects.equals(nome, that.nome) && Objects.equals(desc, that.desc) && Objects.equals(data_criacao, that.data_criacao) && Objects.equals(data_conclusao, that.data_conclusao) && Objects.equals(estado, that.estado);
    }

    @Override
    public String toString() {
        return "Competicao{" +
                "id=" + id +
                ", id_organizador=" + id_organizador +
                ", nome_organizador='" + nome_organizador + '\'' +
                ", nrondas=" + nrondas +
                ", max_equipas=" + max_equipas +
                ", equipasRegistadas=" + equipasRegistadas +
                ", jurisRegistados=" + jurisRegistados +
                ", nome='" + nome + '\'' +
                ", desc='" + desc + '\'' +
                ", data_creacao='" + data_criacao + '\'' +
                ", jurilogadoAssociado=" + jurilogadoAssociado +
                ", organizadorlogadoAssociado=" + organizadorlogadoAssociado +
                ", equipalogadoAssociado=" + equipalogadoAssociado +
                ", data_conclusao='" + data_conclusao + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}