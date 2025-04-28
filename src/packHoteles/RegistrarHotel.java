package packHoteles;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class RegistrarHotel extends javax.swing.JPanel {

    public RegistrarHotel() {

        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDhotel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombrehotel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        servivcioDisponibles = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtCorreoHotel = new javax.swing.JTextField();
        txtTelefonoHotel = new javax.swing.JTextField();
        btnGuardarHotel = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packHoteles/registrar.png"))); // NOI18N
        jLabel1.setText("Registrar Hotel");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("ID hotel");

        IDhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDhotelActionPerformed(evt);
            }
        });
        IDhotel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDhotelKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        txtNombrehotel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrehotelKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Ofrecemoos");

        servivcioDisponibles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                servivcioDisponiblesKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setText("Direccion");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setText("Correo");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setText("Telefono");

        txtTelefonoHotel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoHotelKeyTyped(evt);
            }
        });

        btnGuardarHotel.setText("Guardar");
        btnGuardarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHotelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombrehotel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(servivcioDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addComponent(txtTelefonoHotel)
                            .addComponent(txtCorreoHotel)
                            .addComponent(txtDireccion))))
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarHotel)
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IDhotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombrehotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(servivcioDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefonoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnGuardarHotel)
                .addGap(0, 98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IDhotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDhotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDhotelActionPerformed

    private void btnGuardarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHotelActionPerformed
    RegisHotel hotel = new RegisHotel();
    hotel.setIDhotel(IDhotel.getText().trim());
    hotel.setOfrece(servivcioDisponibles.getText().trim());
    hotel.setNombre(txtNombrehotel.getText().trim());
    hotel.setDireccion(txtDireccion.getText().trim());
    hotel.setCorreo(txtCorreoHotel.getText().trim());
    hotel.setTelefono(txtTelefonoHotel.getText().trim());

    int validacion = 0;

    if (hotel.getIDhotel().isEmpty()) validacion++;
    if (hotel.getOfrece().isEmpty()) validacion++;
    if (hotel.getNombre().isEmpty()) validacion++;
    if (hotel.getDireccion().isEmpty()) validacion++;
    if (hotel.getCorreo().isEmpty()) validacion++;
    if (hotel.getTelefono().isEmpty()) validacion++;

    if (validacion != 0) {
        JOptionPane.showMessageDialog(null, "Se deben completar todos los campos");
    } else {
        String archivoCSV = "Hoteles.csv";
        boolean existe = false;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length > 0 && datos[0].equals(hotel.getIDhotel())) {
                    existe = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (existe) {
            JOptionPane.showMessageDialog(this, "Hotel ya registrado");
        } else {
            try (PrintWriter writer = new PrintWriter(new FileWriter(archivoCSV, true))) {
                writer.printf("%s,%s,%s,%s,%s,%s%n",
                        hotel.getIDhotel(),
                        hotel.getNombre(),
                        hotel.getOfrece(),
                        hotel.getDireccion(),
                        hotel.getCorreo(),
                        hotel.getTelefono());
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
            } catch (IOException ex) {
                System.err.println("Error al guardar los datos: " + ex.getMessage());
            }
        }
    }
    }//GEN-LAST:event_btnGuardarHotelActionPerformed

    public void vcolors() {
        int validacion = 0;
        String id = IDhotel.getText().trim();
        String of = servivcioDisponibles.getText().trim();
        String nb = txtNombrehotel.getText().trim();
        String dc = txtDireccion.getText().trim();
        String cr = txtCorreoHotel.getText().trim();
        String cl = txtTelefonoHotel.getText().trim();

        if (id.equals("")) {
            IDhotel.setBackground(Color.red);
            validacion++;
        }
        if (of.equals("")) {
            servivcioDisponibles.setBackground(Color.red);
            validacion++;
        }

        if (nb.equals("")) {
            txtNombrehotel.setBackground(Color.red);
            validacion++;
        }

        if (dc.equals("")) {
            txtDireccion.setBackground(Color.red);
            validacion++;
        }

        if (cr.equals("")) {
            txtCorreoHotel.setBackground(Color.red);
            validacion++;
        }

        if (cl.equals("")) {
            txtTelefonoHotel.setBackground(Color.red);
            validacion++;
        }

        if (validacion != 0) {
            JOptionPane.showMessageDialog(null, "Se deben completar todos los campos");
        } else {
            txtNombrehotel.setBackground(Color.green);
            IDhotel.setBackground(Color.green);
            txtCorreoHotel.setBackground(Color.green);
            txtTelefonoHotel.setBackground(Color.green);
            txtDireccion.setBackground(Color.green);
            servivcioDisponibles.setBackground(Color.green);
            setWhite();

        }

    }


    private void IDhotelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDhotelKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_IDhotelKeyTyped

    private void txtTelefonoHotelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoHotelKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtTelefonoHotelKeyTyped

    private void txtNombrehotelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrehotelKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_txtNombrehotelKeyTyped

    private void servivcioDisponiblesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_servivcioDisponiblesKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();
    }//GEN-LAST:event_servivcioDisponiblesKeyTyped

    public void setWhite() {
        txtNombrehotel.setBackground(Color.white);
        IDhotel.setBackground(Color.white);
        txtCorreoHotel.setBackground(Color.white);
        txtTelefonoHotel.setBackground(Color.white);
        txtDireccion.setBackground(Color.white);
        servivcioDisponibles.setBackground(Color.white);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDhotel;
    private javax.swing.JButton btnGuardarHotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField servivcioDisponibles;
    private javax.swing.JTextField txtCorreoHotel;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombrehotel;
    private javax.swing.JTextField txtTelefonoHotel;
    // End of variables declaration//GEN-END:variables
}
