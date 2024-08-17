package Inmuebles;
/**
* Esta clase denominada CasaIndependiente modela un tipo específico
* de casa urbana que no está en conjunto cerrado y es completamente
* independiente de otras casas. Tiene un atributo estático para
* especificar un valor del área del inmueble.
* @version 1.2/2020
*/
public class CasaIndependiente extends CasaUrbana{
    //Actributos de las clases 
    protected static double valorArea = 3000000;
    
    //Constructor de la clase
    public CasaIndependiente(int identificadorInmobiliario, int área,
        String dirección, int númeroHabitaciones, int númeroBaños, int
        númeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección,
        númeroHabitaciones, númeroBaños, númeroPisos);
    }
    
    //Metodos de la clase
    //Método que muestra en pantalla los datos de una casa independiente
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}   
   
