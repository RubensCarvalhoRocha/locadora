/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.enumeracao.TipoDeCliente;
import com.locagyn.modelos.Cliente;
import java.util.ArrayList;


public interface IClienteDao {

    void incluir(Cliente objeto, TipoDeCliente tipoDoCliente) throws Exception;

    void alterar(Cliente objeto, TipoDeCliente tipoDoCliente) throws Exception;

    ArrayList<Cliente> listagem(TipoDeCliente tipoDoCliente) throws Exception;

    Cliente buscar(int id, TipoDeCliente tipoDoCliente) throws Exception;

    public void verTxt() throws Exception;

}
