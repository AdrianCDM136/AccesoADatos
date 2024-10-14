/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Starwars;

import org.json.JSONArray;
import org.json.JSONObject;



/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        try{
            String contenido = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("starwars.json")));
            JSONObject jsonLeido = new JSONObject(contenido);
            
            String nombreP = jsonLeido.getString("name");
            JSONArray jsonHeightLeidos = jsonLeido.getJSONArray("height");
            JSONArray jsonFilmsLeidos = jsonLeido.getJSONArray("Films");
            JSONArray jsonSpeciesLeidos = jsonLeido.getJSONArray("species");
            
            Personajes personajeLeido = new Personajes(nombreP);
            
            
        }catch(java.io.IOException e){
            e.printStackTrace();
        }
    }
}
