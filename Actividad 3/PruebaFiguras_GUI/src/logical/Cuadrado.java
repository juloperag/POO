/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

/**
 *
 * @author julil
 */
public class Cuadrado {
    //Definimos el atributo lado del cuadrado
    int lado; 
    //Costruccion para la clase cuadrado
    public Cuadrado(int lado) 
    {
        this.lado = lado;
    }
    //Aqui definimos los metodos de la clase, los cuales son:
    // Calculo del Area
    public double calcularArea() 
    {
        return lado*lado;
    }
    //Calculo del perimetro
    public double calcularPerimetro() 
    {
        return (4*lado);
    }    
}
