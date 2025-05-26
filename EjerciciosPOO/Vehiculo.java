/* Desarrollar un programa en que se defina la clase principal Vehículo y se creen tres clases 
derivadas de ésta: Automóvil, Barco y Avión; las clases derivadas deberán sobrescribir por lo menos
 un método de la clase principal utilizando polimorfismo. */

package EjerciciosPOO;
public class Vehiculo {
    protected String nombre;
    protected int velocidadMaxima;

    public Vehiculo(String nombre, int velocidadMaxima) {
        this.nombre = nombre;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mover() {
        System.out.println("El " + nombre + " se está moviendo.");
    }

    public void mostrarInfo() {
        System.out.println("--- Información del Vehículo ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }

    // Método que será sobrescrito por las clases derivadas
    public void realizarAccionEspecifica() {
        System.out.println("El " + nombre + " realiza una acción genérica.");
    }
}

