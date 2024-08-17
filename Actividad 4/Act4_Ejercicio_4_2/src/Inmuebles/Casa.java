package Inmuebles;
/**
* Esta clase denominada Casa modela un tipo específico de inmueble
* destinado para la vivienda con atributos como el número de pisos
* que tiene una casa.
* @version 1.2/2020
*/
public class Casa extends InmuebleVivienda {
    //Actributos de la clase
    protected int númeroPisos;
    
    //Constructor de la clase
    public Casa(int identificadorInmobiliario, int área, String dirección,
        int númeroHabitaciones, int númeroBaños, int númeroPisos){
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección,
        númeroHabitaciones, númeroBaños);
        this.númeroPisos = númeroPisos;
    }
    
    //Metodos de la clase
    //Método que muestra en pantalla los datos de una casa
    void imprimir(){
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de pisos = " + númeroPisos);
    }
}