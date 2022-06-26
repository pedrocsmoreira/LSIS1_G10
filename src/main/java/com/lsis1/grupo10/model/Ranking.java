package com.lsis1.grupo10.model;

import java.util.Objects;

public class Ranking implements Comparable<Ranking>{
    private String nome_equipa;
    private String nome_robo;
    private int tempoMilissegundos;
    private String besttempo;
    private String velmax;
    private int pontos;

    private static final int INT_DEFAULT = 0;
    private static final String STR_DEFAULT = "";
    
    public Ranking() {
        this.nome_equipa = STR_DEFAULT;
        this.nome_robo = STR_DEFAULT;
        this.tempoMilissegundos = INT_DEFAULT;
        this.besttempo = STR_DEFAULT;
        this.velmax = STR_DEFAULT;
        this.pontos = INT_DEFAULT;
    }
    
    public Ranking(String nome_equipa, String nome_robo, String besttempo, String velmax, int pontos) {
        this.nome_equipa = nome_equipa;
        this.nome_robo = nome_robo;
        this.tempoMilissegundos = INT_DEFAULT;
        this.besttempo = besttempo;
        this.velmax = velmax;
        this.pontos = pontos;
    }

    public String getNome_equipa() {
        return this.nome_equipa;
    }

    public void setNome_equipa(String nome_equipa) {
        this.nome_equipa = nome_equipa;
    }

    public String getNome_robo() {
        return this.nome_robo;
    }

    public void setNome_robo(String nome_robo) {
        this.nome_robo = nome_robo;
    }

    public String getBesttempo() {
        return this.besttempo;
    }

    public void setBesttempo(String besttempo) {
        this.besttempo = besttempo;
    }

    public String getVelmax() {
        return this.velmax;
    }

    public void setVelmax(String velmax) {
        this.velmax = velmax;
    }

    public int getPontos() {
        return this.pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getTempoMilissegundos() {
        return this.tempoMilissegundos;
    }

    public void setTempoMilissegundos(int tempoMilissegundos) {
        this.tempoMilissegundos = tempoMilissegundos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ranking ranking = (Ranking) o;
        return besttempo == ranking.besttempo && velmax == ranking.velmax && pontos == ranking.pontos && Objects.equals(nome_equipa, ranking.nome_equipa) && Objects.equals(nome_robo, ranking.nome_robo);
    }

    @Override
    public int compareTo(Ranking o) {
        if (this.pontos == o.pontos){
            if(this.tempoMilissegundos > o.tempoMilissegundos){
                return 1;
            }else if(this.tempoMilissegundos < o.tempoMilissegundos) {
                return -1;
            }
            return 0;
        }else if(this.pontos > o.pontos) {
            return -1;
        }else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Ranking{" +
                "nome_equipa='" + nome_equipa + '\'' +
                ", nome_robo='" + nome_robo + '\'' +
                ", besttempo=" + besttempo +
                ", velmax=" + velmax +
                ", pontos=" + pontos +
                '}';
    }

}