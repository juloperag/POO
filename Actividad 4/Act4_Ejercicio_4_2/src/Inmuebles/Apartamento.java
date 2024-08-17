package Inmuebles;
/**
* Esta clase denominada Apartamento modela un tipo de inmueble
* específico destinado para la vivienda.
* @version 1.2/2020
*/
public class Apartamento extends InmuebleVivienda {
    //Contructor de la clase
    public Apartamento(int identificadorInmobiliario, int área, String
        dirección, int númeroHabitaciones, int númeroBaños) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección,
        númeroHabitaciones, númeroBaños);
    }
    
    //Metodos de la clase
    //Método que muestra en pantalla los datos de un apartamento
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
