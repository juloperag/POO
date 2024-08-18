package CarreraCiclística;
/**
* Esta clase denominada Contrarrelojista es un tipo de Ciclista que se
* encuentra mejor adaptado a las etapas contrarreloj. Posee un nuevo
* atributo: su velocidad máxima
* @version 1.2/2020
*/
public class Contrarrelojista extends Ciclista {
    //Atributos de la clase
    private double velocidadMáxima;
    
    //Constructor de la clase
    public Contrarrelojista(int identificador, String nombre, double
    velocidadMáxima) {
        super(identificador, nombre);
        this.velocidadMáxima = velocidadMáxima;
    }
    
    //Metodos de la clase
    //Método que devuelve la velocidad máxima de un contrarrelojista
    public double getVelocidadMáxima() {    
        return velocidadMáxima;
    }
    //Método que establece la velocidad máxima de un contrarrelojista
    public void setVelocidadMáxima(double velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima; 
    }
    //Método que muestra en pantalla los datos de un contrarrelojista
    protected void imprimir() {
        super.imprimir(); // Invoca el método imprimir de la clase padre
        System.out.println("Aceleración promedio = " + velocidadMáxima);
    }
    //Método que devuelve el tipo de ciclista
    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }    
}
