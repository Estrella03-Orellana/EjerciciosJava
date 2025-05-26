package EjerciciosPOO;

public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String nombre, int velocidadMaxima, int numeroPuertas) {
        super(nombre, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mover() {
        System.out.println("El automóvil " + nombre + " está circulando por la carretera.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la clase padre
        System.out.println("Número de Puertas: " + numeroPuertas);
    }

    @Override
    public void realizarAccionEspecifica() {
        System.out.println("El automóvil " + nombre + " está estacionándose.");
    }
}
