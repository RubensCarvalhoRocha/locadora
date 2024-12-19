/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Marca;
import com.locagyn.persistencia.IMarcaDao;
import com.locagyn.persistencia.MarcaDao;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementa o controle de marcas com suporte ao padrão Observer.
 */
public class MarcaControle implements IMarcaControle {

    private IMarcaDao marcaPersistencia;
    private List<MarcaObserver> observers = new ArrayList<>(); // Lista de observadores

    public MarcaControle() {
        this.marcaPersistencia = new MarcaDao();
    }

    /**
     * Adiciona um novo observador.
     *
     * @param observer Observador a ser adicionado.
     */
    public void adicionarObserver(MarcaObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    /**
     * Remove um observador existente.
     *
     * @param observer Observador a ser removido.
     */
    public void removerObserver(MarcaObserver observer) {
        observers.remove(observer);
    }

    /**
     * Notifica todos os observadores registrados sobre as alterações na lista
     * de marcas.
     *
     * @throws Exception Se ocorrer um erro ao listar as marcas.
     */
    private void notificarObservers() throws Exception {
        ArrayList<Marca> listaDeMarcas = listagem();
        for (MarcaObserver observer : observers) {
            observer.atualizarListaDeMarcas(listaDeMarcas);
        }
    }

    /**
     * Inclui uma nova marca no sistema e notifica os observadores.
     *
     * @param objeto Marca a ser incluída.
     * @throws Exception Se ocorrer um erro durante a inclusão.
     */
    @Override
    public void incluir(Marca objeto) throws Exception {
        validarMarca(objeto); // Validação de dados
        marcaPersistencia.incluir(objeto);
        notificarObservers(); // Notifica os observadores
    }

    /**
     * Altera uma marca existente no sistema e notifica os observadores.
     *
     * @param objeto Marca a ser alterada.
     * @throws Exception Se ocorrer um erro durante a alteração.
     */
    @Override
    public void alterar(Marca objeto) throws Exception {
        validarMarca(objeto); // Validação de dados
        marcaPersistencia.alterar(objeto);
        notificarObservers(); // Notifica os observadores
    }

    /**
     * Lista todas as marcas do sistema.
     *
     * @return Lista de marcas.
     * @throws Exception Se ocorrer um erro durante a listagem.
     */
    @Override
    public ArrayList<Marca> listagem() throws Exception {
        return marcaPersistencia.listagem();
    }

    /**
     * Busca uma marca pelo ID.
     *
     * @param id Identificador da marca.
     * @return Marca encontrada, ou null se não existir.
     * @throws Exception Se ocorrer um erro durante a busca.
     */
    @Override
    public Marca buscar(int id) throws Exception {
        return marcaPersistencia.buscar(id);
    }

    /**
     * Valida os dados de uma marca antes da inclusão ou alteração.
     *
     * @param objeto Marca a ser validada.
     * @throws Exception Se os dados da marca forem inválidos.
     */
    private void validarMarca(Marca objeto) throws Exception {
        if (buscarMarca(objeto.getDescricao())) {
            throw new Exception("Marca já foi cadastrada.");
        }
        if (objeto.getDescricao().trim().isEmpty()) {
            throw new Exception("Digite a descrição.");
        }
        if (objeto.getUrl().trim().isEmpty()) {
            throw new Exception("Selecione uma imagem.");
        }
    }

    /**
     * Verifica se uma marca com a descrição fornecida já existe.
     *
     * @param descricao Descrição da marca.
     * @return true se a marca já existir, false caso contrário.
     * @throws Exception Se ocorrer um erro durante a busca.
     */
    private boolean buscarMarca(String descricao) throws Exception {
        ArrayList<Marca> listagem = marcaPersistencia.listagem();
        for (Marca marca : listagem) {
            if (marca.getDescricao().equalsIgnoreCase(descricao)) {
                return true;
            }
        }
        return false;
    }
}