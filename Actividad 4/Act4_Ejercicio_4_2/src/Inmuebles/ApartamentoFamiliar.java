package Inmuebles;
/**
* Esta clase denominada ApartamentoFamiliar modela un tipo
* específico de apartamento con atributos como el valor por área y el
* valor de la administración.
* @version 1.2/2020
*/
public class ApartamentoFamiliar extends Apartamento {
    //Actributos de la clase
    protected static double valorArea = 2000000;
    protected int valorAdministración;
    
    //Constructor de la clase 
    public ApartamentoFamiliar(int identificadorInmobiliario, int area,
        String direccion, int numeroHabitaciones, int numeroBaños, int valorAdministración){
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorAdministración = valorAdministración;
    }

    //Metodos de la clase 
    //Método que muestra en pantalla los datos de un apartamento familiar

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = $" + valorAdministración);
        System.out.println();
    }      
}
