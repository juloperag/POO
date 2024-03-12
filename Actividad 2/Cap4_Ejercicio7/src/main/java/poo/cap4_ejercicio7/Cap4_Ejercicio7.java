/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.cap4_ejercicio7;

/**
 *
 * @author julil
 */
import java.util.Scanner;

public class Cap4_Ejercicio7 {

    public static void main(String[] args) {
        //Definimos una instancia para leer por consola
        Scanner output = new Scanner(System.in);
        //Definicion de variables
        double A,B;
        //Lectura por consola de las variables
        System.out.println("Ingrese el valor A: ");
        A = output.nextDouble();
        System.out.println("Ingrese el valor B: ");
        B = output.nextDouble();
        //Definimos un objeto para el par de valores
        Par_valores par = new Par_valores(A, B);
        //Comparacion de valores
        par.mayor();       
    }
}
