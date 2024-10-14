/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicheroTexto;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        File f1 = new File ("C:\\Program Files\\Java\\jdk-21\\bin\\Java.exe");
        File f2 = new File ("C:\\Program Files\\Java\\jdk-22\\bin\\Java.exe");
        
        if(f1.exists()){
            System.out.println("La version de java es la 21");
        }else if(f2.exists()){
            System.out.println("La version de java es la 22");
        }else{
            System.out.println("NO HAY NINGUNO");
        }
    }
}
