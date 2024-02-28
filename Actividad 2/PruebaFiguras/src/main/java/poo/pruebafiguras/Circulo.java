/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pruebafiguras;

/**
 *
 * @author julil
 */
public class Circulo {
    //Definimos el atributo radio
    int radio; 
    //Costruccion para la clase circulo
    Circulo(int radio) {
    this.radio = radio;
    }
    }
    //Aqui definimos los metodos de la clase
    double calcularArea(){
    return Math.PI*Math.pow(radio,2);
    }

    double calcularPerímetro() {
    return 2*Math.PI*radio;
    } 
}
