/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON_Escribir;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(1,"Acceso a Datos",6.0,8.45);
        Usuario usuario2 = new Usuario(2,"PSP",3.0,9.0);
        
        Curso proyecto2 = new Curso("Illo");
        proyecto2.agregarClases(usuario1);
        proyecto2.agregarClases(usuario2);
        
        JSONObject jsonProyecto2 = new JSONObject();
        jsonProyecto2.put("nombre", proyecto2.getNombre());

        JSONArray jsonParticipantes = new JSONArray();
        for (Usuario p : proyecto2.getClases()) {
            JSONObject jsonParticipante = new JSONObject();
            jsonParticipante.put("id", p.getId());
            jsonParticipante.put("nombre", p.getNombre());
            jsonParticipante.put("horas", p.getHoras());
            jsonParticipante.put("nota", p.getNota());
            jsonParticipantes.put(jsonParticipante);
        }
        jsonProyecto2.put("participantes", jsonParticipantes);

        try {
            java.nio.file.Files.write(java.nio.file.Paths.get("proyecto.json"), jsonProyecto2.toString().getBytes());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
