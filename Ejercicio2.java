/* Elaborar un programa que permita almacenar 12 números enteros
en un vector llamado “números” y que posteriormente muestre el
promedio de los números ingresados. */

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] numeros = new int[12];
        int suma = 0;

        // Llenar el vector con números enteros
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100); // Genera números aleatorios entre 0 y 99
            suma += numeros[i];
        }

        // Calcular el promedio
        double promedio = (double) suma / numeros.length;

        // Mostrar el promedio
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}
