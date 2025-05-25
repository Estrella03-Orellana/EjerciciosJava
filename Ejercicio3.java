/* Elaborar un programa que permita almacenar 12 números enteros en un vector llamado “números” 
y que posteriormente muestre la cantidad de números pares e impares contenidos en el vector. */

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        int pares = 0, impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) pares++;
            else impares++;
        }

        // Mostrar la cantidad de números pares e impares
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}
