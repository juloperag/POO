/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logical;

/**
 *
 * @author julil
 */
public class Trabajo_Empleado {
        //Atributos
        int codigo_Empleado;
        String nombre_Empleado;
        double horas_trabajadas_Empleado,valor_hora_empleado, porcentaje_retencion_empleado;        
        //Contructor
        Trabajo_Empleado(int a, String b, double c, double d, double e)
        {
            this.codigo_Empleado = a;
            this.nombre_Empleado = b;
            this.horas_trabajadas_Empleado = c;
            this.valor_hora_empleado = d;
            this.porcentaje_retencion_empleado = e;            
        }
        //Metodos
        double salario_bruto()
        {
            return valor_hora_empleado*horas_trabajadas_Empleado;
        }        
        double salario_neto()
        {
            double salario = salario_bruto()*(1-(porcentaje_retencion_empleado/100));           
            return salario;
        }
    
}
