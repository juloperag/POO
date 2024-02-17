
package com.mycompany.ejercicio_4;

/**
 *
 * @author julil
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        //Definicion de variables
        int edad_Juan, edad_Alberto, edad_Ana, edad_mama;
        //Calculo de edades 
        edad_Juan = 9;
        edad_Alberto = 2*(edad_Juan/3);
        edad_Ana = 4*(edad_Juan/3);
        edad_mama = edad_Alberto+edad_Ana+edad_Juan;
        //Mostrar por consola
        System.out.println("Las edades son: ");
        System.out.println("Alberto: " + edad_Alberto);
        System.out.println("Juan: " + edad_Juan);
        System.out.println("Ana: " + edad_Ana);
        System.out.println("Mama: " + edad_mama);      
    }
}
