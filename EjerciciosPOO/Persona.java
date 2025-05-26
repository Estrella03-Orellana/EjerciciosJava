/*  Desarrollar un programa en el que se cree la clase abstracta Personal con los métodos Registrar 
y calcular Sueldo, los cuales deberán ser implementados en una clase que herede de dicha clase abstracta. */

package EjerciciosPOO;
public abstract class Persona {
    protected String nombre;
    protected String id;
    protected double sueldoBase; // Atributo común para calcular sueldo

    // Constructor de la clase abstracta
    public Persona(String nombre, String id, double sueldoBase) {
        this.nombre = nombre;
        this.id = id;
        this.sueldoBase = sueldoBase;
    }

    // Método abstracto para registrar información del personal
    // Las clases que hereden de Personal DEBEN implementar este método
    public abstract void registrar();

    // Método abstracto para calcular el sueldo
    // Las clases que hereden de Personal DEBEN implementar este método
    public abstract double calcularSueldo();

    // Método concreto (no abstracto) que puede ser usado directamente o sobrescrito
    public void mostrarInformacionBasica() {
        System.out.println("\n--- Información Básica del Personal ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Sueldo Base: $" + sueldoBase);
    }
}