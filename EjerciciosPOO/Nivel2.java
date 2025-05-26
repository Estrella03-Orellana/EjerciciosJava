package EjerciciosPOO;

import java.util.Scanner;

public class Nivel2 {
    public int puntaje;
    private String respuesta;
    private final String[] animales;
    private final Scanner ent;

    public Nivel2() {
        puntaje = 0;
        ent = new Scanner(System.in);
        animales = new String[4]; // Ahora son 4 animales
        animales[0] = "leon";
        animales[1] = "tigre";
        animales[2] = "elefante";
        animales[3] = "jirafa";
    }

    private void puntajeLeon() {
        if (respuesta.equals(animales[0])) {
            System.out.println("¡Correcto! Has ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + animales[0]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    private void puntajeTigre() {
        if (respuesta.equals(animales[1])) {
            System.out.println("¡Correcto! Has ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + animales[1]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    private void puntajeElefante() {
        if (respuesta.equals(animales[2])) {
            System.out.println("¡Correcto! Has ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + animales[2]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    private void puntajeJirafa() {
        if (respuesta.equals(animales[3])) {
            System.out.println("¡Correcto! Has ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + animales[3]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    public void imprimePreguntasNivel2() {
        System.out.println("\n--- Nivel 2 ---");
        System.out.println("¿Es un animal de la selva con melena?");
        respuesta = ent.nextLine();
        puntajeLeon();

        System.out.println("¿Es un felino rayado?");
        respuesta = ent.nextLine();
        puntajeTigre();

        System.out.println("¿Es el animal terrestre más grande?");
        respuesta = ent.nextLine();
        puntajeElefante();

        System.out.println("¿Es un animal con un cuello muy largo?");
        respuesta = ent.nextLine();
        puntajeJirafa();
    }
}