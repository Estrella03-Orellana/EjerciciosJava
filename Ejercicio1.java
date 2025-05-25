/*Desarrollar un programa que permita almacenar 10 nombres de frutas en un vector 
llamando “frutas” y que posteriormente muestre el contenido del vector pero en forma 
inversa, es decir, el último elemento ingresado deberá aparecer primero y el primero 
en el último lugar.*/

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String[] frutas = new String[10];

        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Ingrese el nombre de la fruta " + (i + 1) + ": ");
            frutas[i] = sc.nextLine();
        }

        System.out.println("\nFrutas en orden inverso:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }
    }
    

}
