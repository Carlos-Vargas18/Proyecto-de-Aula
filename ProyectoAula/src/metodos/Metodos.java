/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author SARA
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Metodos {

    public DefaultTableModel buscarMascotas(String buscar) {
        DefaultTableModel modelo = new DefaultTableModel(null,
                new String[]{"ID Hotel", "Mascota", "Color", "Tipo de sangre", "Especie", "Edad"});
        List<Turista> listaTuristas = new ArrayList<>();

        try {
            List<String[]> datosCSV = ArchivoUtil.leerCSV("Turista.csv");

            for (String[] datos : datosCSV) {
                if (datos.length == 6) {
                    Turista turista = new Turista(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]);
                    if (turista.contiene(buscar)) {
                        modelo.addRow(turista.toArray());
                    }
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo Turista.csv: " + e.getMessage());
        }

        return modelo;
    }

    public DefaultTableModel buscarHoteles(String buscar) {
        DefaultTableModel modelo = new DefaultTableModel(null,
                new String[]{"ID Hotel", "Nombre Hotel", "Ofrecemos", "Direccion Hotel", "Correo hotel", "Telefono Hotel"});
        List<Hotel> listaHoteles = new ArrayList<>();

        try {
            List<String[]> datosCSV = ArchivoUtil.leerCSV("Hoteles.csv");

            for (String[] datos : datosCSV) {
                if (datos.length == 6) {
                    Hotel hotel = new Hotel(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]);
                    if (hotel.contiene(buscar)) {
                        modelo.addRow(hotel.toArray());
                    }
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo Hoteles.csv: " + e.getMessage());
        }

        return modelo;
    }
}
