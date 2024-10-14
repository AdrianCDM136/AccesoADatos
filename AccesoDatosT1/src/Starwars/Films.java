/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Starwars;

/**
 *
 * @author FP
 */
public class Films {
    private String titulo;
    private int id_Episodio;
    private String apertura;
    private String director;

    public Films(String titulo, int id_Episodio, String apertura, String director) {
        this.titulo = titulo;
        this.id_Episodio = id_Episodio;
        this.apertura = apertura;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId_Episodio() {
        return id_Episodio;
    }

    public void setId_Episodio(int id_Episodio) {
        this.id_Episodio = id_Episodio;
    }

    public String getApertura() {
        return apertura;
    }

    public void setApertura(String apertura) {
        this.apertura = apertura;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
}
