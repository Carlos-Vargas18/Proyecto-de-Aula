package packTurista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class RegistrarTurista extends javax.swing.JPanel {

    public RegistrarTurista() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxTTurista = new javax.swing.JTextField();
        btnVaciarMasct = new javax.swing.JButton();
        btnGuardarMasct = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxTApellido = new javax.swing.JTextField();
        Reserva = new javax.swing.JTextField();
        txtIdenteficacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        COMBID = new javax.swing.JComboBox<>();
        TipoReser = new javax.swing.JComboBox<>();
        DatePickerCheckIn = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DatePickerCheckOut = new com.github.lgooddatepicker.components.DatePicker();
        jLabel11 = new javax.swing.JLabel();
        txtCantidadPersonas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packageclientes/registrar.png"))); // NOI18N
        jLabel1.setText("Registro Del Turista");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 10, 190, 26);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombres:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 60, 17);
        jPanel1.add(TxTTurista);
        TxTTurista.setBounds(90, 90, 127, 22);

        btnVaciarMasct.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnVaciarMasct.setText("Vaciar");
        btnVaciarMasct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarMasctActionPerformed(evt);
            }
        });
        jPanel1.add(btnVaciarMasct);
        btnVaciarMasct.setBounds(220, 360, 72, 24);

        btnGuardarMasct.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnGuardarMasct.setText("Guardar");
        btnGuardarMasct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMasctActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarMasct);
        btnGuardarMasct.setBounds(350, 360, 80, 24);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(218, 347, 0, 0);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellidos:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 120, 62, 17);

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Motivo De Reserva:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(340, 120, 117, 17);

        TxTApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxTApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(TxTApellido);
        TxTApellido.setBounds(90, 120, 130, 22);
        jPanel1.add(Reserva);
        Reserva.setBounds(460, 120, 140, 22);
        jPanel1.add(txtIdenteficacion);
        txtIdenteficacion.setBounds(170, 180, 123, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Numero De Identificacion:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 180, 159, 17);

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo de Reserva:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(340, 90, 100, 17);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo De Identificacion:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 150, 138, 17);

        COMBID.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        COMBID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Cedula Ciudadana", "Cedula Extranjera", "Pasaporte", "NIT" }));
        jPanel1.add(COMBID);
        COMBID.setBounds(150, 150, 145, 23);

        TipoReser.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        TipoReser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Apartamento", "Salon de Eventos", "Restaurante", "Cuarto", "Penthouse " }));
        jPanel1.add(TipoReser);
        TipoReser.setBounds(460, 90, 138, 23);
        jPanel1.add(DatePickerCheckIn);
        DatePickerCheckIn.setBounds(420, 150, 180, 21);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Check In:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 150, 70, 19);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Check Out:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(340, 180, 80, 19);
        jPanel1.add(DatePickerCheckOut);
        DatePickerCheckOut.setBounds(420, 180, 180, 21);

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cantidad De Personas:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 210, 140, 17);

        txtCantidadPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadPersonasActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadPersonas);
        txtCantidadPersonas.setBounds(150, 210, 30, 22);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo (4).jpg"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 50, 600, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVaciarMasctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarMasctActionPerformed


    }//GEN-LAST:event_btnVaciarMasctActionPerformed

    private void btnGuardarMasctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMasctActionPerformed

    Turistas turista = new Turistas();
    turista.NombreT = TxTTurista.getText().trim();
    turista.ApellidoT = TxTApellido.getText().trim();
    turista.TID = COMBID.getSelectedItem().toString();
    turista.IDTurista = txtIdenteficacion.getText().trim();
    turista.TipoReser = TipoReser.getSelectedItem().toString();
    turista.Reserva = Reserva.getText().trim();
    turista.CheckIn = DatePickerCheckIn.getDate() != null ? DatePickerCheckIn.getDate().toString() : "";
    turista.CheckOut = DatePickerCheckOut.getDate() != null ? DatePickerCheckOut.getDate().toString() : "";
    turista.CantidadPersonas = txtCantidadPersonas.getText().trim();

    int validacion = 0;

    if (turista.NombreT.equals("")) validacion++;
    if (turista.ApellidoT.equals("")) validacion++;
    if (turista.TID.equals("")) validacion++;
    if (turista.IDTurista.equals("")) validacion++;
    if (turista.TipoReser.equals("")) validacion++;
    if (turista.Reserva.equals("")) validacion++;
    if (turista.CheckIn.equals("")) validacion++;
    if (turista.CheckOut.equals("")) validacion++;
    if (turista.CantidadPersonas.equals("")) validacion++;

    // Validación de cantidad de personas
    int cantidad = 0;
    try {
        cantidad = Integer.parseInt(turista.CantidadPersonas);
        if (cantidad <= 0) validacion++;
    } catch (NumberFormatException e) {
        validacion++;
    }

    // Validar que el Check-Out no sea antes que el Check-In
    if (!turista.CheckIn.equals("") && !turista.CheckOut.equals("")) {
        try {
            java.time.LocalDate checkInDate = DatePickerCheckIn.getDate();
            java.time.LocalDate checkOutDate = DatePickerCheckOut.getDate();

            if (checkOutDate.isBefore(checkInDate)) {
            JOptionPane.showMessageDialog(null, "La fecha de Check-Out no puede ser antes del Check-In.");
            return;
        }
        } catch (Exception e) {
            validacion++;
        }
    }

    if (validacion != 0) {
        JOptionPane.showMessageDialog(null, "Se deben completar correctamente todos los campos.");
    } else {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("Turistas.csv", true));
            // Escribir los datos en formato CSV
            writer.printf("%s,%s,%s,%s,%s,%s,%s,%s,%s%n",
                    turista.NombreT,
                    turista.ApellidoT,
                    turista.TID,
                    turista.IDTurista,
                    turista.TipoReser,
                    turista.Reserva,
                    turista.CheckIn,
                    turista.CheckOut,
                    turista.CantidadPersonas);
            writer.close();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
            System.out.println("Turista registrado correctamente.");
        } catch (IOException ex) {
            System.err.println("Error al guardar los datos: " + ex.getMessage());
        }
    }



    }//GEN-LAST:event_btnGuardarMasctActionPerformed

    private void TxTApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxTApellidoActionPerformed

    }//GEN-LAST:event_TxTApellidoActionPerformed

    private void txtCantidadPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadPersonasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMBID;
    private com.github.lgooddatepicker.components.DatePicker DatePickerCheckIn;
    private com.github.lgooddatepicker.components.DatePicker DatePickerCheckOut;
    private javax.swing.JTextField Reserva;
    private javax.swing.JComboBox<String> TipoReser;
    private javax.swing.JTextField TxTApellido;
    private javax.swing.JTextField TxTTurista;
    private javax.swing.JButton btnGuardarMasct;
    private javax.swing.JButton btnVaciarMasct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCantidadPersonas;
    private javax.swing.JTextField txtIdenteficacion;
    // End of variables declaration//GEN-END:variables
}
