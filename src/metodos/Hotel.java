/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.util.stream.Stream;

/**
 *
 * @author SARA
 */
public class Hotel {
    private String idHotel;
    private String nombre;
    private String ofrece;
    private String direccion;
    private String correo;
    private String telefono;

    public Hotel(String idHotel, String nombre, String ofrece, String direccion, String correo, String telefono) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.ofrece = ofrece;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String[] toArray() {
        return new String[]{idHotel, nombre, ofrece, direccion, correo, telefono};
    }

    public boolean contiene(String texto) {
        return Stream.of(idHotel, nombre, ofrece, direccion, correo, telefono)
                .anyMatch(d -> d.toLowerCase().contains(texto.toLowerCase()));
    }
}

