package EjerciciosPOO;

public class Avion extends Vehiculo {
    private int numeroMotores;

    public Avion(String nombre, int velocidadMaxima, int numeroMotores) {
        super(nombre, velocidadMaxima);
        this.numeroMotores = numeroMotores;
    }

    @Override
    public void mover() {
        System.out.println("El avión " + nombre + " está despegando.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la clase padre
        System.out.println("Número de Motores: " + numeroMotores);
    }

    @Override
    public void realizarAccionEspecifica() {
        System.out.println("El avión " + nombre + " está aterrizando.");
    }
}