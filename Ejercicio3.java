/* Elaborar un programa que permita almacenar 12 números enteros en un vector llamado “números” 
y que posteriormente muestre la cantidad de números pares e impares contenidos en el vector. */
public class Ejercicio3 {

    public static void main(String[] args) {
        int[] numeros = new int[12];
        int cantidadPares = 0;
        int cantidadImpares = 0;

        // Llenar el vector con números enteros
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100); // Genera números aleatorios entre 0 y 99
            if (numeros[i] % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }

        // Mostrar la cantidad de números pares e impares
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
    }
}
