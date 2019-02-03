/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Sergio
 */
import java.util.Scanner;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Fraccion fraccion = new Fraccion();
        fraccion.setNumerador(4);
        fraccion.setDenominador(5);
        
        fraccion.invertir();
        System.out.println(fraccion.multiplicar());
        System.out.println(fraccion.dividir());
    }
    
}
