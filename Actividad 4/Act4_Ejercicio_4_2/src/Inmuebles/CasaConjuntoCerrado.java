package Inmuebles;
/**
* Esta clase denominada CasaConjuntoCerrado modela un tipo
* específico de casa urbana que se encuentra en un conjunto cerrado
* con atributos como el valor por área, valor de la administración y
* valores booleanos para especificar si tiene piscina y campos deportivos.
* @version 1.2/2020
*/
public class CasaConjuntoCerrado extends CasaUrbana {
    //Atributos de la clase     
    protected static double valorArea = 2500000;
    protected int valorAdministración;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;
    
    //Constructor de la clase
    public CasaConjuntoCerrado(int identificadorInmobiliario, int área,
        String dirección, int númeroHabitaciones, int númeroBaños,
        int númeroPisos, int valorAdministración, boolean tienePiscina,
        boolean tieneCamposDeportivos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección,
        númeroHabitaciones, númeroBaños, númeroPisos);
        this.valorAdministración = valorAdministración;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
    
    //Metodos de la clase
    //Método que muestra en pantalla los datos de una casa en conjunto
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = " + valorAdministración);
        System.out.println("Tiene piscina? = " + tienePiscina);
        System.out.println("Tiene campos deportivos? = " + tieneCamposDeportivos);
        System.out.println();
    }
}
