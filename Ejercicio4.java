/* Elaborar un programa que permita almacenar 10 números cualquiera
en un vector llamado “números” y que posteriormente muestre el
mayor y el menor valor ingresado. */

public class Ejercicio4 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int mayor = Integer.MIN_VALUE; // Inicializar con el valor más pequeño posible
        int menor = Integer.MAX_VALUE; // Inicializar con el valor más grande posible

        // Llenar el vector con números enteros
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100); // Genera números aleatorios entre 0 y 99
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);

            // Actualizar mayor y menor
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar el mayor y menor valor ingresado
        System.out.println("El mayor valor ingresado es: " + mayor);
        System.out.println("El menor valor ingresado es: " + menor);
    }
}
