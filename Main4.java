import EjerciciosPOO.Doctor;
import EjerciciosPOO.Ingeniero;

public class Main4 {
    public static void main(String[] args) {

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

        // Usando la interfaz SueldoCalculable para calcular sueldos
        System.out.println("Sueldo del Doctor Juan: $" + doctorJuan.calcularSueldo());
        System.out.println("Sueldo del Ingeniero Ana: $" + ingenieroAna.calcularSueldo());
    }

}