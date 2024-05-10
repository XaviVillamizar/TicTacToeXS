/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToe;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author xavis
 */
public class tablero3x3 extends javax.swing.JFrame {
    private Tablero tablero;
    
    private JLabel posicion [] = new JLabel[9];
    private int matriz [][]={
        {1, 2, 3}, 
        {4, 5, 6}, 
        {7, 8, 9},
        {1, 4, 7}, 
        {2, 5,8}, 
        {3, 6, 9},
        {1, 5, 9}, 
        {3, 5, 7}
    };
  
    public tablero3x3(String nombre1, String nombre2, JRadioButton rbt3x3, JRadioButton rbt4x4, JRadioButton rbt5x5) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        jugador1.setText(nombre1);
        jugador2.setText(nombre2);
        posicion [0] = pos1;
        posicion [1] = pos2;
        posicion [2] = pos3;
        posicion [3] = pos4;
        posicion [4] = pos5;
        posicion [5] = pos6;
        posicion [6] = pos7;
        posicion [7] = pos8;
        posicion [8] = pos9;
        
        tablero = new Tablero(posicion, matriz, txtTurno, puntoX, puntoO, true, rbt3x3, rbt4x4, rbt5x5);
    }
    
    public tablero3x3() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        pos1 = new javax.swing.JLabel();
        pos2 = new javax.swing.JLabel();
        pos3 = new javax.swing.JLabel();
        pos4 = new javax.swing.JLabel();
        pos5 = new javax.swing.JLabel();
        pos6 = new javax.swing.JLabel();
        pos7 = new javax.swing.JLabel();
        pos8 = new javax.swing.JLabel();
        pos9 = new javax.swing.JLabel();
        puntoX = new javax.swing.JLabel();
        puntoO = new javax.swing.JLabel();
        bgMesa = new javax.swing.JLabel();
        txtTurno = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        fichaO = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        fichaX = new javax.swing.JLabel();
        jugador1 = new javax.swing.JLabel();
        tipoTablero = new javax.swing.JLabel();
        mesa = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(209, 112, 34));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pos1.setBackground(new java.awt.Color(255, 255, 255));
        pos1.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        pos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pos1MousePressed(evt);
            }
        });
        jPanel5.add(pos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 100));

        pos2.setBackground(new java.awt.Color(255, 255, 255));
        pos2.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        pos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pos2MousePressed(evt);
            }
        });
        jPanel5.add(pos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 100, 100));

        pos3.setBackground(new java.awt.Color(255, 255, 255));
        pos3.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        pos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pos3MousePressed(evt);
            }
        });
        jPanel5.add(pos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 100, 100));

        pos4.setBackground(new java.awt.Color(255, 255, 255));
        pos4.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        pos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pos4MousePressed(evt);
            }
        });
        jPanel5.add(pos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 100, 100));

        pos5.setBackground(new java.awt.Color(255, 255, 255));
        pos5.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        pos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pos5MousePressed(evt);
            }
        });
        jPanel5.add(pos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 100, 100));

        pos6.setBackground(new java.awt.Color(255, 255, 255));
        pos6.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        pos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pos6MousePressed(evt);
            }
        });
        jPanel5.add(pos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 100, 100));

        pos7.setBackground(new java.awt.Color(255, 255, 255));
        pos7.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        pos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pos7MousePressed(evt);
            }
        });
        jPanel5.add(pos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 100, 100));

        pos8.setBackground(new java.awt.Color(255, 255, 255));
        pos8.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        pos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pos8MousePressed(evt);
            }
        });
        jPanel5.add(pos8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 100, 100));

        pos9.setBackground(new java.awt.Color(255, 255, 255));
        pos9.setFont(new java.awt.Font("Segoe UI Light", 1, 48)); // NOI18N
        pos9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pos9MousePressed(evt);
            }
        });
        jPanel5.add(pos9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 100, 100));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 470, 560));

        puntoX.setFont(new java.awt.Font("Sitka Display", 0, 48)); // NOI18N
        puntoX.setForeground(new java.awt.Color(255, 153, 102));
        puntoX.setText("0");
        jPanel4.add(puntoX, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 30, 30));

        puntoO.setFont(new java.awt.Font("Sitka Display", 0, 48)); // NOI18N
        puntoO.setForeground(new java.awt.Color(204, 0, 153));
        puntoO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        puntoO.setText("0");
        jPanel4.add(puntoO, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 30, 30));

        bgMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TicTacToe/imagenes/bg3x3juego.png"))); // NOI18N
        jPanel4.add(bgMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 570));

        txtTurno.setFont(new java.awt.Font("Sitka Display", 3, 18)); // NOI18N
        txtTurno.setForeground(new java.awt.Color(255, 204, 0));
        txtTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTurno.setText("Turno de  X");
        jPanel4.add(txtTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 180, 250, -1));

        regresar.setFont(new java.awt.Font("Sitka Banner", 3, 14)); // NOI18N
        regresar.setText("REGRESAR");
        regresar.setBorder(null);
        regresar.setBorderPainted(false);
        regresar.setContentAreaFilled(false);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel4.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 130, 50));

        reiniciar.setFont(new java.awt.Font("Sitka Banner", 3, 14)); // NOI18N
        reiniciar.setText("REINICIAR JUEGO");
        reiniciar.setBorder(null);
        reiniciar.setBorderPainted(false);
        reiniciar.setContentAreaFilled(false);
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        jPanel4.add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 130, 50));

        fichaO.setFont(new java.awt.Font("Sitka Heading", 2, 20)); // NOI18N
        fichaO.setForeground(new java.awt.Color(255, 0, 204));
        fichaO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fichaO.setText("O");
        jPanel4.add(fichaO, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 240, 30));

        jugador2.setFont(new java.awt.Font("Sitka Heading", 2, 20)); // NOI18N
        jugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugador2.setText("Jugador 2");
        jPanel4.add(jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 230, 30));

        fichaX.setFont(new java.awt.Font("Sitka Heading", 2, 20)); // NOI18N
        fichaX.setForeground(new java.awt.Color(255, 153, 0));
        fichaX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fichaX.setText("X");
        jPanel4.add(fichaX, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 230, 30));

        jugador1.setFont(new java.awt.Font("Sitka Heading", 2, 20)); // NOI18N
        jugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugador1.setText("Jugador 1");
        jPanel4.add(jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 230, 30));

        tipoTablero.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        tipoTablero.setText("3x3");
        jPanel4.add(tipoTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 40, 30));

        mesa.setBackground(new java.awt.Color(153, 0, 0));
        mesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TicTacToe/imagenes/bg3x3mesa.png"))); // NOI18N
        mesa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(mesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 850, 600));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TicTacToe/imagenes/bg3x3.jpg"))); // NOI18N
        jPanel3.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pos1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos1MousePressed
        // TODO add your handling code here:
        tablero.ficha(1);
        
    }//GEN-LAST:event_pos1MousePressed

    private void pos2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos2MousePressed
        // TODO add your handling code here:
        tablero.ficha(2);
    }//GEN-LAST:event_pos2MousePressed

    private void pos3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos3MousePressed
        // TODO add your handling code here:
        tablero.ficha(3);
    }//GEN-LAST:event_pos3MousePressed

    private void pos4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos4MousePressed
        // TODO add your handling code here:
        tablero.ficha(4);
    }//GEN-LAST:event_pos4MousePressed

    private void pos5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos5MousePressed
        // TODO add your handling code here:
        tablero.ficha(5);
    }//GEN-LAST:event_pos5MousePressed

    private void pos6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos6MousePressed
        // TODO add your handling code here:
        tablero.ficha(6);
    }//GEN-LAST:event_pos6MousePressed

    private void pos7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos7MousePressed
        // TODO add your handling code here:
        tablero.ficha(7);
    }//GEN-LAST:event_pos7MousePressed

    private void pos8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos8MousePressed
        // TODO add your handling code here:
       tablero.ficha(8);
    }//GEN-LAST:event_pos8MousePressed

    private void pos9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos9MousePressed
        // TODO add your handling code here:
       tablero.ficha(9);
    }//GEN-LAST:event_pos9MousePressed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        // TODO add your handling code here:
        tablero.reinicioJuego();
      
    }//GEN-LAST:event_reiniciarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(tablero3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablero3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablero3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablero3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablero3x3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel bgMesa;
    private javax.swing.JLabel fichaO;
    private javax.swing.JLabel fichaX;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    private javax.swing.JLabel mesa;
    private javax.swing.JLabel pos1;
    private javax.swing.JLabel pos2;
    private javax.swing.JLabel pos3;
    private javax.swing.JLabel pos4;
    private javax.swing.JLabel pos5;
    private javax.swing.JLabel pos6;
    private javax.swing.JLabel pos7;
    private javax.swing.JLabel pos8;
    private javax.swing.JLabel pos9;
    private javax.swing.JLabel puntoO;
    private javax.swing.JLabel puntoX;
    private javax.swing.JButton regresar;
    private javax.swing.JButton reiniciar;
    private javax.swing.JLabel tipoTablero;
    private javax.swing.JLabel txtTurno;
    // End of variables declaration//GEN-END:variables
}
