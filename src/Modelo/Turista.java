/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Vector;

public class Turista {
    private String nombre;
    private String cedula;
    private String destino;
    private int edad;

    public Turista(String nombre, String cedula, String destino, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.destino = destino;
        this.edad = edad;
    }

    Turista(String dato, String dato0, String dato1, String dato2, String dato3, String dato4) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() { return nombre; }
    public String getCedula() { return cedula; }
    public String getDestino() { return destino; }
    public int getEdad() { return edad; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public void setDestino(String destino) { this.destino = destino; }
    public void setEdad(int edad) { this.edad = edad; }

    @Override
    public String toString() {
        return nombre + " - " + cedula + " - " + destino + " - " + edad;
    }

    boolean contiene(String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Vector<?> toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

