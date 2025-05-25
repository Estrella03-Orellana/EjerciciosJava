/* Desarrollar un programa que permita almacenar 12 valores numéricos cualquiera 
en una matriz y como resultado deberá mostrar si existe algún “punto de silla” y 
el número donde se presenta. */ 

public class Ejercicio7 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][4]; // Matriz de 3x4 para almacenar 12 valores numéricos

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100); // Genera números aleatorios entre 0 y 99
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Buscar puntos de silla
        buscarPuntosDeSilla(matriz);
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    private static void buscarPuntosDeSilla(int[][] matriz) {
        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valorActual = matriz[i][j];
                boolean esMinimoFila = true;
                boolean esMaximoColumna = true;

                // Verificar si es el mínimo en su fila
                for (int k = 0; k < matriz[i].length; k++) {
                    if (matriz[i][k] < valorActual) {
                        esMinimoFila = false;
                        break;
                    }
                }

                // Verificar si es el máximo en su columna
                for (int k = 0; k < matriz.length; k++) {
                    if (matriz[k][j] > valorActual) {
                        esMaximoColumna = false;
                        break;
                    }
                }

                // Si es un punto de silla, mostrarlo
                if (esMinimoFila && esMaximoColumna) {
                    System.out.println("Punto de silla encontrado: " + valorActual + " en posición (" + i + ", " + j + ")");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron puntos de silla en la matriz.");
        }
    }
}

