/* Desarrollar un programa que permita almacenar 9 nombres de artículos en una matriz 
llamada “artículos”, posteriormente deberá mostrar el contenido de matriz en el orden 
de las filas invertido, es decir, la última fila debe aparecer primero y la primera de último. */ 

public class Ejercicio5 {
    public static void main(String[] args) {
        String[][] articulos = new String[3][3]; // Matriz de 3x3 para almacenar 9 artículos

        // Llenar la matriz con nombres de artículos
        for (int i = 0; i < articulos.length; i++) {
            for (int j = 0; j < articulos[i].length; j++) {
                articulos[i][j] = "Artículo " + (i * articulos[i].length + j + 1);
            }
        }

        // Mostrar el contenido de la matriz en orden invertido
        for (int i = articulos.length - 1; i >= 0; i--) {
            for (int j = 0; j < articulos[i].length; j++) {
                System.out.print(articulos[i][j] + " ");
            }
            System.out.println();
        }
    }

}
