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
public class Turista {
    private String ccCliente;
    private String mascota;
    private String color;
    private String tipoSangre;
    private String especie;
    private String edad;

    public Turista(String ccCliente, String mascota, String color, String tipoSangre, String especie, String edad) {
        this.ccCliente = ccCliente;
        this.mascota = mascota;
        this.color = color;
        this.tipoSangre = tipoSangre;
        this.especie = especie;
        this.edad = edad;
    }

    public String[] toArray() {
        return new String[]{ccCliente, mascota, color, tipoSangre, especie, edad};
    }

    public boolean contiene(String texto) {
        return Stream.of(ccCliente, mascota, color, tipoSangre, especie, edad)
                .anyMatch(d -> d.toLowerCase().contains(texto.toLowerCase()));
    }
}
