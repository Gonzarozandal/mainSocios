/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainsocios;

import java.time.LocalDate;

/**
 *
 * @author Gonza
 */
public class Socios {
    private int numeroSocio;
    private String nombreCompleto;
    private int edad;
    private String sexo;
    private LocalDate fechaAlta;

    public Socios(int numeroSocio, String nombreCompleto, int edad, String sexo) {
        this.numeroSocio = numeroSocio;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaAlta = LocalDate.now();
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }
    
    
    
}
