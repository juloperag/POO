/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

/**
 *
 * @author julil
 */
public class Rectangulo {
    //Definimos los atributos base y altura del rectangulo
    int base;
    int altura;
    //Costruccion para la clase rectangulo
    public Rectangulo(int base, int altura) 
    {
        this.base = base;
        this.altura = altura;
    }
    //Aqui definimos los metodos de la clase, los cuales son:
    //Calculo del Area
    public double calcularArea() 
    {
        return base * altura;
    }
    //Calculo perimetro
    public double calcularPerimetro() 
    {
        return (2 * base) + (2 * altura);
    }   
}
