/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.enumeracao.TipoDeCliente;
import static com.locagyn.enumeracao.TipoDeCliente.PESSOA_FISICA;
import static com.locagyn.enumeracao.TipoDeCliente.PESSOA_JURIDICA;
import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Cliente;
import com.locagyn.modelos.Endereco;
import com.locagyn.modelos.Telefone;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;


public class ClienteDao implements IClienteDao {

    private String nomeDoArquivoNoDiscoPF;
    private String nomeDoArquivoNoDiscoPJ;
    private String caminho = "";
    Cliente objetoCliente = new Cliente();

    public ClienteDao() {
        nomeDoArquivoNoDiscoPF = "./src/com/locagyn/arquivosdedados/ClientePF.txt";
        nomeDoArquivoNoDiscoPJ = "./src/com/locagyn/arquivosdedados/ClientePJ.txt";
    }

    @Override
    public void incluir(Cliente objeto, TipoDeCliente tipoDoCliente) throws Exception {

        try {
            if (tipoDoCliente == PESSOA_FISICA) {
                //cria o arquivo
                FileWriter fw = new FileWriter(nomeDoArquivoNoDiscoPF, true);
                //Criar o buffer do arquivo
                BufferedWriter bw = new BufferedWriter(fw);
                // Incluindo o id no objeto ******
                objeto.setId(GeradorIdentificador.getID());
                //Escreve no arquivo
                bw.write(objeto.toString(objeto.getTipoDoCliente()) + "\n");
                //fecha o arquivo
                bw.close();
            }
            if (tipoDoCliente == PESSOA_JURIDICA) {
                //cria o arquivo
                FileWriter fw = new FileWriter(nomeDoArquivoNoDiscoPJ, true);
                //Criar o buffer do arquivo
                BufferedWriter bw = new BufferedWriter(fw);
                // Incluindo o id no objeto ******
                objeto.setId(GeradorIdentificador.getID());
                //Escreve no arquivo
                bw.write(objeto.toString(objeto.getTipoDoCliente()) + "\n");
                //fecha o arquivo
                bw.close();
            }

        } catch (Exception erro) {
            throw erro;
        }

    }

