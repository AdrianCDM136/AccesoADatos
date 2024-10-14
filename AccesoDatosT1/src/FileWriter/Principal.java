/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fichero1 = new File("Plantilla.txt");
        File fichero2 = new File("Carta.txt");
        
        Scanner teclado = new Scanner(System.in);
        
        FileReader leer = new FileReader(fichero1);
        FileWriter escritura = new FileWriter(fichero2);
        BufferedReader br = new BufferedReader(leer);
        
        String linea = null;
        
        System.out.println("Hola introduce tu nombre");
        String nombre = teclado.next();
        System.out.println("Hola introduce tu apellido");
        String apellido = teclado.next();
               
        
        while((linea = br.readLine())!=null){
            for (int i = 0; i < linea.length(); i++) {
                if (linea.contains("$")) {
                    linea.replace("$nombre", nombre);
                    linea.replace("$apellidos", apellido);

                    
                }
                
            }
            escritura.write(linea);
                    escritura.append("\n");
        }
        
        escritura.close();
        leer.close();
    }
}
