
package packHoteles;

import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.Metodos;


public class ConsultarHotel extends javax.swing.JPanel {

    DefaultTableModel model=new DefaultTableModel();
    public ConsultarHotel() {
        initComponents();
         model.addColumn("ID hotel");
        model.addColumn("Nombre");
        model.addColumn("ofrecemos");
        model.addColumn("Direccion");
        model.addColumn("Correo");
        model.addColumn("Telefono");
        refrescarLista();
        
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
        txtIDhotel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Cbuscarhotel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhoteles2 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packHoteles/BUSCAR-removebg-preview (1).png"))); // NOI18N
        jLabel1.setText("BUSCAR HOTEL");

        txtIDhotel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDhotelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDhotelKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("ID Hotel");

        Cbuscarhotel.setText("Buscar");
        Cbuscarhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbuscarhotelActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tblhoteles2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cbuscarhotel)))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDhotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Cbuscarhotel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
  

    private void CbuscarhotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbuscarhotelActionPerformed
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
    }//GEN-LAST:event_CbuscarhotelActionPerformed

    public void buscarCliente(String buscar){
        Metodos metodo = new Metodos();
        
        DefaultTableModel modelo = metodo.buscarHoteles(buscar);
        tblhoteles2.setModel(modelo);
    }
    
    private void txtIDhotelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDhotelKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();

    }//GEN-LAST:event_txtIDhotelKeyTyped

    private void txtIDhotelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDhotelKeyReleased
        buscarCliente(txtIDhotel.getText());
    }//GEN-LAST:event_txtIDhotelKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cbuscarhotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblhoteles2;
    private javax.swing.JTextField txtIDhotel;
    // End of variables declaration//GEN-END:variables
}
