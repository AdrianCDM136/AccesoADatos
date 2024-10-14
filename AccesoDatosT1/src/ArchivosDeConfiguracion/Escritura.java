/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArchivosDeConfiguracion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author FP
 */
public class Escritura {
    public static void main(String[] args) {
        String miUsuario = "root";
        String miContrasenya = "p@ssw0rd";
        String elServidor = "goldengate.tk";
        String elPuerto = "3306";
        
        Properties config= new Properties();
        config.setProperty("user", miUsuario);
        config.setProperty("password", miContrasenya);
        config.setProperty("server", elServidor);
        config.setProperty("port", elPuerto);
        try{
            config.store(new FileOutputStream("config.pass"), "Fichero de configuracion");
        }catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
