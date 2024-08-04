/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

/**
 *
 * @author julil
 */
public class Ecuacion2Grado {
    //Definimos los Abributos
    //los coeficiente de la ecuacion de segundo grado
    /*Ax²+Bx+C=0*/
    private double A;
    private double B;
    private double C;
    //Definimos variables para almacenar lso resultados de una ecuacion cuadratica
    public double realPart1;
    public double imgPart1;
    public double realPart2;
    public double imgPart2;

    //Definimos el contructor
    public Ecuacion2Grado(){
    }
    public Ecuacion2Grado(double a, double b, double c) {
        this.A=a;
        this.B=b;
        this.C=c;
    }


    //Definicion de metodos
    /**definimos un metodo para la solucion de la ecuacion
    * que imprima las soluciones
    */
    int solucionEcuacion(){
        //Definimos una variable para saber si la solucion tiene parte imaginaria
        double imgDet=Math.pow(B, 2)-4*A*C;
        //Definimos variable para un boleano de si la solucion es imaginaria o no
        int value;
        //Evaluamos si tiene parte imaginaria
        if(imgDet<0){
            realPart1=-B/(2*A);
            imgPart1=Math.sqrt(Math.abs(imgDet))/(2*A);
            realPart2=realPart1;
            imgPart2=imgPart1;
            //Definimos valor
            value = 0;
                    
        }
        //Si no tiene parte imaginaria
        else{
            realPart1=(-B+Math.sqrt(imgDet))/(2*A);
            realPart2=(-B-Math.sqrt(imgDet))/(2*A);
            //Definimos valor
            value = 1;
        }
        
        return value;
    }

}
