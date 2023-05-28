package Telas;

import java.awt.Color;

public class TelaCardapio extends javax.swing.JFrame {

    public TelaCardapio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
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
        btn_fazer_pedido = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        panel_cardapio = new javax.swing.JPanel();
        panel_pizzas = new javax.swing.JPanel();
        h1 = new javax.swing.JLabel();
        card_calabresa = new javax.swing.JPanel();
        imgCalabresa = new javax.swing.JLabel();
        lbl_calabresa = new javax.swing.JLabel();
        lbl_preco_calabresa = new javax.swing.JLabel();
        btn_carrinho_calabresa = new javax.swing.JButton();
        card_marguerita = new javax.swing.JPanel();
        imgMarguerita = new javax.swing.JLabel();
        lbl_marguerita = new javax.swing.JLabel();
        lbl_preco_marguerita = new javax.swing.JLabel();
        btn_carrinho_marguerita = new javax.swing.JButton();
        card_portuguesa = new javax.swing.JPanel();
        imgPortuguesa = new javax.swing.JLabel();
        lbl_sabor_portuguesa = new javax.swing.JLabel();
        lbl_preco_portuguesa = new javax.swing.JLabel();
        btn_carrinho_portuguesa = new javax.swing.JButton();
        card_mm = new javax.swing.JPanel();
        imgMm = new javax.swing.JLabel();
        lbl_mm = new javax.swing.JLabel();
        lbl_preco_mm = new javax.swing.JLabel();
        btn_carrinho_mm = new javax.swing.JButton();
        panel_promocoes = new javax.swing.JPanel();
        h1_promocoes = new javax.swing.JLabel();
        card_combo_familia = new javax.swing.JPanel();
        imgComboFamilia = new javax.swing.JLabel();
        lbl_combo_familia = new javax.swing.JLabel();
        lbl_preco_combo_familia = new javax.swing.JLabel();
        btn_carrinho_combo_familia = new javax.swing.JButton();
        cad_promo_mussarela = new javax.swing.JPanel();
        imgPromoMussarela = new javax.swing.JLabel();
        lbl_promo_mussarela = new javax.swing.JLabel();
        lbl_preco_promo_mussarela = new javax.swing.JLabel();
        btn_carrinho_promo_mussarela = new javax.swing.JButton();
        card_combo_doce = new javax.swing.JPanel();
        imgComboDoce = new javax.swing.JLabel();
        lbl_combo_doce = new javax.swing.JLabel();
        lbl_preco_combo_doce = new javax.swing.JLabel();
        btn_carrinho_combo_doce = new javax.swing.JButton();
        card_combo_individual = new javax.swing.JPanel();
        imgComboIndividual = new javax.swing.JLabel();
        lbl_combo_individual = new javax.swing.JLabel();
        lbl_preco_combo_individual = new javax.swing.JLabel();
        btn_carrinho_combo_individual = new javax.swing.JButton();
        panel_bebidas = new javax.swing.JPanel();
        h1_bebidas = new javax.swing.JLabel();
        card_agua = new javax.swing.JPanel();
        imgAgua = new javax.swing.JLabel();
        lbl_agua = new javax.swing.JLabel();
        lbl_preco_agua = new javax.swing.JLabel();
        btn_carrinho_agua = new javax.swing.JButton();
        cad_suco = new javax.swing.JPanel();
        imgSuco = new javax.swing.JLabel();
        lbl_suco = new javax.swing.JLabel();
        lbl_preco_suco = new javax.swing.JLabel();
        btn_carrinho_suco = new javax.swing.JButton();
        card_refrigerante = new javax.swing.JPanel();
        imgRefrigerante = new javax.swing.JLabel();
        lbl_refrigerante = new javax.swing.JLabel();
        lbl_preco_refrigerante = new javax.swing.JLabel();
        btn_carrinho_refrigerante = new javax.swing.JButton();
        card_cerveja = new javax.swing.JPanel();
        imgCerveja = new javax.swing.JLabel();
        lbl_cerveja = new javax.swing.JLabel();
        lbl_preco_cerveja = new javax.swing.JLabel();
        btn_carrinho_cerveja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        header.setBackground(new java.awt.Color(239, 151, 1));

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

