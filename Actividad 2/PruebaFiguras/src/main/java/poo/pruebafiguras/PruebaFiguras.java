/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.pruebafiguras;

/**
 *
 * @author julil
 */

import java.util.Scanner;

public class PruebaFiguras {

    public static void main(String[] args) {
        
        //Definimos una clase para leer por teclado
        Scanner output = new Scanner(System.in);
        
        //Leemos por teclado
        System.out.println("Ingrese el valor del radio del circulo :");
        int radio = output.nextInt();
        //Creamos la instancia 
        Circulo figura1 = new Circulo(radio);
        
        //Leemos por teclado
        System.out.println("Ingrese el valor de la base del retangulo :");
        int base = output.nextInt();
        System.out.println("Ingrese el valor de la altura del retangulo :");
        int altura = output.nextInt();
        //Creamos la instancia 
        Rectangulo figura2 = new Rectangulo(base,altura);
        
        //Leemos por teclado
        System.out.println("Ingrese el valor del lado del cuadrado :");
        int lado = output.nextInt();
        //Creamos la instancia 
        Cuadrado figura3 = new Cuadrado(lado);
        
        //Leemos por teclado
        System.out.println("Ingrese el valor de la base del TrianguloRectangulo :");
        int base_TR = output.nextInt();
        System.out.println("Ingrese el valor de la altura del TrianguloRectangulo :");
        int altura_TR = output.nextInt();
        //Creamos la instancia        
        TrianguloRectangulo figura4 = new TrianguloRectangulo(base_TR,altura_TR);
        
        //Imprimimos caracteristicas de las figuras por medio de los metodos de cada clase
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = "  + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo(); 
    }
}
