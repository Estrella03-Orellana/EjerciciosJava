/*Desarrollar un programa que permita almacenar 10 nombres de frutas en un vector 
llamando “frutas” y que posteriormente muestre el contenido del vector pero en forma 
inversa, es decir, el último elemento ingresado deberá aparecer primero y el primero 
en el último lugar.*/


public class Ejercicio1 {
    
    public static void main(String[] args) {
        String[] frutas = new String[10];
        
        // Llenar el vector con nombres de frutas
        frutas[0] = "Manzana";
        frutas[1] = "Banana";
        frutas[2] = "Naranja";
        frutas[3] = "Fresa";
        frutas[4] = "Kiwi";
        frutas[5] = "Mango";
        frutas[6] = "Pera";
        frutas[7] = "Uva";
        frutas[8] = "Piña";
        frutas[9] = "Melón";

        // Mostrar el contenido del vector en forma inversa
        for (int i = 9; i >= 0; i--) {
            System.out.println(frutas[i]);
        }
    }
    

}
