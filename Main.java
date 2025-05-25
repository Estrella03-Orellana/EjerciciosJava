import EjerciciosPOO.Animal;

public class Main {
    public static void main(String[] args) {
        
        // EJERCICIO 1 POO Crear instancias de la clase Animal y mostrar su información
        Animal leon = new Animal("León", "Carnívoro", 4);
        Animal pulpo = new Animal("Pulpo", "Molusco", 8);

        leon.mostrarInformacion();
        System.out.println();
        pulpo.mostrarInformacion();

    }
    
}
