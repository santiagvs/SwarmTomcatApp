package com.form.model;

public class Reserva {

    private String nome;
    private String email;
    private String sexo;
    private String dataChegada;
    private int noites;
    private int qtdHospedes;
    private String mensagem;

    public Reserva(String nome, String email, String sexo, String dataChegada, int noites, int qtdHospedes, String mensagem) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.dataChegada = dataChegada;
        this.noites = noites;
        this.qtdHospedes = qtdHospedes;
        this.mensagem = mensagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public int getNoites() {
        return noites;
    }

    public void setNoites(int noites) {
        this.noites = noites;
    }

    public int getQtdHospedes() {
        return qtdHospedes;
    }

    public void setQtdHospedes(int qtdHospedes) {
        this.qtdHospedes = qtdHospedes;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
