/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author FP
 */
public class Principal {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fichero = new File("fichero.txt");
        FileReader lectura = new FileReader(fichero);
        BufferedReader bf = new BufferedReader(lectura);

        String linea = null;
        String parrafoSin;
        int caracterSin = 0;
        int caracter = 0;
        int parrafos = 0;
        int espacios = 0;

        double lineasD = 0.0;

        while ((linea = bf.readLine()) != null) {
            parrafos++;
            caracter += linea.length();
            parrafoSin = linea;
            parrafoSin = parrafoSin.replace(" ", "");
            caracterSin += parrafoSin.length();

            //cont lineas con redondeo
            int i;
            for (i = 0; i <= linea.length(); i++) {
                
            }

        }
        lineasD = (double) caracter/95;
        int lineasFinal = (int) Math.ceil(lineasD);
        
        System.out.println("Total de caracteres " + caracter);
        System.out.println("Total de caracteres sin " + caracterSin);
        System.out.println("Numero de parrafos " + parrafos);
        System.out.println("Numero de lineas "+lineasFinal);
        System.out.println(espacios);

    }
}
