/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

public class Motorista extends Pessoa {

    private String url;
    private int numeroRegistro;
    private String categoriaCNH;
    private String validade;

    public Motorista() {
    }

    public Motorista(int id, String nome, Telefone telefone, Endereco endereco,
            String url, int numeroRegistro, String categoriaCNH, String validade) {
        super(id, nome, telefone, endereco);
        this.url = url;
        this.numeroRegistro = numeroRegistro;
        this.categoriaCNH = categoriaCNH;
        this.validade = validade;
    }

    public Motorista(int id, String nome, String url, int numeroRegistro, String categoriaCNH, String validade) {
        super(id, nome);
        this.url = url;
        this.numeroRegistro = numeroRegistro;
        this.categoriaCNH = categoriaCNH;
        this.validade = validade;
    }

    public Motorista(int id, String nome, String url, int numeroRegistro,
            String categoriaCNH, String validade, Telefone telefone, Endereco endereco) {
        super(id, nome, telefone, endereco); 
        this.url = url;
        this.numeroRegistro = numeroRegistro;
        this.categoriaCNH = categoriaCNH;
        this.validade = validade;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Override
    public String getDetalhes() {
        return "Motorista: " + getNome() + ", CNH: " + categoriaCNH;
    }

    @Override
    public String toString() {
        return getId() + ";" + getNome() + ";" + url + ";" + numeroRegistro + ";" + categoriaCNH + ";"
                + validade + ";" + getTelefone().toString() + ";" + getEndereco().toString();
    }
}
