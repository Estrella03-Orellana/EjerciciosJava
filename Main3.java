import EjerciciosPOO.Empleado;
import EjerciciosPOO.Persona;

public class Main3 {

    public static void main(String[] args) {

       // Ejercicio 4 POO Crear instancias de la clase Empleado y mostrar su información
        System.out.println("*****************EJERCICIO 4 *****************");
        Empleado empleado1 = new Empleado("Ana García", "EMP001", 800.0, "Desarrollador", 15.0);
        Empleado empleado2 = new Empleado("Luis Pérez", "EMP002", 750.0, "Diseñador", 12.5);

        // Uso de los métodos implementados
        empleado1.registrar();
        empleado2.registrar(); 

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
            p.mostrarInformacionBasica(); // Llama al método concreto de Persona
            // Llama a la implementación específica de calcularSueldo() del objeto Empleado
            System.out.println("Sueldo Final (Polimorfismo): $" + p.calcularSueldo());
        }


    }
}
