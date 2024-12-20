/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

/**
 *
 * @author CarlosJr
 */
public class VeiculoBuilder implements IVeiculoBuilder{

      private Veiculo veiculo;

    public VeiculoBuilder() {
        veiculo = new Veiculo();
    }

    @Override
    public IVeiculoBuilder setId(int id) {
        veiculo.setId(id);
        return this;
    }

    @Override
    public IVeiculoBuilder setPlaca(String placa) {
        veiculo.setPlaca(placa);
        return this;
    }

    @Override
    public IVeiculoBuilder setRenavam(int renavam) {
        veiculo.setRenavam(renavam);
        return this;
    }

    @Override
    public IVeiculoBuilder setPrecoDeCompra(float precoDeCompra) {
        veiculo.setPrecoDeCompra(precoDeCompra);
        return this;
    }

    @Override
    public IVeiculoBuilder setPrecoDeVenda(float precoDeVenda) {
        veiculo.setPrecoDeVenda(precoDeVenda);
        return this;
    }

    @Override
    public IVeiculoBuilder setAnoFabricacao(int anoFabricacao) {
        veiculo.setAnoFabricacao(anoFabricacao);
        return this;
    }

    @Override
    public IVeiculoBuilder setAnoModelo(int anoModelo) {
        veiculo.setAnoModelo(anoModelo);
        return this;
    }

    @Override
    public IVeiculoBuilder setTipoDeCombutivel(String tipoDeCombutivel) {
        veiculo.setTipoDeCombutivel(tipoDeCombutivel);
        return this;
    }

    @Override
    public IVeiculoBuilder setQuilometragem(int quilometragem) {
        veiculo.setQuilometragem(quilometragem);
        return this;
    }

    @Override
    public IVeiculoBuilder setTipoDeVeiculo(String tipoDeVeiculo) {
        veiculo.setTipoDeVeiculo(tipoDeVeiculo);
        return this;
    }

    @Override
    public IVeiculoBuilder setModelo(Modelo modelo) {
        veiculo.setModelo(modelo);
        return this;
    }

    @Override
    public IVeiculoBuilder setSituacao(String situacao) {
        veiculo.setSituacao(situacao);
        return this;
    }

    @Override
    public IVeiculoBuilder setCategoria(Categoria categoria) {
        veiculo.setCategoria(categoria);
        return this;
    }

    @Override
    public Veiculo build() {
        return veiculo;
    }


}
