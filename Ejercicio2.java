/* Elaborar un programa que permita almacenar 12 números enteros
en un vector llamado “números” y que posteriormente muestre el
promedio de los números ingresados. */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;
        System.out.println("Promedio: " + promedio);
    }
    
    }

