/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

import com.locagyn.enumeracao.TipoDeCliente;


public class Cliente  extends Pessoa{

    
    private String cpf;
    private String cnpj;
    private String razaoSocial;
    private String identidade;
    private String email;
    private TipoDeCliente tipoDoCliente;

    public Cliente(int i, String vetorString, String vetorString2, String vetorString3, String vetorString4, Telefone telefone, Endereco endereco, TipoDeCliente tipoDoCliente2) {}

    public Cliente(int id, String nome, Telefone telefone, Endereco endereco,
                   String cpf, String cnpj, String razaoSocial, 
                   String identidade, String email, TipoDeCliente tipoDoCliente) {
        super(id, nome, telefone, endereco);
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.identidade = identidade;
        this.email = email;
        this.tipoDoCliente = tipoDoCliente;
    }

    public Cliente(int id, String cnpj, String razaoSocial, String email, Telefone telefone, Endereco endereco, TipoDeCliente tipoDoCliente) {
        super(id, telefone,endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.tipoDoCliente = tipoDoCliente;
    }

    public Cliente() {
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoDeCliente getTipoDoCliente() {
        return tipoDoCliente;
    }

    public void setTipoDoCliente(TipoDeCliente tipoDoCliente) {
        this.tipoDoCliente = tipoDoCliente;
    }

    public String toString(TipoDeCliente tipoDoCliente) {

        if (tipoDoCliente.equals(TipoDeCliente.PESSOA_FISICA)) {
            return getId() + ";"
                    + cpf + ";"
                    + getNome() + ";"
                    + identidade + ";"
                    + getTelefone().toString() + ";"
                    + email + ";"
                    + getEndereco().toString();
        }
        if (tipoDoCliente.equals(TipoDeCliente.PESSOA_JURIDICA)) {
            return getId() + ";"
                    + razaoSocial + ";"
                    + cnpj + ";"
                    + getTelefone().toString() + ";"
                    + email + ";"
                    + getEndereco().toString();
        } else {
            return null;
        }
    }

    @Override
    public String getDetalhes() {
        return "Cliente: " + getNome() + ", CPF/CNPJ: " + (cpf != null ? cpf : cnpj);
    }

}
