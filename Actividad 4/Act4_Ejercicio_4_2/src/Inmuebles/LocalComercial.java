package Inmuebles;
/**
* Esta clase denominada LocalComercial modela un tipo específico de
* Local destinado para un uso comercial con atributos como el valor
* por área y el centro comercial al cual pertenece.
* @version 1.2/2020
*/
public class LocalComercial extends Local {
    //Actributos de la clase
    protected static double valorArea = 3000000;
    protected String centroComercial;
    
    //Constructor de la clase
    public LocalComercial(int identificadorInmobiliario, int área, String
        dirección, tipo tipoLocal, String centroComercial) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección, tipoLocal);
        this.centroComercial = centroComercial;
    }   
    
    //Metodos de la clase
    //Método que muestra en pantalla los datos de un local comercial
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }   
}
