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
        //Comparacion de valores
        if(A==B)
        {
            if(B==C)
            {
                System.out.println("Las esferas son de igual peso");                
            }
            if(B>C)
            {
                System.out.println("Las esferas A y B tienen el mismo peso, ademas tienen un peso mayor a la esfera C");        
            }
            else
            {
                System.out.println("La esfera de mayor peso es C");  
            } 
        }          
        else if(A>B)
        {
            if(A>C)
            {
                System.out.println("La esfera de mayor peso es A");
            }
            else
            {
                System.out.println("La esfera de mayor peso es C");                
            }
        }         
        else if(B>C)
        {
            if(B==C)
            {
                System.out.println("Las esferas B y C tienen el mismo peso, ademas tienen un peso mayor a la esfera A");                  
            }
            else
            {
                System.out.println("La esfera de mayor peso es B");  
            }     
        }
        else
        {
            System.out.println("La esfera de mayor peso es C");  
        }       
    }
}
