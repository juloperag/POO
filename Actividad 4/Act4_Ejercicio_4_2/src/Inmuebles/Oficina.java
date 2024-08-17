package Inmuebles;
/**
* Esta clase denominada Oficina modela un tipo específico de local
* con atributos como el valor por área y un valor booleano para
* determinar si pertenece o no al gobierno.
* @version 1.2/2020
*/
public class Oficina extends Local{
    //Atributos de la clase
    protected static double valorArea = 3500000;
    protected boolean esGobierno;
    
    //Constructor de la clase
    public Oficina(int identificadorInmobiliario, int área, String
        dirección, tipo tipoLocal, boolean esGobierno) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección, tipoLocal);
        this.esGobierno = esGobierno;
    }
    
    //Metodos de la clase
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
    }   
}