    @Override
    public void alterar(Cliente objeto, TipoDeCliente tipoDoCliente) throws Exception {
        try {
            if (tipoDoCliente == PESSOA_FISICA) {
                Iterator<Cliente> lista = listagem(TipoDeCliente.PESSOA_FISICA).iterator();
                FileWriter fw = new FileWriter(nomeDoArquivoNoDiscoPF);
                BufferedWriter bw = new BufferedWriter(fw);

                while (lista.hasNext()) {

                    Cliente aux = lista.next();
                    if (aux.getId() == objeto.getId()) {
                        bw.write(objeto.toString(TipoDeCliente.PESSOA_FISICA)+ "\n");
                    } else {
                        bw.write(aux.toString(TipoDeCliente.PESSOA_FISICA)+ "\n");
                    }

                }

                bw.close();
            }
            if (tipoDoCliente == PESSOA_JURIDICA) {
                Iterator<Cliente> lista = listagem(TipoDeCliente.PESSOA_JURIDICA).iterator();
                FileWriter fw = new FileWriter(nomeDoArquivoNoDiscoPJ);
                BufferedWriter bw = new BufferedWriter(fw);

                while (lista.hasNext()) {

                    Cliente aux = lista.next();
                    if (aux.getId() == objeto.getId()) {
                        bw.write(objeto.toString(TipoDeCliente.PESSOA_JURIDICA)+ "\n");
                    } else {
                        bw.write(aux.toString(TipoDeCliente.PESSOA_JURIDICA)+ "\n");
                    }

                }

                bw.close();
            }

        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList<Cliente> listagem(TipoDeCliente tipoDoCliente) throws Exception {
        try {
            ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
            String linha = "";
            if (tipoDoCliente.equals(TipoDeCliente.PESSOA_FISICA)) {
                FileReader fr = new FileReader(nomeDoArquivoNoDiscoPF);
                BufferedReader br = new BufferedReader(fr);

                while ((linha = br.readLine()) != null) {
                    Cliente objetoCliente = new Cliente();
                    String vetorString[] = linha.split(";");
                    objetoCliente.setId(Integer.parseInt(vetorString[0]));
                    objetoCliente.setCpf(vetorString[1]);
                    objetoCliente.setNome(vetorString[2]);
                    objetoCliente.setIdentidade(vetorString[3]);

                    long ddi = Long.parseLong(vetorString[4]);
                    long ddd = Long.parseLong(vetorString[5]);
                    long numero = Long.parseLong(vetorString[6]);
                    Telefone telefone = new Telefone(ddi, ddd, numero);
                    objetoCliente.setTelefone(telefone);
                    objetoCliente.setEmail(vetorString[7]);

                    String logradouro = vetorString[8];
                    String complemento = vetorString[9];
                    String bairro = vetorString[10];
                    String cidade = vetorString[11];
                    String estado = vetorString[12];
                    long cep = Long.parseLong(vetorString[13]);

                    Endereco endereco = new Endereco(logradouro, complemento, cidade, estado, bairro, cep);
                    objetoCliente.setEndereco(endereco);
                    listaDeClientes.add(objetoCliente);
                }
                br.close();
                return listaDeClientes;
            }
            if (tipoDoCliente.equals(TipoDeCliente.PESSOA_JURIDICA)) {
                FileReader fr = new FileReader(nomeDoArquivoNoDiscoPJ);
                BufferedReader br = new BufferedReader(fr);

                while ((linha = br.readLine()) != null) {
                    Cliente objetoCliente = new Cliente();
                    String vetorString[] = linha.split(";");
                    objetoCliente.setId(Integer.parseInt(vetorString[0]));
                    objetoCliente.setRazaoSocial(vetorString[1]);
                    objetoCliente.setCnpj(vetorString[2]);

                    long ddi = Long.parseLong(vetorString[3]);
                    long ddd = Long.parseLong(vetorString[4]);
                    long numero = Long.parseLong(vetorString[5]);
                    Telefone telefone = new Telefone(ddi, ddd, numero);
                    objetoCliente.setTelefone(telefone);
                    objetoCliente.setEmail(vetorString[6]);

                    String logradouro = vetorString[7];
                    String complemento = vetorString[8];
                    String bairro = vetorString[9];
                    String cidade = vetorString[10];
                    String estado = vetorString[11];
                    long cep = Long.parseLong(vetorString[12]);
                    Endereco endereco = new Endereco(logradouro, complemento, cidade, estado, bairro, cep);
                    objetoCliente.setEndereco(endereco);
                    listaDeClientes.add(objetoCliente);

                }
                br.close();
                return listaDeClientes;
            }
            return null;

        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public Cliente buscar(int id, TipoDeCliente tipoDoCliente) throws Exception {
        if (tipoDoCliente == PESSOA_FISICA) {
            caminho = nomeDoArquivoNoDiscoPF;
        }
        if (tipoDoCliente == PESSOA_JURIDICA) {
            caminho = nomeDoArquivoNoDiscoPJ;
        }
        FileReader fr = new FileReader(caminho);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";

        if (tipoDoCliente == PESSOA_FISICA) {
            while ((linha = br.readLine()) != null) {
                String vetorString[] = linha.split(";");
                objetoCliente.setId(Integer.parseInt(vetorString[0]));
                objetoCliente.setCpf(vetorString[1]);
                objetoCliente.setNome(vetorString[2].replaceAll("_", " "));
                objetoCliente.setIdentidade(vetorString[3]);
//                String[] telSeparado = vetorString[4].split(";");
                long ddi = Long.parseLong(vetorString[4]);
                long ddd = Long.parseLong(vetorString[5]);
                long numero = Long.parseLong(vetorString[6]);
                Telefone telefone = new Telefone(ddi, ddd, numero);
                objetoCliente.setTelefone(telefone);
                objetoCliente.setEmail(vetorString[7]);
//                String[] endSeparado = vetorString[8].split(",");
                String logradouro = vetorString[8];
                String complemento = vetorString[9];
                String bairro = vetorString[10];
                String cidade = vetorString[11];
                String estado = vetorString[12];
                long cep = Long.parseLong(vetorString[13]);
                Endereco endereco = new Endereco(logradouro, complemento, cidade, estado, bairro, cep);
                objetoCliente.setEndereco(endereco);
                if (objetoCliente.getId() == id) {
                    br.close();
                    return new Cliente((Integer.parseInt(vetorString[0])), vetorString[1], vetorString[2], vetorString[3], vetorString[7], telefone, endereco, tipoDoCliente);
                }
            }
        }
        if (tipoDoCliente == PESSOA_JURIDICA) {
            String vetorString[] = linha.split(";");
            objetoCliente.setId(Integer.parseInt(vetorString[0]));
            objetoCliente.setRazaoSocial(vetorString[1]);
            objetoCliente.setCnpj(vetorString[2]);
            String[] telSeparado = vetorString[3].split(";");
            long ddi = Long.parseLong(telSeparado[0]);
            long ddd = Long.parseLong(telSeparado[1]);
            long numero = Long.parseLong(telSeparado[2]);
            Telefone telefone = new Telefone(ddi, ddd, numero);
            objetoCliente.setTelefone(telefone);
            objetoCliente.setEmail(vetorString[4]);
            String[] endSeparado = vetorString[5].split(",");
            String logradouro = endSeparado[0];
            String complemento = endSeparado[1];
            String bairro = endSeparado[2];
            String cidade = endSeparado[3];
            String estado = endSeparado[4];
            long cep = Long.parseLong(endSeparado[5]);
            Endereco endereco = new Endereco(logradouro, complemento, cidade, estado, bairro, cep);
            objetoCliente.setEndereco(endereco);
            if (objetoCliente.getId() == id) {
                br.close();
                return new Cliente((Integer.parseInt(vetorString[0])), vetorString[2], vetorString[1], vetorString[4], telefone, endereco, tipoDoCliente);
            }
        }
        return null;

    }

    @Override
    public void verTxt() throws Exception {
        File arquivoPf = new File("./src/com/locagyn/arquivosdedados/ClientePF.txt");
        File arquivoPj = new File("./src/com/locagyn/arquivosdedados/ClientePJ.txt");
        try {
            arquivoPf.createNewFile();
            arquivoPj.createNewFile();
        } catch (Exception e) {
            System.out.println("");
        }

    }

}
