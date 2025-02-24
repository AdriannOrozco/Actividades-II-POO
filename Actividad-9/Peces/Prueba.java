package Peces;

import java.io.IOException;

public class Prueba {
    public static void main(String[] args) {
        limpiarPantalla();
        Pez pez = new Pez();
        System.out.println("");
        pez.respirar();
        System.out.println("----------------------");
        pez.nadar();
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
