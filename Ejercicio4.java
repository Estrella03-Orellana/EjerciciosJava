/* Elaborar un programa que permita almacenar 10 números cualquiera
en un vector llamado “números” y que posteriormente muestre el
mayor y el menor valor ingresado. */

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] > mayor) mayor = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
        }

        System.out.println("Mayor número: " + mayor);
        System.out.println("Menor número: " + menor);
    }
}
