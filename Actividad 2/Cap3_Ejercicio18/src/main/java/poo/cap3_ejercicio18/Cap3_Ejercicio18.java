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
        double horas_trabajadas,valor_hora, salario_bruto;
        double porcentaje_retencion, salario_neto;
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
        
        //Calculo de valores
        salario_bruto = valor_hora*horas_trabajadas;
        salario_neto = salario_bruto-salario_bruto*(porcentaje_retencion/100);
        //Mostrar por consola
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("Salario neto: " + salario_neto);
    }
}
