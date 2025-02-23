package Animales;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    limpiarPantalla();
    System.out.println(" || ANIMALES ||");
    Pato pato = new Pato();
    pato.verAnimal();
    System.out.println("");
    Vaca vaca = new Vaca();
    vaca.verAnimal();
    System.out.println("");
    }

      public static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
