/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_17;

/**
 *
 * @author julil
 */
public class Ejercicio_17 {

    public static void main(String[] args) {
    //Definicion de variables
    double radio, area, longitud_circunferencia;
    //Definicion de valores 
    radio = 15;
    //Calculo de valores
    area = Math.PI*Math.pow(radio, 2);
    longitud_circunferencia = 2*Math.PI*radio;
    //Mostrar por consola
    System.out.println("El Radio es: " + radio);
    System.out.println("El area es: " + area);
    System.out.println("La longitud de la circunferencia es: " + longitud_circunferencia);
    }
}
