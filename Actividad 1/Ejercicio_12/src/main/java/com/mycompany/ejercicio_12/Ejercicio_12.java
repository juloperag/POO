
package com.mycompany.ejercicio_12;

/**
 *
 * @author julil
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        //Definicion de variables
        double horas_trabajadas,salario_hora, salario_bruto;
        double retencion_fuente, salario_neto;
        //Asignacion de valor
        horas_trabajadas = 48;
        salario_hora = 5000;
        //Calculo de valores
        salario_bruto = salario_hora*horas_trabajadas;
        retencion_fuente = salario_bruto*0.125;
        salario_neto = salario_bruto-retencion_fuente;
        //Mostrar por consola
        System.out.println("Las horas trabajadas son: " + horas_trabajadas);
        System.out.println("El salario por hora: " + salario_hora);
        System.out.println("El salario bruto es: " + salario_bruto);
        System.out.println("La retencion en la fuente es: " + retencion_fuente);
        System.out.println("El salario neto es: " + salario_neto);
    }
}
