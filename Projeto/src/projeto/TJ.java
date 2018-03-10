package projeto;

import java.util.Scanner;
import perguntas.Arquivos;
import perguntas.Pergunta;
import perguntas.RepositorioPerguntas;
import jogadores.ArquivoJog;
import jogadores.Jogador;

public class TJ extends javax.swing.JFrame {

    RepositorioPerguntas rp;
    int lv1,lv2,lv3;
    String tema,nome,resp;

 
    public TJ(RepositorioPerguntas rp,int lv1,int lv2,int lv3,String tema,String nome) 
    {
        this.tema=tema;
        this.nome=nome;
        
        initComponents();
        this.rp = rp;
        this.lv1=lv1;
        this.lv2=lv2;
        this.lv3=lv3;
        br1.setVisible(false);
        br2.setVisible(false);
        br3.setVisible(false);
        br4.setVisible(false);
        br1.setVisible(false);
                
    }
    public TJ(RepositorioPerguntas rp,int lv){}
    
    public TJ(){}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        textP = new javax.swing.JTextField();
        br1 = new javax.swing.JToggleButton();
        br2 = new javax.swing.JToggleButton();
        br3 = new javax.swing.JToggleButton();
        br4 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textA = new javax.swing.JTextArea();
        textLv = new javax.swing.JTextField();
        textN = new javax.swing.JTextField();
        textT = new javax.swing.JTextField();
        cf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(700, 420));
        setPreferredSize(new java.awt.Dimension(788, 572));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 102), new java.awt.Color(0, 204, 204)));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textP.setEditable(false);
        textP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textP.setForeground(new java.awt.Color(0, 0, 153));
        textP.setText("pts");
        textP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 51, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51)));
        jPanel1.add(textP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 94, 50));

        br1.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(br1);
        br1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        br1.setSelected(true);
        br1.setText("a");
        br1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        br1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br1ActionPerformed(evt);
            }
        });
        jPanel1.add(br1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, 277, 55));

        br2.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(br2);
        br2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        br2.setText("b");
        br2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        br2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br2ActionPerformed(evt);
            }
        });
        jPanel1.add(br2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 264, 277, 52));

        br3.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(br3);
        br3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        br3.setText("c");
        br3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        br3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br3ActionPerformed(evt);
            }
        });
        jPanel1.add(br3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 322, 277, 52));

        br4.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(br4);
        br4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        br4.setText("d");
        br4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        br4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br4ActionPerformed(evt);
            }
        });
        jPanel1.add(br4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 381, 277, 52));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Próxima");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 140, 50));

        textA.setEditable(false);
        textA.setBackground(new java.awt.Color(255, 255, 102));
        textA.setColumns(20);
        textA.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        textA.setForeground(new java.awt.Color(0, 0, 153));
        textA.setRows(5);
        textA.setText("Pronto para jogar? "+nome );
        textA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 51, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51)));
        jScrollPane3.setViewportView(textA);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, 620, 130));

        textLv.setEditable(false);
        textLv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textLv.setForeground(new java.awt.Color(0, 0, 153));
        textLv.setText("LV ");
        textLv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 51, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51)));
        jPanel1.add(textLv, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 80, 50));

        textN.setEditable(false);
        textN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textN.setForeground(new java.awt.Color(0, 0, 153));
        textN.setText(nome);
        textN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 51, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51)));
        jPanel1.add(textN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 183, 50));

        textT.setEditable(false);
        textT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textT.setForeground(new java.awt.Color(0, 0, 153));
        textT.setText(tema);
        textT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 51, 102), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51)));
        jPanel1.add(textT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 187, 50));

        cf.setBackground(new java.awt.Color(0, 153, 51));
        cf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cf.setText("Confirmar");
        cf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 102, 102), new java.awt.Color(0, 51, 51)));
        cf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfActionPerformed(evt);
            }
        });
        jPanel1.add(cf, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 140, 50));
        cf.setVisible(false);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 40, 700, 480);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void br1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br1ActionPerformed
        resp=br1.getText();
        cf.setVisible(true);
    }//GEN-LAST:event_br1ActionPerformed

    private void br2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br2ActionPerformed
       resp=br2.getText();
       cf.setVisible(true);
    }//GEN-LAST:event_br2ActionPerformed

    private void br3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br3ActionPerformed
        resp=br3.getText();
        cf.setVisible(true);
    }//GEN-LAST:event_br3ActionPerformed

    private void br4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br4ActionPerformed
        resp=br4.getText();
        cf.setVisible(true);
    }//GEN-LAST:event_br4ActionPerformed
int i=0; int ii=0; int iii=0;
String respV;
int pontos = 0;
boolean on=true;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    if(i<5)
    {
        textA.setText(rp.proc(lv1).getQuestoes(0));
        br1.setText(rp.proc(lv1).getQuestoes(1));
        br2.setText(rp.proc(lv1).getQuestoes(2));
        br3.setText(rp.proc(lv1).getQuestoes(3));
        br4.setText(rp.proc(lv1).getQuestoes(4));
        respV = rp.proc(lv1).getQuestoes(5);
        textLv.setText("lv 1");
        
        i++;
        lv1++;
    }
    else if(ii<5)
    {
        textA.setText(rp.proc(lv2).getQuestoes(0));
        br1.setText(rp.proc(lv2).getQuestoes(1));
        br2.setText(rp.proc(lv2).getQuestoes(2));
        br3.setText(rp.proc(lv2).getQuestoes(3));
        br4.setText(rp.proc(lv2).getQuestoes(4));
        respV = rp.proc(lv2).getQuestoes(5);
        textLv.setText("lv 2");
        
        ii++;
        lv2++;
    }
    else if(iii<5)
    {
        textA.setText(rp.proc(lv3).getQuestoes(0));
        br1.setText(rp.proc(lv3).getQuestoes(1));
        br2.setText(rp.proc(lv3).getQuestoes(2));
        br3.setText(rp.proc(lv3).getQuestoes(3));
        br4.setText(rp.proc(lv3).getQuestoes(4));
        respV = rp.proc(lv3).getQuestoes(5);
        textLv.setText("lv 3");
        
        iii++;
        lv3++;
    }
    else{this.setVisible(false);
            on = false;}  
    
        br1.setVisible(true);
        br2.setVisible(true);
        br3.setVisible(true);
        br4.setVisible(true);
        br1.setVisible(true);
       
System.out.println(tema+nome);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfActionPerformed
        if(resp.equals(respV))
        {
            pontos=pontos+100;
            textP.setText(""+pontos);
            textA.setText("Resposta certa");
        }
        else
        {
            textA.setText("Resposta errada ");

        }
        br1.setVisible(false);
        br2.setVisible(false);
        br3.setVisible(false);
        br4.setVisible(false);
        cf.setVisible(false);
    }//GEN-LAST:event_cfActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton br1;
    private javax.swing.JToggleButton br2;
    private javax.swing.JToggleButton br3;
    private javax.swing.JToggleButton br4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea textA;
    private javax.swing.JTextField textLv;
    private javax.swing.JTextField textN;
    private javax.swing.JTextField textP;
    private javax.swing.JTextField textT;
    // End of variables declaration//GEN-END:variables
}
