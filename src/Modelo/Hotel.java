/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Vector;

public class Hotel {
    private String nombre;
    private String ciudad;
    private int estrellas;
    private double precioNoche;

    public Hotel(String nombre, String ciudad, int estrellas, double precioNoche) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estrellas = estrellas;
        this.precioNoche = precioNoche;
    }

    Hotel(String dato, String dato0, String dato1, String dato2, String dato3, String dato4) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }
    public int getEstrellas() { return estrellas; }
    public double getPrecioNoche() { return precioNoche; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public void setEstrellas(int estrellas) { this.estrellas = estrellas; }
    public void setPrecioNoche(double precioNoche) { this.precioNoche = precioNoche; }

    @Override
    public String toString() {
        return nombre + " - " + ciudad + " - " + estrellas + " estrellas - $" + precioNoche;
    }

    boolean contiene(String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Vector<?> toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


