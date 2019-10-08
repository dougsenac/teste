package br.senac.chamados.model;

public enum Status {
    ENVIADA{
        @Override
        public String toString(){
            return "Enviada";
        }
    },
    NAOENVIADA{
        @Override
        public String toString(){
            return "Não Enviada";
        }
    }
}
