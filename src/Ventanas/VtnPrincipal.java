/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import englishproject.ManipulaListas;
import englishproject.Nodo;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mosh_
 */
public class VtnPrincipal extends javax.swing.JFrame {
    
    public static Nodo raiz = null;

    /**
     * Creates new form Principal
     */
    public VtnPrincipal() {
        initComponents();
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BtnAjustes = new javax.swing.JToggleButton();
        jLabelAgregar = new javax.swing.JLabel();
        jButtonAgregarCon = new javax.swing.JButton();
        jLabelAjustes1 = new javax.swing.JLabel();
        jButtonEliminarCon = new javax.swing.JButton();
        jLabelEliminar = new javax.swing.JLabel();
        jLabelAgregar1 = new javax.swing.JLabel();
        jButtonAgregarCon1 = new javax.swing.JButton();
        jButtonEliminarCon1 = new javax.swing.JButton();
        jLabelEliminar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Dictionary ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelTitulo1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabelTitulo1.setText("My Hack Dictionary ");

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        BtnAjustes.setBackground(new java.awt.Color(255, 255, 204));
        BtnAjustes.setForeground(new java.awt.Color(255, 255, 204));
        BtnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-ajustes-48.png"))); // NOI18N
        BtnAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAjustesActionPerformed(evt);
            }
        });

        jLabelAgregar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelAgregar.setText("Add Concept");

        jButtonAgregarCon.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAgregarCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-más-48.png"))); // NOI18N
        jButtonAgregarCon.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jButtonAgregarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarConActionPerformed(evt);
            }
        });

        jLabelAjustes1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelAjustes1.setText("Settings");

        jButtonEliminarCon.setBackground(new java.awt.Color(204, 255, 204));
        jButtonEliminarCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-basura-llena-48.png"))); // NOI18N
        jButtonEliminarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarConActionPerformed(evt);
            }
        });

        jLabelEliminar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelEliminar.setText("Delete Concept");

        jLabelAgregar1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelAgregar1.setText("Update Concept");

        jButtonAgregarCon1.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAgregarCon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-reemplazar-48.png"))); // NOI18N
        jButtonAgregarCon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarCon1ActionPerformed(evt);
            }
        });

        jButtonEliminarCon1.setBackground(new java.awt.Color(204, 255, 204));
        jButtonEliminarCon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-documento-48.png"))); // NOI18N
        jButtonEliminarCon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCon1ActionPerformed(evt);
            }
        });

        jLabelEliminar1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabelEliminar1.setText("Consult Concept");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonAgregarCon1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregarCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonEliminarCon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonEliminarCon1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelAjustes1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTitulo1)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabelAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabelEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonEliminarCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAgregarCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(jLabelAgregar1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonEliminarCon1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonAgregarCon1))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelEliminar1)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(BtnAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelAjustes1)
                        .addGap(36, 36, 36))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAjustesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BtnAjustesActionPerformed
    {//GEN-HEADEREND:event_BtnAjustesActionPerformed
       
    }//GEN-LAST:event_BtnAjustesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        raiz = ManipulaListas.carga(this);
        if (raiz == null) {
            System.out.println("Insertando letras");            
            String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            Nodo letra;            
            String s[] = new String[1];
            for (int i = 0; i < letras.length(); i++) {
                s[0] = String.valueOf(letras.charAt(i));
                letra = new Nodo(String.valueOf(letras.charAt(i)), null);
                raiz = ManipulaListas.inserta(raiz, s, 0, letra, null);
            }
            System.out.println(raiz.getEtiqueta());
            System.out.println(raiz.getSiguiente().getEtiqueta());
            System.out.println(raiz.getAnterior().getEtiqueta());            
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        try {
            ManipulaListas.guarda(raiz, this);
        } catch (IOException ex) {
            Logger.getLogger(VtnPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonAgregarConActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonAgregarConActionPerformed
    {//GEN-HEADEREND:event_jButtonAgregarConActionPerformed
        new VtnAltaConceptos().setVisible(true);
    }//GEN-LAST:event_jButtonAgregarConActionPerformed

    private void jButtonEliminarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarConActionPerformed
        new vtnBajaConceptos().setVisible(true);
    }//GEN-LAST:event_jButtonEliminarConActionPerformed

    private void jButtonEliminarCon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCon1ActionPerformed
        new VtnConsultaConceptos().setVisible(true);
    }//GEN-LAST:event_jButtonEliminarCon1ActionPerformed

    private void jButtonAgregarCon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarCon1ActionPerformed
        new VtnActualizaConceptos().setVisible(true);
    }//GEN-LAST:event_jButtonAgregarCon1ActionPerformed

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
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnAjustes;
    private javax.swing.JButton jButtonAgregarCon;
    private javax.swing.JButton jButtonAgregarCon1;
    private javax.swing.JButton jButtonEliminarCon;
    private javax.swing.JButton jButtonEliminarCon1;
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelAgregar1;
    private javax.swing.JLabel jLabelAjustes1;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelEliminar1;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
