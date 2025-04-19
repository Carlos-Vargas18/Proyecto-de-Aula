
package packHoteles;

import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.Metodos;


public class ActualizarHotel extends javax.swing.JPanel {
    int filas;
   DefaultTableModel model=new DefaultTableModel();
   DefaultTableModel mdlTabla;
    public ActualizarHotel() {
        initComponents();
         model.addColumn("ID hotel");
        model.addColumn("Nombre");
        model.addColumn("ofrecemos");
        model.addColumn("Direccion");
        model.addColumn("Correo");
        model.addColumn("Telefono");
        refrescarLista();
        tblhoteles2.setModel(model);
    }
    public void refrescarLista(){
        tblhoteles2.setModel(model);
         File file = new File("Hoteles.csv");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
               model.addRow(parts);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdirechotel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnomHotel = new javax.swing.JTextField();
        txtofrecehotel = new javax.swing.JTextField();
        txtcorreHotel = new javax.swing.JTextField();
        txttelHotel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnActualizarHotel = new javax.swing.JButton();
        txtIDhote = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhoteles2 = new javax.swing.JTable();
        Cbuscar = new javax.swing.JButton();
        txtIDhotel = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packHoteles/captcha (1).png"))); // NOI18N
        jLabel1.setText("Actualizar Hotel");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("ID Hotel");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Ofrecmos");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("Direccion");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setText("Correo");

        txtdirechotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdirechotelActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setText("Telefono");

        txtnomHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomHotelActionPerformed(evt);
            }
        });
        txtnomHotel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomHotelKeyTyped(evt);
            }
        });

        txtofrecehotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtofrecehotelActionPerformed(evt);
            }
        });
        txtofrecehotel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtofrecehotelKeyTyped(evt);
            }
        });

        txtcorreHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreHotelActionPerformed(evt);
            }
        });

        txttelHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelHotelActionPerformed(evt);
            }
        });
        txttelHotel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelHotelKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setText("Dijite ID Hotel");

        btnActualizarHotel.setText("Actualizar");
        btnActualizarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarHotelActionPerformed(evt);
            }
        });

        txtIDhote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblhoteles2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblhoteles2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhoteles2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblhoteles2);

        Cbuscar.setText("Buscar");
        Cbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbuscarActionPerformed(evt);
            }
        });

        txtIDhotel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDhotelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDhotelKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnomHotel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIDhote, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtofrecehotel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdirechotel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txttelHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btnActualizarHotel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcorreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Cbuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(45, 45, 45))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(169, 169, 169))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cbuscar)
                        .addComponent(txtIDhotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtIDhote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnomHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtofrecehotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtdirechotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcorreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txttelHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(btnActualizarHotel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtdirechotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdirechotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdirechotelActionPerformed

    private void txtnomHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomHotelActionPerformed

    private void txtofrecehotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtofrecehotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtofrecehotelActionPerformed

    private void txtcorreHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreHotelActionPerformed

    private void txttelHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelHotelActionPerformed

    private void CbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbuscarActionPerformed

String archivoCSV = "Hoteles.csv";
 int entrada=1;
 model.setRowCount(0);
 if(entrada==1){
    refrescarLista(); 
 }
 String variableAComprobar = txtIDhotel.getText();
 String  activo="";
        boolean existe = false;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                // Comparar el valor con la primera columna
                if (datos.length > 0 && datos[0].equals(variableAComprobar)) {
                    existe = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (existe) {
            String searchTerm = variableAComprobar;
            activo=searchTerm;
            for (int i = 0; i < tblhoteles2.getRowCount(); i++) {
                String documento = (String) tblhoteles2.getValueAt(i, 0);
                if (documento.equals(searchTerm)) {
                   
                    model.setRowCount(0);
                    File file = new File("Hoteles.csv");
                    try {
                        Scanner scanner = new Scanner(file);
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine();
                            String[] parts = line.split(",");
                            if (parts[0].equals(searchTerm)) {
                                model.addRow(parts);
                            }
                        }
                        

                        scanner.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    break;
                    
                } else {

                }
            }
        } else {

 JOptionPane.showMessageDialog(this, "Hotel no registrado\n Actualizamos la lista por si tienes algun error");

        }
             for (int i = 0; i < tblhoteles2.getRowCount(); i++) {
                String documento = (String) tblhoteles2.getValueAt(i, 0);
                if (documento.equals(activo)) {
                   
                    tblhoteles2.setRowSelectionInterval(i, i);

                    tblhoteles2.scrollRectToVisible(new Rectangle(tblhoteles2.getCellRect(i, 0, true)));
                   
                    break;
                }
        }
   
        
    }//GEN-LAST:event_CbuscarActionPerformed

    private void btnActualizarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarHotelActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Deseas actualizar este Hotel?");
        if (a == 0) {
            String[] date = new String[6];
            date[0] = txtIDhote.getText();
            date[1] = txtnomHotel.getText();
            date[2] = txtofrecehotel.getText();
            date[3] = txtdirechotel.getText();
            date[4] = txtcorreHotel.getText();
            date[5] = txttelHotel.getText();
            if (date[0].isEmpty() && date[1].isEmpty() && date[2].isEmpty() && date[3].isEmpty() && date[4].isEmpty() && date[5].isEmpty() || date[0].isEmpty() || date[1].isEmpty() || date[2].isEmpty() || date[3].isEmpty() || date[4].isEmpty() || date[5].isEmpty()) {
                JOptionPane.showMessageDialog(null, "Datos insuficientes");
            } else {
                for (int k = 0; k < tblhoteles2.getColumnCount(); k++) {
                    tblhoteles2.setValueAt(date[k], filas, k);
                }
                try {
                    String archivo = "Hoteles.csv";
                    BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
                    for (int i = 0; i < tblhoteles2.getRowCount(); i++) {
                        for (int j = 0; j < tblhoteles2.getColumnCount(); j++) {

                            bw.write((String) (tblhoteles2.getValueAt(i, j)));
                            if (j < tblhoteles2.getColumnCount() - 1) {
                                bw.write(",");
                            }
                        }
                        bw.newLine();

                    }
                    bw.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                txtIDhote.setText("");
                txtnomHotel.setText("");
                txtofrecehotel.setText("");
                txtdirechotel.setText("");
                txtcorreHotel.setText("");
                txttelHotel.setText("");
            }
        } else if (a == 1) {

            JOptionPane.showMessageDialog(this, "Este Hotel no se actualizo");
        } else {
            JOptionPane.showMessageDialog(this, "Operacion canselada");
        }


    }//GEN-LAST:event_btnActualizarHotelActionPerformed

    private void tblhoteles2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhoteles2MouseClicked
        this.mdlTabla = (DefaultTableModel) tblhoteles2.getModel();
        int seleccion = tblhoteles2.getSelectedRow();
        txtIDhote.setText(tblhoteles2.getValueAt(seleccion, 0).toString());
        txtnomHotel.setText(tblhoteles2.getValueAt(seleccion, 1).toString());
        txtofrecehotel.setText(tblhoteles2.getValueAt(seleccion, 2).toString());
        txtdirechotel.setText(tblhoteles2.getValueAt(seleccion, 3).toString());
        txtcorreHotel.setText(tblhoteles2.getValueAt(seleccion, 4).toString());
        txttelHotel.setText(tblhoteles2.getValueAt(seleccion, 5).toString());
        filas = seleccion;

    }//GEN-LAST:event_tblhoteles2MouseClicked

    public void buscarCliente(String buscar){
        Metodos metodo = new Metodos();
        
        DefaultTableModel modelo = metodo.buscarHoteles(buscar);
        tblhoteles2.setModel(modelo);
    }
    
    private void txttelHotelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelHotelKeyTyped
       char c= evt.getKeyChar();
                if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_txttelHotelKeyTyped

    private void txtIDhotelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDhotelKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();

    }//GEN-LAST:event_txtIDhotelKeyTyped

    private void txtnomHotelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomHotelKeyTyped
           char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_txtnomHotelKeyTyped

    private void txtofrecehotelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtofrecehotelKeyTyped
              char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_txtofrecehotelKeyTyped

    private void txtIDhotelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDhotelKeyReleased
        buscarCliente(txtIDhotel.getText());
    }//GEN-LAST:event_txtIDhotelKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cbuscar;
    private javax.swing.JButton btnActualizarHotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblhoteles2;
    private javax.swing.JLabel txtIDhote;
    private javax.swing.JTextField txtIDhotel;
    private javax.swing.JTextField txtcorreHotel;
    private javax.swing.JTextField txtdirechotel;
    private javax.swing.JTextField txtnomHotel;
    private javax.swing.JTextField txtofrecehotel;
    private javax.swing.JTextField txttelHotel;
    // End of variables declaration//GEN-END:variables
}
