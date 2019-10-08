package br.senac.chamados.model;

import androidx.annotation.NonNull;

import java.util.Date;

public class Chamado {

    private int id;
    private Date dataAbertura;
    private String descricao;
    private String status;
    private String solucao;

    public Chamado() {

    }

    public Chamado(int id, Date dataAbertura, String decricao, String status, String solucao) {
        this.id = id;
        this.dataAbertura = dataAbertura;
        this.descricao = descricao;
        this.status = status;
        this.solucao = solucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    @NonNull
    @Override
    public String toString() {
        return "Chamado{" +
                " dataAbertura = " + dataAbertura +
                ", descrição = '" + descricao + '\'' +
                ", status = '" + status + '\'' +
                ", solução = '" + solucao + '\'' +
                '}';


    }
}
