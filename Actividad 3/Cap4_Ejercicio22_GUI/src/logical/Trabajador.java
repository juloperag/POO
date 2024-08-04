/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

public class Trabajador {
  
    //Definimos los atributos de la clase
    public String nombreEmpleado;
    public float salBasicoph;
    public float horasMensuales;
    public float salarioMensual;
    
    //Definimos el contrutor
    public Trabajador() {
    }
    public Trabajador(String nombreEmpleado, float salBasicoph, float horasMensuales) {
        this.nombreEmpleado = nombreEmpleado;
        this.salBasicoph = salBasicoph;
        this.horasMensuales = horasMensuales;
        salarioMensual = salBasicoph * horasMensuales;
    }
    
    //Definimos los Metodos de la clase    
    public int condTrabajador (){       
        //Vairable auxiliar
        int value = 0;
        //Condicion de salario
        if (salarioMensual > 450000){
            
            value = 0;
        }else{
            
            value = 1;         
        }       
        return value;
    }
}
