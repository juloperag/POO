/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;
/**
* Esta clase denominada InmuebleVivienda modela un inmueble
* destinado para la vivienda con atributos como el número de
* habitaciones y el número de baños que posee
* @version 1.2/2020
*/
public class InmuebleVivienda extends Inmueble {
    //Atributos de la clase
    protected int númeroHabitaciones;
    protected int númeroBaños;
    
    //Construtor de la clase
    public InmuebleVivienda(int identificadorInmobiliario, int área, String dirección, 
        int númeroHabitaciones, int númeroBaños) {
        super(identificadorInmobiliario, área, dirección); /* Invoca al constructor de la clase padre */
        this.númeroHabitaciones = númeroHabitaciones;
        this.númeroBaños = númeroBaños;
    }
    
    //Metodo de la clase
    void imprimir(){
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de habitaciones = " + númeroHabitaciones);
        System.out.println("Número de baños = " + númeroBaños);
    }    
}
