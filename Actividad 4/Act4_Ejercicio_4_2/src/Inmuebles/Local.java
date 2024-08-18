package Inmuebles;
/**
* Esta clase denominada Local modela un tipo específico de inmueble
* que no está destinado para la vivienda que tiene como atributos un
* tipo que especifica si es un local interno o que da a la calle.
* @version 1.2/2020
*/
public class Local extends Inmueble{
    //Actributos de la clase
    enum tipo {INTERNO,CALLE};
    protected tipo tipoLocal;
    
    //Constructor de la clase
    public Local(int identificadorInmobiliario, int área, String dirección,
        tipo tipoLocal) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección);
        this.tipoLocal = tipoLocal;
    }
    
    //Metodos de la clase
    //Método que muestra en pantalla los datos de un local
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Tipo de local = " + tipoLocal);
    }    
}
