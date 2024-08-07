/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

/**
 *
 * @author julil
 */
public class Circulo {
    //Definimos el atributo radio
    int radio; 
    //Costruccion para la clase circulo
    public Circulo() {
    }
    public Circulo(int radio) {
        this.radio = radio;
    }   
    //Aqui definimos los metodos de la clase, los cuales son:
    // Calculo del Area
    public double calcularArea()
    {
        return Math.PI*Math.pow(radio,2);
    }
    //Calculo del Perimetro
    public double calcularPerimetro() 
    {
        return 2*Math.PI*radio;
    } 
}
