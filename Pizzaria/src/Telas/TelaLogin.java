package Telas;

import Dados.LoginDao;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        h1 = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbl_senha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btn_entrar = new javax.swing.JButton();
        lbl_reset_senha = new javax.swing.JLabel();
        btn_cadastrar = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(239, 151, 1));
        Panel.setLayout(null);

        h1.setFont(new java.awt.Font("Poppins Medium", 0, 32)); // NOI18N
        h1.setText("Login");
        Panel.add(h1);
        h1.setBounds(440, 40, 100, 60);

        text.setFont(new java.awt.Font("DM Sans", 0, 18)); // NOI18N
        text.setText("Entre para continuar");
        Panel.add(text);
        text.setBounds(400, 90, 180, 20);

        lbl_email.setFont(new java.awt.Font("DM Sans", 1, 14)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(107, 105, 105));
        lbl_email.setText("E-mail:");
        Panel.add(lbl_email);
        lbl_email.setBounds(340, 130, 50, 19);

        txtEmail.setFont(new java.awt.Font("DM Sans", 0, 14)); // NOI18N
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Panel.add(txtEmail);
        txtEmail.setBounds(340, 150, 300, 30);

        lbl_senha.setFont(new java.awt.Font("DM Sans", 1, 14)); // NOI18N
        lbl_senha.setForeground(new java.awt.Color(107, 105, 105));
        lbl_senha.setText("Senha:");
        Panel.add(lbl_senha);
        lbl_senha.setBounds(340, 210, 50, 20);

        txtSenha.setFont(new java.awt.Font("DM Sans", 0, 14)); // NOI18N
        Panel.add(txtSenha);
        txtSenha.setBounds(340, 230, 300, 30);

        btn_entrar.setBackground(new java.awt.Color(0, 0, 0));
        btn_entrar.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_entrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_entrar.setText("Entrar");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        Panel.add(btn_entrar);
        btn_entrar.setBounds(420, 290, 160, 40);

        lbl_reset_senha.setFont(new java.awt.Font("DM Sans", 1, 14)); // NOI18N
        lbl_reset_senha.setForeground(new java.awt.Color(107, 105, 105));
        lbl_reset_senha.setText("Esqueceu sua senha?");
        lbl_reset_senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_reset_senhaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_reset_senhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_reset_senhaMouseExited(evt);
            }
        });
        Panel.add(lbl_reset_senha);
        lbl_reset_senha.setBounds(420, 350, 170, 20);

        btn_cadastrar.setBackground(new java.awt.Color(53, 150, 36));
        btn_cadastrar.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastrar.setText("Criar nova conta");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });
        Panel.add(btn_cadastrar);
        btn_cadastrar.setBounds(420, 410, 160, 40);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/Logo.png"))); // NOI18N
        Panel.add(Logo);
        Logo.setBounds(800, 320, 190, 213);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1004, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        try {
            ResultSet resultado = LoginDao.Logar(txtEmail.getText(), txtSenha.getText());

            if(resultado.next()){
                dispose();
                new Index().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Email ou senha estão incorretos!");
                txtEmail.requestFocus();
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_entrarActionPerformed

    private void lbl_reset_senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_reset_senhaMouseClicked
        dispose();
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_lbl_reset_senhaMouseClicked

    private void lbl_reset_senhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_reset_senhaMouseEntered
        lbl_reset_senha.setForeground(Color.blue);
    }//GEN-LAST:event_lbl_reset_senhaMouseEntered

    private void lbl_reset_senhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_reset_senhaMouseExited
        lbl_reset_senha.setForeground(new Color(107,105,105));
    }//GEN-LAST:event_lbl_reset_senhaMouseExited

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed

        dispose();
        new Tela_cadastro().setVisible(true);
    }//GEN-LAST:event_btn_cadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_reset_senha;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel text;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
