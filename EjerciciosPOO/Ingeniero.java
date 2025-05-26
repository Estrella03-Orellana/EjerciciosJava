package EjerciciosPOO;


public class Ingeniero implements IProfesion {
    private String nombre;
    private String area;
    private double salarioMensualFijo;
    private double bonoPorProyecto;

    public Ingeniero(String nombre, String area, double salarioMensualFijo, double bonoPorProyecto) {
        this.nombre = nombre;
        this.area = area;
        this.salarioMensualFijo = salarioMensualFijo;
        this.bonoPorProyecto = bonoPorProyecto;
    }

    // Implementación obligatoria del método calcularSueldo de la interfaz Profesion
    @Override
    public double calcularSueldo() {
        // Suponemos que el sueldo de un ingeniero es un salario fijo más un bono por proyecto
        return salarioMensualFijo + bonoPorProyecto;
    }

    public void mostrarInfo() {
        System.out.println("\n--- Información del Ingeniero ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Área: " + area);
        System.out.println("Salario Mensual Fijo: $" + salarioMensualFijo);
        System.out.println("Bono por Proyecto: $" + bonoPorProyecto);
        System.out.println("Sueldo Total: $" + calcularSueldo());
    }
}