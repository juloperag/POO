/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

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
    int mayor()
    {
        //Crear variable
        int value = 0;
        //Comparacion
        if(esf_A>esf_B)
        {
        
            value = 0;
        }
        else if(esf_A==esf_B)
        {
            value = 1;           
        }
        else
        {
            value = 2;  
        }
        
        return value;
    }  
    
}
