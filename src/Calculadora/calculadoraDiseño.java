package Calculadora;

public class calculadoraDiseño extends javax.swing.JFrame {

    private boolean igual,inicio = true,operacion1,operacion2;
    private double a,b,c, cos, acos, sin, asin, tan, atan, memoria = 0,resultado,valor1,valor2;
    private String cadena,funciones,tipoOperaciones;
    private Object jLabel2_Principal;

    public calculadoraDiseño() {
        initComponents();
        Label_Memoria.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Label_Memoria = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Sin = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Tan = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        Cos = new javax.swing.JButton();
        arcose = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        arcsin = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        arctan = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        sexages = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        radianes = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 38, 66));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 180, 157));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0");

        Label_Memoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_Memoria.setText("M");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 180, 157));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_Memoria, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Label_Memoria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        Label_Memoria.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 130));

        jPanel2.setBackground(new java.awt.Color(46, 57, 81));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 180, 157));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton2.setText("9");
        jButton2.setBorder(null);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 50, 50));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3_dark.png"))); // NOI18N
        jButton3.setText("=");
        jButton3.setBorder(null);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3_pressed_dark.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 50, 50));

        Sin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Sin.setForeground(new java.awt.Color(0, 180, 157));
        Sin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        Sin.setText("Sin");
        Sin.setBorder(null);
        Sin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Sin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        Sin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        Sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinActionPerformed(evt);
            }
        });
        jPanel2.add(Sin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 50, 50));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 180, 157));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton5.setText("pi(n)");
        jButton5.setBorder(null);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 50, 50));

        Tan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Tan.setForeground(new java.awt.Color(0, 180, 157));
        Tan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        Tan.setText("Tan");
        Tan.setBorder(null);
        Tan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Tan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        Tan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        Tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanActionPerformed(evt);
            }
        });
        jPanel2.add(Tan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 50, 50));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 180, 157));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton7.setText("MS");
        jButton7.setBorder(null);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 50, 50));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 180, 157));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton8.setText("MR");
        jButton8.setBorder(null);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 50, 50));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 180, 157));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton9.setText("MC");
        jButton9.setBorder(null);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 50, 50));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 180, 157));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton10.setText("M-");
        jButton10.setBorder(null);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 50, 50));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 180, 157));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton11.setText("M+");
        jButton11.setBorder(null);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 50, 50));

        Cos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cos.setForeground(new java.awt.Color(0, 180, 157));
        Cos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        Cos.setText("Cos");
        Cos.setBorder(null);
        Cos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        Cos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        Cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CosActionPerformed(evt);
            }
        });
        jPanel2.add(Cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 50, 50));

        arcose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arcose.setForeground(new java.awt.Color(0, 180, 157));
        arcose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        arcose.setText("Cos-1");
        arcose.setBorder(null);
        arcose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        arcose.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        arcose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        arcose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcoseActionPerformed(evt);
            }
        });
        jPanel2.add(arcose, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 50, 50));

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 180, 157));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton14.setText("e");
        jButton14.setBorder(null);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 50, 50));

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 180, 157));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton15.setText("n!");
        jButton15.setBorder(null);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 50, 50));

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 180, 157));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton16.setText("10^x");
        jButton16.setBorder(null);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 50, 50));

        arcsin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arcsin.setForeground(new java.awt.Color(0, 180, 157));
        arcsin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        arcsin.setText("Sin-1");
        arcsin.setBorder(null);
        arcsin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        arcsin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        arcsin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        arcsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcsinActionPerformed(evt);
            }
        });
        jPanel2.add(arcsin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 50, 50));

        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 180, 157));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton18.setText("x^-1");
        jButton18.setBorder(null);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 50, 50));

        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 180, 157));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton19.setText("y√x");
        jButton19.setBorder(null);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jPanel2.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 50, 50));

        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 180, 157));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton20.setText("3√x");
        jButton20.setBorder(null);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jPanel2.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 50, 50));

        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 180, 157));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton21.setText("EXP");
        jButton21.setBorder(null);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jPanel2.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 50, 50));

        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 180, 157));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton22.setText("Log");
        jButton22.setBorder(null);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jPanel2.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 50, 50));

        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 180, 157));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton23.setText("x^2");
        jButton23.setBorder(null);
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jPanel2.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 50, 50));

        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton24.setForeground(new java.awt.Color(0, 180, 157));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton24.setText("x^3");
        jButton24.setBorder(null);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton24.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jPanel2.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 50, 50));

        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton25.setForeground(new java.awt.Color(0, 180, 157));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton25.setText("x^y");
        jButton25.setBorder(null);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton25.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 50, 50));

        arctan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        arctan.setForeground(new java.awt.Color(0, 180, 157));
        arctan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        arctan.setText("Tan-1");
        arctan.setBorder(null);
        arctan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        arctan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        arctan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        arctan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arctanActionPerformed(evt);
            }
        });
        jPanel2.add(arctan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 50, 50));

        jButton27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton27.setForeground(new java.awt.Color(0, 180, 157));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton27.setText("<-");
        jButton27.setBorder(null);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 50, 50));

        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 180, 157));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton28.setText("CE");
        jButton28.setBorder(null);
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 50, 50));

        jButton29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton29.setForeground(new java.awt.Color(0, 180, 157));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton29.setText("C");
        jButton29.setBorder(null);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton29.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 50, 50));

        jButton30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 180, 157));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton30.setText("±");
        jButton30.setBorder(null);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton30.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton30.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 50, 50));

        jButton31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 180, 157));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton31.setText("√");
        jButton31.setBorder(null);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton31.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 50, 50));

        jButton32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(0, 180, 157));
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton32.setText("7");
        jButton32.setBorder(null);
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton32.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 50, 50));

        jButton33.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(0, 180, 157));
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton33.setText("8");
        jButton33.setBorder(null);
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton33.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton33.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 50, 50));

        jButton37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton37.setForeground(new java.awt.Color(0, 180, 157));
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton37.setText("4");
        jButton37.setBorder(null);
        jButton37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton37.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton37.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 50, 50));

        jButton38.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton38.setForeground(new java.awt.Color(0, 180, 157));
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton38.setText("5");
        jButton38.setBorder(null);
        jButton38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton38.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton38.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 50, 50));

        jButton39.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton39.setForeground(new java.awt.Color(0, 180, 157));
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton39.setText("6");
        jButton39.setBorder(null);
        jButton39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton39.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton39.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 50, 50));

        jButton40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton40.setForeground(new java.awt.Color(0, 180, 157));
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton40.setText("1");
        jButton40.setBorder(null);
        jButton40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton40.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton40.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 50, 50));

        jButton41.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton41.setForeground(new java.awt.Color(0, 180, 157));
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton41.setText("3");
        jButton41.setBorder(null);
        jButton41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton41.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton41.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 50, 50));

        jButton42.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton42.setForeground(new java.awt.Color(0, 180, 157));
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton42.setText("2");
        jButton42.setBorder(null);
        jButton42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton42.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2_dark.png"))); // NOI18N
        jButton42.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 50, 50));

        jButton34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton34.setForeground(new java.awt.Color(0, 180, 157));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton34.setText("/");
        jButton34.setBorder(null);
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton34.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton34.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 50, 50));

        jButton35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton35.setForeground(new java.awt.Color(0, 180, 157));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton35.setText("%");
        jButton35.setBorder(null);
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton35.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton35.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 50, 50));

        jButton36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton36.setForeground(new java.awt.Color(0, 180, 157));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton36.setText(".");
        jButton36.setBorder(null);
        jButton36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton36.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton36.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 50, 50));

        jButton43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton43.setForeground(new java.awt.Color(0, 180, 157));
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton43.setText("1/x");
        jButton43.setBorder(null);
        jButton43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton43.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton43.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 50, 50));

        jButton44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton44.setForeground(new java.awt.Color(0, 180, 157));
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton44.setText("*");
        jButton44.setBorder(null);
        jButton44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton44.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton44.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 50, 50));

        jButton45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton45.setForeground(new java.awt.Color(0, 180, 157));
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton45.setText("-");
        jButton45.setBorder(null);
        jButton45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton45.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton45.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 50, 50));

        jButton46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton46.setForeground(new java.awt.Color(0, 180, 157));
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton46.setText("+");
        jButton46.setBorder(null);
        jButton46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton46.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton46.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 50, 50));

        buttonGroup1.add(sexages);
        sexages.setSelected(true);
        sexages.setText("Sexages");
        sexages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexagesActionPerformed(evt);
            }
        });
        jPanel2.add(sexages, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(46, 57, 81));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 180, 157));
        jButton1.setText("0");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 120, 40));

        buttonGroup1.add(radianes);
        radianes.setText("Radianes");
        jPanel2.add(radianes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 710, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(inicio == true){
jLabel2.setText("");
jLabel2.setText("9");
inicio = false;
}else{
jLabel2.setText(jLabel2.getText()+"9");
}  
    // jp
    }//GEN-LAST:event_jButton2ActionPerformed
    // * BOTON DE SENO
    private void SinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinActionPerformed
        // TODO add your handling code here:
        funciones = "sin";
        Trigonometria();
    }//GEN-LAST:event_SinActionPerformed
    // * BOTON DE ARCOSENO
    private void arcoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcoseActionPerformed
        // TODO add your handling code here:
        funciones = "acos";
        Trigonometria();
    }//GEN-LAST:event_arcoseActionPerformed
    // * BOTON DE ARCSENO
    private void arcsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcsinActionPerformed
        // TODO add your handling code here:
        funciones = "asin";
        Trigonometria();
    }//GEN-LAST:event_arcsinActionPerformed
    // * BOTON DE ARCTANGENTE
    private void arctanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arctanActionPerformed
        // TODO add your handling code here:
        funciones = "atan";
        Trigonometria();
    }//GEN-LAST:event_arctanActionPerformed

    // * BOTON DE RETROCESO
    // jp
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        if (jLabel2.getText().length() > 0) {
            jLabel2.setText(jLabel2.getText().substring(0, jLabel2.getText().length() - 1));
        } if (jLabel2.getText().length() == 0) {
            jLabel2.setText("0");
            inicio = true;
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
if(inicio == true){
jLabel2.setText("");
jLabel2.setText("7");
inicio = false;
}else{
jLabel2.setText(jLabel2.getText()+"7");
}        
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
if(inicio == true){
jLabel2.setText("");
jLabel2.setText("8");
inicio = false;
}else{
jLabel2.setText(jLabel2.getText()+"8");
}        
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
if(inicio == true){
jLabel2.setText("");
jLabel2.setText("4");
inicio = false;
}else{
jLabel2.setText(jLabel2.getText()+"4");
}     
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
if(inicio == true){
jLabel2.setText("");
jLabel2.setText("5");
inicio = false;
}else{
jLabel2.setText(jLabel2.getText()+"5");
}     
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
if(inicio == true){
jLabel2.setText("");
jLabel2.setText("6");
inicio = false;
}else{
jLabel2.setText(jLabel2.getText()+"6");
}       
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
if(inicio == true){
jLabel2.setText("");
jLabel2.setText("1");
inicio = false;
}else{
jLabel2.setText(jLabel2.getText()+"1");
}       
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
if(inicio == true){
jLabel2.setText("");
jLabel2.setText("3");
inicio = false;
}else{
jLabel2.setText(jLabel2.getText()+"3");
}      
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
if(inicio == true){
jLabel2.setText("");
jLabel2.setText("2");
inicio = false;
}else{
jLabel2.setText(jLabel2.getText()+"2");
}      
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
igual = true;
inicio = true;
if(operacion1 = true){
   valor1 = Double.parseDouble(jLabel2.getText());
   jLabel1.setText("");
   jLabel1.setText(jLabel2.getText()+ "/");
   operacion1 = false;
}else{
if(operacion2 == true){
   valor1 = Double.parseDouble(jLabel2.getText());
   jLabel1.setText("");
   jLabel1.setText(jLabel2.getText()+ "/");
   operacion2 = false;
}else{
   jLabel1.setText(jLabel2.getText()+ "/");
   Operaciones(resultado,valor2);
   
  }
}
tipoOperaciones = "/";
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
if(jLabel2.getText().contains(".")){
}else{
jLabel2.setText(jLabel2.getText()+".");
inicio = false;
}
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
igual = true;
inicio = true;
if(operacion1 = true){
   valor1 = Double.parseDouble(jLabel2.getText());
   jLabel1.setText("");
   jLabel1.setText(jLabel2.getText()+ "*");
   operacion1 = false;
}else{
if(operacion2 == true){
   valor1 = Double.parseDouble(jLabel2.getText());
   jLabel1.setText("");
   jLabel1.setText(jLabel2.getText()+ "*");
   operacion2 = false;
}else{
   jLabel1.setText(jLabel2.getText()+ "*");
   Operaciones(resultado,valor2);
   
  }
}
tipoOperaciones = "*";
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
igual = true;
inicio = true;
if(operacion1 = true){
   valor1 = Double.parseDouble(jLabel2.getText());
   jLabel1.setText("");
   jLabel1.setText(jLabel2.getText()+ "-");
   operacion1 = false;
}else{
if(operacion2 == true){
   valor1 = Double.parseDouble(jLabel2.getText());
   jLabel1.setText("");
   jLabel1.setText(jLabel2.getText()+ "-");
   operacion2 = false;
}else{
   jLabel1.setText(jLabel2.getText()+ "-");
   Operaciones(resultado,valor2);
   
  }
}
tipoOperaciones = "-";
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
igual = true;
inicio = true;
if(operacion1 = true){
   valor1 = Double.parseDouble(jLabel2.getText());
   jLabel1.setText("");
   jLabel1.setText(jLabel2.getText()+ "+");
   operacion1 = false;
}else{
if(operacion2 == true){
   valor1 = Double.parseDouble(jLabel2.getText());
   jLabel1.setText("");
   jLabel1.setText(jLabel2.getText()+ "+");
   operacion2 = false;
}else{
   jLabel1.setText(jLabel2.getText()+ "+");
   Operaciones(resultado,valor2);
   
  }
}
tipoOperaciones = "+";
    }//GEN-LAST:event_jButton46ActionPerformed
