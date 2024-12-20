/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.enumeracao.TipoDeCliente;
import com.locagyn.modelos.Cliente;
import com.locagyn.persistencia.IClienteDao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CarlosJr
 */
public class ClienteControleTest {
    
    @Test
    public void testeIncluirCliente() throws Exception {
       
        ClienteDaoFake clienteDaoFake = new ClienteDaoFake();
        ClienteControle clienteControle = new ClienteControle();
        clienteControle.clientePersistencia = (IClienteDao) clienteDaoFake;

        
        Cliente cliente = new Cliente();
        cliente.setCpf("12345678901");
        cliente.setNome("João da Silva");

       
        clienteControle.incluir(cliente, TipoDeCliente.PESSOA_FISICA);

        
        assertEquals(1, clienteDaoFake.listagem(TipoDeCliente.PESSOA_FISICA).size());
        assertEquals("João da Silva", clienteDaoFake.listagem(TipoDeCliente.PESSOA_FISICA).get(0).getNome());
    }
    
}
