package CarreraCiclística;
/**
* Esta clase denominada Escalador es un tipo de Ciclista que se
* encuentra mejor adaptado y se destaca cuando las carreteras son en
* ascenso, ya sea en colinas o montañas. Posee nuevos atributos como
* su aceleración promedio y el grado de rampa que soporta
* @version 1.2/2020
*/
public class Escalador extends Ciclista {
    //Atributos de la clase
    private double aceleraciónPromedio;
    private double gradoRampa;
    
    //Contructor de la clase 
    public Escalador(int identificador, String nombre, double
    aceleraciónPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleraciónPromedio = aceleraciónPromedio;
        this.gradoRampa = gradoRampa;
    }
    
    //Metodos de la clase
    //Método que devuelve la aceleración promedio de un escalador
    public double getAceleraciónPromedio() {   
        return aceleraciónPromedio;
    }   
    //Método que establece la aceleración promedio de un escalador
    public void setAceleraciónPromedio(double aceleraciónPromedio) {
        this.aceleraciónPromedio = aceleraciónPromedio;
    }   
    //Método que devuelve el grado de rampa soportado de un escalador
    public double getGradoRampa() {
        return gradoRampa;
    }   
    //Método que establece el grado de rampa soportado por un escalador
    public void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }
    //Método que muestra en pantalla los datos de un escalador
    protected void imprimir() {
        super.imprimir(); // Invoca el método imprimir de la clase padre
        System.out.println("Aceleración promedio = " + aceleraciónPromedio);
        System.out.println("Grado de rampa = " + gradoRampa);
    }   
    //Método que devuelve el tipo de ciclista
    protected String imprimirTipo() {
        return "Es un escalador";
    }    
}
