/* Desarrollar una aplicación Java que implemente la clase Animal. Las propiedades que debe tener son:
nombre, orden, extremidades debidamente encapsuladas. Para ello, la clase Animal debe ser creada dentro
del mismo documento de la clase que la implementará. */

package EjerciciosPOO;
public class Ejercicio2POO {
    public static void main(String[] args) {
        Animal animal = new Animal("Gato", "Carnívoro", 4);
        System.out.println("Nombre: " + animal.getNombre());
        System.out.println("Orden: " + animal.getOrden());
        System.out.println("Extremidades: " + animal.getExtremidades());
    }

    static class Animal {
        private String nombre;
        private String orden;
        private int extremidades;

        public Animal(String nombre, String orden, int extremidades) {
            this.nombre = nombre;
            this.orden = orden;
            this.extremidades = extremidades;
        }

        public String getNombre() {
            return nombre;
        }

        public String getOrden() {
            return orden;
        }

        public int getExtremidades() {
            return extremidades;
        }
    }

}
