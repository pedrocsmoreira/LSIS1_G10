package com.lsis1.grupo10.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


public class Associar_robo {
    private int id;
    private int id_robot;
    private String robot;
    private String velocidade;
    private String tempo;
    private int pontos;
    private String data_criacao;

    private static final int INT_DEFAULT = 0;
    private static final String STR_DEFAULT = "";
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Associar_robo() {
        this.id = INT_DEFAULT;
        this.id_robot = INT_DEFAULT;
        this.robot = STR_DEFAULT;
        this.velocidade = STR_DEFAULT;
        this.tempo = STR_DEFAULT;
        this.pontos = INT_DEFAULT;
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
    }

    public Associar_robo(int id, String robot, String velocidade, String tempo, int pontos) {
        this.id = id;
        this.robot = robot;
        this.velocidade = velocidade;
        this.tempo = tempo;
        this.pontos = pontos;
        LocalDateTime now = LocalDateTime.now();
        this.data_criacao = dtf.format(now);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPontos() {
        return this.pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getRobot() {
        return this.robot;
    }

    public void setRobot(String robot) {
        this.robot = robot;
    }

    public String getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public String getTempo() {
        return this.tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }


    public String getData_criacao() {
        return this.data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public int getId_robot() {
        return this.id_robot;
    }

    public void setId_robot(int id_robot) {
        this.id_robot = id_robot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Associar_robo)){
            return false;
        }
        Associar_robo associarrobo = (Associar_robo) o;
        return velocidade == associarrobo.velocidade && tempo == associarrobo.tempo && pontos == associarrobo.pontos && Objects.equals(robot, associarrobo.robot);
    }

    @Override
    public String toString() {
        return "Associar_robo{" +
                "robot=" + robot +
                ", velocidade=" + velocidade +
                ", tempo=" + tempo +
                ", pontos=" + pontos +
                '}';
    }
}