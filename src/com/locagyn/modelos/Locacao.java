/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;


public class Locacao {

    private int id;
    private Cliente cliente;
    private Motorista motorista;
    private Veiculo veiculo;
    private Acessorios acessorio;
    private String dataInicio;
    private String dataFim;
    private Float valorDaLocação;
    private Object situacao;
    private long diasLocados;
    private float valorDia;

    public Locacao(int id, Motorista motorista, Veiculo veiculo, Acessorios acessorio, String dataInicio, String dataFim, float valorDaLocacao, String situacao, long diasLocados) {
        this.id = id;
        this.id = id;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.acessorio = acessorio;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorDaLocação = valorDaLocacao;
        this.situacao = situacao;
        this.diasLocados = diasLocados;
    }

    public Locacao(int id, Cliente cliente, Motorista motorista, Veiculo veiculo, Acessorios acessorio, String dataInicio, String dataFim, float valorDaLocação, Object situacao, long diasLocados, float valorDia) {
        this.id = id;
        this.cliente = cliente;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.acessorio = acessorio;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorDaLocação = valorDaLocação;
        this.situacao = situacao;
        this.diasLocados = diasLocados;
        this.valorDia = valorDia;
    }

    public Locacao(int id, String dataInicio, String dataFim, Float valorDaLocação, String situacao, long diasLocados, float valorDia) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorDaLocação = valorDaLocação;
        this.situacao = situacao;
        this.diasLocados = diasLocados;
        this.valorDia = valorDia;
    }
    
    public long getDiasLocados() {
        return diasLocados;
    }

    public void setDiasLocados(long diasLocados) {
        this.diasLocados = diasLocados;
    }

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }

    public Locacao() {
    }

    public Object getSituacao() {
        return situacao;
    }

    public void setSituacao(Object situacao) {
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Acessorios getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorios acessorio) {
        this.acessorio = acessorio;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public Float getValorDaLocação() {
        return valorDaLocação;
    }

    public void setValorDaLocação(Float valorDaLocação) {
        this.valorDaLocação = valorDaLocação;
    }

    @Override
    public String toString() {
        return id + ";" + cliente.getId() + ";" + motorista.getId() + ";" + veiculo.getId() + ";" + acessorio.getId() + ";" + dataInicio + ";" + dataFim + ";" + valorDaLocação + ";" + situacao + ";" + diasLocados + ";" + valorDia;
    }

}
