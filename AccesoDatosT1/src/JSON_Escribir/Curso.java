/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON_Escribir;

import java.util.ArrayList;

/**
 *
 * @author FP
 */
public class Curso {
    private String nombre;
    private ArrayList<Usuario>clases;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.clases = new ArrayList<Usuario>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Usuario> clases) {
        this.clases = clases;
    }

    public boolean agregarClases(Usuario e){
        return clases.add(e);
    }

    
}