        btn_fazer_pedido.setBackground(new java.awt.Color(248, 199, 0));
        btn_fazer_pedido.setFont(new java.awt.Font("Nunito Sans 10pt Black", 0, 14)); // NOI18N
        btn_fazer_pedido.setText("Fazer Pedido");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/Logo.png"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addGap(122, 122, 122)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_cardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btn_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btn_fazer_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btn_fazer_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sobre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(header);
        header.setBounds(0, 0, 1140, 200);

        scrollPane.setBackground(new java.awt.Color(239, 151, 1));

        panel_cardapio.setBackground(new java.awt.Color(239, 151, 1));
        panel_cardapio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_pizzas.setBackground(new java.awt.Color(239, 151, 1));
        panel_pizzas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        h1.setBackground(new java.awt.Color(239, 151, 1));
        h1.setFont(new java.awt.Font("Nunito", 1, 48)); // NOI18N
        h1.setForeground(new java.awt.Color(34, 27, 27));
        h1.setText("Pizzas");

        card_calabresa.setBackground(new java.awt.Color(255, 255, 255));

        imgCalabresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/pizza-calabreza.png"))); // NOI18N

        lbl_calabresa.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lbl_calabresa.setText("Calabresa");

        lbl_preco_calabresa.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbl_preco_calabresa.setText("R$ 35,00");

        btn_carrinho_calabresa.setBackground(new java.awt.Color(251, 176, 64));
        btn_carrinho_calabresa.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_carrinho_calabresa.setText("Adicionar ao carrinho");

