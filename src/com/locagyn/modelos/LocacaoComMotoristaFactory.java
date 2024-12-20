/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

import com.locagyn.persistencia.AcessoriosDao;
import com.locagyn.persistencia.IAcessoriosDao;
import com.locagyn.persistencia.IMotoristaDao;
import com.locagyn.persistencia.IVeiculoDao;
import com.locagyn.persistencia.MotoristaDao;
import com.locagyn.persistencia.VeiculoDao;

/**
 *
 * @author CarlosJr
 */
public class LocacaoComMotoristaFactory implements ILocalcaoFactory {

    private Cliente cliente;
    private Motorista motorista;
    private Veiculo veiculo;
    private Acessorios acessorio;
    private String dataInicio;
    private String dataFim;
    private Float valorDaLocacao;
    private Object situacao;
    private long diasLocados;
    private float valorDia;

    
    @Override
    public Locacao criarLocacao(String linha) throws Exception {
        IVeiculoDao objetoVeiculo = new VeiculoDao();
        IMotoristaDao objetoMotorista = new MotoristaDao();
        IAcessoriosDao objetoAcessorio = new AcessoriosDao();

        Locacao objetoLocacao = new Locacao();
        String vetorString[] = linha.split(";");

        objetoLocacao.setId(Integer.parseInt(vetorString[0]));
        int idMotorista = Integer.parseInt(vetorString[2]);
        objetoLocacao.setMotorista(objetoMotorista.buscar(idMotorista));
        int idVeiculo = Integer.parseInt(vetorString[3]);
        objetoLocacao.setVeiculo(objetoVeiculo.buscar(idVeiculo));
        int idAcessorios = Integer.parseInt(vetorString[4]);
        objetoLocacao.setAcessorio(objetoAcessorio.buscar(idAcessorios));
        objetoLocacao.setDataInicio(vetorString[5]);
        objetoLocacao.setDataFim(vetorString[6]);
        objetoLocacao.setValorDaLocação(Float.parseFloat(vetorString[7]));
        objetoLocacao.setSituacao(vetorString[8]);
        objetoLocacao.setDiasLocados(Long.parseLong(vetorString[9]));

        return objetoLocacao;
    }
}
