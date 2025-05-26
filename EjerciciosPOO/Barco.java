package EjerciciosPOO;

public class Barco extends Vehiculo {
    private String tipoNavegacion; // Cambié el nombre a tipoNavegacion para ser más descriptivo

    public Barco(String nombre, int velocidadMaxima, String tipoNavegacion) {
        super(nombre, velocidadMaxima);
        this.tipoNavegacion = tipoNavegacion;
    }

    @Override
    public void mover() {
        System.out.println("El barco " + nombre + " está navegando por el mar.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la clase padre
        System.out.println("Tipo de Navegación: " + tipoNavegacion);
    }

    @Override
    public void realizarAccionEspecifica() {
        System.out.println("El barco " + nombre + " está anclando en el puerto.");
    }
}
