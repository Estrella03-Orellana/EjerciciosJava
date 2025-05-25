/*  Desarrollar un programa que permita almacenar 9 valores numéricos cualquiera 
en una matriz y que posteriormente muestre su transpuesta. */

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Ingrese los valores de la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
}
