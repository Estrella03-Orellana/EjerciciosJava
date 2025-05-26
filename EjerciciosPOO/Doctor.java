package EjerciciosPOO;

public class Doctor implements IProfesion {
    private String nombre;
    private String especialidad;
    private int horasTrabajadas;
    private double tarifaConsulta; // Tarifa por consulta para doctores

    public Doctor(String nombre, String especialidad, double tarifaConsulta) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.tarifaConsulta = tarifaConsulta;
        this.horasTrabajadas = 0; // Se establece al registrar las horas
    }

    // Método para simular el registro de horas o consultas
    public void registrarHoras(int horas) {
        this.horasTrabajadas = horas;
        System.out.println(nombre + " (" + especialidad + ") ha registrado " + horas + " horas de trabajo.");
    }

    // Implementación obligatoria del método calcularSueldo de la interfaz Profesion
    @Override
    public double calcularSueldo() {
        // Suponemos que el sueldo de un doctor se basa en sus horas trabajadas y una tarifa por consulta
        return horasTrabajadas * tarifaConsulta * 4; // Por ejemplo, 4 semanas al mes
    }

    public void mostrarInfo() {
        System.out.println("\n--- Información del Doctor ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Tarifa por Consulta: $" + tarifaConsulta);
        System.out.println("Horas Registradas: " + horasTrabajadas);
        System.out.println("Sueldo Estimado: $" + calcularSueldo());
    }
}