        javax.swing.GroupLayout card_calabresaLayout = new javax.swing.GroupLayout(card_calabresa);
        card_calabresa.setLayout(card_calabresaLayout);
        card_calabresaLayout.setHorizontalGroup(
            card_calabresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_calabresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_calabresa)
                .addGap(63, 63, 63))
            .addComponent(imgCalabresa, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(card_calabresaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_carrinho_calabresa))
            .addGroup(card_calabresaLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(lbl_preco_calabresa))
        );
        card_calabresaLayout.setVerticalGroup(
            card_calabresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_calabresaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgCalabresa)
                .addGap(18, 18, 18)
                .addComponent(lbl_calabresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_preco_calabresa)
                .addGap(18, 18, 18)
                .addComponent(btn_carrinho_calabresa)
                .addGap(20, 20, 20))
        );

        card_marguerita.setBackground(new java.awt.Color(255, 255, 255));

        imgMarguerita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/pizza-mussarela.png"))); // NOI18N

        lbl_marguerita.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lbl_marguerita.setText("Marguerita");

        lbl_preco_marguerita.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbl_preco_marguerita.setText("R$ 39,00");

        btn_carrinho_marguerita.setBackground(new java.awt.Color(251, 176, 64));
        btn_carrinho_marguerita.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_carrinho_marguerita.setText("Adicionar ao carrinho");
        btn_carrinho_marguerita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrinho_margueritaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card_margueritaLayout = new javax.swing.GroupLayout(card_marguerita);
        card_marguerita.setLayout(card_margueritaLayout);
        card_margueritaLayout.setHorizontalGroup(
            card_margueritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_margueritaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(imgMarguerita)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_margueritaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(card_margueritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_margueritaLayout.createSequentialGroup()
                        .addComponent(lbl_marguerita)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_margueritaLayout.createSequentialGroup()
                        .addComponent(lbl_preco_marguerita)
                        .addGap(85, 85, 85))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_margueritaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_carrinho_marguerita)
                .addGap(21, 21, 21))
        );
        card_margueritaLayout.setVerticalGroup(
            card_margueritaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_margueritaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgMarguerita)
                .addGap(18, 18, 18)
                .addComponent(lbl_marguerita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_preco_marguerita)
                .addGap(18, 18, 18)
                .addComponent(btn_carrinho_marguerita)
                .addGap(25, 25, 25))
        );

        card_portuguesa.setBackground(new java.awt.Color(255, 255, 255));

        imgPortuguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/pizza-portuguesa.png"))); // NOI18N

        lbl_sabor_portuguesa.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lbl_sabor_portuguesa.setText("Portuguesa");

        lbl_preco_portuguesa.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbl_preco_portuguesa.setText("R$ 43,00");

        btn_carrinho_portuguesa.setBackground(new java.awt.Color(251, 176, 64));
        btn_carrinho_portuguesa.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_carrinho_portuguesa.setText("Adicionar ao carrinho");
        btn_carrinho_portuguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrinho_portuguesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card_portuguesaLayout = new javax.swing.GroupLayout(card_portuguesa);
        card_portuguesa.setLayout(card_portuguesaLayout);
        card_portuguesaLayout.setHorizontalGroup(
            card_portuguesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_portuguesaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(card_portuguesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_portuguesaLayout.createSequentialGroup()
                        .addComponent(btn_carrinho_portuguesa)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_portuguesaLayout.createSequentialGroup()
                        .addComponent(lbl_preco_portuguesa)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_portuguesaLayout.createSequentialGroup()
                        .addComponent(lbl_sabor_portuguesa)
                        .addGap(56, 56, 56))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_portuguesaLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(imgPortuguesa, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        card_portuguesaLayout.setVerticalGroup(
            card_portuguesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_portuguesaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgPortuguesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_sabor_portuguesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_preco_portuguesa)
                .addGap(18, 18, 18)
                .addComponent(btn_carrinho_portuguesa)
                .addGap(25, 25, 25))
        );

        card_mm.setBackground(new java.awt.Color(255, 255, 255));

        imgMm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/pizza-chocolate.png"))); // NOI18N

        lbl_mm.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lbl_mm.setText("M'Ms");

        lbl_preco_mm.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbl_preco_mm.setText("R$ 45,00");

        btn_carrinho_mm.setBackground(new java.awt.Color(251, 176, 64));
        btn_carrinho_mm.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_carrinho_mm.setText("Adicionar ao carrinho");
        btn_carrinho_mm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrinho_mmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card_mmLayout = new javax.swing.GroupLayout(card_mm);
        card_mm.setLayout(card_mmLayout);
        card_mmLayout.setHorizontalGroup(
            card_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_mmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgMm))
            .addGroup(card_mmLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(card_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_mm)
                    .addComponent(lbl_preco_mm)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_mmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_carrinho_mm)
                .addGap(15, 15, 15))
        );
        card_mmLayout.setVerticalGroup(
            card_mmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_mmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgMm)
                .addGap(18, 18, 18)
                .addComponent(lbl_mm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_preco_mm)
                .addGap(18, 18, 18)
                .addComponent(btn_carrinho_mm)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout panel_pizzasLayout = new javax.swing.GroupLayout(panel_pizzas);
        panel_pizzas.setLayout(panel_pizzasLayout);
        panel_pizzasLayout.setHorizontalGroup(
            panel_pizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_pizzasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(card_calabresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(card_marguerita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(card_portuguesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(card_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(panel_pizzasLayout.createSequentialGroup()
                .addGap(466, 466, 466)
                .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_pizzasLayout.setVerticalGroup(
            panel_pizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pizzasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_pizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card_portuguesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card_calabresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card_marguerita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card_mm, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        panel_cardapio.add(panel_pizzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 19, 1080, -1));

        panel_promocoes.setBackground(new java.awt.Color(239, 151, 1));
        panel_promocoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        h1_promocoes.setBackground(new java.awt.Color(239, 151, 1));
        h1_promocoes.setFont(new java.awt.Font("Nunito", 1, 48)); // NOI18N
        h1_promocoes.setForeground(new java.awt.Color(34, 27, 27));
        h1_promocoes.setText("Promoções");

        card_combo_familia.setBackground(new java.awt.Color(255, 255, 255));

        imgComboFamilia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/promocao1.png"))); // NOI18N
        imgComboFamilia.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lbl_combo_familia.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lbl_combo_familia.setText("Combo Família");

        lbl_preco_combo_familia.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbl_preco_combo_familia.setText("R$ 70,00");

        btn_carrinho_combo_familia.setBackground(new java.awt.Color(251, 176, 64));
        btn_carrinho_combo_familia.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_carrinho_combo_familia.setText("Adicionar ao carrinho");

        javax.swing.GroupLayout card_combo_familiaLayout = new javax.swing.GroupLayout(card_combo_familia);
        card_combo_familia.setLayout(card_combo_familiaLayout);
        card_combo_familiaLayout.setHorizontalGroup(
            card_combo_familiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_combo_familiaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(card_combo_familiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_combo_familiaLayout.createSequentialGroup()
                        .addComponent(btn_carrinho_combo_familia)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_combo_familiaLayout.createSequentialGroup()
                        .addComponent(lbl_combo_familia)
                        .addGap(51, 51, 51))))
            .addGroup(card_combo_familiaLayout.createSequentialGroup()
                .addGroup(card_combo_familiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_combo_familiaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgComboFamilia))
                    .addGroup(card_combo_familiaLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lbl_preco_combo_familia)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        card_combo_familiaLayout.setVerticalGroup(
            card_combo_familiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_combo_familiaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgComboFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_combo_familia)
                .addGap(18, 18, 18)
                .addComponent(lbl_preco_combo_familia)
                .addGap(29, 29, 29)
                .addComponent(btn_carrinho_combo_familia)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        cad_promo_mussarela.setBackground(new java.awt.Color(255, 255, 255));

        imgPromoMussarela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/pizza-mussarela.png"))); // NOI18N

        lbl_promo_mussarela.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lbl_promo_mussarela.setText("Mussarela");

        lbl_preco_promo_mussarela.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbl_preco_promo_mussarela.setText("R$ 35,00");

        btn_carrinho_promo_mussarela.setBackground(new java.awt.Color(251, 176, 64));
        btn_carrinho_promo_mussarela.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_carrinho_promo_mussarela.setText("Adicionar ao carrinho");
        btn_carrinho_promo_mussarela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrinho_promo_mussarelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cad_promo_mussarelaLayout = new javax.swing.GroupLayout(cad_promo_mussarela);
        cad_promo_mussarela.setLayout(cad_promo_mussarelaLayout);
        cad_promo_mussarelaLayout.setHorizontalGroup(
            cad_promo_mussarelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cad_promo_mussarelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cad_promo_mussarelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cad_promo_mussarelaLayout.createSequentialGroup()
                        .addComponent(imgPromoMussarela)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cad_promo_mussarelaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(cad_promo_mussarelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cad_promo_mussarelaLayout.createSequentialGroup()
                                .addComponent(lbl_preco_promo_mussarela)
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cad_promo_mussarelaLayout.createSequentialGroup()
                                .addComponent(btn_carrinho_promo_mussarela)
                                .addGap(15, 15, 15))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cad_promo_mussarelaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_promo_mussarela)
                .addGap(58, 58, 58))
        );
        cad_promo_mussarelaLayout.setVerticalGroup(
            cad_promo_mussarelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cad_promo_mussarelaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgPromoMussarela)
                .addGap(18, 18, 18)
                .addComponent(lbl_promo_mussarela)
                .addGap(18, 18, 18)
                .addComponent(lbl_preco_promo_mussarela)
                .addGap(18, 18, 18)
                .addComponent(btn_carrinho_promo_mussarela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        card_combo_doce.setBackground(new java.awt.Color(255, 255, 255));

        imgComboDoce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/promocao2.png"))); // NOI18N

        lbl_combo_doce.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lbl_combo_doce.setText("Combo Doce");

        lbl_preco_combo_doce.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbl_preco_combo_doce.setText("R$ 65,00");

        btn_carrinho_combo_doce.setBackground(new java.awt.Color(251, 176, 64));
        btn_carrinho_combo_doce.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_carrinho_combo_doce.setText("Adicionar ao carrinho");
        btn_carrinho_combo_doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrinho_combo_doceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card_combo_doceLayout = new javax.swing.GroupLayout(card_combo_doce);
        card_combo_doce.setLayout(card_combo_doceLayout);
        card_combo_doceLayout.setHorizontalGroup(
            card_combo_doceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_combo_doceLayout.createSequentialGroup()
                .addGroup(card_combo_doceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_combo_doceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgComboDoce))
                    .addGroup(card_combo_doceLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lbl_preco_combo_doce)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_combo_doceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(card_combo_doceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_combo_doceLayout.createSequentialGroup()
                        .addComponent(btn_carrinho_combo_doce)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_combo_doceLayout.createSequentialGroup()
                        .addComponent(lbl_combo_doce)
                        .addGap(68, 68, 68))))
        );
        card_combo_doceLayout.setVerticalGroup(
            card_combo_doceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_combo_doceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgComboDoce)
                .addGap(52, 52, 52)
                .addComponent(lbl_combo_doce)
                .addGap(18, 18, 18)
                .addComponent(lbl_preco_combo_doce)
                .addGap(18, 18, 18)
                .addComponent(btn_carrinho_combo_doce)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        card_combo_individual.setBackground(new java.awt.Color(255, 255, 255));

        imgComboIndividual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/promocao3.png"))); // NOI18N

        lbl_combo_individual.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lbl_combo_individual.setText("Cerveja Heineken");

        lbl_preco_combo_individual.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbl_preco_combo_individual.setText("R$ 30,00");

        btn_carrinho_combo_individual.setBackground(new java.awt.Color(251, 176, 64));
        btn_carrinho_combo_individual.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_carrinho_combo_individual.setText("Adicionar ao carrinho");
        btn_carrinho_combo_individual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrinho_combo_individualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card_combo_individualLayout = new javax.swing.GroupLayout(card_combo_individual);
        card_combo_individual.setLayout(card_combo_individualLayout);
        card_combo_individualLayout.setHorizontalGroup(
            card_combo_individualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_combo_individualLayout.createSequentialGroup()
                .addGroup(card_combo_individualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_combo_individualLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgComboIndividual))
                    .addGroup(card_combo_individualLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(card_combo_individualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_carrinho_combo_individual)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_combo_individualLayout.createSequentialGroup()
                                .addComponent(lbl_combo_individual)
                                .addGap(11, 11, 11)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_combo_individualLayout.createSequentialGroup()
                .addComponent(lbl_preco_combo_individual)
                .addGap(84, 84, 84))
        );
        card_combo_individualLayout.setVerticalGroup(
            card_combo_individualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_combo_individualLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(imgComboIndividual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_combo_individual)
                .addGap(18, 18, 18)
                .addComponent(lbl_preco_combo_individual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btn_carrinho_combo_individual)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout panel_promocoesLayout = new javax.swing.GroupLayout(panel_promocoes);
        panel_promocoes.setLayout(panel_promocoesLayout);
        panel_promocoesLayout.setHorizontalGroup(
            panel_promocoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_promocoesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(card_combo_familia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(cad_promo_mussarela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(card_combo_doce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(card_combo_individual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(panel_promocoesLayout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(h1_promocoes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_promocoesLayout.setVerticalGroup(
            panel_promocoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_promocoesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(h1_promocoes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_promocoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card_combo_individual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_promocoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(card_combo_doce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(card_combo_familia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cad_promo_mussarela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panel_cardapio.add(panel_promocoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1100, 1080, 500));

        panel_bebidas.setBackground(new java.awt.Color(239, 151, 1));
        panel_bebidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        h1_bebidas.setBackground(new java.awt.Color(239, 151, 1));
        h1_bebidas.setFont(new java.awt.Font("Nunito", 1, 48)); // NOI18N
        h1_bebidas.setForeground(new java.awt.Color(34, 27, 27));
        h1_bebidas.setText("Bebidas");

        card_agua.setBackground(new java.awt.Color(255, 255, 255));

        imgAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/bebida-agua.png"))); // NOI18N

        lbl_agua.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lbl_agua.setText("Água");

        lbl_preco_agua.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbl_preco_agua.setText("R$ 6,00");

        btn_carrinho_agua.setBackground(new java.awt.Color(251, 176, 64));
        btn_carrinho_agua.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_carrinho_agua.setText("Adicionar ao carrinho");

        javax.swing.GroupLayout card_aguaLayout = new javax.swing.GroupLayout(card_agua);
        card_agua.setLayout(card_aguaLayout);
        card_aguaLayout.setHorizontalGroup(
            card_aguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_aguaLayout.createSequentialGroup()
                .addGroup(card_aguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_aguaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(imgAgua))
                    .addGroup(card_aguaLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(card_aguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_preco_agua)
                            .addComponent(lbl_agua)))
                    .addGroup(card_aguaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_carrinho_agua)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        card_aguaLayout.setVerticalGroup(
            card_aguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_aguaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(imgAgua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_agua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_preco_agua)
                .addGap(27, 27, 27)
                .addComponent(btn_carrinho_agua)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cad_suco.setBackground(new java.awt.Color(255, 255, 255));

        imgSuco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/bebida-suco.png"))); // NOI18N

        lbl_suco.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lbl_suco.setText("Suco de Laranja");

        lbl_preco_suco.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbl_preco_suco.setText("R$ 9,00");

        btn_carrinho_suco.setBackground(new java.awt.Color(251, 176, 64));
        btn_carrinho_suco.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_carrinho_suco.setText("Adicionar ao carrinho");
        btn_carrinho_suco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrinho_sucoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cad_sucoLayout = new javax.swing.GroupLayout(cad_suco);
        cad_suco.setLayout(cad_sucoLayout);
        cad_sucoLayout.setHorizontalGroup(
            cad_sucoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cad_sucoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_suco)
                .addGap(31, 31, 31))
            .addGroup(cad_sucoLayout.createSequentialGroup()
                .addGroup(cad_sucoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cad_sucoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_carrinho_suco))
                    .addGroup(cad_sucoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(imgSuco)))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(cad_sucoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lbl_preco_suco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cad_sucoLayout.setVerticalGroup(
            cad_sucoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cad_sucoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgSuco)
                .addGap(18, 18, 18)
                .addComponent(lbl_suco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_preco_suco)
                .addGap(18, 18, 18)
                .addComponent(btn_carrinho_suco)
                .addGap(25, 25, 25))
        );

        card_refrigerante.setBackground(new java.awt.Color(255, 255, 255));

        imgRefrigerante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/bebida-refrigerante.png"))); // NOI18N

        lbl_refrigerante.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lbl_refrigerante.setText("Coca-Cola");

        lbl_preco_refrigerante.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbl_preco_refrigerante.setText("R$ 8,00");

        btn_carrinho_refrigerante.setBackground(new java.awt.Color(251, 176, 64));
        btn_carrinho_refrigerante.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_carrinho_refrigerante.setText("Adicionar ao carrinho");
        btn_carrinho_refrigerante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrinho_refrigeranteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card_refrigeranteLayout = new javax.swing.GroupLayout(card_refrigerante);
        card_refrigerante.setLayout(card_refrigeranteLayout);
        card_refrigeranteLayout.setHorizontalGroup(
            card_refrigeranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_refrigeranteLayout.createSequentialGroup()
                .addGroup(card_refrigeranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_refrigeranteLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btn_carrinho_refrigerante))
                    .addGroup(card_refrigeranteLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lbl_refrigerante))
                    .addGroup(card_refrigeranteLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(imgRefrigerante))
                    .addGroup(card_refrigeranteLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lbl_preco_refrigerante)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        card_refrigeranteLayout.setVerticalGroup(
            card_refrigeranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_refrigeranteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgRefrigerante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_refrigerante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_preco_refrigerante)
                .addGap(18, 18, 18)
                .addComponent(btn_carrinho_refrigerante)
                .addGap(25, 25, 25))
        );

        card_cerveja.setBackground(new java.awt.Color(255, 255, 255));

        imgCerveja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assents/Images/bebida-cerveja.png"))); // NOI18N

        lbl_cerveja.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        lbl_cerveja.setText("Cerveja Heineken");

        lbl_preco_cerveja.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lbl_preco_cerveja.setText("R$ 12,00");

        btn_carrinho_cerveja.setBackground(new java.awt.Color(251, 176, 64));
        btn_carrinho_cerveja.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_carrinho_cerveja.setText("Adicionar ao carrinho");
        btn_carrinho_cerveja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carrinho_cervejaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout card_cervejaLayout = new javax.swing.GroupLayout(card_cerveja);
        card_cerveja.setLayout(card_cervejaLayout);
        card_cervejaLayout.setHorizontalGroup(
            card_cervejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_cervejaLayout.createSequentialGroup()
                .addGroup(card_cervejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_cervejaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lbl_cerveja))
                    .addGroup(card_cervejaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_carrinho_cerveja))
                    .addGroup(card_cervejaLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lbl_preco_cerveja))
                    .addGroup(card_cervejaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(imgCerveja)))
                .addGap(14, 14, 14))
        );
        card_cervejaLayout.setVerticalGroup(
            card_cervejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_cervejaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgCerveja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_cerveja)
                .addGap(18, 18, 18)
                .addComponent(lbl_preco_cerveja)
                .addGap(12, 12, 12)
                .addComponent(btn_carrinho_cerveja)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout panel_bebidasLayout = new javax.swing.GroupLayout(panel_bebidas);
        panel_bebidas.setLayout(panel_bebidasLayout);
        panel_bebidasLayout.setHorizontalGroup(
            panel_bebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bebidasLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(card_agua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(cad_suco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(card_refrigerante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(card_cerveja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(panel_bebidasLayout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(h1_bebidas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_bebidasLayout.setVerticalGroup(
            panel_bebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bebidasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(h1_bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_bebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cad_suco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card_agua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card_refrigerante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card_cerveja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panel_cardapio.add(panel_bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 1080, 500));

        scrollPane.setViewportView(panel_cardapio);

        getContentPane().add(scrollPane);
        scrollPane.setBounds(0, 200, 1140, 410);

        setSize(new java.awt.Dimension(1155, 616));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_carrinho_margueritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrinho_margueritaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_carrinho_margueritaActionPerformed

    private void btn_carrinho_portuguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrinho_portuguesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_carrinho_portuguesaActionPerformed

    private void btn_carrinho_mmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrinho_mmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_carrinho_mmActionPerformed

    private void btn_carrinho_sucoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrinho_sucoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_carrinho_sucoActionPerformed

    private void btn_carrinho_refrigeranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrinho_refrigeranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_carrinho_refrigeranteActionPerformed

    private void btn_carrinho_cervejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrinho_cervejaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_carrinho_cervejaActionPerformed

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

    private void btn_cardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cardapioMouseClicked
        dispose();
        new TelaCardapio().setVisible(true);
    }//GEN-LAST:event_btn_cardapioMouseClicked

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

    private void btn_carrinho_promo_mussarelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrinho_promo_mussarelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_carrinho_promo_mussarelaActionPerformed

    private void btn_carrinho_combo_doceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrinho_combo_doceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_carrinho_combo_doceActionPerformed

    private void btn_carrinho_combo_individualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carrinho_combo_individualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_carrinho_combo_individualActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCardapio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel btn_cardapio;
    private javax.swing.JButton btn_carrinho_agua;
    private javax.swing.JButton btn_carrinho_calabresa;
    private javax.swing.JButton btn_carrinho_cerveja;
    private javax.swing.JButton btn_carrinho_combo_doce;
    private javax.swing.JButton btn_carrinho_combo_familia;
    private javax.swing.JButton btn_carrinho_combo_individual;
    private javax.swing.JButton btn_carrinho_marguerita;
    private javax.swing.JButton btn_carrinho_mm;
    private javax.swing.JButton btn_carrinho_portuguesa;
    private javax.swing.JButton btn_carrinho_promo_mussarela;
    private javax.swing.JButton btn_carrinho_refrigerante;
    private javax.swing.JButton btn_carrinho_suco;
    private javax.swing.JButton btn_fazer_pedido;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_localizacao;
    private javax.swing.JPanel btn_sobre;
    private javax.swing.JPanel cad_promo_mussarela;
    private javax.swing.JPanel cad_suco;
    private javax.swing.JPanel card_agua;
    private javax.swing.JPanel card_calabresa;
    private javax.swing.JPanel card_cerveja;
    private javax.swing.JPanel card_combo_doce;
    private javax.swing.JPanel card_combo_familia;
    private javax.swing.JPanel card_combo_individual;
    private javax.swing.JPanel card_marguerita;
    private javax.swing.JPanel card_mm;
    private javax.swing.JPanel card_portuguesa;
    private javax.swing.JPanel card_refrigerante;
    private javax.swing.JLabel h1;
    private javax.swing.JLabel h1_bebidas;
    private javax.swing.JLabel h1_promocoes;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imgAgua;
    private javax.swing.JLabel imgCalabresa;
    private javax.swing.JLabel imgCerveja;
    private javax.swing.JLabel imgComboDoce;
    private javax.swing.JLabel imgComboFamilia;
    private javax.swing.JLabel imgComboIndividual;
    private javax.swing.JLabel imgMarguerita;
    private javax.swing.JLabel imgMm;
    private javax.swing.JLabel imgPortuguesa;
    private javax.swing.JLabel imgPromoMussarela;
    private javax.swing.JLabel imgRefrigerante;
    private javax.swing.JLabel imgSuco;
    private javax.swing.JLabel img_cardapio;
    private javax.swing.JLabel img_home;
    private javax.swing.JLabel img_localizacao;
    private javax.swing.JLabel img_sobre;
    private javax.swing.JLabel lbl_agua;
    private javax.swing.JLabel lbl_calabresa;
    private javax.swing.JLabel lbl_cardapio;
    private javax.swing.JLabel lbl_cerveja;
    private javax.swing.JLabel lbl_combo_doce;
    private javax.swing.JLabel lbl_combo_familia;
    private javax.swing.JLabel lbl_combo_individual;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_localizacao;
    private javax.swing.JLabel lbl_marguerita;
    private javax.swing.JLabel lbl_mm;
    private javax.swing.JLabel lbl_preco_agua;
    private javax.swing.JLabel lbl_preco_calabresa;
    private javax.swing.JLabel lbl_preco_cerveja;
    private javax.swing.JLabel lbl_preco_combo_doce;
    private javax.swing.JLabel lbl_preco_combo_familia;
    private javax.swing.JLabel lbl_preco_combo_individual;
    private javax.swing.JLabel lbl_preco_marguerita;
    private javax.swing.JLabel lbl_preco_mm;
    private javax.swing.JLabel lbl_preco_portuguesa;
    private javax.swing.JLabel lbl_preco_promo_mussarela;
    private javax.swing.JLabel lbl_preco_refrigerante;
    private javax.swing.JLabel lbl_preco_suco;
    private javax.swing.JLabel lbl_promo_mussarela;
    private javax.swing.JLabel lbl_refrigerante;
    private javax.swing.JLabel lbl_sabor_portuguesa;
    private javax.swing.JLabel lbl_sobre;
    private javax.swing.JLabel lbl_suco;
    private javax.swing.JPanel panel_bebidas;
    private javax.swing.JPanel panel_cardapio;
    private javax.swing.JPanel panel_pizzas;
    private javax.swing.JPanel panel_promocoes;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
