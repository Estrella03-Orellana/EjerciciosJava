import EjerciciosPOO.Animal;
import EjerciciosPOO.Nivel1;
import EjerciciosPOO.Nivel2;

public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1 POO Crear instancias de la clase Animal y mostrar su información
        System.out.println("*****************EJERCICIO 1 *****************");
        Animal leon = new Animal("León", "Carnívoro", 4);
        Animal pulpo = new Animal("Pulpo", "Molusco", 8);

        leon.mostrarInformacion();
        System.out.println();
        pulpo.mostrarInformacion();
        System.out.println();

        // EJERCICIO 2 POO Crear instancias de la clase Juego y mostrar su información
        System.out.println("*****************EJERCICIO 2 *****************");
        Nivel1 objNivel1 = new Nivel1();
        objNivel1.imprimePreguntas(); // Método original de Nivel1

        Nivel2 objNivel2 = new Nivel2();
        objNivel2.imprimePreguntasNivel2(); // Nuevo método para Nivel2

        System.out.println("\n*****************MARCADOR*****************");
        System.out.println("Tu puntaje del Nivel 1 es: " + objNivel1.puntaje);
        System.out.println("Tu puntaje del Nivel 2 es: " + objNivel2.puntaje);

        int puntajeTotal = objNivel1.puntaje + objNivel2.puntaje;
        System.out.println("Tu puntaje acumulado total es: " + puntajeTotal);
        System.out.println();
        
    }
}
