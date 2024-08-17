package Inmuebles;
/**
* Esta clase denominada Apartaestudio modela un tipo específico de
* apartamento que tiene una sola habitación.
* @version 1.2/2020
*/
public class Apartaestudio extends Apartamento {
    //Actributos de la clase    
    protected static double valorArea = 1500000;
    
    //Constructor de la clase
    public Apartaestudio(int identificadorInmobiliario, int área, String
        dirección, int númeroHabitaciones, int númeroBaños) {
        // Invoca al constructor de la clase padre
        // Los apartaestudios tienen una sola habitación y un solo baño
        super(identificadorInmobiliario, área, dirección, 1, 1);
    }
    
    //Metodos de la clase
    //Método que muestra en pantalla los datos de un apartaestudio
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }   
}
