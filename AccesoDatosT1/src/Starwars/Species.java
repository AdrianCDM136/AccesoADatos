/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Starwars;

/**
 *
 * @author FP
 */
public class Species {
    private String nombre;
    private String clasificacion;
    private String designacion;
    private Boolean altura_Media;
    private String color_Piel;
    private String color_Pelo;
    private String promedio_Vida;
    private String lenguaje;

    public Species(String nombre, String clasificacion, String designacion, Boolean altura_Media, String color_Piel, String color_Pelo, String promedio_Vida, String lenguaje) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.designacion = designacion;
        this.altura_Media = altura_Media;
        this.color_Piel = color_Piel;
        this.color_Pelo = color_Pelo;
        this.promedio_Vida = promedio_Vida;
        this.lenguaje = lenguaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDesignacion() {
        return designacion;
    }

    public void setDesignacion(String designacion) {
        this.designacion = designacion;
    }

    public Boolean getAltura_Media() {
        return altura_Media;
    }

    public void setAltura_Media(Boolean altura_Media) {
        this.altura_Media = altura_Media;
    }

    public String getColor_Piel() {
        return color_Piel;
    }

    public void setColor_Piel(String color_Piel) {
        this.color_Piel = color_Piel;
    }

    public String getColor_Pelo() {
        return color_Pelo;
    }

    public void setColor_Pelo(String color_Pelo) {
        this.color_Pelo = color_Pelo;
    }

    public String getPromedio_Vida() {
        return promedio_Vida;
    }

    public void setPromedio_Vida(String promedio_Vida) {
        this.promedio_Vida = promedio_Vida;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    
}
