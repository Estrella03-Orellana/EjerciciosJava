/*  Desarrollar un programa que permita almacenar 9 valores numéricos cualquiera 
en una matriz y que posteriormente muestre su transpuesta. */ 

public class Ejercicio6 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3]; // Matriz de 3x3 para almacenar 9 valores numéricos

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100); // Genera números aleatorios entre 0 y 99
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Calcular y mostrar la transpuesta
        System.out.println("Matriz transpuesta:");
        mostrarTranspuesta(matriz);
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    private static void mostrarTranspuesta(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
