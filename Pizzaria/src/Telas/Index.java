package Telas;

import java.awt.Color;
import javax.swing.BorderFactory;

public class Index extends javax.swing.JFrame {

    public Index() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        principal_area = new javax.swing.JPanel();
        img_pizza = new javax.swing.JLabel();
        img_restaurante = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        btn_fazer_pedido = new javax.swing.JButton();
        img4 = new javax.swing.JLabel();
        btn_home = new javax.swing.JPanel();
        lbl_home = new javax.swing.JLabel();
        img_home = new javax.swing.JLabel();
        btn_sobre = new javax.swing.JPanel();
        lbl_sobre = new javax.swing.JLabel();
        img_sobre = new javax.swing.JLabel();
        btn_cardapio = new javax.swing.JPanel();
        lbl_cardapio = new javax.swing.JLabel();
        img_cardapio = new javax.swing.JLabel();
        btn_localizacao = new javax.swing.JPanel();
        lbl_localizacao = new javax.swing.JLabel();
        img_localizacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(239, 151, 1));
        panel.setLayout(null);

        principal_area.setBackground(new java.awt.Color(239, 151, 1));
        principal_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        principal_area.setLayout(null);

        img_pizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_pizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/pizza.png"))); // NOI18N
        principal_area.add(img_pizza);
        img_pizza.setBounds(150, 140, 290, 290);

        img_restaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/restaurante.png"))); // NOI18N
        principal_area.add(img_restaurante);
        img_restaurante.setBounds(10, 60, 282, 290);

        h1.setBackground(new java.awt.Color(239, 151, 1));
        h1.setFont(new java.awt.Font("Nunito", 1, 36)); // NOI18N
        h1.setForeground(new java.awt.Color(34, 27, 27));
        h1.setText("PizzaRia");
        principal_area.add(h1);
        h1.setBounds(500, 90, 150, 30);

        lbl1.setBackground(new java.awt.Color(239, 151, 1));
        lbl1.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        lbl1.setForeground(new java.awt.Color(34, 27, 27));
        lbl1.setText("Desde 1980 produzindo as melhores pizzas da");
        principal_area.add(lbl1);
        lbl1.setBounds(500, 160, 340, 40);

        lbl5.setBackground(new java.awt.Color(239, 151, 1));
        lbl5.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        lbl5.setForeground(new java.awt.Color(34, 27, 27));
        lbl5.setText("ou encomendar nossas deliciosas pizzas pelo");
        principal_area.add(lbl5);
        lbl5.setBounds(500, 280, 370, 23);

        lbl2.setBackground(new java.awt.Color(239, 151, 1));
        lbl2.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        lbl2.setForeground(new java.awt.Color(34, 27, 27));
        lbl2.setText("região. Nosso rodízio oferece mais de 60 sabores ");
        principal_area.add(lbl2);
        lbl2.setBounds(500, 190, 370, 23);

        lbl3.setBackground(new java.awt.Color(239, 151, 1));
        lbl3.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        lbl3.setForeground(new java.awt.Color(34, 27, 27));
        lbl3.setText("entre pizzas, massas e porções.");
        principal_area.add(lbl3);
        lbl3.setBounds(500, 210, 370, 23);

        lbl4.setBackground(new java.awt.Color(239, 151, 1));
        lbl4.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        lbl4.setForeground(new java.awt.Color(34, 27, 27));
        lbl4.setText("Você pode escolher se prefere o serviço à la carte,");
        principal_area.add(lbl4);
        lbl4.setBounds(500, 260, 370, 23);

        lbl6.setBackground(new java.awt.Color(239, 151, 1));
        lbl6.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        lbl6.setForeground(new java.awt.Color(34, 27, 27));
        lbl6.setText("nosso delivery.");
        principal_area.add(lbl6);
        lbl6.setBounds(500, 300, 370, 23);

        panel.add(principal_area);
        principal_area.setBounds(210, 130, 920, 470);

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/bg-pizza.png"))); // NOI18N
        panel.add(img2);
        img2.setBounds(-160, 510, 380, 359);

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/bg-cebola.png"))); // NOI18N
        panel.add(img1);
        img1.setBounds(-90, -150, 350, 330);

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/bg-tomate.png"))); // NOI18N
        panel.add(img3);
        img3.setBounds(1000, 420, 380, 346);

        btn_fazer_pedido.setBackground(new java.awt.Color(248, 199, 0));
        btn_fazer_pedido.setFont(new java.awt.Font("Nunito Sans 10pt Black", 0, 14)); // NOI18N
        btn_fazer_pedido.setText("Fazer Pedido");
        panel.add(btn_fazer_pedido);
        btn_fazer_pedido.setBounds(1030, 40, 200, 50);

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/bg-cogumelo.png"))); // NOI18N
        panel.add(img4);
        img4.setBounds(950, -100, 380, 346);

        btn_home.setBackground(new java.awt.Color(239, 151, 1));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_homeMouseExited(evt);
            }
        });
        btn_home.setLayout(null);

        lbl_home.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        lbl_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_home.setText("Home");
        btn_home.add(lbl_home);
        lbl_home.setBounds(20, 70, 50, 30);

        img_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/icon-home.png"))); // NOI18N
        btn_home.add(img_home);
        img_home.setBounds(10, 10, 70, 60);

        panel.add(btn_home);
        btn_home.setBounds(400, 10, 90, 110);

        btn_sobre.setBackground(new java.awt.Color(239, 151, 1));
        btn_sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sobreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sobreMouseExited(evt);
            }
        });
        btn_sobre.setLayout(null);

        lbl_sobre.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        lbl_sobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sobre.setText("Sobre nós");
        btn_sobre.add(lbl_sobre);
        lbl_sobre.setBounds(10, 60, 70, 50);

        img_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/icon-contato.png"))); // NOI18N
        btn_sobre.add(img_sobre);
        img_sobre.setBounds(10, 10, 70, 60);

        panel.add(btn_sobre);
        btn_sobre.setBounds(520, 10, 90, 110);

        btn_cardapio.setBackground(new java.awt.Color(239, 151, 1));
        btn_cardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cardapioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cardapioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cardapioMouseExited(evt);
            }
        });
        btn_cardapio.setLayout(null);

        lbl_cardapio.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        lbl_cardapio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cardapio.setText("Cardápio");
        btn_cardapio.add(lbl_cardapio);
        lbl_cardapio.setBounds(10, 60, 70, 50);

        img_cardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/icon-cardapio.png"))); // NOI18N
        btn_cardapio.add(img_cardapio);
        img_cardapio.setBounds(20, 10, 60, 60);

        panel.add(btn_cardapio);
        btn_cardapio.setBounds(640, 10, 90, 110);

        btn_localizacao.setBackground(new java.awt.Color(239, 151, 1));
        btn_localizacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_localizacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_localizacaoMouseExited(evt);
            }
        });
        btn_localizacao.setLayout(null);

        lbl_localizacao.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        lbl_localizacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_localizacao.setText("Onde estamos?");
        btn_localizacao.add(lbl_localizacao);
        lbl_localizacao.setBounds(0, 60, 110, 50);

        img_localizacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/icon-mapa.png"))); // NOI18N
        btn_localizacao.add(img_localizacao);
        img_localizacao.setBounds(30, 10, 60, 60);

        panel.add(btn_localizacao);
        btn_localizacao.setBounds(760, 10, 110, 110);

        getContentPane().add(panel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1265, 717));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseEntered
        btn_home.setBackground(new Color(247, 179, 62));
    }//GEN-LAST:event_btn_homeMouseEntered

    private void btn_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseExited
        btn_home.setBackground(new Color(239,151,1));

    }//GEN-LAST:event_btn_homeMouseExited

    private void btn_sobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sobreMouseEntered
        btn_sobre.setBackground(new Color(247, 179, 62));
    }//GEN-LAST:event_btn_sobreMouseEntered

    private void btn_sobreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sobreMouseExited
       btn_sobre.setBackground(new Color(239,151,1));
    }//GEN-LAST:event_btn_sobreMouseExited

    private void btn_cardapioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cardapioMouseEntered
        btn_cardapio.setBackground(new Color(247, 179, 62));
    }//GEN-LAST:event_btn_cardapioMouseEntered

    private void btn_cardapioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cardapioMouseExited
       btn_cardapio.setBackground(new Color(239,151,1));
    }//GEN-LAST:event_btn_cardapioMouseExited

    private void btn_localizacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_localizacaoMouseEntered
        btn_localizacao.setBackground(new Color(247, 179, 62));
    }//GEN-LAST:event_btn_localizacaoMouseEntered

    private void btn_localizacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_localizacaoMouseExited
        btn_localizacao.setBackground(new Color(239,151,1));
    }//GEN-LAST:event_btn_localizacaoMouseExited

    private void btn_cardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cardapioMouseClicked
        dispose();
        new TelaCardapio().setVisible(true);
    }//GEN-LAST:event_btn_cardapioMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_cardapio;
    private javax.swing.JButton btn_fazer_pedido;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_localizacao;
    private javax.swing.JPanel btn_sobre;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img_cardapio;
    private javax.swing.JLabel img_home;
    private javax.swing.JLabel img_localizacao;
    private javax.swing.JLabel img_pizza;
    private javax.swing.JLabel img_restaurante;
    private javax.swing.JLabel img_sobre;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl_cardapio;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_localizacao;
    private javax.swing.JLabel lbl_sobre;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel principal_area;
    // End of variables declaration//GEN-END:variables
}
