/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.modelo;

/**
 *
 * @author Estudiante
 */
public class Profesor extends Persona {
    
    private static final Double salarioBase=1000.0;

    public Profesor(int id, String nombre, String apellido) {
        super(id, nombre, apellido);
    }

    public static Double getSalarioBase() {
        return salarioBase;
    }
    
    
    
    
    
    

 

  
    
    
}
