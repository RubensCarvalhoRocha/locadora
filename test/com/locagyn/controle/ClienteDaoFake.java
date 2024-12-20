/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;
import com.locagyn.modelos.Cliente;
import com.locagyn.enumeracao.TipoDeCliente;
import com.locagyn.persistencia.IClienteDao;
import java.util.ArrayList;
/**
 *
 * @author CarlosJr
 */
public class ClienteDaoFake implements IClienteDao {
    
    private ArrayList<Cliente> clientes = new ArrayList<>();

    @Override
    public void incluir(Cliente cliente, TipoDeCliente tipoDeCliente) throws Exception {
        clientes.add(cliente);
    }

    @Override
    public void alterar(Cliente cliente, TipoDeCliente tipoDeCliente) throws Exception {
        // Simula alteração, removendo e adicionando novamente
        clientes.removeIf(c -> c.getId() == cliente.getId());
        clientes.add(cliente);
    }

    @Override
    public ArrayList<Cliente> listagem(TipoDeCliente tipoDeCliente) throws Exception {
        return clientes; // Retorna a lista fictícia
    }

    @Override
    public Cliente buscar(int id, TipoDeCliente tipoDeCliente) throws Exception {
        return clientes.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void verTxt() throws Exception {
        
    }
}
