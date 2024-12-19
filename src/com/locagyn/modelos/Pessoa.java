/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

/**
 *
 * @author CarlosJr
 */
public abstract class Pessoa {
    private int id;
    private String nome;
    private Telefone telefone;
    private Endereco endereco;
    
    public Pessoa (){
    }

    public Pessoa(int id, String nome, Telefone telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Pessoa(int id2, String nome2) {
       this.id = id2;
       this.nome = nome2;
    }

    

    public Pessoa(int id, Telefone telefone, Endereco endereco) {
        this.id = id;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public abstract String getDetalhes();    
    
}
