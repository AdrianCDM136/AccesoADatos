/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Starwars;

import java.util.ArrayList;

/**
 *
 * @author FP
 */
public class Personajes {
    private String nombre;
    private Double altura;
    private ArrayList<Films> peliculas;
    private ArrayList<Species> especies;

    public Personajes(String nombre) {
        this.nombre = nombre;
        this.altura = altura;
        this.peliculas = new ArrayList<Films>();
        this.especies = new ArrayList<Species>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public ArrayList<Films> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Films> peliculas) {
        this.peliculas = peliculas;
    }

    public ArrayList<Species> getEspecies() {
        return especies;
    }

    public void setEspecies(ArrayList<Species> especies) {
        this.especies = especies;
    }
    
    public boolean agregarPeliculas(Films f){
        return peliculas.add(f);
    }
    public boolean agregarEspecies(Species s){
        return especies.add(s);
    }
    
}
