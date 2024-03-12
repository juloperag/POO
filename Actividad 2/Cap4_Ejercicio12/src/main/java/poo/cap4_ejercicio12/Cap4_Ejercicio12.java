/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.cap4_ejercicio12;

/**
 *
 * @author julil
 */

import java.util.Scanner;


public class Cap4_Ejercicio12 {

    public static void main(String[] args) {
        //Definimos una instancia para leer por consola
        Scanner output = new Scanner(System.in);
        
        //Definicion de variables
        String nombre;
        double horas_trabajadas,valor_hora;
        //Lectura por consola de las variables
        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = output.next();        
        System.out.println("Ingrese las horas trabajadas al mes por el trabajador: ");
        horas_trabajadas = output.nextDouble();
        System.out.println("Ingrese el valor por hora de trabajo: ");
        valor_hora = output.nextDouble();    
        //Definimos un objeto para calcular el pago total
        Empleado empleado = new Empleado(nombre, horas_trabajadas, valor_hora);
        //mostramos por consola el pago total
         System.out.println("Nombre trabajador: " + empleado.nombre_empleado);
        System.out.println("El pago total del trabajador es: " + empleado.pago());
    }
}
