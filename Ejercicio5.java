/* Desarrollar un programa que permita almacenar 9 nombres de artículos en una matriz 
llamada “artículos”, posteriormente deberá mostrar el contenido de matriz en el orden 
de las filas invertido, es decir, la última fila debe aparecer primero y la primera de último. */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] articulos = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese artículo en fila " + i + ", columna " + j + ": ");
                articulos[i][j] = sc.nextLine();
            }
        }

        System.out.println("\nMatriz con filas invertidas:");
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                System.out.print(articulos[i][j] + " ");
            }
            System.out.println();
        }
    }

}
