/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

public class Estudiante {
  
    //Definimos deatributo
	//Definimos los atributos socioeconomicos del Estudiante;
	//Numero de inscripcion
	int ni;
	String nom;
	double pat;
	int est;
	private double pagMat;


    //Definicion del contructor
    public Estudiante(){    
    }
    public Estudiante(int ni, String nombre, double patrimonio, int estrato_social) {
        this.ni = ni;
        this.nom = nombre;
        this.pat = patrimonio;
        this.est = estrato_social;
    }
    
    //Definimos los metodos
    //Metodo del calculo de la matricula
    public double calcMat() {
        //Valor minimo de matricula
        pagMat=50000;
        //Excedente dependiente del estado socioeconomico
        if(pat>2000000 & est>3){
            pagMat += pat*0.03; //mas 3% del patrimonio
        }
        return  pagMat;
    }
}
