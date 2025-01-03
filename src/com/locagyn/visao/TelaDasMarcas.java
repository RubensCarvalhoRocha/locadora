/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.locagyn.visao;

import com.locagyn.controle.IMarcaControle;
import com.locagyn.controle.MarcaControle;
import com.locagyn.ferramentas.GeradorIdentificador;
import javax.swing.JOptionPane;
import com.locagyn.modelos.Marca;
import com.locagyn.utils.jTableRender;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import com.locagyn.utils.jTableRender;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import com.locagyn.controle.IMarcaObserver;

public class TelaDasMarcas extends javax.swing.JFrame implements IMarcaObserver {

    //Atributos 
    IMarcaControle marcaControle = new MarcaControle();

    private TableCellRenderer jTableRender;

    /**
     * Creates new form TelaDasMarcas
     */
    public TelaDasMarcas() {
        initComponents();
        marcaControle = new MarcaControle();

        // Registra esta tela como observadora
        ((MarcaControle) marcaControle).adicionarObserver(this);

        jTextFieldIdentificador.setEnabled(false);
        //jTextAreaLogo.setEnabled(false);
        jTextFieldUrl.setEnabled(false);
        this.setLocationRelativeTo(null);
        try {
            imprimirDadosNaGrid(marcaControle.listagem());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIdentificador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldUrl = new javax.swing.JTextField();
        jButtonIncluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldLogo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMarcas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemLocacao = new javax.swing.JMenuItem();
        jMenuItemCadastroDeMotorista = new javax.swing.JMenuItem();
        jMenuItemCadastroDeCategorias = new javax.swing.JMenuItem();
        jMenuItemCadastroDeAcessorios = new javax.swing.JMenuItem();
        jMenuItemCadastroVeiculo = new javax.swing.JMenuItem();
        jMenuItemCadastroDeCliente = new javax.swing.JMenuItem();
        jMenuItemCadastroDeModelo = new javax.swing.JMenuItem();
        jMenuItemCadastroDeMarca = new javax.swing.JMenuItem();
        jMenuItemTelaInicial = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(176, 198, 238));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setText("ID:");

        jTextFieldIdentificador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldIdentificador.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel3.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setText("URL:");

        jTextFieldDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldDescricao.setBorder(null);
        jTextFieldDescricao.setInheritsPopupMenu(true);
        jTextFieldDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyTyped(evt);
            }
        });

        jTextFieldUrl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldUrl.setBorder(null);
        jTextFieldUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUrlActionPerformed(evt);
            }
        });

        jButtonIncluir.setBackground(new java.awt.Color(0, 0, 0));
        jButtonIncluir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonIncluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIncluir.setText("INCLUIR");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAlterar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setText("ALTERAR");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonBuscar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("BUSCAR LOGO");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTextFieldLogo.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldLogo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTableMarcas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableMarcas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICADOR", "DESCRIÇÃO", "URL", "LOGO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMarcas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableMarcas.setGridColor(new java.awt.Color(0, 0, 0));
        jTableMarcas.setRowHeight(50);
        jTableMarcas.setShowGrid(true);
        jTableMarcas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMarcasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMarcas);
        if (jTableMarcas.getColumnModel().getColumnCount() > 0) {
            jTableMarcas.getColumnModel().getColumn(3).setCellRenderer(new jTableRender());
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAlterar))
                            .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 59, Short.MAX_VALUE)
                        .addComponent(jTextFieldLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addComponent(jLabel3)
                                    .addGap(2, 2, 2)
                                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jTextFieldLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jButtonBuscar)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAlterar)
                            .addComponent(jButtonIncluir))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuOpcoes.setText("Options");

        jMenuItemLocacao.setText("Locação");
        jMenuItemLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLocacaoActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemLocacao);

        jMenuItemCadastroDeMotorista.setText("Cadastro de Motorista");
        jMenuItemCadastroDeMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeMotoristaActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroDeMotorista);

        jMenuItemCadastroDeCategorias.setText("Cadastro de Categorias");
        jMenuItemCadastroDeCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeCategoriasActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroDeCategorias);

        jMenuItemCadastroDeAcessorios.setText("Cadastro de Acessorios");
        jMenuItemCadastroDeAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeAcessoriosActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroDeAcessorios);

        jMenuItemCadastroVeiculo.setText("Cadastro de Veículo");
        jMenuItemCadastroVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroVeiculoActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroVeiculo);

        jMenuItemCadastroDeCliente.setText("Cadastro de Cliente");
        jMenuItemCadastroDeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeClienteActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroDeCliente);

        jMenuItemCadastroDeModelo.setText("Cadastro de Modelo");
        jMenuItemCadastroDeModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeModeloActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroDeModelo);

        jMenuItemCadastroDeMarca.setText("Cadastro de Marca");
        jMenuItemCadastroDeMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroDeMarcaActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemCadastroDeMarca);

        jMenuItemTelaInicial.setText("Tela Inicial");
        jMenuItemTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaInicialActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemTelaInicial);

        jMenuBar1.add(jMenuOpcoes);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try {
            JFileChooser fc = new JFileChooser();
            File logo = new File("./src/com/locadora/logos");
            fc.setCurrentDirectory(logo);
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.showOpenDialog(this);
            File arquivo = fc.getSelectedFile();
            String nomeDoArquivo = arquivo.getPath();
            String nome = arquivo.getName();
            String url = logo.getPath();
            url += "/" + nome;
            jTextFieldUrl.setText(url);
            ImageIcon iconLogo = new ImageIcon(nomeDoArquivo);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(jTextFieldLogo.getWidth(), jTextFieldLogo.getHeight(), 1));
            jTextFieldLogo.setIcon(iconLogo);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Selecione uma imagem!");
        }
    }
    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:
        try {
            Marca objeto = new Marca(0, jTextFieldDescricao.getText(), jTextFieldUrl.getText());
            marcaControle.incluir(objeto);
            jTextFieldDescricao.setText("");
            jTextFieldUrl.setText("");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jTextFieldUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUrlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUrlActionPerformed

    private void jTextFieldDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyReleased
        // TODO add your handling code here:
        int posicao = jTextFieldDescricao.getCaretPosition();
        jTextFieldDescricao.setText(jTextFieldDescricao.getText().toUpperCase());
        jTextFieldDescricao.setCaretPosition(posicao);


    }//GEN-LAST:event_jTextFieldDescricaoKeyReleased

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:

        try {
            Marca objeto = new Marca(
                    Integer.parseInt(jTextFieldIdentificador.getText()),
                    jTextFieldDescricao.getText(),
                    jTextFieldUrl.getText()
            );
            marcaControle.alterar(objeto);
            jTextFieldDescricao.setText("");
            jTextFieldUrl.setText("");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTableMarcasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMarcasMouseClicked
        // TODO add your handling code here:
        try {
            jTextFieldIdentificador.setText(jTableMarcas.getValueAt(jTableMarcas.getSelectedRow(), 0).toString());
            jTextFieldDescricao.setText(jTableMarcas.getValueAt(jTableMarcas.getSelectedRow(), 1).toString());
            jTextFieldUrl.setText(jTableMarcas.getValueAt(jTableMarcas.getSelectedRow(), 2).toString());
            String nomeArquivo = (String) this.jTableMarcas.getValueAt(jTableMarcas.getSelectedRow(), 2);
            jTextFieldUrl.setText(nomeArquivo);
            ImageIcon iconLogo = new ImageIcon(nomeArquivo);
            iconLogo.setImage(iconLogo.getImage().getScaledInstance(jTextFieldLogo.getWidth(), jTextFieldLogo.getHeight(), 1));
            jTextFieldLogo.setIcon(iconLogo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jTableMarcasMouseClicked

    private void jTextFieldDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyTyped
        // TODO add your handling code here:
        char e = evt.getKeyChar();
        if (!Character.isLetter(e)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDescricaoKeyTyped

    private void jMenuItemLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLocacaoActionPerformed
        // TODO add your handling code here:
        try {
            TelaDeLocacao telaLocacao = new TelaDeLocacao();
            telaLocacao.setLocationRelativeTo(null);
            telaLocacao.setVisible(true);
            this.setVisible(false);
            telaLocacao.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemLocacaoActionPerformed

    private void jMenuItemCadastroDeMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeMotoristaActionPerformed
        // TODO add your handling code here:
        try {
            TelaCadastroMotorista telaMotorista = new TelaCadastroMotorista();
            telaMotorista.setLocationRelativeTo(null);
            telaMotorista.setVisible(true);
            this.setVisible(false);
            telaMotorista.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroDeMotoristaActionPerformed

    private void jMenuItemCadastroDeCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeCategoriasActionPerformed
        // TODO add your handling code here:
        try {

            TelaDeCategoria telaCategoria = new TelaDeCategoria();
            telaCategoria.setLocationRelativeTo(null);
            telaCategoria.setVisible(true);
            this.setVisible(false);
            telaCategoria.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroDeCategoriasActionPerformed

    private void jMenuItemCadastroDeAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeAcessoriosActionPerformed
        // TODO add your handling code here:
        try {
            TelaDeAcessorios telaAcessorios = new TelaDeAcessorios();
            telaAcessorios.setLocationRelativeTo(null);
            telaAcessorios.setVisible(true);
            this.setVisible(false);
            telaAcessorios.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroDeAcessoriosActionPerformed

    private void jMenuItemCadastroVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroVeiculoActionPerformed
        // TODO add your handling code here:
        try {

            TelaCadastroVeiculo telaVeiculo = new TelaCadastroVeiculo();
            telaVeiculo.setLocationRelativeTo(null);
            telaVeiculo.setVisible(true);
            this.setVisible(false);
            telaVeiculo.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroVeiculoActionPerformed

    private void jMenuItemCadastroDeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeClienteActionPerformed
        // TODO add your handling code here:
        try {

            TelaCadastroCliente cadastroCliente = new TelaCadastroCliente();
            cadastroCliente.setLocationRelativeTo(null);
            cadastroCliente.setVisible(true);
            this.setVisible(false);
            cadastroCliente.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroDeClienteActionPerformed

    private void jMenuItemCadastroDeModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeModeloActionPerformed
        // TODO add your handling code here:
        try {
            TelaDosModelos telaModelo = new TelaDosModelos();
            telaModelo.setLocationRelativeTo(null);
            telaModelo.setVisible(true);
            this.setVisible(false);
            telaModelo.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroDeModeloActionPerformed

    private void jMenuItemCadastroDeMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroDeMarcaActionPerformed
        // TODO add your handling code here:
        try {

            TelaDasMarcas telaMarca = new TelaDasMarcas();
            telaMarca.setLocationRelativeTo(null);
            telaMarca.setVisible(true);
            this.setVisible(false);
            telaMarca.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemCadastroDeMarcaActionPerformed

    private void jMenuItemTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaInicialActionPerformed
        // TODO add your handling code here:
        try {

            TelaInicial telaInicial = new TelaInicial();
            telaInicial.setLocationRelativeTo(null);
            telaInicial.setVisible(true);
            this.setVisible(false);
            telaInicial.setResizable(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jMenuItemTelaInicialActionPerformed

    /**
     * Método exigido pela interface IMarcaObserver Atualiza a tabela sempre que
 o controle notificar uma mudança
     */
    @Override
    public void atualizarListaDeMarcas(ArrayList<Marca> marcas) {
        imprimirDadosNaGrid(marcas);
    }

    /**
     * Atualiza os dados na tabela com base na lista de marcas
     */
    private void imprimirDadosNaGrid(ArrayList<Marca> listaDeMarcas) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableMarcas.getModel();
            model.setNumRows(0); // Limpa a tabela
            for (Marca marca : listaDeMarcas) {
                model.addRow(new Object[]{marca.getId(), marca.getDescricao(), marca.getUrl()});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDasMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDasMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDasMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDasMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDasMarcas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCadastroDeAcessorios;
    private javax.swing.JMenuItem jMenuItemCadastroDeCategorias;
    private javax.swing.JMenuItem jMenuItemCadastroDeCliente;
    private javax.swing.JMenuItem jMenuItemCadastroDeMarca;
    private javax.swing.JMenuItem jMenuItemCadastroDeModelo;
    private javax.swing.JMenuItem jMenuItemCadastroDeMotorista;
    private javax.swing.JMenuItem jMenuItemCadastroVeiculo;
    private javax.swing.JMenuItem jMenuItemLocacao;
    private javax.swing.JMenuItem jMenuItemTelaInicial;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableMarcas;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldIdentificador;
    private javax.swing.JLabel jTextFieldLogo;
    public javax.swing.JTextField jTextFieldUrl;
    // End of variables declaration//GEN-END:variables
}
