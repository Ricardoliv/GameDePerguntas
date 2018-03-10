package projeto;

import javax.swing.JTextArea;




public class Ini extends javax.swing.JFrame {

    public Ini() {
        
        initComponents();
    }
    
    boolean on=true;
    
    
     private  String nome;

     private String tema;
     private int nivel=1;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        tn = new javax.swing.JTextField();
        bv1 = new javax.swing.JToggleButton();
        bv2 = new javax.swing.JToggleButton();
        bv3 = new javax.swing.JToggleButton();
        bv4 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTextArea();
        bini = new javax.swing.JButton();
        tr = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(0, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tn.setForeground(new java.awt.Color(0, 0, 102));
        tn.setText("nome");
        jPanel2.add(tn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 150, 36));

        buttonGroup1.add(bv1);
        bv1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bv1.setForeground(new java.awt.Color(0, 0, 102));
        bv1.setText("infomática");
        bv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv1ActionPerformed(evt);
            }
        });
        jPanel2.add(bv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 50));

        buttonGroup1.add(bv2);
        bv2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bv2.setForeground(new java.awt.Color(0, 0, 102));
        bv2.setText("inglês");
        bv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv2ActionPerformed(evt);
            }
        });
        jPanel2.add(bv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, 50));

        buttonGroup1.add(bv3);
        bv3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bv3.setForeground(new java.awt.Color(0, 0, 102));
        bv3.setText("espanhol");
        bv3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv3ActionPerformed(evt);
            }
        });
        jPanel2.add(bv3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 110, 50));

        buttonGroup1.add(bv4);
        bv4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bv4.setForeground(new java.awt.Color(0, 0, 102));
        bv4.setText("geral");
        bv4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv4ActionPerformed(evt);
            }
        });
        jPanel2.add(bv4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 110, 50));

        t2.setEditable(false);
        t2.setBackground(new java.awt.Color(255, 255, 153));
        t2.setColumns(20);
        t2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 0, 102));
        t2.setRows(5);
        jScrollPane1.setViewportView(t2);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 170, 370));

        bini.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bini.setForeground(new java.awt.Color(0, 0, 102));
        bini.setText("Jogar");
        bini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biniActionPerformed(evt);
            }
        });
        jPanel2.add(bini, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 220, 50));

        tr.setEditable(false);
        tr.setBackground(new java.awt.Color(255, 255, 153));
        tr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr.setText("ranking");
        jPanel2.add(tr, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 70, -1));

        t1.setEditable(false);
        t1.setBackground(new java.awt.Color(255, 255, 153));
        t1.setColumns(20);
        t1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 0, 102));
        t1.setRows(5);
        t1.setText("Coloque seu nome, \nescolha um tema e\naperte jogar");
        jScrollPane2.setViewportView(t1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 300, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 29, 740, 532));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv1ActionPerformed
        tema="informática";
    }//GEN-LAST:event_bv1ActionPerformed

    private void bv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv2ActionPerformed
        tema="inglês";
    }//GEN-LAST:event_bv2ActionPerformed

    private void bv3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv3ActionPerformed
        tema ="espanhol";
    }//GEN-LAST:event_bv3ActionPerformed

    private void bv4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv4ActionPerformed
        tema ="geral";
    }//GEN-LAST:event_bv4ActionPerformed

    private void biniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biniActionPerformed
     
    this.nome = tn.getText();
    on=false;

    this.setVisible(false);
    
    }//GEN-LAST:event_biniActionPerformed

    public JTextArea getT2() {
        return t2;
    }
   
    public void setT2(JTextArea t2) {
        this.t2 = t2;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bini;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton bv1;
    private javax.swing.JToggleButton bv2;
    private javax.swing.JToggleButton bv3;
    private javax.swing.JToggleButton bv4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea t1;
    private javax.swing.JTextArea t2;
    private javax.swing.JTextField tn;
    private javax.swing.JTextField tr;
    // End of variables declaration//GEN-END:variables
}
