/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.persistencia;


import com.locagyn.modelos.Modelo;
import java.util.ArrayList;


public interface IModeloDao {

    void incluir(Modelo objeto) throws Exception;
    void alterar(Modelo objeto) throws Exception;
    ArrayList<Modelo> listagem() throws Exception;
    Modelo buscar(int id) throws Exception;

}
