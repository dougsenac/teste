package br.senac.Chamado.model;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Chamado {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("dataAbertura")
    @Expose
    private Date dataAbertura;

    @SerializedName("descricao")
    @Expose
    private String descricao;


    private Enum status;

    @SerializedName("solucao")
    @Expose
    private String solucao;



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

        public Enum getStatus() {
            return status;
        }

        public void setStatus(Enum status) {
            this.status = status;
        }

        public String getSolucao() {
            return solucao;
        }

        public void setSolucao(String solucao) {
            this.solucao = solucao;

        }

    public Chamado(int id, Date dataAbertura, String descricao, Enum status, String solucao) {
        this.id = id;
        this.dataAbertura = dataAbertura;
        this.descricao = descricao;
        this.status = status;
        this.solucao = solucao;
    }

    public  Chamado(){

    }




    @NonNull
    @Override
    public String toString() {
        return "Chamados{" +
                "id=" + id +
                ", dataAbertura=" + dataAbertura +
                ", decricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                ", solucao='" + solucao + '\'' +
                '}';

    }
}
