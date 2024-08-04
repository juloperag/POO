/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

public class Estudiante {
  
    //Definimos deatributo
    int ni;
    String nombre;
    double patrimonio;
    int estrato_social;
    private double pag_Matricula;

    //Definicion del contructor
    public Estudiante(){    
    }
    public Estudiante(int ni, String nombre, double patrimonio, int estrato_social) {
        this.ni = ni;
        this.nombre = nombre;
        this.patrimonio = patrimonio;
        this.estrato_social = estrato_social;
    }
    
    //Definimos los metodos
    //Metodo del calculo de la matricula
    public double calcMat() {
        //Valor minimo de matricula
        pag_Matricula=50000;
        //Excedente dependiente del estado socioeconomico
        if(patrimonio>2000000 & estrato_social>3){
            pag_Matricula += patrimonio*0.03; //mas 3% del patrimonio
        }
        return  pag_Matricula;
    }
}
