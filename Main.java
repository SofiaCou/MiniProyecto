
package javaapplication1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Instrumento[] instrumentos = new Instrumento[5];
        instrumentos[0] = new Guitarra("Guitarra");
        instrumentos[1] = new Piano("Piano");
        instrumentos[2] = new Bateria("Batería");
        instrumentos[3] = new Flauta("Flauta");
        instrumentos[4] = new Violin("Violín");

        int opcion;

        do {
            System.out.println("\n**** MENU ****");
            System.out.println("1. Tocar un instrumento");
            System.out.println("2. Ejecutar una canción");
            System.out.println("3. Tocar todos los instrumentos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            if (opcion == 1 || opcion == 2) {
                System.out.println("Elige un instrumento:");
                for (int i = 0; i < instrumentos.length; i++) {
                    System.out.println((i + 1) + ". " + instrumentos[i].nombre);
                }
                int eleccion = teclado.nextInt();

                if (eleccion >= 1 && eleccion <= 5) {
                    Instrumento inst = instrumentos[eleccion - 1];
                    if (opcion == 1) {
                        inst.tocarSonido();
                    } else {
                        inst.ejecutarCancion();
                    }
                } else {
                    System.out.println("Instrumento invalido.");
                }

            } else if (opcion == 3) {
                for (int i = 0; i < instrumentos.length; i++) {
                    instrumentos[i].tocarSonido();
                }
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción invalida.");
            }

        } while (opcion != 4);

        teclado.close();
    }
}