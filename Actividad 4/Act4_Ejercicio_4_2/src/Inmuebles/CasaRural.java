package Inmuebles;
/**
* Esta clase denominada CasaRural modela un tipo específico de casa
* ubicada en el sector rural
* @version 1.2/2020
*/
public class CasaRural extends Casa {
    //Actributos de la clase
    protected static double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altitud;
    
    //Constructor de la clase
    public CasaRural(int identificadorInmobiliario, int área, String
        dirección, int númeroHabitaciones, int númeroBaños, int
        númeroPisos, int distanciaCabera, int altitud){
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección,
        númeroHabitaciones, númeroBaños, númeroPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }
    
    //Metodos de la clase
    //Método que muestra en pantalla los datos de una casa rural

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Distancia la cabecera municipal = " + númeroHabitaciones + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros.");
        System.out.println();
    }    
}
    
   