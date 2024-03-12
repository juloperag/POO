/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.cap4_ejercicio24;

/**
 *
 * @author julil
 */
public class Conjunto_Esferas {
    //Actributos
    double Esp_A, Esp_B, Esp_C;
    //Contructor
    Conjunto_Esferas(double a, double b,double c)
    {
        this.Esp_A = a;
        this.Esp_B = b;
        this.Esp_C = c;
    }
    //Metodos
    void peso()
    {
                //Comparacion de valores
        if(Esp_A==Esp_B)
        {
            if(Esp_B==Esp_C)
            {
                System.out.println("Las esferas son de igual peso");                
            }
            if(Esp_B>Esp_C)
            {
                System.out.println("Las esferas A y B tienen el mismo peso, ademas tienen un peso mayor a la esfera C");        
            }
            else
            {
                System.out.println("La esfera de mayor peso es C");  
            } 
        }          
        else if(Esp_A>Esp_B)
        {
            if(Esp_A>Esp_C)
            {
                System.out.println("La esfera de mayor peso es A");
            }
            else
            {
                System.out.println("La esfera de mayor peso es C");                
            }
        }         
        else if(Esp_B>Esp_C)
        {
            if(Esp_B==Esp_C)
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
