/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

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
    public double calcularArea() 
    {
        return (base * altura / 2);
    }
    //Calculo del perimetro
    public double calcularPerimetro() 
    {
        return (base + altura + calcularHipotenusa()); 
    }
    //Hipotenusa de un triangulo
    double calcularHipotenusa()
    {
        return Math.pow(base*base + altura*altura, 0.5);
    }
    //Metodo para determinar si es un triangulo equilatero, escaleno o isosceles
    public int determinarTipoTriangulo() 
    {
        //Definimos variable para indicar el valor
        int value = 0;
        //Comparacion
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
        == calcularHipotenusa())){
            value = 0; /* Todos sus
            lados son iguales */
        }
        else if ((base != altura) && (base != calcularHipotenusa()) &&
        (altura != calcularHipotenusa())){
            value = 1; /* Todos sus
            lados son diferentes */
        }
        else{
            value = 2; /* De otra
            manera, es isósceles */
        }
        
        return value;
    }
     
}
