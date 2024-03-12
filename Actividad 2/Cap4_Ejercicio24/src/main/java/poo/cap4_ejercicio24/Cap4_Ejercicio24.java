/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.cap4_ejercicio24;

/**
 *
 * @author julil
 */

/*
 Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es
la esfera de mayor peso.
*/
import java.util.Scanner;

public class Cap4_Ejercicio24 {

    public static void main(String[] args){
        //Definimos una instancia para leer por consola
        Scanner output = new Scanner(System.in);
        //Definicion de variables
        double A,B,C;
        //Lectura por consola de las variables
        System.out.println("Ingrese el peso de la esfera A: ");
        A = output.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        B = output.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        C = output.nextDouble();
        //Definimos un objeto para el conjunto de esferas
        Conjunto_Esferas esferas = new Conjunto_Esferas(A, B, C);
        //Comparamos los pesos de las esferas 
        esferas.peso();     
    }
}
