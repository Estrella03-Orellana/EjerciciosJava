/* Desarrollar una aplicación Java que implemente la clase Animal. Las propiedades que debe tener son:
nombre, orden, extremidades debidamente encapsuladas. Para ello, la clase Animal debe ser creada dentro
del mismo documento de la clase que la implementará. */ 

package EjerciciosPOO;
public class Animal {

    private String nombre;
    private String orden;
    private int extremidades;

    public Animal(String nombre, String orden, int extremidades) {
        this.nombre = nombre;
        this.orden = orden;
        this.extremidades = extremidades;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Orden: " + orden);
        System.out.println("Extremidades: " + extremidades);
    }
    
    }


