/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.cap4_ejercicio7;

/**
 *
 * @author julil
 */
public class Par_valores {
        //Actributos
    double esf_A;
    double esf_B;
    //Construtor
    Par_valores(double a,double b)
    {
        this.esf_A = a;
        this.esf_B = b;
    }
    //Metodos
    void mayor()
    {
        if(esf_A>esf_B)
        {
            System.out.println("A es mayor que B");
        }
        else if(esf_A==esf_B)
        {
            System.out.println("A es igual que B");            
        }
        else
        {
            System.out.println("A es menor que B");        
        }
    }  
    
}
