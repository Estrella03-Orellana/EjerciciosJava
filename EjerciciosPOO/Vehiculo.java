/* Desarrollar un programa en que se defina la clase principal Vehículo y se creen tres clases 
derivadas de ésta: Automóvil, Barco y Avión; las clases derivadas deberán sobrescribir por lo menos
 un método de la clase principal utilizando polimorfismo. */

package EjerciciosPOO;
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }

    public void tipoVehiculo() {
        System.out.println("Este es un vehículo genérico.");
    }

    
}

