import EjerciciosPOO.Automovil;
import EjerciciosPOO.Avion;
import EjerciciosPOO.Barco;
import EjerciciosPOO.Vehiculo;

public class Main2 {
     public static void main(String[] args) {
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
        mVehiculo.mostrarInfo();
        System.out.println(); 
        mAutomovil.mostrarInfo();
        System.out.println();
        miBarco.mostrarInfo();
        System.out.println();
        miAvion.mostrarInfo();
        System.out.println();

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
