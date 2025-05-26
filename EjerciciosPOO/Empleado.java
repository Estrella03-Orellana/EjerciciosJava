package EjerciciosPOO;
import java.util.Scanner;

public class Empleado extends Persona {
    private String puesto;
    private int horasTrabajadas;
    private double tarifaPorHora;

    // Constructor de la clase Empleado
    public Empleado(String nombre, String id, double sueldoBase, String puesto, double tarifaPorHora) {
        super(nombre, id, sueldoBase); // Llama al constructor de la clase Personal
        this.puesto = puesto;
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = 0; // Se inicializa a 0 y se registra luego
    }

    // Implementación del método abstracto registrar
    @Override
    public void registrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Registrando Empleado: " + nombre + " ---");
        System.out.print("Ingrese las horas trabajadas para " + nombre + ": ");
        this.horasTrabajadas = scanner.nextInt();
        System.out.println("Registro completado para " + nombre + ".");
        // En una aplicación real, aquí guardarías esto en una base de datos o lista.
        // Por simplicidad, solo se almacena en el objeto.
    }

    // Implementación del método abstracto calcularSueldo
    @Override
    public double calcularSueldo() {
        // En este ejemplo, el sueldo se calcula como sueldo base + (horas trabajadas * tarifa por hora)
        double sueldoCalculado = sueldoBase + (horasTrabajadas * tarifaPorHora);
        return sueldoCalculado;
    }

    // Método adicional específico de Empleado
    public void mostrarDetallesEmpleado() {
        mostrarInformacionBasica(); // Llama al método concreto de la clase Personal
        System.out.println("Puesto: " + puesto);
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Tarifa por Hora: $" + tarifaPorHora);
        System.out.println("Sueldo Calculado: $" + calcularSueldo()); // Llama al método implementado
    }
}