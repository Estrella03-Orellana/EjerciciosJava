import EjerciciosPOO.Animal;
import EjerciciosPOO.Nivel1;
import EjerciciosPOO.Nivel2;
import EjerciciosPOO.Vehiculo;
import EjerciciosPOO.Automovil;
import EjerciciosPOO.Barco;
import EjerciciosPOO.Doctor;
import EjerciciosPOO.Empleado;
import EjerciciosPOO.Ingeniero;
import EjerciciosPOO.Avion;
import EjerciciosPOO.Persona;


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

        // EJERCICIO 3 POO Crear instancias de la clase Vehiculo y mostrar su
        // información
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
        // ¡Cuidado! En tu código original llamabas mVehiculo.mover() y
        // mAutomovil.mover() dos veces aquí.
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

        // Ejercicio 4 POO Crear instancias de la clase Empleado y mostrar su
        // información
        Empleado empleado1 = new Empleado("Ana García", "EMP001", 800.0, "Desarrollador", 15.0);
        Empleado empleado2 = new Empleado("Luis Pérez", "EMP002", 750.0, "Diseñador", 12.5);

        // Uso de los métodos implementados
        empleado1.registrar(); // Solicita horas trabajadas
        empleado2.registrar(); // Solicita horas trabajadas

        System.out.println("\n--- Resumen de Nómina ---");

        // Mostrar información y sueldo
        empleado1.mostrarDetallesEmpleado();
        System.out.println("\n--------------------------");
        empleado2.mostrarDetallesEmpleado();
        System.out.println("\n--------------------------");

        // Demostración de Polimorfismo:
        // Se puede crear un array de tipo Personal y almacenar objetos Empleado
        Persona[] listaPersonal = new Persona[2];
        listaPersonal[0] = empleado1;
        listaPersonal[1] = empleado2;

        System.out.println("\n--- Acciones a través del tipo Personal (Polimorfismo) ---");
        for (Persona p : listaPersonal) {
            p.mostrarInformacionBasica(); // Llama al método concreto de Personal
            // Llama a la implementación específica de calcularSueldo() del objeto Empleado
            System.out.println("Sueldo Final (Polimorfismo): $" + p.calcularSueldo());
        }

        // Ejercicio 5 POO Crear instancias de la clase Persona y mostrar su información
        System.out.println("*****************EJERCICIO 5 *****************");
        Doctor doctorJuan = new Doctor("Juan Pérez", "Pediatría", 50.0);
        Ingeniero ingenieroAna = new Ingeniero("Ana López", "Software", 3000.0, 500.0);

        // El doctor registra algunas horas de trabajo
        doctorJuan.registrarHoras(160); // 160 horas en el mes (40 por semana * 4 semanas)

        // Mostrar información y calcular sueldo de cada uno
        doctorJuan.mostrarInfo();
        ingenieroAna.mostrarInfo();

        System.out.println("\n--- Cálculo de Sueldos (Polimorfismo con Interfaz) ---");

        
    }
}
