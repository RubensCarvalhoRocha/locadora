/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;
import com.locagyn.modelos.Veiculo;

/**
 *
 * @author CarlosJr
 */
public class VeiculoDiretor {

    private IVeiculoBuilder builder;

    public VeiculoDiretor(IVeiculoBuilder builder) {
        this.builder = builder;
    }

    
   public Veiculo criarVeiculo() {
        return builder.setId(1)
                      .setPlaca("ABC1234")
                      .setRenavam(123456789)
                      .setPrecoDeCompra(30000.0f)
                      .setPrecoDeVenda(35000.0f)
                      .setAnoFabricacao(2022)
                      .setAnoModelo(2023)
                      .setTipoDeCombutivel("Gasolina")
                      .setQuilometragem(15000)
                      .setTipoDeVeiculo("Carro")
                      .setModelo(new Modelo())  // Exemplo de uso de Modelo
                      .setSituacao("Disponível")
                      .setCategoria(new Categoria())  // Exemplo de uso de Categoria
                      .build();
    }

}
