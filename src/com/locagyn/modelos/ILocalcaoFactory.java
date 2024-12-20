/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.modelos;

/**
 *
 * @author CarlosJr
 */
public interface ILocalcaoFactory { 
    Locacao criarLocacao(String linha) throws Exception;
}
