package Inmuebles;
/**
* Esta clase denominada CasaUrbana modela un tipo específico de casa
* destinada para la vivienda localizada en el sector urbano.
* @version 1.2/2020
*/
public class CasaUrbana extends Casa {
    //Contructor de la Clase
    public CasaUrbana(int identificadorInmobiliario, int área, String
        dirección, int númeroHabitaciones, int númeroBaños, int
        númeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección,
        númeroHabitaciones, númeroBaños, númeroPisos);
    }
    
    //Metodos de la clase
    //Método que muestra en pantalla los datos de una casa urbana
    void imprimir(){
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }   
}