private void Operaciones(double valor1, double valor2){
     switch (tipoOperaciones){
        case "+":
            resultado = valor1+valor2;
            jLabel2.setText(resultado + "");
            valor1 = Double.parseDouble(jLabel2.getText());
            break;
        case "-":
            resultado = valor1-valor2;
            jLabel2.setText(resultado + "");
            valor1 = Double.parseDouble(jLabel2.getText());
            break;
        case "*":
            resultado = valor1*valor2;
            jLabel2.setText(resultado + "");
            valor1 = Double.parseDouble(jLabel2.getText());
            break;
        case "/":
            if(valor2 == 0){
               jLabel2.setText("SYNTAX ERROR");
               break;
            }else{
            resultado = valor1/valor2;
            jLabel2.setText(resultado + "");
            valor1 = Double.parseDouble(jLabel2.getText());
            break;
            }
            // FUNCION DE POTENCIA DE UN NUMERO
            case "potencia":
            resultado = Math.pow(valor1, valor2);
            jLabel2.setText(resultado + "");
            break;
   }
}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
inicio = true;
operacion1 = true;
if(igual = true){
   if(tipoOperaciones == null){
   
   }else{
     valor2 = Double.parseDouble(jLabel2.getText());
     jLabel1.setText(jLabel1.getText()+jLabel2.getText());
     Operaciones(valor1, valor2);
     igual = false;
   }
}else{
   jLabel1.setText("");
    Operaciones(valor1, valor2);
}
    }//GEN-LAST:event_jButton3ActionPerformed
    // * METODOS TRIGONOMETRICOS
    // jp
    public void Trigonometria(){
        if (sexages.isSelected()) {
            switch (funciones) {
                // CASO SENO
                case "sin":
                    valor1 = Double.parseDouble(jLabel2.getText());
                    jLabel1.setText("sin("+valor1+")");
                    sin = Math.sin(Math.PI * valor1 / 180);
                    jLabel2.setText(sin + " ");
                    break;
                // SENO INVERSO
                case "asin":
                    valor1 = Double.parseDouble(jLabel2.getText());
                    jLabel1.setText("asin("+valor1+")");
                    asin = Math.asin(valor1) * 180 / Math.PI;
                    jLabel2.setText(asin + " ");
                    break;

                // CASO COSENO
                case "cos":
                    valor1 = Double.parseDouble(jLabel2.getText());
                    jLabel1.setText("cos("+valor1+")");
                    cos = Math.cos(Math.PI * valor1 / 180);
                    jLabel2.setText(cos + " ");
                    break;
                // COSENO INVERSO
                case "acos":
                    valor1 = Double.parseDouble(jLabel2.getText());
                    jLabel1.setText("acos("+valor1+")");
                    acos = Math.acos(valor1) * 180 / Math.PI;
                    jLabel2.setText(acos + " ");
                    break;

                // CASO TANGENTE
                case "tan":
                    valor1 = Double.parseDouble(jLabel2.getText());
                    jLabel1.setText("tan("+valor1+")");
                    tan = Math.tan(Math.PI * valor1 / 180);
                    jLabel2.setText(tan + " ");
                    break;
                // TANGENTE INVERSA
                case "atan":
                    valor1 = Double.parseDouble(jLabel2.getText());
                    jLabel1.setText("atan("+valor1+")");
                    atan = Math.atan(valor1) * 180 / Math.PI;
                    jLabel2.setText(atan + " ");
                    break;
            }
        }

        else {
            if (radianes.isSelected()) {
                switch (funciones) {
                    // CASO SENO
                    case "sin":
                        valor1 = Double.parseDouble(jLabel2.getText());
                        jLabel1.setText("sinr("+valor1+")");
                        sin = Math.sin(valor1);
                        jLabel2.setText(sin + " ");
                        break;
                    // SENO INVERSO
                    case "asin":
                        valor1 = Double.parseDouble(jLabel2.getText());
                        jLabel1.setText("asinr("+valor1+")");
                        asin = Math.asin(valor1);
                        jLabel2.setText(asin + " ");
                        break;
    
                    // CASO COSENO
                    case "cos":
                        valor1 = Double.parseDouble(jLabel2.getText());
                        jLabel1.setText("cosr("+valor1+")");
                        cos = Math.cos(valor1 );
                        jLabel2.setText(cos + " ");
                        break;
                    // COSENO INVERSO
                    case "acos":
                        valor1 = Double.parseDouble(jLabel2.getText());
                        jLabel1.setText("acosr("+valor1+")");
                        acos = Math.acos(valor1);
                        jLabel2.setText(acos + " ");
                        break;
    
                    // CASO TANGENTE
                    case "tan":
                        valor1 = Double.parseDouble(jLabel2.getText());
                        jLabel1.setText("tanr("+valor1+")");
                        tan = Math.tan(valor1 );
                        jLabel2.setText(tan + " ");
                        break;
                    // TANGENTE INVERSA
                    case "atan":
                        valor1 = Double.parseDouble(jLabel2.getText());
                        jLabel1.setText("atanr("+valor1+")");
                        atan = Math.atan(valor1) ;
                        jLabel2.setText(atan + " ");
                        break;
                }
            }
        }
    } 
    // * BOTON DE COSENO
    // jp
    private void CosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CosActionPerformed
        // TODO add your handling code here:
        funciones = "cos";
        Trigonometria();
    }//GEN-LAST:event_CosActionPerformed
    // * BOTON DE TANGENTE
    private void TanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanActionPerformed
        // TODO add your handling code here:
        funciones = "tan";
        Trigonometria();
    }//GEN-LAST:event_TanActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    // * BOTON DE BORRADO
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        // jp
        jLabel2.setText("0");
        jLabel1.setText("");
        inicio = true;
        funciones = "";
    }//GEN-LAST:event_jButton28ActionPerformed

    // * BOTON DE BORRADO TOTAL
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        // jp
        jLabel2.setText("0");
        jLabel1.setText("");
        inicio = true;
        funciones = "";
        operacion1 = true;
        operacion2 = true;
        igual = true;
        resultado = 0;
        valor1 = 0;
        valor2 = 0;
    }//GEN-LAST:event_jButton29ActionPerformed

    // * BOTON DE CAMBIO DE SIGNO
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        // jp
        double nu1 = 0, nu2, nu3;
        nu2 = Double.parseDouble(jLabel2.getText());
        nu3 = nu1 - nu2;
        jLabel2.setText(nu3+" ");

    }//GEN-LAST:event_jButton30ActionPerformed

    // * BOTON DE RAIZ CUADRADA
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        // jp
        valor1 = Double.parseDouble(jLabel2.getText());
        if(valor1>=0) {
            jLabel1.setText("sqrt("+valor1+")");
            jLabel2.setText(Math.sqrt(valor1)+" ");
        } else{
            jLabel2.setText("ERROR");
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    // * BOTON DE PI 
    // jp
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jLabel1.setText("PI ");
        jLabel2.setText(Math.PI+" ");
    }//GEN-LAST:event_jButton5ActionPerformed

    // * BOTON ELEVAR A LA -1
    // jp
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        valor1 = Double.parseDouble(jLabel2.getText());
        jLabel1.setText(valor1+"^"+"-1");
        jLabel2.setText(Math.pow(valor1,-1)+" ");
    }//GEN-LAST:event_jButton18ActionPerformed

    // * BOTON QUE ELEVA A UN NUMERO
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        inicio = true;
        valor1 = Double.parseDouble(jLabel2.getText());
        jLabel1.setText(valor1+"^");
        tipoOperaciones = "potencia";
        operacion1 =  false;
        igual = true;

    }//GEN-LAST:event_jButton25ActionPerformed

    // * BOTON DE PORCENTAJE
    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        // jp
        valor2 = Double.parseDouble(jLabel2.getText());
        jLabel1.setText(jLabel1.getText()+jLabel2.getText());
        jLabel2.setText(valor1*(valor2/100)+" ");
        igual = true;
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 if(inicio == true){
jLabel2.setText("");
jLabel2.setText("0");
inicio = false;
}else{
jLabel2.setText(jLabel2.getText()+"0");
}    
    }//GEN-LAST:event_jButton1ActionPerformed

    // * BOTON DE DIVISION
    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // jp
        // TODO add your handling code here:
        valor1 = Double.parseDouble(jLabel2.getText());
        jLabel1.setText("reciproc("+valor1+")");
        jLabel2.setText(1/valor1+" ");
    }//GEN-LAST:event_jButton43ActionPerformed

    private void sexagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexagesActionPerformed

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
            java.util.logging.Logger.getLogger(calculadoraDiseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadoraDiseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadoraDiseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadoraDiseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadoraDiseño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cos;
    private javax.swing.JLabel Label_Memoria;
    private javax.swing.JButton Sin;
    private javax.swing.JButton Tan;
    private javax.swing.JButton arcose;
    private javax.swing.JButton arcsin;
    private javax.swing.JButton arctan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton radianes;
    private javax.swing.JRadioButton sexages;
    // End of variables declaration//GEN-END:variables
}
