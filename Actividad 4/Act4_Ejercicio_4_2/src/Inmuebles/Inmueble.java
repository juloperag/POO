/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;
/**
* Esta clase denominada Inmueble modela un inmueble que posee
* como atributos un identificador, un área, una dirección y un precio
* de venta. Es la clase raíz de una jerarquía de herencia.
* @version 1.2/2020
*/
public class Inmueble {
    //Actributos de la clase
    protected int identificadorInmobiliario;
    protected int área; 
    protected String dirección; 
    protected double precioVenta;
    
    //Construtor de la clase
    Inmueble(int identificadorInmobiliario, int área, String dirección){
    this.identificadorInmobiliario = identificadorInmobiliario;
    this.área = área;
    this.dirección = dirección;
    }
    
    //Metodos de la clase
    //Método que a partir del valor del área de un inmueble, calcula su precio de venta
    double calcularPrecioVenta(double valorArea) {
        precioVenta = área * valorArea;
        return precioVenta;
    }
    //Método que muestra en pantalla los datos de un inmueble
  
    void imprimir() {
        System.out.println("Identificador inmobiliario = " + identificadorInmobiliario);
        System.out.println("Area = " + área);
        System.out.println("Dirección = " + dirección);
        System.out.println("Precio de venta = $" + precioVenta);
    }

}
