/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.modelos;

/**
 *
 * @author CarlosJr
 */
public interface IVeiculoBuilder {

    IVeiculoBuilder setId(int id);

    IVeiculoBuilder setPlaca(String placa);

    IVeiculoBuilder setRenavam(int renavam);

    IVeiculoBuilder setPrecoDeCompra(float precoDeCompra);

    IVeiculoBuilder setPrecoDeVenda(float precoDeVenda);

    IVeiculoBuilder setAnoFabricacao(int anoFabricacao);

    IVeiculoBuilder setAnoModelo(int anoModelo);

    IVeiculoBuilder setTipoDeCombutivel(String tipoDeCombutivel);

    IVeiculoBuilder setQuilometragem(int quilometragem);

    IVeiculoBuilder setTipoDeVeiculo(String tipoDeVeiculo);

    IVeiculoBuilder setModelo(Modelo modelo);

    IVeiculoBuilder setSituacao(String situacao);

    IVeiculoBuilder setCategoria(Categoria categoria);

    Veiculo build();
}
