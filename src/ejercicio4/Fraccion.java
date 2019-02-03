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
public class Fraccion {

    private double denominador;
    private double numerador;

    public Fraccion() {
    }

    public Fraccion(double numerador, double denominador) {
        this.denominador = denominador;
        this.numerador = numerador;
    }
    //Invierte operandos fraccion
    public double invertir() {
        double aux;
        aux = denominador;
        denominador=numerador;
        numerador=aux;
        return aux;

    }
    //Multiplica operandos fraccion
    public double multiplicar(){
        double aux;
        aux = denominador*numerador;
        return aux;
    }
    //Divide operandos fraccion
    public double dividir(){
        double aux;
        aux = denominador/numerador;
        return aux;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }
    
    

}
