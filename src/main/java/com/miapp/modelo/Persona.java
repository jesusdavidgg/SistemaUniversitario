/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.modelo;

/**
 *
 * @author Estudiante
 */
public abstract class Persona {
    
    
    
    
    protected int    id;
    private String nombre;
    private String apellido;

    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
    
    
    
    // ── Setters ──────────────────────────────────────────────────────────────

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // ── Getters ──────────────────────────────────────────────────────────────
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
        
        
    }
    
    
    
    public void  calcularPago(){
    
    
    
    
    }
    @Override
            
    public String toString(){
        return "Id"+ id
                + " | Nombre" + nombre
                + " | Apellido"+ apellido;
        
    }
    
  
    
}
