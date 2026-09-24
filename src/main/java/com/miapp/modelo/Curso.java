/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.modelo;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Curso {
    
    private int codigo;
    private int creditos ;
    private ArrayList<Estudiante> estudiantes;

    public Curso(int codigo, int creditos) {
        this.codigo = codigo;
        this.creditos = creditos;
        this.estudiantes = new ArrayList<>();
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
    public ArrayList<Estudiante> getEstudiantes(){
        return estudiantes;
    }
    
    
    public boolean agregarEstudiante(Estudiante e){
        if (e==null || estudiantes.contains(e)){
            return false;
        }
        estudiantes.add(e);
        return true;
    }
    
}
