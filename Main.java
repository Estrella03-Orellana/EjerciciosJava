import EjerciciosPOO.Animal;
import EjerciciosPOO.Nivel1;
import EjerciciosPOO.Nivel2;
import EjerciciosPOO.Vehiculo;
import EjerciciosPOO.Automovil;
import EjerciciosPOO.Barco;
import EjerciciosPOO.Avion;


public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1 POO Crear instancias de la clase Animal y mostrar su información
         System.out.println("*****************EJERCICIO 1 *****************");
        Animal leon = new Animal("León", "Carnívoro", 4);
        Animal pulpo = new Animal("Pulpo", "Molusco", 8);

        leon.mostrarInformacion();
        System.out.println();
        pulpo.mostrarInformacion();
        System.out.println();

        // EJERCICIO 2 POO Crear instancias de la clase Juego y mostrar su información
        System.out.println("*****************EJERCICIO 2 *****************");
        Nivel1 objNivel1 = new Nivel1();
        objNivel1.imprimePreguntas(); // Método original de Nivel1

        Nivel2 objNivel2 = new Nivel2();
        objNivel2.imprimePreguntasNivel2(); // Nuevo método para Nivel2

        System.out.println("\n*****************MARCADOR*****************");
        System.out.println("Tu puntaje del Nivel 1 es: " + objNivel1.puntaje);
        System.out.println("Tu puntaje del Nivel 2 es: " + objNivel2.puntaje);

        int puntajeTotal = objNivel1.puntaje + objNivel2.puntaje;
        System.out.println("Tu puntaje acumulado total es: " + puntajeTotal);
        System.out.println();

        // EJERCICIO 3 POO Crear instancias de la clase Vehiculo y mostrar su información
        System.out.println("*****************EJERCICIO 3 *****************");
        Vehiculo mVehiculo = new Vehiculo("Vehículo Genérico", 100);
        Automovil mAutomovil = new Automovil("Toyota Corolla", 180, 4);    
        Barco miBarco = new Barco("Queen Mary 2", 55, "Océano"); // Usando "Océano" como tipoNavegacion
        Avion miAvion = new Avion("Boeing 747", 900, 4);
        System.out.println("--- Demostración de Polimorfismo ---");

        // Llamada al método mover() en cada tipo de vehículo
        // Se ejecuta el método sobrescrito de cada clase derivada
        mVehiculo.mover();
        mAutomovil.mover();
        miBarco.mover();
        miAvion.mover();
        System.out.println();

        // Llamada al método mostrarInfo() en cada tipo de vehículo
        // ¡Cuidado! En tu código original llamabas mVehiculo.mover() y mAutomovil.mover() dos veces aquí.
        // Lo he corregido para llamar a mostrarInfo() como parece que era la intención.
        mVehiculo.mostrarInfo();
        System.out.println(); // Salto de línea para mejor legibilidad entre objetos
        mAutomovil.mostrarInfo();
        System.out.println();
        miBarco.mostrarInfo();
        System.out.println();
        miAvion.mostrarInfo();
        System.out.println();

        // Demostración del polimorfismo con el método sobrescrito
        // Se declara un arreglo de tipo Vehiculo
        Vehiculo[] vehiculos = new Vehiculo[4];
        vehiculos[0] = mVehiculo;
        vehiculos[1] = mAutomovil;
        vehiculos[2] = miBarco;
        vehiculos[3] = miAvion;

        System.out.println("--- Acciones Específicas (Polimorfismo en acción) ---");
        for (Vehiculo v : vehiculos) {
            v.realizarAccionEspecifica(); // Se llama a la versión específica de cada clase
        }
    }


}
