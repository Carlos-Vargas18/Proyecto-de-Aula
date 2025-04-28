
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


public class Eliminarhotel extends javax.swing.JPanel {
DefaultTableModel model=new DefaultTableModel();

    public Eliminarhotel() {
        initComponents();
         model.addColumn("ID hotel");
        model.addColumn("Nombre");
        model.addColumn("ofrecemos");
        model.addColumn("Direccion");
        model.addColumn("Correo");
        model.addColumn("Telefono");
        refrescarLista();
    }
     public void refrescarLista() {
        tblHotel3.setModel(model);
         File file = new File("Hotel.csv");
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
        txtIDhotel = new javax.swing.JTextField();
        btnbuscarhotel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHotel3 = new javax.swing.JTable();
        btnEliminarhotel = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packHoteles/basura.png"))); // NOI18N
        jLabel1.setText("Eliminar Hotel");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("ID Hotel");

        txtIDhotel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDhotelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDhotelKeyTyped(evt);
            }
        });

        btnbuscarhotel.setText("Buscar");
        btnbuscarhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarhotelActionPerformed(evt);
            }
        });

        tblHotel3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblHotel3);

        btnEliminarhotel.setText("Eliminar");
        btnEliminarhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarhotelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDhotel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnbuscarhotel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminarhotel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDhotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarhotel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnEliminarhotel)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarhotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarhotelActionPerformed
  
       
        int a=JOptionPane.showConfirmDialog(this,"Deseas eliminar este Hotel?");
        if(a==0){
      this.model=(DefaultTableModel)tblHotel3.getModel();
      model.removeRow(tblHotel3.getSelectedRow());
      try{
          String archivo="Hoteles.csv";
          BufferedWriter bw=new BufferedWriter(new FileWriter(archivo));
          for(int i=0; i<tblHotel3.getRowCount();i++){
          for(int j=0;j<tblHotel3.getColumnCount();j++){
              bw.write((String)(tblHotel3.getValueAt(i,j)));
              if(j<tblHotel3.getColumnCount()-1){
              bw.write(",");
              }
          }
          bw.newLine();
          }
          bw.close();
          JOptionPane.showMessageDialog(this,"Hotel eliminado exitosamente");
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
        }else if(a==1){
     
      JOptionPane.showMessageDialog(this,"Este Hotel no logro ser elimino");
        }else{
        JOptionPane.showMessageDialog(this,"Operacion cancelada");
        }
    }//GEN-LAST:event_btnEliminarhotelActionPerformed

    private void btnbuscarhotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarhotelActionPerformed
       String archivoCSV = "clientes.csv";
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
            for (int i = 0; i < tblHotel3.getRowCount(); i++) {
                String documento = (String) tblHotel3.getValueAt(i, 0);
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
             for (int i = 0; i < tblHotel3.getRowCount(); i++) {
                String documento = (String) tblHotel3.getValueAt(i, 0);
                if (documento.equals(activo)) {

                    tblHotel3.setRowSelectionInterval(i, i);

                    tblHotel3.scrollRectToVisible(new Rectangle(tblHotel3.getCellRect(i, 0, true)));
                   
                    break;
                }
        }
    }//GEN-LAST:event_btnbuscarhotelActionPerformed

    public void buscarHotel(String buscar){
        Metodos metodo = new Metodos();
        
        DefaultTableModel modelo = metodo.buscarHoteles(buscar);
        tblHotel3.setModel(modelo);
    }
    
    private void txtIDhotelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDhotelKeyTyped
        char c= evt.getKeyChar();
                if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_txtIDhotelKeyTyped

    private void txtIDhotelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDhotelKeyReleased
        buscarHotel(txtIDhotel.getText());
    }//GEN-LAST:event_txtIDhotelKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarhotel;
    private javax.swing.JButton btnbuscarhotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHotel3;
    private javax.swing.JTextField txtIDhotel;
    // End of variables declaration//GEN-END:variables
}
