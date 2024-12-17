/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.locagyn.visao;

import javax.swing.JOptionPane;
import com.locagyn.controle.IAcessoriosControle;
import com.locagyn.controle.AcessoriosControle;
import com.locagyn.enumeracao.Situacao;
import com.locagyn.modelos.Acessorios;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;





public class TelaDeAcessorios extends javax.swing.JFrame {
     IAcessoriosControle acessoriosControle = new AcessoriosControle();

    /**
     * Creates new form TelaDeAcessorios
     */
    public TelaDeAcessorios() {
        initComponents();
        this.setLocationRelativeTo(null);
         jTextFieldID1.setEnabled(false);
        try {
            imprimirDadosNaGrid(acessoriosControle.listagem());
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAcessorios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldID1 = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jComboBoxSituacao = new javax.swing.JComboBox<>();
        jTextFieldValorLocacao = new javax.swing.JTextField();
        jButtonIncluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
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

        jPanel1.setBackground(new java.awt.Color(176, 198, 238));

        jTableAcessorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IDENTIFICADOR", "DESCRIÇÃO", "VALOR DA LOCAÇÃO", "SITUAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAcessorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAcessoriosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAcessorios);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setText("Descrição:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel3.setText("Valor da Locação:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setText("Situação:");

        jTextFieldID1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTextFieldDescricao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });
        jTextFieldDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyReleased(evt);
            }
        });

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel(Situacao.values()));
        jComboBoxSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSituacaoActionPerformed(evt);
            }
        });

        jTextFieldValorLocacao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldValorLocacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorLocacaoKeyTyped(evt);
            }
        });

        jButtonIncluir.setBackground(new java.awt.Color(0, 0, 0));
        jButtonIncluir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonIncluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAlterar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldID1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAlterar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValorLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAlterar)
                            .addComponent(jButtonIncluir))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 
  
    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:
         try {
             if (jTextFieldValorLocacao.getText().trim().isEmpty()){
                throw new Exception ("Digite o Valor da Locação");
            }
            IAcessoriosControle incluirAcessorios = new AcessoriosControle();
            Acessorios objeto = new Acessorios(0, jTextFieldDescricao.getText(), Float.parseFloat (jTextFieldValorLocacao.getText()), jComboBoxSituacao.getSelectedItem());
            acessoriosControle.incluir(objeto);
            jTextFieldDescricao.setText("");
            imprimirDadosNaGrid(incluirAcessorios.listagem());
         

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());

        }

    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
         try {
             if (jTextFieldValorLocacao.getText().trim().isEmpty()){
                throw new Exception ("Digite o Valor da Locação");
            }
            IAcessoriosControle incluirAcessorios = new AcessoriosControle();
            Acessorios objeto = new Acessorios(Integer.parseInt(jTextFieldID1.getText()), jTextFieldDescricao.getText(), Float.parseFloat (jTextFieldValorLocacao.getText()), jComboBoxSituacao.getSelectedItem());
            acessoriosControle.alterar(objeto);

            imprimirDadosNaGrid(incluirAcessorios.listagem());
        
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());

        }
        jTextFieldDescricao.setText("");

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTableAcessoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAcessoriosMouseClicked
        // TODO add your handling code here:
         try {
            jTextFieldID1.setText(jTableAcessorios.getValueAt(jTableAcessorios.getSelectedRow(), 0).toString());
            jTextFieldDescricao.setText(jTableAcessorios.getValueAt(jTableAcessorios.getSelectedRow(), 1).toString());
            jTextFieldValorLocacao.setText(jTableAcessorios.getValueAt(jTableAcessorios.getSelectedRow(), 2).toString());
            jComboBoxSituacao.setSelectedItem(jTableAcessorios.getValueAt(jTableAcessorios.getSelectedRow(), 3).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
         private void imprimirDadosNaGrid(ArrayList<Acessorios> listaDeAcessorios) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableAcessorios.getModel();
            //Limpa a tabela
            model.setNumRows(0);
            Iterator<Acessorios> lista = listaDeAcessorios.iterator();
            while (lista.hasNext()) {
                String[] saida = new String[4];
                Acessorios aux = lista.next();
                saida[0] = aux.getId() + "";
                saida[1] = aux.getDescricao();
                saida[2] = aux.getValorDaLocacao()+"";
                saida[3] = aux.getSituacao().toString();
                //Incluir nova linha na Tabela
                model.addRow(saida);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jTableAcessoriosMouseClicked

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

    private void jTextFieldDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyReleased
        // TODO add your handling code here:
        int posicao = jTextFieldDescricao.getCaretPosition();
        jTextFieldDescricao.setText(jTextFieldDescricao.getText().toUpperCase());
        jTextFieldDescricao.setCaretPosition(posicao);
    }//GEN-LAST:event_jTextFieldDescricaoKeyReleased

    private void jTextFieldValorLocacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorLocacaoKeyTyped
        // TODO add your handling code here:
         char e = evt.getKeyChar();
        if (!Character.isDigit(e)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldValorLocacaoKeyTyped

    private void jComboBoxSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSituacaoActionPerformed
        // TODO add your handling code here:
        jComboBoxSituacaoActionPerformed(evt);
    }//GEN-LAST:event_jComboBoxSituacaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeAcessorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeAcessorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeAcessorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeAcessorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeAcessorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JComboBox<String> jComboBoxSituacao;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAcessorios;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldID1;
    private javax.swing.JTextField jTextFieldValorLocacao;
    // End of variables declaration//GEN-END:variables
}
