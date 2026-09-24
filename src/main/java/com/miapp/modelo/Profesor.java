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
    
    private  final double salarioBase;

    public Profesor(double salarioBase, int id, String nombre, String apellido) {
        super(id, nombre, apellido);
        this.salarioBase = salarioBase;
    }

    

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void impartirClases(){
    System.out.println(getNombre()+" "+ getApellido() + " está impartiendo su clase.");
    }
    
    
@Override
    public double calcularPago() {
        return salarioBase;}    
    
    
    
    
    

 

  
    
    
}
