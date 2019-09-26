package view;

/**
 *
 * @author Quemuel
 */
public class FormMenu extends javax.swing.JFrame {

    /**
     * Creates new form FormMenu
     */
    public FormMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVisualizarClientes = new javax.swing.JButton();
        btnVisualizarFilmes = new javax.swing.JButton();
        btnCadastrarCliente = new javax.swing.JButton();
        btnCadastrarFilme = new javax.swing.JButton();
        btnVisualizarLocacacoes = new javax.swing.JButton();
        btnCadastrarLocacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        btnVisualizarClientes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVisualizarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisar.png"))); // NOI18N
        btnVisualizarClientes.setText("Clientes Cadastrados");
        btnVisualizarClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVisualizarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarClientesActionPerformed(evt);
            }
        });

        btnVisualizarFilmes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVisualizarFilmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisar.png"))); // NOI18N
        btnVisualizarFilmes.setText("Filmes cadastrados");
        btnVisualizarFilmes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVisualizarFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarFilmesActionPerformed(evt);
            }
        });

        btnCadastrarCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Adicionar_Cadastro.png"))); // NOI18N
        btnCadastrarCliente.setText("Cadastrar cliente");
        btnCadastrarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnCadastrarFilme.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCadastrarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Adicionar_Cadastro.png"))); // NOI18N
        btnCadastrarFilme.setText("Cadastrar filme");
        btnCadastrarFilme.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFilmeActionPerformed(evt);
            }
        });

        btnVisualizarLocacacoes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVisualizarLocacacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisar.png"))); // NOI18N
        btnVisualizarLocacacoes.setText("Locações");
        btnVisualizarLocacacoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVisualizarLocacacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarLocacacoesActionPerformed(evt);
            }
        });

        btnCadastrarLocacao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCadastrarLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Adicionar_Cadastro.png"))); // NOI18N
        btnCadastrarLocacao.setText("Nova locação");
        btnCadastrarLocacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLocacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnVisualizarFilmes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualizarClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(btnVisualizarLocacacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(btnCadastrarFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualizarClientes)
                    .addComponent(btnCadastrarCliente))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarFilme)
                    .addComponent(btnVisualizarFilmes))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualizarLocacacoes)
                    .addComponent(btnCadastrarLocacao))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarLocacacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarLocacacoesActionPerformed
        FormVisualizar clientes = new FormVisualizar(2);
        clientes.setVisible(true);
    }//GEN-LAST:event_btnVisualizarLocacacoesActionPerformed

    private void btnCadastrarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLocacaoActionPerformed
        FormLocacao locacao = new FormLocacao();
        locacao.setVisible(true);
    }//GEN-LAST:event_btnCadastrarLocacaoActionPerformed

    private void btnVisualizarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarClientesActionPerformed
        FormVisualizar clientes = new FormVisualizar(0);
        clientes.setVisible(true);
    }//GEN-LAST:event_btnVisualizarClientesActionPerformed

    private void btnVisualizarFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarFilmesActionPerformed
        FormVisualizar clientes = new FormVisualizar(1);
        clientes.setVisible(true);
    }//GEN-LAST:event_btnVisualizarFilmesActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        FormCadastrarCliente clientes = new FormCadastrarCliente();
        clientes.setVisible(true);
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnCadastrarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFilmeActionPerformed
        FormCadastrarFilme filme = new FormCadastrarFilme();
        filme.setVisible(true);
    }//GEN-LAST:event_btnCadastrarFilmeActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCadastrarFilme;
    private javax.swing.JButton btnCadastrarLocacao;
    private javax.swing.JButton btnVisualizarClientes;
    private javax.swing.JButton btnVisualizarFilmes;
    private javax.swing.JButton btnVisualizarLocacacoes;
    // End of variables declaration//GEN-END:variables
}