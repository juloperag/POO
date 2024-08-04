/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

/**
 *
 * @author julil
 */
public class TrianguloEquilatero {
    
    //Atributos
    double edge;
    private double area;
    private double perimeter;
    private double height;

    //Definicion de metodos
    public TrianguloEquilatero(){
    }

    public TrianguloEquilatero(double edge) {
        this.edge = edge;
    }
    
    //Definicion de Metodos
    //Calculo del perimetro del triangulo
    public double perimetroTrian(){
        perimeter = 3*edge;
        return perimeter;
    }

    //Calculo de la altura del triangulo
    public double alturaTrian(){
        height= (Math.sqrt(3)/2)*edge;
        return height;
    }

    //Calculo de el area del Triangulo
    public double areaTrian(){
        area=((Math.sqrt(3)/2)*edge*edge)/2;
        return area;
    }
}
