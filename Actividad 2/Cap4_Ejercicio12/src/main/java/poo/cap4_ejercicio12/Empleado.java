/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.cap4_ejercicio12;

/**
 *
 * @author julil
 */
public class Empleado{
    //Atributos
    String nombre_empleado;
    double horas_trabajadas_empleado,valor_hora_empleado;
    //Contructor
    Empleado(String a, double b, double c)
    {
        this.nombre_empleado = a;
        this.horas_trabajadas_empleado = b;
        this.valor_hora_empleado = c;
    }
    //Metodos
    double pago()
    {
        //Definicion de variabels
        double horas_extra,horas_extra_excedente;
        double pago_total;
        //Calculo del pago total
        if(horas_trabajadas_empleado<=40)
        {
            pago_total = horas_trabajadas_empleado*valor_hora_empleado;
        }
        else if(horas_trabajadas_empleado>40 && horas_trabajadas_empleado<=48)
        {
            horas_extra = horas_trabajadas_empleado-40;
            pago_total = 40*valor_hora_empleado+horas_extra*2*valor_hora_empleado;    
        }
        else
        {
            horas_extra_excedente = horas_trabajadas_empleado-48;
            pago_total = 40*valor_hora_empleado+16*valor_hora_empleado+horas_extra_excedente*3*valor_hora_empleado;             
        }
        
        return pago_total;
    }
    
                    
    
}
