/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pruebafiguras;

/**
 *
 * @author julil
 */
public class TrianguloRectangulo {
    //Definimos los atributos base y altura del Triangulorectangulo
    int base;
    int altura;
    //Costruccion para la clase Triangulorectangulo
    public TrianguloRectangulo(int base, int altura) 
    {
    this.base = base;
    this.altura = altura;
    }
    //Aqui definimos los metodos de la clase, los cuales son:
    // Calculo del Area
    double calcularArea() 
    {
    return (base * altura / 2);
    }
    //Calculo del perimetro
    double calcularPerimetro() 
    {
    return (base + altura + calcularHipotenusa()); 
    }
    //Hipotenusa de un triangulo
    double calcularHipotenusa()
    {
    return Math.pow(base*base + altura*altura, 0.5);
    }
    //Metodo para determinar si es un triangulo equilatero, escaleno o isosceles
    void determinarTipoTriangulo() 
    {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
        == calcularHipotenusa()))
        System.out.println("Es un triángulo equilátero"); /* Todos sus
        lados son iguales */
        else if ((base != altura) && (base != calcularHipotenusa()) &&
        (altura != calcularHipotenusa()))
        System.out.println("Es un triángulo escaleno"); /* Todos sus
        lados son diferentes */
        else
        System.out.println("Es un triángulo isósceles"); /* De otra
        manera, es isósceles */
    }
     
}
