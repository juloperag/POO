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
        double horas_extra,horas_extra_excedente;
        double pago_total;
        //Lectura por consola de las variables
        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = output.next();        
        System.out.println("Ingrese las horas trabajadas al mes por el trabajador: ");
        horas_trabajadas = output.nextDouble();
        System.out.println("Ingrese el valor por hora de trabajo: ");
        valor_hora = output.nextDouble();
        //Calculo del pago total
        if(horas_trabajadas<=40)
        {
            pago_total = horas_trabajadas*valor_hora;
        }
        else if(horas_trabajadas>40 && horas_trabajadas<=48)
        {
            horas_extra = horas_trabajadas-40;
            pago_total = 40*valor_hora+horas_extra*2*valor_hora;    
        }
        else
        {
            horas_extra_excedente = horas_trabajadas-48;
            pago_total = 40*valor_hora+16*valor_hora+horas_extra_excedente*3*valor_hora;             
        }
                      
        //mostramos por consola el pago total
         System.out.println("Nombre trabajador: " + nombre);
        System.out.println("El pago total del trabajador es: " + pago_total);
    }
}
