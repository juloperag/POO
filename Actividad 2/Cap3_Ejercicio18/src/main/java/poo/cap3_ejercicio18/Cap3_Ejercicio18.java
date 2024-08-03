/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.cap3_ejercicio18;

/**
 *
 * @author julil
 */

import java.util.Scanner;

public class Cap3_Ejercicio18 {
    public static void main(String[] args) {
        //Definimos una instancia para leer por consola
        Scanner output = new Scanner(System.in);
        
        //Definicion de variables
        int codigo; 
        String nombre;
        double horas_trabajadas,valor_hora;
        double porcentaje_retencion;
        //Lectura por consola de las variables
        System.out.println("Ingrese el codigo del empleado: ");
        codigo = output.nextInt();
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = output.next();        
        System.out.println("Ingrese las horas trabajadas al mes por el empleado: ");
        horas_trabajadas = output.nextDouble();
        System.out.println("Ingrese el valor por hora de trabajo: ");
        valor_hora = output.nextDouble();
        System.out.println("Ingrese el porcentaje de retencion en la fuente: ");
        porcentaje_retencion = output.nextDouble();
        //Creamos un objeto para el calculo de los valores
        Trabajo_Empleado empleado = new Trabajo_Empleado(codigo, nombre, horas_trabajadas, valor_hora, porcentaje_retencion);
        //Mostrar por consola
        System.out.println("Codigo: " + empleado.codigo_Empleado);
        System.out.println("Nombre: " + empleado.nombre_Empleado);
        System.out.println("Salario bruto: " + empleado.salario_bruto());
        System.out.println("Salario neto: " + empleado.salario_neto());
    }
}
