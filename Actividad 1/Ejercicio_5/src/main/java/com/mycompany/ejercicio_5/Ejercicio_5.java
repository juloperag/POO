
package com.mycompany.ejercicio_5;
/**
 *
 * @author julil
 */
public class Ejercicio_5 {

    public static void main(String[] args) {
        //Definicion de variables
        double suma, x, y;
        //Asignacion de valor
        suma = 0;
        x = 20;
        y = 40;
        //Calculo de valores
        suma = suma+x;
        x = x + Math.pow(y, 2);
        suma = suma+(x/y);
        //Mostramos por pantalla
        System.out.println("El valor de la suma es: " +suma);
    }
}
