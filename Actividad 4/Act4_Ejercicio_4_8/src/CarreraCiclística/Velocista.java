package CarreraCiclística;
/**
* Esta clase denominada Velocista es un tipo de Ciclista caracterizado
* por poseer gran potencia y alta velocidad punta en esfuerzos cortos.
* Posee nuevos atributos como la potencia promedio y la velocidad
* promedio
* @version 1.2/2020
*/
public class Velocista extends Ciclista{
    //Atributos de la clase
    private double potenciaPromedio;
    private double velocidadPromedio;
    
    //Constructor de la clase
    public Velocista(int identificador, String nombre, double
    potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }
    
    //Metodos de la clase
    //Método que devuelve la potencia promedio de un velocista
    protected double getPotenciaPromedio() {
        return potenciaPromedio;
    }
    //Método que establece la potencia promedio de un velocista
    protected void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }
    //Método que devuelve la velocidad promedio de un velocista
    protected double getvelocidadPromedio() {
        return velocidadPromedio;
    }
    //Método que establece la velocidad promedio de un velocista
    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    //Método que muestra en pantalla los datos de un velocista
    protected void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Potencia promedio = " + potenciaPromedio);
        System.out.println("Velocidad promedio = " + velocidadPromedio);
    }
    //Método que devuelve el tipo de ciclista
    protected String imprimirTipo() {
        return "Es un velocista";
    }    
}
