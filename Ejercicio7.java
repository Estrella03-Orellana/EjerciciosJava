/* Desarrollar un programa que permita almacenar 12 valores numéricos cualquiera 
en una matriz y como resultado deberá mostrar si existe algún “punto de silla” y 
el número donde se presenta. */

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        System.out.println("Ingrese los valores de la matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean existe = false;
        for (int i = 0; i < 3; i++) {
            int minFila = matriz[i][0];
            int colMin = 0;
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] < minFila) {
                    minFila = matriz[i][j];
                    colMin = j;
                }
            }

            boolean esMayorColumna = true;
            for (int k = 0; k < 3; k++) {
                if (matriz[k][colMin] > minFila) {
                    esMayorColumna = false;
                    break;
                }
            }

            if (esMayorColumna) {
                System.out.println("Punto de silla encontrado: " + minFila);
                existe = true;
            }
        }

        if (!existe) {
            System.out.println("No hay punto de silla en la matriz.");
        }
    }
}

