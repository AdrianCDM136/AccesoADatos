/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import org.json.*;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) {
        UsuarioAvanzado usuario1 = new UsuarioAvanzado("Jude Bellingham", 21);
        UsuarioAvanzado usuario2 = new UsuarioAvanzado("De fruts", 21);

        Proyecto proyecto = new Proyecto("Copa de Europa 24/25");
        proyecto.agregarParticipante(usuario1);
        proyecto.agregarParticipante(usuario2);

        //convertir el proyecto a un jsonObject
        JSONObject jsonProyecto = new JSONObject();
        jsonProyecto.put("nombre", proyecto.getNombre());

        JSONArray jsonParticipantes = new JSONArray();
        for (UsuarioAvanzado participantes : proyecto.getParticipantes()) {
            JSONObject jsonParticipante = new JSONObject();
            jsonParticipante.put("nombre", participantes.getNombre());
            jsonParticipante.put("edad", participantes.getEdad());
            jsonParticipantes.put(jsonParticipante);
        }
        jsonProyecto.put("participantes", jsonParticipantes);

        try {
            java.nio.file.Files.write(java.nio.file.Paths.get("proyecto.json"), jsonProyecto.toString().getBytes());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        
         try{
            String contenido=new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get("proyecto.json")));
            JSONObject jsonLeido=new JSONObject(contenido);
            
            String nombreProyecto=jsonLeido.getString("nombre");
            JSONArray jsonParticipantesLeidos=jsonLeido.getJSONArray("participantes");
            
            Proyecto proyectoLeido=new Proyecto(nombreProyecto);
            
            for (int i = 0; i < jsonParticipantesLeidos.length(); i++) {
                JSONObject jsonParticipante=jsonParticipantesLeidos.getJSONObject(i);
                String nombreParticipante=jsonParticipante.getString("nombre");
                int edadParticipante=jsonParticipante.getInt("edad");
                
                UsuarioAvanzado participanteLeido=new UsuarioAvanzado(nombreParticipante,edadParticipante);
                 proyectoLeido.agregarParticipante(participanteLeido);
                
            }
             System.out.println("Proyecto: "+proyectoLeido.getNombre());
             System.out.println("Participantes: ");
             for (UsuarioAvanzado e : proyectoLeido.getParticipantes()) {
                 System.out.println("- "+e.getNombre()+ ", Edad: "+e.getEdad());
             }
            
        }catch(java.io.IOException e){
            
        }

    }
}
