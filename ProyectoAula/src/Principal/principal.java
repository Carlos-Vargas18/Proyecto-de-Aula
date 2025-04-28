
package Principal;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal extends JFrame {
    public principal() {
    
        setTitle("Menú Principal");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1));

        Bogota = new JButton("Bogotá");
        Cartagena = new JButton("Cartagena");
        Barranquilla = new JButton("Barranquilla");

        add(Bogota);
        add(Cartagena);
        add(Barranquilla);

}
    
        
               


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cartagena = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Barranquilla = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Bogota = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setText("Seleccione La Ciudad Donde Desea Reservar su Hotel");

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cartagena\n");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 200, 110, 26);

        Cartagena.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Cartagena.setText("Ver Ahora");
        Cartagena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartagenaActionPerformed(evt);
            }
        });
        jPanel2.add(Cartagena);
        Cartagena.setBounds(600, 200, 90, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo (1).jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 160, 699, 100);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Barranquilla");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 340, 110, 26);

        Barranquilla.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Barranquilla.setText("Ver Ahora");
        Barranquilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarranquillaActionPerformed(evt);
            }
        });
        jPanel2.add(Barranquilla);
        Barranquilla.setBounds(600, 340, 90, 24);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo2 (1).jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 300, 700, 102);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bogota");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 60, 70, 26);

        Bogota.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Bogota.setText("Ver Ahora");
        Bogota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BogotaActionPerformed(evt);
            }
        });
        jPanel2.add(Bogota);
        Bogota.setBounds(600, 60, 90, 24);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo3 (1).jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 20, 700, 110);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel7)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BogotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BogotaActionPerformed
    // TODO add your handling code here:
    new Bogota().setVisible(true);
    this.dispose();



    }//GEN-LAST:event_BogotaActionPerformed

    private void CartagenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartagenaActionPerformed
    // TODO add your handling code here:
        new Cartagena().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_CartagenaActionPerformed

    private void BarranquillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarranquillaActionPerformed
        // TODO add your handling code here:
        new Barranquilla().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BarranquillaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Barranquilla;
    private javax.swing.JButton Bogota;
    private javax.swing.JButton Cartagena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
   
