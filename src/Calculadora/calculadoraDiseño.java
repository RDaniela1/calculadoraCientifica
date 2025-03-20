package Calculadora;

public class calculadoraDiseño extends javax.swing.JFrame {

    private boolean igual,inicio = true,operacion1,operacion2;
    private double a,b,c,memoria = 0,resultado,valor1,valor2;
    private String cadena,funciones,tipoOperaciones;
    private Object jLabel2_Principal;

    public calculadoraDiseño() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
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
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 38, 66));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 180, 157));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 180, 157));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

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

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 180, 157));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton4.setText("Sin");
        jButton4.setBorder(null);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 50, 50));

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

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 180, 157));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton6.setText("Tan");
        jButton6.setBorder(null);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 50, 50));

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

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 180, 157));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton12.setText("Cos");
        jButton12.setBorder(null);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 50, 50));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 180, 157));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton13.setText("Cos-1");
        jButton13.setBorder(null);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 50, 50));

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

        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 180, 157));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton17.setText("Sin-1");
        jButton17.setBorder(null);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 50, 50));

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

        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton26.setForeground(new java.awt.Color(0, 180, 157));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton26.setText("Tan-1");
        jButton26.setBorder(null);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_dark.png"))); // NOI18N
        jButton26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed_dark.png"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 50, 50));

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

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Sexages");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Radianes");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
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

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
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
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
