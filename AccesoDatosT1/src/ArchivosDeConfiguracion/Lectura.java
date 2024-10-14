/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArchivosDeConfiguracion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author FP
 */
public class Lectura {
    public static void main(String[] args) {
        String miUsuario,miContrasenya,elServidor;
        Integer elPuerto;
        
        Properties config = new Properties();
        
        try {
            config.load(new FileInputStream("config.pass"));
            miUsuario = config.getProperty("user");
            miContrasenya = config.getProperty("password");
            elServidor = config.getProperty("server");
            elPuerto = Integer.valueOf(config.getProperty("port"));
            System.out.println(miUsuario);
            System.out.println(miContrasenya);
            System.out.println(elServidor);
            System.out.println(elPuerto);
            
        }catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
